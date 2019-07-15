/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.p1.logicas;

import hn.uth.pa1.p1.objetos.Humano;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uth
 */
public class lnHumanos {
    
     public static Connection getConexion() {
        try {
            String usuario = "uth";
            String contrasenia = "uth";
            String url = "jdbc:derby://localhost:1527/uth";//por el q se conectará:derby(base de datos).dminio(local host para indicar q esta dentro de la compu):puerto:nombre bd

            return DriverManager.getConnection(url, usuario, contrasenia);

            //gestor deb
        } catch (Exception e) {
            System.out.println("Error conection: " + e.toString());
        }
        return null;
    }
    
     
     
    private static List<Humano> datos=new ArrayList<>();
    private static Humano humanoSeleccionado=null;
    
    public static void setHumanoSeleccionado(Humano humano){
        humanoSeleccionado=humano;
    }
    
    public static Humano getHumanoSeleccionado(){
        return humanoSeleccionado;
    }
       
    public static DefaultTableModel getModelHumano(){
        String[] columnas=new String[]{ "id", "nombre", "apellido", "peso", "sexo", "departamento", "municipio"};
        String[][] filas=new String[datos.size()][7];
        for (int i = 0; i < datos.size(); i++) {
            Humano tmp = datos.get(i);
            filas[i][0]=String.valueOf(tmp.getId());
            filas[i][1]=tmp.getNombre();
            filas[i][2]=tmp.getApellido();
            filas[i][3]=String.valueOf(tmp.getPeso());
            filas[i][4]=tmp.getSexo();
            filas[i][5]=tmp.getDepartamento();
            filas[i][6]=tmp.getMunicipio();
        }
        
        return new DefaultTableModel(filas,columnas);   
    }
    /*
    public static void guardar(Humano humano){
        //datos.add(humano);
        
    }*/
    
    
    public static void guardarHumanos(int id,
            String nombre,
            String apellido,
            double peso,
            String sexo,
            String departamento,
            String municipio) {
        try {
            //1. obtener la conexion, logearse, iniciar sesion
            Connection con = getConexion();
                
            //2. SQL de insert
            //queryn
            String sql = "insert into UTH.humanos "
                    + "(ID, NOMBRE, APELLIDO,PESO,SEXO,DEPARTAMENTO,MUNICIPIO) "
                    + "values "
                    + "(?,?,?,?,?,?,?) ";
            //3. preparar el queryn
            PreparedStatement ps = con.prepareStatement(sql);
            //PreparedStatement llee los ?
            //4. asignar valores a los signos de interrogacion
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setDouble(4, peso);
            ps.setString(5, sexo);
            ps.setString(6, departamento);
            ps.setString(7, municipio);

            //5. ejecutar el queryn (consulta)
            ps.execute();//para ejecutar el programa

            //6. cerrar la conexion 
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error en guardarHumano: " + e.toString());

        }
        //

    }
    
    public static Humano buscar(int id){
        for (Humano dato : datos) {
            if (dato.getId()==id) {
                return dato;
            }
        }
        return null;
    }

  
    
    public static void eliminar(
            int id) {
        try {
            //1. obtener la conexion, logearse, iniciar sesion
            Connection con = getConexion();

            //2. SQL de insert update
            //queryn
            String sql = "DELETE FROM HUMANOS "
                    + "WHERE ID =? ";
//3. preparar el queryn
            PreparedStatement ps = con.prepareStatement(sql);
            //PreparedStatement llee los ?
            //4. asignar valores a los signos de interrogacion
            ps.setInt(1, id);//el orden no importa, solo el numero

            //5. ejecutar el queryn (consulta)
            ps.executeUpdate();//para ejecutar el programa

            //6. cerrar la conexion 
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error en eliminarrHumano: " + e.toString());

        }
        //

    }
    
    public static void eliminar(Humano humano){
        datos.remove(humano);
    }
    
    public static int getIdSecuencia(){
        int idSecuencia=1;
        for (Humano dato : datos) {
            if (dato.getId()>=idSecuencia) {
                idSecuencia=dato.getId();
                idSecuencia++;
            }
        }
        return idSecuencia;
    }
    
}
