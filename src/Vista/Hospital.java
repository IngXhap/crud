package Vista;

import Conexion.Conexiondb;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Hospital extends javax.swing.JFrame {

    Conexiondb con = new Conexiondb();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
     
    public Hospital() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos_JhoanVicente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombres_JhoanVicente = new javax.swing.JTextField();
        txt_celular_JossueTorres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dni_JhoanVicente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar_JhoanVicente = new javax.swing.JButton();
        btnEditar_JhoanVicente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar_JhoanVicente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos_JhoanVicente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_nacimiento_JhoanVicente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_correo_JhoanVicente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_direccion_JhoanVicente = new javax.swing.JTextField();
        ComboBoxHemoglobina_JhoanVicente = new javax.swing.JComboBox<>();
        ComboBoxTipo_Seguro_JhoanVicente = new javax.swing.JComboBox<>();
        RadioButtonhombre_JhoanVicente = new javax.swing.JRadioButton();
        RadioButtonmujer_JhoanVicente = new javax.swing.JRadioButton();
        txtrespuestahemoglobina_JhoanVicente = new javax.swing.JTextField();
        txtrespuestatipo_seguro_JhoanVicente = new javax.swing.JTextField();
        btnNuevo_JhoanVicente = new javax.swing.JButton();
        spner_glucosa_JhoanVicente = new javax.swing.JSpinner();
        respuesta_spinner_glucosa_JossueTorres = new javax.swing.JTextField();
        spner_colesterol_JhoanVicente = new javax.swing.JSpinner();
        respuesta_spinner_colesterol_JossueTorres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/seiya.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("nombre:");

        txt_apellidos_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos_JhoanVicenteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("apellidos:");

        txt_nombres_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_JhoanVicenteActionPerformed(evt);
            }
        });

        txt_celular_JossueTorres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celular_JossueTorresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("celular:");

        txt_dni_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dni_JhoanVicenteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("dni: ");

        btnAgregar_JhoanVicente.setText("Agregar");
        btnAgregar_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_JhoanVicenteActionPerformed(evt);
            }
        });

        btnEditar_JhoanVicente.setText("Editar");
        btnEditar_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_JhoanVicenteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Id:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnEliminar_JhoanVicente.setText("Eliminar");
        btnEliminar_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_JhoanVicenteActionPerformed(evt);
            }
        });

        Tabla_Datos_JhoanVicente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "dni", "nombre", "apellido", "fecha de nacimiento", "sexo", "celular", "correo electronico", "direccion", "Colesterol", "Glucosa", "Hemoglobina", "Tipo deSeguro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Datos_JhoanVicente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_Datos_JhoanVicenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Datos_JhoanVicente);
        if (Tabla_Datos_JhoanVicente.getColumnModel().getColumnCount() > 0) {
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(0).setMinWidth(50);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(0).setMaxWidth(50);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(3).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(4).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(5).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(6).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(7).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(8).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(9).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(10).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(11).setResizable(false);
            Tabla_Datos_JhoanVicente.getColumnModel().getColumn(12).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("fecha de nacimiento:");

        txt_fecha_nacimiento_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_nacimiento_JhoanVicenteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("sexo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("correo electronico:");

        txt_correo_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_JhoanVicenteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("direccion:");

        txt_direccion_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_JhoanVicenteActionPerformed(evt);
            }
        });

        ComboBoxHemoglobina_JhoanVicente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBoxHemoglobina_JhoanVicente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemoglobina", "12(mg/dL)", "24(mg/dL)", "36(mg/dL)" }));
        ComboBoxHemoglobina_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxHemoglobina_JhoanVicenteActionPerformed(evt);
            }
        });

        ComboBoxTipo_Seguro_JhoanVicente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboBoxTipo_Seguro_JhoanVicente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Seguro", "EsSalud", "Clinica", "Farmacia" }));
        ComboBoxTipo_Seguro_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipo_Seguro_JhoanVicenteActionPerformed(evt);
            }
        });

        RadioButtonhombre_JhoanVicente.setText("hombre");
        RadioButtonhombre_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonhombre_JhoanVicenteActionPerformed(evt);
            }
        });

        RadioButtonmujer_JhoanVicente.setText("mujer");
        RadioButtonmujer_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonmujer_JhoanVicenteActionPerformed(evt);
            }
        });

        txtrespuestahemoglobina_JhoanVicente.setEditable(false);
        txtrespuestahemoglobina_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespuestahemoglobina_JhoanVicenteActionPerformed(evt);
            }
        });

        txtrespuestatipo_seguro_JhoanVicente.setEditable(false);
        txtrespuestatipo_seguro_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespuestatipo_seguro_JhoanVicenteActionPerformed(evt);
            }
        });

        btnNuevo_JhoanVicente.setText("Nuevo");
        btnNuevo_JhoanVicente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo_JhoanVicenteActionPerformed(evt);
            }
        });

        spner_glucosa_JhoanVicente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spner_glucosa_JhoanVicenteStateChanged(evt);
            }
        });

        respuesta_spinner_glucosa_JossueTorres.setEditable(false);

        spner_colesterol_JhoanVicente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spner_colesterol_JhoanVicenteStateChanged(evt);
            }
        });

        respuesta_spinner_colesterol_JossueTorres.setEditable(false);
        respuesta_spinner_colesterol_JossueTorres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta_spinner_colesterol_JossueTorresActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Glucosa:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Colesterol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(196, 196, 196)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComboBoxHemoglobina_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtrespuestahemoglobina_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_correo_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ComboBoxTipo_Seguro_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtrespuestatipo_seguro_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_fecha_nacimiento_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RadioButtonhombre_JhoanVicente)
                                                .addGap(18, 18, 18)
                                                .addComponent(RadioButtonmujer_JhoanVicente)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNuevo_JhoanVicente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAgregar_JhoanVicente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(spner_glucosa_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(respuesta_spinner_glucosa_JossueTorres, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spner_colesterol_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(respuesta_spinner_colesterol_JossueTorres, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_celular_JossueTorres, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nombres_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_apellidos_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_direccion_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dni_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_celular_JossueTorres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_dni_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_correo_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_nombres_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellidos_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RadioButtonhombre_JhoanVicente)
                                        .addComponent(RadioButtonmujer_JhoanVicente)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txt_direccion_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(btnAgregar_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnEliminar_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel13)
                                                    .addComponent(spner_colesterol_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(respuesta_spinner_colesterol_JossueTorres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(spner_glucosa_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(respuesta_spinner_glucosa_JossueTorres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(ComboBoxHemoglobina_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtrespuestahemoglobina_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtrespuestatipo_seguro_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ComboBoxTipo_Seguro_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txt_fecha_nacimiento_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar_JhoanVicente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_JhoanVicenteActionPerformed
        agregar();
       listar();
    }//GEN-LAST:event_btnAgregar_JhoanVicenteActionPerformed

    private void btnEditar_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_JhoanVicenteActionPerformed
        Modificar();
        listar();
    }//GEN-LAST:event_btnEditar_JhoanVicenteActionPerformed

    private void btnEliminar_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_JhoanVicenteActionPerformed
       Eliminar();
       listar();
       
    }//GEN-LAST:event_btnEliminar_JhoanVicenteActionPerformed

    private void Tabla_Datos_JhoanVicenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_Datos_JhoanVicenteMouseClicked
        int fila = Tabla_Datos_JhoanVicente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
        } else {
            id = Integer.parseInt((String) Tabla_Datos_JhoanVicente.getValueAt(fila, 0).toString());
            String dni = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 1);
            String nombres = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 2);
            String apellidos = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 3);
            String fecha_nacimiento = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 4);
            String sexo = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 5);
            String celular = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 6);
            String correo = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 7);
            String direccion = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 8);
            String colesterol = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 9);
            String glucosa = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 10);
            String hemoglobina = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 11);
            String tipo_seguro = (String) Tabla_Datos_JhoanVicente.getValueAt(fila, 12);
            txtId.setText("" + id);
            txt_dni_JhoanVicente.setText(dni);
            txt_nombres_JhoanVicente.setText(nombres);
            txt_apellidos_JhoanVicente.setText(apellidos);
            txt_fecha_nacimiento_JhoanVicente.setText(fecha_nacimiento);
            RadioButtonhombre_JhoanVicente.setText(sexo);
            txt_celular_JossueTorres.setText(celular);
            txt_correo_JhoanVicente.setText(correo);
            txt_direccion_JhoanVicente.setText(direccion);
            spner_colesterol_JhoanVicente.setToolTipText(colesterol);
            spner_glucosa_JhoanVicente.setToolTipText(glucosa);
            ComboBoxHemoglobina_JhoanVicente.setToolTipText(hemoglobina);
            ComboBoxTipo_Seguro_JhoanVicente.setToolTipText(tipo_seguro);
        }
    }//GEN-LAST:event_Tabla_Datos_JhoanVicenteMouseClicked

    private void txt_fecha_nacimiento_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_nacimiento_JhoanVicenteActionPerformed

    }//GEN-LAST:event_txt_fecha_nacimiento_JhoanVicenteActionPerformed

    private void txtrespuestahemoglobina_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespuestahemoglobina_JhoanVicenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespuestahemoglobina_JhoanVicenteActionPerformed

    private void ComboBoxHemoglobina_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxHemoglobina_JhoanVicenteActionPerformed
       String mensaje = "su nivel de hemoglobina es ";
    mensaje= mensaje+ComboBoxHemoglobina_JhoanVicente.getSelectedItem().toString();
    txtrespuestahemoglobina_JhoanVicente.setText(mensaje);
    }//GEN-LAST:event_ComboBoxHemoglobina_JhoanVicenteActionPerformed

    private void ComboBoxTipo_Seguro_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipo_Seguro_JhoanVicenteActionPerformed
      String mensaje = "su consulta fue en la clinica ";
    mensaje= mensaje+ComboBoxTipo_Seguro_JhoanVicente.getSelectedItem().toString();
    txtrespuestatipo_seguro_JhoanVicente.setText(mensaje);
    }//GEN-LAST:event_ComboBoxTipo_Seguro_JhoanVicenteActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtIdActionPerformed

    private void txt_dni_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dni_JhoanVicenteActionPerformed
     
    }//GEN-LAST:event_txt_dni_JhoanVicenteActionPerformed

    private void txt_nombres_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_JhoanVicenteActionPerformed
        
    }//GEN-LAST:event_txt_nombres_JhoanVicenteActionPerformed

    private void txt_apellidos_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos_JhoanVicenteActionPerformed

    }//GEN-LAST:event_txt_apellidos_JhoanVicenteActionPerformed

    private void RadioButtonhombre_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonhombre_JhoanVicenteActionPerformed
        
    }//GEN-LAST:event_RadioButtonhombre_JhoanVicenteActionPerformed

    private void RadioButtonmujer_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonmujer_JhoanVicenteActionPerformed

    }//GEN-LAST:event_RadioButtonmujer_JhoanVicenteActionPerformed

    private void txt_celular_JossueTorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celular_JossueTorresActionPerformed

    }//GEN-LAST:event_txt_celular_JossueTorresActionPerformed

    private void txt_correo_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_JhoanVicenteActionPerformed

    }//GEN-LAST:event_txt_correo_JhoanVicenteActionPerformed

    private void txt_direccion_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_JhoanVicenteActionPerformed

    }//GEN-LAST:event_txt_direccion_JhoanVicenteActionPerformed

    private void btnNuevo_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo_JhoanVicenteActionPerformed
    txt_dni_JhoanVicente.setText("");
    txt_nombres_JhoanVicente.setText("");
    txt_apellidos_JhoanVicente.setText("");
    txt_fecha_nacimiento_JhoanVicente.setText("");
    RadioButtonhombre_JhoanVicente.setSelected(true);
    RadioButtonmujer_JhoanVicente.setSelected(false);
    txt_celular_JossueTorres.setText("");
    txt_correo_JhoanVicente.setText("");
    txt_direccion_JhoanVicente.setText("");
    spner_colesterol_JhoanVicente.setValue(0);
    spner_glucosa_JhoanVicente.setValue(0);
    ComboBoxHemoglobina_JhoanVicente.setSelectedIndex(0);   
    ComboBoxTipo_Seguro_JhoanVicente.setSelectedIndex(0);
    respuesta_spinner_colesterol_JossueTorres.setText("");
    respuesta_spinner_glucosa_JossueTorres.setText("");
    txtrespuestahemoglobina_JhoanVicente.setText("");
    txtrespuestatipo_seguro_JhoanVicente.setText("");
    txtId.setText("");
    }//GEN-LAST:event_btnNuevo_JhoanVicenteActionPerformed

    private void txtrespuestatipo_seguro_JhoanVicenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespuestatipo_seguro_JhoanVicenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespuestatipo_seguro_JhoanVicenteActionPerformed

    private void spner_glucosa_JhoanVicenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spner_glucosa_JhoanVicenteStateChanged
        // TODO add your handling code here:
        respuesta_spinner_glucosa_JossueTorres.setText("su porcentaje de glucosa es: "+ spner_glucosa_JhoanVicente.getValue().toString() );
        
    }//GEN-LAST:event_spner_glucosa_JhoanVicenteStateChanged

    private void respuesta_spinner_colesterol_JossueTorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta_spinner_colesterol_JossueTorresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta_spinner_colesterol_JossueTorresActionPerformed

    private void spner_colesterol_JhoanVicenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spner_colesterol_JhoanVicenteStateChanged
        // TODO add your handling code here:
        respuesta_spinner_colesterol_JossueTorres.setText("su porcentaje de colesterol es: "+ spner_colesterol_JhoanVicente.getValue().toString());
    }//GEN-LAST:event_spner_colesterol_JhoanVicenteStateChanged

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }
    
    void listar() {
    String sql = "SELECT * FROM hotel";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        cn = con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);

        Object[] usuario = new Object[13];
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Datos_JhoanVicente.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de listar los datos

        while (rs.next()) {
            usuario[0] = rs.getInt("Id");
            usuario[1] = rs.getString("dni");
            usuario[2] = rs.getString("nombres");
            usuario[3] = rs.getString("apellidos");
            usuario[4] = rs.getString("fecha_nacimiento");
            usuario[5] = rs.getString("sexo");
            usuario[6] = rs.getString("celular");
            usuario[7] = rs.getString("correo");
            usuario[8] = rs.getString("direccion");
            usuario[9] = rs.getString("colesterol");
            usuario[10] = rs.getString("glucosa");
            usuario[11] = rs.getString("hemoglobina");
            usuario[12] = rs.getString("tipo_seguro");
            modelo.addRow(usuario);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar los datos: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (cn != null) cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
        }
    }
}

    
    
void agregar() {
    String dni = txt_dni_JhoanVicente.getText();
    String nombres = txt_nombres_JhoanVicente.getText();
    String apellidos = txt_apellidos_JhoanVicente.getText();
    String fecha_nacimiento = txt_fecha_nacimiento_JhoanVicente.getText();
    String sexo = RadioButtonhombre_JhoanVicente.isSelected() ? "Hombre" : "Mujer";
    String celular = txt_celular_JossueTorres.getText();
    String correo = txt_correo_JhoanVicente.getText();
    String direccion = txt_direccion_JhoanVicente.getText();
    String colesterol = spner_colesterol_JhoanVicente.getValue().toString();
    String glucosa = spner_glucosa_JhoanVicente.getValue().toString();
    String hemoglobina = ComboBoxHemoglobina_JhoanVicente.getSelectedItem().toString();
    String tipo_seguro = ComboBoxTipo_Seguro_JhoanVicente.getSelectedItem().toString();

    if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || fecha_nacimiento.isEmpty() || sexo.isEmpty() || celular.isEmpty() || correo.isEmpty() || direccion.isEmpty() || colesterol.isEmpty() || glucosa.isEmpty() || hemoglobina.isEmpty() || tipo_seguro.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Completar todos los campos");
    } else {
        String sql = "INSERT INTO hotel (dni, nombres, apellidos, fecha_nacimiento, sexo, celular, correo, direccion, colesterol, glucosa, hemoglobina, tipo_seguro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = con.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1, dni);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, fecha_nacimiento);
            pst.setString(5, sexo);
            pst.setString(6, celular);
            pst.setString(7, correo);
            pst.setString(8, direccion);
            pst.setString(9, colesterol);
            pst.setString(10, glucosa);
            pst.setString(11, hemoglobina);
            pst.setString(12, tipo_seguro);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el usuario");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el usuario: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}

    
    
    void Modificar() {
    String dni = txt_dni_JhoanVicente.getText();
    String nombres = txt_nombres_JhoanVicente.getText();
    String apellidos = txt_apellidos_JhoanVicente.getText();
    String fecha_nacimiento = txt_fecha_nacimiento_JhoanVicente.getText();
    String sexo = RadioButtonhombre_JhoanVicente.isSelected() ? "Hombre" : "Mujer";
    String celular = txt_celular_JossueTorres.getText();
    String correo = txt_correo_JhoanVicente.getText();
    String direccion = txt_direccion_JhoanVicente.getText();
    String colesterol = spner_colesterol_JhoanVicente.getValue().toString();
    String glucosa = spner_glucosa_JhoanVicente.getValue().toString();
    String hemoglobina = ComboBoxHemoglobina_JhoanVicente.getSelectedItem().toString();
    String tipo_seguro = ComboBoxTipo_Seguro_JhoanVicente.getSelectedItem().toString();

    if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || fecha_nacimiento.isEmpty() || sexo.isEmpty() || celular.isEmpty() || correo.isEmpty() || direccion.isEmpty() || colesterol.isEmpty() || glucosa.isEmpty() || hemoglobina.isEmpty() || tipo_seguro.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Necesita ingresar cambios");
    } else {
        String sql = "UPDATE hotel SET dni = ?, nombres = ?, apellidos = ?, fecha_nacimiento = ?, sexo = ?, celular = ?, correo = ?, direccion = ?, colesterol = ?, glucosa = ?, hemoglobina = ?, tipo_seguro = ? WHERE Id = ?";
        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = con.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1, dni);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, fecha_nacimiento);
            pst.setString(5, sexo);
            pst.setString(6, celular);
            pst.setString(7, correo);
            pst.setString(8, direccion);
            pst.setString(9, colesterol);
            pst.setString(10, glucosa);
            pst.setString(11, hemoglobina);
            pst.setString(12, tipo_seguro);
            pst.setInt(13, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualización completada");
            limpiar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
    
    
    void Eliminar() {
    int fila = Tabla_Datos_JhoanVicente.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona a alguien");
    } else {
        int id = (int) Tabla_Datos_JhoanVicente.getValueAt(fila, 0); // Obtener el Id del usuario seleccionado

        String sql = "DELETE FROM hotel WHERE Id = ?";
        Connection cn = null;
        PreparedStatement pst = null;

        try {
            cn = con.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setInt(1, id);

            int resultado = pst.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
    
    
    
    
    void limpiar() {
    DefaultTableModel modelo = (DefaultTableModel) Tabla_Datos_JhoanVicente.getModel();
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxHemoglobina_JhoanVicente;
    private javax.swing.JComboBox<String> ComboBoxTipo_Seguro_JhoanVicente;
    private javax.swing.JRadioButton RadioButtonhombre_JhoanVicente;
    private javax.swing.JRadioButton RadioButtonmujer_JhoanVicente;
    private javax.swing.JTable Tabla_Datos_JhoanVicente;
    private javax.swing.JButton btnAgregar_JhoanVicente;
    private javax.swing.JButton btnEditar_JhoanVicente;
    private javax.swing.JButton btnEliminar_JhoanVicente;
    private javax.swing.JButton btnNuevo_JhoanVicente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField respuesta_spinner_colesterol_JossueTorres;
    private javax.swing.JTextField respuesta_spinner_glucosa_JossueTorres;
    private javax.swing.JSpinner spner_colesterol_JhoanVicente;
    private javax.swing.JSpinner spner_glucosa_JhoanVicente;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txt_apellidos_JhoanVicente;
    private javax.swing.JTextField txt_celular_JossueTorres;
    private javax.swing.JTextField txt_correo_JhoanVicente;
    private javax.swing.JTextField txt_direccion_JhoanVicente;
    private javax.swing.JTextField txt_dni_JhoanVicente;
    private javax.swing.JTextField txt_fecha_nacimiento_JhoanVicente;
    private javax.swing.JTextField txt_nombres_JhoanVicente;
    private javax.swing.JTextField txtrespuestahemoglobina_JhoanVicente;
    private javax.swing.JTextField txtrespuestatipo_seguro_JhoanVicente;
    // End of variables declaration//GEN-END:variables
}
