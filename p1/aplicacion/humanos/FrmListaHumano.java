/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.p1.aplicacion.humanos;

import hn.uth.pa1.p1.servicios.svHumanos;
import hn.uth.pa1.p1.objetos.Humano;

/**
 *
 * @author uth
 */
public class FrmListaHumano extends javax.swing.JFrame {

    /**
     * Creates new form FrmListaHumano
     */
    public FrmListaHumano() {
        initComponents();

        svHumanos.llenarTabla();
        
        refrescarTabla();
    }

    public void refrescarTabla() {
        tblHumanos.setModel(svHumanos.getModelHumano());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        uthPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("uthPU").createEntityManager();
        humanosQuery = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery.getResultList();
        humanosQuery1 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery1.getResultList();
        humanosQuery2 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery2.getResultList();
        humanosQuery3 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery3.getResultList();
        humanosQuery4 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery4.getResultList();
        humanosQuery5 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery5.getResultList();
        humanosQuery6 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery6.getResultList();
        humanosQuery7 = java.beans.Beans.isDesignTime() ? null : uthPUEntityManager.createQuery("SELECT h FROM Humanos h");
        humanosList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : humanosQuery7.getResultList();
        lblTitulo = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtIdEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHumanos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Lista de humanos");

        btnRefrescar.setText("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtIdEliminar.setText(" ");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, humanosList7, tblHumanos);
        bindingGroup.addBinding(jTableBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, humanosQuery7, org.jdesktop.beansbinding.ObjectProperty.create(), tblHumanos, org.jdesktop.beansbinding.BeanProperty.create("model"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(tblHumanos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        refrescarTabla();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        llamarFormularioGestion();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void llamarFormularioGestion() {
        FrmGestionarHumano frmHumano = new FrmGestionarHumano();
        frmHumano.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frmHumano.setVisible(true);
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        svHumanos.eliminar(svHumanos.getHumanoSeleccionado());

        refrescarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        llamarFormularioGestion();
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmListaHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaHumano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaHumano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRefrescar;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList1;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList2;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList3;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList4;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList5;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList6;
    private java.util.List<hn.uth.pa1.p1.aplicacion.humanos.Humanos> humanosList7;
    private javax.persistence.Query humanosQuery;
    private javax.persistence.Query humanosQuery1;
    private javax.persistence.Query humanosQuery2;
    private javax.persistence.Query humanosQuery3;
    private javax.persistence.Query humanosQuery4;
    private javax.persistence.Query humanosQuery5;
    private javax.persistence.Query humanosQuery6;
    private javax.persistence.Query humanosQuery7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblHumanos;
    private javax.swing.JTextField txtIdEliminar;
    private javax.persistence.EntityManager uthPUEntityManager;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
