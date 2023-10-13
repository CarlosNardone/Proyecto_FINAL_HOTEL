
package vistas;

import accesoadatos.HuespedData;
import entidades.Huesped;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HuespedView extends javax.swing.JInternalFrame {
    private HuespedData hue;
    private Huesped huesped;
    private Huesped huespedActual = null;
    private List <Huesped> ListaH;
    private DefaultTableModel modelo;

    
    public HuespedView() {
        initComponents();
        this.hue = new HuespedData();
        this.huesped = huesped;
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminarH = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHuespedes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTApellidoBusqueda = new javax.swing.JTextField();
        jBApellidoBusqueda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Gestión Huespedes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DNI:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Celular:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Correo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Estado:");

        jtfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorreoActionPerformed(evt);
            }
        });

        jtfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDNIActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jtfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCelularActionPerformed(evt);
            }
        });

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar Huesped");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminarH.setText("Eliminar Huesped");
        jbEliminarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarHActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Domicilio:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtHuespedes);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jBApellidoBusqueda.setText("Buscar");
        jBApellidoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApellidoBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jbBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(jtfApellido))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jtfDomicilio))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstado)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTApellidoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jBApellidoBusqueda))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(39, 39, 39)
                                .addComponent(jbGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(jbEliminarH)
                                .addGap(43, 43, 43)
                                .addComponent(jbSalir)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminarH)
                    .addComponent(jbSalir))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellidoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBApellidoBusqueda))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCorreoActionPerformed

    private void jtfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDNIActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoActionPerformed

    private void jtfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCelularActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        huesped = null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
                try{
    String apellido = jtfApellido.getText();
    String nombre = jtfNombre.getText();
    String dni = jtfDNI.getText();
    String domicilio = jtfDomicilio.getText();
    String correo = jtfCorreo.getText();
    int celular = Integer.parseInt(jtfCelular.getText()); 
    boolean estado = jrbEstado.isSelected();
        huespedActual = hue.buscarHuepedPorDni(Integer.parseInt(dni));
            if(huespedActual == null){
            huespedActual = new Huesped(apellido, nombre, dni, domicilio, correo, celular, estado);
            hue.agregarHuesped(huespedActual);
        }else{
            huespedActual.setApellido(apellido);
            huespedActual.setNombre(nombre);
            huespedActual.setDomicilio(domicilio);
            huespedActual.setCorreo(correo);
            huespedActual.setCelular(celular);
            
            hue.modificarHuespedPorDNI(huespedActual);
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Parametros incorrectos");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
                int documento;
        
        try{ 
        documento = Integer.parseInt(jtfDNI.getText());
        Huesped huesped = hue.buscarHuepedPorDni(documento);
        if(huesped !=null){
        jtfApellido.setText(huesped.getApellido());
        jtfDNI.setText((huesped.getDni()));
        jtfNombre.setText(huesped.getNombre());
        jtfCorreo.setText(huesped.getCorreo());
        jtfDomicilio.setText(huesped.getDomicilio());
        jtfCelular.setText(Integer.toString(huesped.getCelular()));
        jrbEstado.setSelected(huesped.isEstado());
        }
        }catch(NumberFormatException nu){
        JOptionPane.showMessageDialog(this, "Solo se permiten numeros en el campo dni y celular");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarHActionPerformed
        // TODO add your handling code here:
                try{                                          
       int dni;
       dni = Integer.parseInt(jtfDNI.getText());
       hue.eliminarHuesped(dni);
        jbNuevoActionPerformed(evt);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros en los campo dni y fecha");
        }
    }//GEN-LAST:event_jbEliminarHActionPerformed

    private void jBApellidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApellidoBusquedaActionPerformed
        String apellido;
        apellido = jTApellidoBusqueda.getText();
        cargarHuespedXApellido(apellido);
        
//        try{ 
//        apellido = jTApellidoBusqueda.getText();
//        Huesped huesped = hue.buscarHuepedPorApellido(apellido);
//        if(huesped !=null){
//        jtfApellido.setText(huesped.getApellido());
//        jtfDNI.setText((huesped.getDni()));
//        jtfNombre.setText(huesped.getNombre());
//        jtfCorreo.setText(huesped.getCorreo());
//        jtfDomicilio.setText(huesped.getDomicilio());
//        jtfCelular.setText(Integer.toString(huesped.getCelular()));
//        jrbEstado.setSelected(huesped.isEstado());
//        }
//        }catch(NumberFormatException nu){
//        JOptionPane.showMessageDialog(this, "Solo se permiten numeros en el campo dni y celular");
//        }
        
        
    }//GEN-LAST:event_jBApellidoBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApellidoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellidoBusqueda;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminarH;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtHuespedes;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
    private void limpiarCampos(){
        jtfApellido.setText("");
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfDomicilio.setText("");
        jrbEstado.setSelected(false);
        jtfCorreo.setText("");
        jtfCelular.setText("");
        
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("Correo");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Celular");
        filaCabecera.add("Estado");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtHuespedes.setModel(modelo);
    }
    
    private void cargarHuespedXApellido(String apellido){
        List <Huesped> lista  = (ArrayList) hue.listarHuespedesXApellido(apellido);
        for (Huesped h: lista){
            modelo.addRow(new Object[]{h.getDni(),h.getApellido(), h.getNombre(), h.getCorreo(), h.getDomicilio(), h.getCelular(), h.isEstado()});
        }
    }
}
