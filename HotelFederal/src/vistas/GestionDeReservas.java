/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoadatos.HabitacionData;
import accesoadatos.HuespedData;
import accesoadatos.ReservaData;
import accesoadatos.TipoHabitacionData;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionDeReservas extends javax.swing.JInternalFrame {

    private HuespedData hue;
    private Huesped huesped;
    private Reserva reserva;
    private ReservaData reservaData;
    private Habitacion habitacion;
    private HabitacionData habitaciondata;
    private TipoHabitacion tipoHab = new TipoHabitacion();
    private TipoHabitacionData tipoDat = new TipoHabitacionData();
    private DefaultTableModel modelo;

    public GestionDeReservas() {
        this.hue = new HuespedData();
        this.reserva = new Reserva();
        this.habitacion = new Habitacion();
        this.habitaciondata = new HabitacionData();
        this.huesped = huesped;
        this.reservaData = new ReservaData();
        initComponents();
        centrarVentana();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();

        jtListaHabitaciones.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable modelo = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int fila = modelo.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {
                    jlNHabitacion.setText(modelo.getValueAt(fila, 0).toString());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbBuscarTipoXcantidadP = new javax.swing.JButton();
        jlTipoHab = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlPrecioxNoche1 = new javax.swing.JLabel();
        jtfMontoEstadia = new javax.swing.JTextField();
        jlPrecioxNoche = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbCalcularMontoE = new javax.swing.JButton();
        jlPrecioxNoche2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtfCantidadPersonas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jlNHabitacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jbBuscarHuespedXDni = new javax.swing.JButton();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jtfDniHuesped = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jbCrearNReserva = new javax.swing.JButton();
        jbLimpiarTodo = new javax.swing.JButton();
        jbBuscarReservas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaHabitaciones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel1.setText("Gestión de Reservas ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(68, 167, 132));
        jPanel1.setForeground(new java.awt.Color(68, 167, 132));

        jbBuscarTipoXcantidadP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarTipoXcantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTipoXcantidadPActionPerformed(evt);
            }
        });

        jlTipoHab.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jlTipoHab.setText("-------------");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Precio por Noche:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Monto Estadía:");

        jlPrecioxNoche1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jlPrecioxNoche1.setText("$");

        jtfMontoEstadia.setEditable(false);

        jlPrecioxNoche.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jlPrecioxNoche.setText("-------------");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Habitación:");

        jbCalcularMontoE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/calcularTotal.png"))); // NOI18N
        jbCalcularMontoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularMontoEActionPerformed(evt);
            }
        });

        jlPrecioxNoche2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jlPrecioxNoche2.setText("$");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de Entrada:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de Salida:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de Personas:");

        jtfCantidadPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCantidadPersonasKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("N° De Habitacion:");

        jlNHabitacion.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jlNHabitacion.setText("----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3))
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPrecioxNoche1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioxNoche2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfMontoEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCalcularMontoE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlPrecioxNoche)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtfCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbBuscarTipoXcantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jdcFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlTipoHab))
                    .addComponent(jlNHabitacion))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jbBuscarTipoXcantidadP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlTipoHab)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPrecioxNoche2)
                            .addComponent(jLabel5)
                            .addComponent(jlPrecioxNoche))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfMontoEstadia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlPrecioxNoche1))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jbCalcularMontoE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jlNHabitacion))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(68, 167, 132));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Celular:");

        jbBuscarHuespedXDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarHuespedXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHuespedXDniActionPerformed(evt);
            }
        });

        jtfApellido.setEditable(false);

        jtfNombre.setEditable(false);

        jtfCorreo.setEditable(false);

        jtfDomicilio.setEditable(false);

        jtfCelular.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Huesped DNI:");

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

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Apellido:");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Correo:");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Domicilio:");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDomicilio)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscarHuespedXDni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbBuscarHuespedXDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jrbEstado))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(68, 167, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/SalirVentanas.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbCrearNReserva.setBackground(new java.awt.Color(255, 255, 102));
        jbCrearNReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCrearNReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NuevaReserva.png"))); // NOI18N
        jbCrearNReserva.setText("Nueva Reserva");
        jbCrearNReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearNReservaActionPerformed(evt);
            }
        });

        jbLimpiarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        jbLimpiarTodo.setText("Limpiar");
        jbLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarTodoActionPerformed(evt);
            }
        });

        jbBuscarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jbBuscarReservas.setText("Buscar Reservas");
        jbBuscarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbLimpiarTodo)
                .addGap(35, 35, 35)
                .addComponent(jbCrearNReserva)
                .addGap(33, 33, 33)
                .addComponent(jbBuscarReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBuscarReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpiarTodo)
                            .addComponent(jbSalir)
                            .addComponent(jbCrearNReserva))))
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(68, 167, 132));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(318, 318, 318))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(118, 118, 118))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Vuelva a escribir otro DNI");
        }


    }//GEN-LAST:event_jbBuscarHuespedXDniActionPerformed

    private void jbBuscarTipoXcantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTipoXcantidadPActionPerformed
        try {
            int cantidadPersonas = Integer.parseInt(jtfCantidadPersonas.getText());
            if (cantidadPersonas != 0 && cantidadPersonas <= 4) {
                TipoHabitacion tipoxCantidad = tipoDat.buscarTipoHabitacionXCantidaP(cantidadPersonas);
                jlTipoHab.setText(tipoxCantidad.getTipoCamas());
                jlPrecioxNoche.setText(Double.toString(tipoxCantidad.getPrecioNoche()));
//                TipoHabitacion tipo = (TipoHabitacion) jcbTipo.getSelectedItem();
                borrarFilaTabla();
                cargarHabitacionXTipo(tipoxCantidad);
            } else {
                JOptionPane.showMessageDialog(this, "Hospedamos de 1 a 4 personas, maximo por habitacion");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "parametro incorrecto");
        }
    }//GEN-LAST:event_jbBuscarTipoXcantidadPActionPerformed

    private void jbCalcularMontoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularMontoEActionPerformed
        try {
            Date fechaEntrada = jdcFechaEntrada.getDate();
            Date fechaSalida = jdcFechaSalida.getDate();
            Double precioXNoche = Double.parseDouble(jlPrecioxNoche.getText());
            LocalDate localDateEntrada = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDateSalida = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            long diasTotales = ChronoUnit.DAYS.between(localDateEntrada, localDateSalida);
            Double MontoFinal = precioXNoche * diasTotales;
            jtfMontoEstadia.setText(MontoFinal + "");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los parametros tienen que estar completos.");
        } catch (NullPointerException nu) {
            JOptionPane.showMessageDialog(this, "Seleccione fecha de su estadia.");
        }


    }//GEN-LAST:event_jbCalcularMontoEActionPerformed

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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarTodoActionPerformed
       limpiarCampos();
       borrarFilaTabla();
    }//GEN-LAST:event_jbLimpiarTodoActionPerformed

    private void jbCrearNReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearNReservaActionPerformed

//        boolean reservaEstado = true;
//        int dni = Integer.parseInt(jtfDniHuesped.getText());
//        int numeroH = Integer.parseInt(jlNHabitacion.getText());
//        Huesped huespedXId = hue.buscarHuepedPorDni(dni);
//        Habitacion habitacionxId = habitaciondata.buscarHabitacionXNro(numeroH);
//        reserva.setCantidadPersonas(Integer.parseInt(jtfCantidadPersonas.getText()));
//        Date fechaEntradaDate = jdcFechaEntrada.getDate();
//        Date fechaSalidaDate = jdcFechaSalida.getDate();
//        LocalDate fechaEntrada = fechaEntradaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate fechaSalida = fechaSalidaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        reserva.setFechaDeEntrada(fechaEntrada);
//        reserva.setFechaDeSalida(fechaSalida);
//        reserva.setPrecioTotal(Double.parseDouble(jtfMontoEstadia.getText()));
//        reserva.setEstado(reservaEstado);
//        reserva.setHuesped(huespedXId);
//        reserva.setHabitacion(habitacionxId);
//        reservaData.agregarReserva(reserva);
        try {
            boolean reservaEstado = true;
            int dni = Integer.parseInt(jtfDniHuesped.getText());
            int numeroH = Integer.parseInt(jlNHabitacion.getText());
            Huesped huespedXId = hue.buscarHuepedPorDni(dni);
            Habitacion habitacionxId = habitaciondata.buscarHabitacionXNro(numeroH);

            if (huespedXId == null || habitacionxId == null) {
                throw new NullPointerException("Debe completar todos los datos para crear una nueva reserva.");
            }

            Reserva reserva = new Reserva(); // Asumiendo que tienes una instancia de Reserva

            reserva.setCantidadPersonas(Integer.parseInt(jtfCantidadPersonas.getText()));
            Date fechaEntradaDate = jdcFechaEntrada.getDate();
            Date fechaSalidaDate = jdcFechaSalida.getDate();
            LocalDate fechaEntrada = fechaEntradaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = fechaSalidaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            reserva.setFechaDeEntrada(fechaEntrada);
            reserva.setFechaDeSalida(fechaSalida);
            reserva.setPrecioTotal(Double.parseDouble(jtfMontoEstadia.getText()));

            reserva.setEstado(reservaEstado);
            reserva.setHuesped(huespedXId);
            reserva.setHabitacion(habitacionxId);

            reservaData.agregarReserva(reserva);
        } catch (NumberFormatException | NullPointerException e) {
            // Manejo de excepciones para NumberFormatException y NullPointerException
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Debe completar todos los datos para crear una nueva reserva.");
        }
    


    }//GEN-LAST:event_jbCrearNReservaActionPerformed

    private void jtfCantidadPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCantidadPersonasKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
        if (jtfCantidadPersonas.getText().trim().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCantidadPersonasKeyTyped

    private void jbBuscarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarReservasActionPerformed
        // TODO add your handling code here:
        BusquedaXReservasView bxr = new BusquedaXReservasView();
        MenuPrincipalView.jdEscritorio.add(bxr);
        bxr.toFront();
        bxr.setVisible(true);
        bxr.getContentPane().setBackground(new Color(68, 167, 132));
    }//GEN-LAST:event_jbBuscarReservasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarHuespedXDni;
    private javax.swing.JButton jbBuscarReservas;
    private javax.swing.JButton jbBuscarTipoXcantidadP;
    private javax.swing.JButton jbCalcularMontoE;
    private javax.swing.JButton jbCrearNReserva;
    private javax.swing.JButton jbLimpiarTodo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFechaEntrada;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JLabel jlNHabitacion;
    private javax.swing.JLabel jlPrecioxNoche;
    private javax.swing.JLabel jlPrecioxNoche1;
    private javax.swing.JLabel jlPrecioxNoche2;
    private javax.swing.JLabel jlTipoHab;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtListaHabitaciones;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCantidadPersonas;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfDniHuesped;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfMontoEstadia;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtfApellido.setText("");
        jtfDniHuesped.setText("");
        jtfNombre.setText("");
        jtfDomicilio.setText("");
        jrbEstado.setSelected(false);
        jtfCorreo.setText("");
        jtfMontoEstadia.setText("");
        jtfCelular.setText("");
        jtfCantidadPersonas.setText("");
        jdcFechaEntrada.setDate(null);
        jdcFechaSalida.setDate(null);
        jlPrecioxNoche.setText("-------------");
        jlTipoHab.setText("-------------");
        
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Numero");
        filaCabecera.add("Estado");
        filaCabecera.add("Piso");
        filaCabecera.add("Tipo");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtListaHabitaciones.setModel(modelo);
    }

    private void cargarHabitacionXTipo(TipoHabitacion tipohab) {
        List<Habitacion> listah = (ArrayList) habitaciondata.listarHabitacionesxTipoYEstado(tipohab);
        for (Habitacion h : listah) {
            modelo.addRow(new Object[]{h.getNumero(), h.isEstado(), h.getPiso(), h.getTipoHabitacion()});
        }
    }

}
