/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.p1.servicios;

import hn.uth.pa1.p1.objetos.Humano;
import javax.swing.table.DefaultTableModel;
import hn.uth.pa1.p1.logicas.lnHumanos;
/**
 *
 * @author uth
 */
public class svHumanos {
    
    public static void setHumanoSeleccionado(Humano humano){
        lnHumanos.setHumanoSeleccionado(humano);
    }
    
    public static Humano getHumanoSeleccionado(){
        return lnHumanos.getHumanoSeleccionado();
    }
    
    public static DefaultTableModel getModelHumano(){
        return lnHumanos.getModelHumano();   
    }
    
    public static void guardar(Humano humano){
       lnHumanos.guardarHumanos(0, "", "", 0, "", "", "");
    }
    
    public static Humano buscar(int id){        
        return lnHumanos.buscar(id);
    }
    
    public static void eliminar(int id){
        lnHumanos.eliminar(id);
   
    }
    
    public static void eliminar(Humano humano){        
        lnHumanos.eliminar(humano);
    }
    
    public static int getIdSecuencia(){
        return lnHumanos.getIdSecuencia();
    }
    
    public static void llenarTabla(){
       // lnHumanos.guardar(new Humano(1,"Eliud", "Varela", 150, "M", "FM", "DC"));
     // lnHumanos.guardarHumanos(1, "Danny", "Cooper", 120, "M", "Frnacisco Morazan", "dc");
    
    }
    
}
