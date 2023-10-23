/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoadatos.HuespedData;
import accesoadatos.TipoHabitacionData;
import entidades.Huesped;
import entidades.TipoHabitacion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

public class GestionDeReservas extends javax.swing.JInternalFrame {

    private HuespedData hue;
    private Huesped huesped;
    private TipoHabitacion tipoHab = new TipoHabitacion();
    private TipoHabitacionData tipoDat = new TipoHabitacionData();

    public GestionDeReservas() {
        this.hue = new HuespedData();
        this.huesped = huesped;
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCrearNReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtfCantidadPersonas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMontoEstadia = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jtfDniHuesped = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbBuscarHuespedXDni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbBuscarTipoXcantidadP = new javax.swing.JButton();
        jlTipoHab = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jlPrecioxNoche = new javax.swing.JLabel();
        jbCalcularMontoE = new javax.swing.JButton();

        jbCrearNReserva.setText("Crear Nueva Reserva");

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        jLabel1.setText("Gestión de Reservas ");

        jLabel2.setText("Fecha de Entrada");

        jLabel3.setText("Fecha de Salida");

        jLabel4.setText("Cantidad de Personas:");

        jLabel5.setText("Tipo de Habitación:");

        jLabel7.setText("Monto Estadía:");

        jtfMontoEstadia.setEditable(false);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Huesped DNI");

        jtfDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniHuespedActionPerformed(evt);
            }
        });

        jLabel9.setText("Apellido");

        jLabel10.setText("Nombre");

        jLabel11.setText("Correo");

        jLabel12.setText("Domicilio");

        jLabel13.setText("Estado");

        jLabel14.setText("Celular");

        jbBuscarHuespedXDni.setText("jButton1");
        jbBuscarHuespedXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHuespedXDniActionPerformed(evt);
            }
        });

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

        jbBuscarTipoXcantidadP.setText("Buscar Tipo X cantidad de personas");
        jbBuscarTipoXcantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTipoXcantidadPActionPerformed(evt);
            }
        });

        jlTipoHab.setText("Doble");

        jButton3.setText("Reservas");

        jtfApellido.setEditable(false);

        jtfNombre.setEditable(false);

        jtfCorreo.setEditable(false);

        jtfDomicilio.setEditable(false);

        jtfCelular.setEditable(false);

        jlPrecioxNoche.setText("precio x Noche");

        jbCalcularMontoE.setText("----");
        jbCalcularMontoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularMontoEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscarHuespedXDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(jtfNombre))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEstado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfDomicilio)
                                        .addComponent(jtfCelular)))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtfCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbBuscarTipoXcantidadP))
                                        .addComponent(jlPrecioxNoche)
                                        .addComponent(jlTipoHab))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfMontoEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbCalcularMontoE)
                                        .addGap(141, 141, 141))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jbCrearNReserva)
                                .addGap(29, 29, 29)
                                .addComponent(jbSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarTipoXcantidadP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlTipoHab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPrecioxNoche)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMontoEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jbCalcularMontoE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCrearNReserva)
                            .addComponent(jbSalir)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarHuespedXDni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbEstado)
                            .addComponent(jLabel13))
                        .addGap(88, 88, 88)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
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

    private void jbBuscarHuespedXDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHuespedXDniActionPerformed
        try {
            int dniHuesped = Integer.parseInt(jtfDniHuesped.getText());
            Huesped huespedxdni = hue.buscarHuepedPorDni(dniHuesped);
            jtfApellido.setText(huespedxdni.getApellido());
            jtfNombre.setText(huespedxdni.getNombre());
            jtfCorreo.setText(huespedxdni.getCorreo());
            jtfDomicilio.setText(huespedxdni.getDomicilio());
            jtfCelular.setText(Integer.toString(huespedxdni.getCelular()));
            jrbEstado.setSelected(huespedxdni.isEstado());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "parametro incorrecto");
        }


    }//GEN-LAST:event_jbBuscarHuespedXDniActionPerformed

    private void jbBuscarTipoXcantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTipoXcantidadPActionPerformed
        try {
            int cantidadPersonas = Integer.parseInt(jtfCantidadPersonas.getText());
            TipoHabitacion tipoxCantidad = tipoDat.buscarTipoHabitacionXCantidaP(cantidadPersonas);
            JOptionPane.showMessageDialog(null, "tipo y precio " + tipoxCantidad.getTipoCamas() + " " + tipoxCantidad.getPrecioNoche());
            jlTipoHab.setText(tipoxCantidad.getTipoCamas());
            jlPrecioxNoche.setText(Double.toString(tipoxCantidad.getPrecioNoche()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "parametro incorrecto");
        }
    }//GEN-LAST:event_jbBuscarTipoXcantidadPActionPerformed

    private void jbCalcularMontoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularMontoEActionPerformed
        
        Date fechaEntrada = jdcFechaEntrada.getDate();
        Date fechaSalida = jdcFechaSalida.getDate();
        Double precioXNoche = Double.parseDouble(jlPrecioxNoche.getText());
        LocalDate localDateEntrada = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDateSalida = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long diasTotales = ChronoUnit.DAYS.between(localDateEntrada, localDateSalida);
        Double MontoFinal = precioXNoche * diasTotales;
        jtfMontoEstadia.setText(MontoFinal+"");
        
       


    }//GEN-LAST:event_jbCalcularMontoEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscarHuespedXDni;
    private javax.swing.JButton jbBuscarTipoXcantidadP;
    private javax.swing.JButton jbCalcularMontoE;
    private javax.swing.JButton jbCrearNReserva;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFechaEntrada;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JLabel jlPrecioxNoche;
    private javax.swing.JLabel jlTipoHab;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCantidadPersonas;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfDniHuesped;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfMontoEstadia;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
