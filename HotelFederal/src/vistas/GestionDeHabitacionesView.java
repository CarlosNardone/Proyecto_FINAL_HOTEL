/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoadatos.HabitacionData;
import accesoadatos.TipoHabitacionData;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class GestionDeHabitacionesView extends javax.swing.JInternalFrame {

    private List<TipoHabitacion> listath;
    private TipoHabitacionData thData;
    private TipoHabitacion tipoHab = null;
    private List<Habitacion> listah;
    private HabitacionData hdata;
    private Habitacion habitacion = null;
    private DefaultTableModel modelo;

    /**
     * Creates new form GestionDeHabitacionesView
     */
    public GestionDeHabitacionesView() {
        initComponents();
        thData = new TipoHabitacionData(); // Inicializa la lista
        hdata = new HabitacionData();
        listath = thData.listarTipoHabitaciones();
        listah = hdata.listarHabitaciones();
        cargarTipoHabitacion();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        centrarVentana();

    }


    
    private void cargarTipoHabitacion() {
    TipoHabitacion tipoHabitacionNulo = null;
    jcbTipo.addItem(tipoHabitacionNulo); // Agrega un elemento nulo al principio del JComboBox

    jcbTipo.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            if (jcbTipo.getItemCount() == 1) {
                jcbTipo.removeItem(tipoHabitacionNulo); // Elimina el elemento nulo
                for (TipoHabitacion item : listath) {
                    jcbTipo.addItem(item);
                }
            }
        }
    });
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

        jbLimpiar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaHabitaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jtfPiso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbBuscarNumero = new javax.swing.JButton();
        jbBuscarTipo = new javax.swing.JButton();
        jbBuscarPiso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfNumeroNuevo = new javax.swing.JTextField();
        jtfPisoNuevo = new javax.swing.JTextField();
        jtfTipoNuevo = new javax.swing.JTextField();
        jrbEstadoNuevo = new javax.swing.JRadioButton();
        jbBuscarEstado = new javax.swing.JButton();

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Guardar.png"))); // NOI18N
        jbModificar.setText("Guardar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jtListaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaHabitaciones);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel2.setText("Gestión de Habitaciones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estado");

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/SalirVentanas.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Numero:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Piso:");

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jbBuscarNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarNumeroActionPerformed(evt);
            }
        });

        jbBuscarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTipoActionPerformed(evt);
            }
        });

        jbBuscarPiso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPisoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Numero:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Piso:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tipo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Estado");

        jtfTipoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoNuevoActionPerformed(evt);
            }
        });

        jrbEstadoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoNuevoActionPerformed(evt);
            }
        });

        jbBuscarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jrbEstadoNuevo)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(70, 70, 70)
                                    .addComponent(jrbEstado)))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbBuscarEstado)
                                .addComponent(jbBuscarTipo)
                                .addComponent(jbBuscarNumero)
                                .addComponent(jbBuscarPiso))
                            .addGap(181, 181, 181))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfPisoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfTipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfNumeroNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbModificar)
                        .addGap(30, 30, 30)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfNumeroNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfPisoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfTipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jrbEstadoNuevo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbModificar)
                                    .addComponent(jbSalir)
                                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscarNumero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(jbBuscarPiso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbBuscarTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jrbEstado)
                                    .addComponent(jbBuscarEstado))))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarNumeroActionPerformed

        try {
            int numero = Integer.parseInt(jtfNumero.getText());
            Habitacion habitacion = hdata.buscarHabitacionXNro(numero);
            TipoHabitacion tipoHabitacion = thData.buscarTipoHabitacion(habitacion.getTipoHabitacion().getIdTipoHabitacion());
            if (habitacion != null && tipoHabitacion != null) {
                jtfNumeroNuevo.setText(Integer.toString(habitacion.getNumero()));
                jtfPisoNuevo.setText(Integer.toString(habitacion.getPiso()));
                jrbEstadoNuevo.setSelected(habitacion.isEstado());
                jtfTipoNuevo.setText(tipoHabitacion.getTipoCamas());
            } else {
                JOptionPane.showMessageDialog(null, "error");
            }
//            borrarFilaTabla();
//            cargarHabitacionXNumero(numero);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros en estos parametros");
        }
    }//GEN-LAST:event_jbBuscarNumeroActionPerformed

    private void jbBuscarPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPisoActionPerformed
        try {
            int piso = Integer.parseInt(jtfPiso.getText());
            borrarFilaTabla();
            cargarHabitacionXPiso(piso);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros en estos parametros");
        }
    }//GEN-LAST:event_jbBuscarPisoActionPerformed

    private void jbBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTipoActionPerformed

        TipoHabitacion tipoSeleccionado = (TipoHabitacion) jcbTipo.getSelectedItem();
        borrarFilaTabla();
        cargarHabitacionXTipo(tipoSeleccionado);
    }//GEN-LAST:event_jbBuscarTipoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            int numero = Integer.parseInt(jtfNumeroNuevo.getText());
            int piso = Integer.parseInt(jtfPisoNuevo.getText());
            String tipo = jtfTipoNuevo.getText();
            TipoHabitacion tipoHab = new TipoHabitacion();
            tipoHab.setTipoCamas(tipo);
            boolean estado = jrbEstadoNuevo.isSelected();
            Habitacion encontrada = hdata.buscarHabitacionXNro(numero);
            
            if(encontrada == null){
               int idtipo = thData.obtenerIdTipoHabitacionPorNombre(tipo);
               tipoHab.setIdTipoHabitacion(idtipo);
               Habitacion nueva = new Habitacion(numero, estado, piso, tipoHab);
               hdata.altaHabitacion(nueva);
            }else{
                Habitacion habitacion = new Habitacion();
                habitacion.setNumero(numero);
                habitacion.setPiso(piso);
                habitacion.setEstado(estado);
                tipoHab.setTipoCamas(tipo);    
            hdata.modificarHabitacionPorNumero(habitacion,tipoHab);
            }
            }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en estos campos");

    }//GEN-LAST:event_jbModificarActionPerformed
    }

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jrbEstadoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoNuevoActionPerformed

    private void jtfTipoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoNuevoActionPerformed

    private void jbBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarEstadoActionPerformed
       boolean estado = jrbEstado.isSelected();
       borrarFilaTabla();
       cargarHabitacionXEstado(estado);
       
    }//GEN-LAST:event_jbBuscarEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton jbBuscarEstado;
    private javax.swing.JButton jbBuscarNumero;
    private javax.swing.JButton jbBuscarPiso;
    private javax.swing.JButton jbBuscarTipo;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<TipoHabitacion> jcbTipo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbEstadoNuevo;
    private javax.swing.JTable jtListaHabitaciones;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfNumeroNuevo;
    private javax.swing.JTextField jtfPiso;
    private javax.swing.JTextField jtfPisoNuevo;
    private javax.swing.JTextField jtfTipoNuevo;
    // End of variables declaration//GEN-END:variables

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("IdHabitacion");
        filaCabecera.add("Numero");
        filaCabecera.add("Estado");
        filaCabecera.add("Piso");
        filaCabecera.add("Tipo");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtListaHabitaciones.setModel(modelo);
    }

    private void cargarHabitacionXPiso(int piso) {
        List<Habitacion> listah = (ArrayList) hdata.listarHabitacionesxPiso(piso);
        for (Habitacion h : listah) {
            modelo.addRow(new Object[]{h.getIdHabitacion(), h.getNumero(), h.isEstado(), h.getPiso(), h.getTipoHabitacion()});
        }
    }

    private void cargarHabitacionXTipo(TipoHabitacion tipohab) {
        List<Habitacion> listah = (ArrayList) hdata.listarHabitacionesxTipo(tipohab);
        for (Habitacion h : listah) {
            modelo.addRow(new Object[]{h.getIdHabitacion(), h.getNumero(), h.isEstado(), h.getPiso(), h.getTipoHabitacion()});
        }
    }

    private void limpiarCampos() {
        jtfNumero.setText("");
        jtfPiso.setText("");
        jrbEstado.setSelected(false);
        jtfNumeroNuevo.setText("");
        jtfPisoNuevo.setText("");
        jtfTipoNuevo.setText("");
        jrbEstadoNuevo.setSelected(false);
        borrarFilaTabla();
        cargarTipoHabitacion();

    }

    private void cargarHabitacionXEstado(boolean estado) {
        List<Habitacion> listah = (ArrayList) hdata.listarHabitacionesxEstado(estado);
        for (Habitacion h : listah) {
            modelo.addRow(new Object[]{h.getIdHabitacion(), h.getNumero(), h.isEstado(), h.getPiso(), h.getTipoHabitacion()});
        }
    }

}
