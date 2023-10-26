package vistas;

import accesoadatos.HabitacionData;
import accesoadatos.HuespedData;
import accesoadatos.ReservaData;
import accesoadatos.TipoHabitacionData;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class BusquedaXReservasView extends javax.swing.JInternalFrame {

    private HuespedData hue;
    private Huesped huesped;
    private Reserva reserva;
    private ReservaData reservaData;
    private Habitacion habitacion;
    private HabitacionData habitaciondata;
    private TipoHabitacion tipoHab = new TipoHabitacion();
    private TipoHabitacionData tipoDat = new TipoHabitacionData();
    private List<Habitacion> listah = null;
    private DefaultTableModel modelo;

    public BusquedaXReservasView() {
        this.hue = new HuespedData();
        this.reserva = new Reserva();
        this.habitacion = new Habitacion();
        this.habitaciondata = new HabitacionData();
        this.huesped = huesped;
        this.reservaData = new ReservaData();
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        centrarVentana();
    }

    public void centrarVentana() {
        //El tamaño de nuestra pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //El tamaño de la aplicacion
        Dimension frameSize = getSize();
        //Hacer que la pantalla de la aplicacion no exeda mi pantalla
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;

        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;

        }
        //Centrar ventana
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBuscarReservas = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jbCancelarReserva = new javax.swing.JButton();
        jbLiampiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfDniHuesped = new javax.swing.JTextField();
        jbBuscarHuespedXDni = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jdcFechaDesde = new com.toedter.calendar.JDateChooser();
        jdcFechaHasta = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbBuscarXFecha = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel15.setText("Búsqueda Reserva");

        jPanel4.setBackground(new java.awt.Color(68, 167, 132));

        jtBuscarReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtBuscarReservas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(68, 167, 132));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/SalirVentanas.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbCancelarReserva.setBackground(new java.awt.Color(255, 153, 153));
        jbCancelarReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        jbCancelarReserva.setText("Cancelar Reserva");
        jbCancelarReserva.setBorder(null);
        jbCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarReservaActionPerformed(evt);
            }
        });

        jbLiampiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        jbLiampiar.setText("Limpiar");
        jbLiampiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiampiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbLiampiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jbCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLiampiar)
                    .addComponent(jbSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(68, 167, 132));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Reserva por DNI:");

        jtfDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniHuespedActionPerformed(evt);
            }
        });
        jtfDniHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniHuespedKeyTyped(evt);
            }
        });

        jbBuscarHuespedXDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarHuespedXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHuespedXDniActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Reserva por Fechas:");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Hasta");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Desde");

        jbBuscarXFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarXFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarXFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jbBuscarHuespedXDni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscarXFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbBuscarHuespedXDni)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)))
                            .addComponent(jdcFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jdcFechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbBuscarXFecha)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(345, 345, 345))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfDniHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniHuespedActionPerformed

    private void jtfDniHuespedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniHuespedKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
        if (jtfDniHuesped.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfDniHuespedKeyTyped

    private void jbBuscarHuespedXDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHuespedXDniActionPerformed
        try {
            int dniHuesped = Integer.parseInt(jtfDniHuesped.getText());
            Huesped huespedxdni = hue.buscarHuepedPorDni(dniHuesped);
            if (huespedxdni != null) {
                cargarReservaXIdHuesped(huespedxdni.getIdHuesped());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún huésped con ese DNI.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.");
        }


    }//GEN-LAST:event_jbBuscarHuespedXDniActionPerformed

    private void jbBuscarXFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarXFechaActionPerformed
        java.util.Date fechaDesdeUtil = jdcFechaDesde.getDate();
        java.util.Date fechaHastaUtil = jdcFechaHasta.getDate();

        if (fechaDesdeUtil != null && fechaHastaUtil != null) {
            java.sql.Date fechaDesde = new java.sql.Date(fechaDesdeUtil.getTime());
            java.sql.Date fechaHasta = new java.sql.Date(fechaHastaUtil.getTime());

            cargarReservaXfechas(fechaDesde, fechaHasta);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione ambas fechas.");
        }


    }//GEN-LAST:event_jbBuscarXFechaActionPerformed

    private void jbCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarReservaActionPerformed
        // TODO add your handling code here:

        //Intento 1
//                try{
// 
//        int filaSeleccionada = jtBuscarReservas.getSelectedRow();
//        if (filaSeleccionada != -1) {
//            int idHuesped = (Integer) modelo.getValueAt(filaSeleccionada, 0);
//            int idHabitacion = (Integer) modelo.getValueAt(filaSeleccionada, 8);
//            
//            reservaData.cancelarReserva(idHuesped, idHabitacion, false); // Cambiado getIdHuesped() por idHuesped y getIdHabitacion() por idHabitacion
//            borrarFilaTabla();      
//        } else {
//            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una fila de la tabla");
//        }
//    } catch (ClassCastException ex) {
//        JOptionPane.showMessageDialog(this, "No deberías editar las filas");
//    }
//Intento 2
//        int idHuesped;
//        int idHabitacion;
//        try {
//            int filaSeleccionada = jtBuscarReservas.getSelectedRow();
//            if (filaSeleccionada != -1) {
//                String idHuespedStr = modelo.getValueAt(filaSeleccionada, 0).toString();
//                String idHabitacionStr = modelo.getValueAt(filaSeleccionada, 8).toString();
//
//                idHuesped = Integer.parseInt(idHuespedStr);
//                idHabitacion = Integer.parseInt(idHabitacionStr);
//
//                reservaData.cancelarReserva(idHuesped, idHabitacion, false);
//                borrarFilaTabla();
//            } else {
//                JOptionPane.showMessageDialog(this, "Usted debe seleccionar una fila de la tabla");
//            }
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Los valores en la tabla no son números válidos");
//        }

//Intento 3
        
        try {
            int filaSeleccionada = jtBuscarReservas.getSelectedRow();
            if (filaSeleccionada != -1) {
            int idReserva = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
            int numeroHabitacion = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 9).toString()); 
                habitaciondata.habitacionLibre(numeroHabitacion);
                reservaData.cancelarReserva(idReserva);
            }
            
//            int filaSeleccionada = jtBuscarReservas.getSelectedRow();
//            if (filaSeleccionada != -1) {
//                String dniStr = modelo.getValueAt(filaSeleccionada, 0).toString();
//                String nHabitacionStr = modelo.getValueAt(filaSeleccionada, 8).toString();
//
//                if (esNumeroValido(dniStr) && esNumeroValido(nHabitacionStr)) {
//                    dni = Integer.parseInt(dniStr);
//                    numeroHabitacion = Integer.parseInt(nHabitacionStr);
//
//                   reservaData.cancelarReserva(dni, numeroHabitacion, false);
//                    borrarFilaTabla();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Los valores en la tabla no son números válidos "
//                            + " Dni: " + dniStr + " Numero Habitacion: " + nHabitacionStr);
//                }
//                System.out.println("Dni: " + dniStr);
//                System.out.println("Numero Habitacion: " + nHabitacionStr);
//
             else {
                JOptionPane.showMessageDialog(this, "Usted debe seleccionar una fila de la tabla");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los valores en la tabla no son números válidos");
        }
    }//GEN-LAST:event_jbCancelarReservaActionPerformed

    private void jbLiampiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiampiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        borrarFilaTabla();
    }//GEN-LAST:event_jbLiampiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscarHuespedXDni;
    private javax.swing.JButton jbBuscarXFecha;
    private javax.swing.JButton jbCancelarReserva;
    private javax.swing.JButton jbLiampiar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFechaDesde;
    private com.toedter.calendar.JDateChooser jdcFechaHasta;
    private javax.swing.JTable jtBuscarReservas;
    private javax.swing.JTextField jtfDniHuesped;
    // End of variables declaration//GEN-END:variables
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("FechaEntrada");
        filaCabecera.add("FechaSalida");
        filaCabecera.add("Cant. Huesped");
        filaCabecera.add("Precio Total");
        filaCabecera.add("Estado");
        filaCabecera.add("N° Habitacion");
        filaCabecera.add("Tipo");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtBuscarReservas.setModel(modelo);
    }

    private void cargarReservaXIdHuesped(int id) {
        borrarFilaTabla();

        List<Reserva> reservas = reservaData.ListarReservasPorIdHuesped(id);

        for (Reserva reserva : reservas) {
            Huesped huesped = reserva.getHuesped();
            Habitacion habitacion = reserva.getHabitacion();

            if (huesped != null && habitacion != null) {
                String estadoReserva = reserva.isEstado() ? "Activa" : "Cancelada";
                TipoHabitacion tipoHabitacion = habitacion.getTipoHabitacion();
                

                Object[] rowData = {
                    reserva.getIdReserva(),
                    huesped.getDni(),
                    huesped.getApellido(),
                    huesped.getNombre(),
                    reserva.getFechaDeEntrada(),
                    reserva.getFechaDeSalida(),
                    reserva.getCantidadPersonas(),
                    reserva.getPrecioTotal(),
                    estadoReserva,
                    habitacion.getNumero(),
                    tipoHabitacion
                    
                };

                modelo.addRow(rowData);
            }
        }
    }

    private void cargarReservaXfechas(Date fechaDesde, Date fechaHasta) {
        if (fechaDesde != null && fechaHasta != null) {
            List<Reserva> reservas = reservaData.ListarReservasPorFechas(fechaDesde, fechaHasta);
            borrarFilaTabla();
            for (Reserva reserva : reservas) {
                Huesped huesped = reserva.getHuesped();
                Habitacion habitacion = reserva.getHabitacion();

                if (huesped != null && habitacion != null) {
                    String estadoReserva = reserva.isEstado() ? "Activa" : "Inactiva";
                    TipoHabitacion tipoHabitacion = habitacion.getTipoHabitacion();

                    Object[] rowData = {
                        reserva.getIdReserva(),
                        huesped.getDni(),
                        huesped.getApellido(),
                        huesped.getNombre(),
                        reserva.getFechaDeEntrada(),
                        reserva.getFechaDeSalida(),
                        reserva.getCantidadPersonas(),
                        reserva.getPrecioTotal(),
                        estadoReserva,
                        habitacion.getNumero(),
                        tipoHabitacion
                    };

                    modelo.addRow(rowData);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione ambas fechas.");
        }

    }

    private void limpiarCampos() {
        jtfDniHuesped.setText("");
        jdcFechaDesde.setDate(null);
        jdcFechaHasta.setDate(null);
    }

    // Función para validar si una cadena es un número válido
    private boolean esNumeroValido(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
