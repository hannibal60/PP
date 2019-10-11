/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregar_m;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alan
 */
public class AM extends javax.swing.JFrame {

    /**
     * Creates new form AM
     */
    public AM() {
        initComponents();
        ocultamensajes(Color.white);
        camestado(false);
        jtfnombre.requestFocus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        panelprincipal = new javax.swing.JPanel();
        paneldatospersonales = new javax.swing.JPanel();
        jLabelNombre4 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabelNombre6 = new javax.swing.JLabel();
        jLabelNombre5 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabelNombre7 = new javax.swing.JLabel();
        jtfcurp = new javax.swing.JTextField();
        jedad = new com.toedter.calendar.JDateChooser();
        jtftelefono = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jtfrfc = new javax.swing.JTextField();
        jLabelNombre8 = new javax.swing.JLabel();
        jltitulovalidar1 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jtfespecialidad = new javax.swing.JTextField();
        jLabelNombre9 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jtfcorreo = new javax.swing.JTextField();
        jLabelNombre10 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabelNombre11 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabelNombre12 = new javax.swing.JLabel();
        jbsalir = new javax.swing.JButton();
        jbagregar = new javax.swing.JButton();
        jlmensacont = new javax.swing.JLabel();
        jlmensajeerror4 = new javax.swing.JLabel();
        jlmensajeerror3 = new javax.swing.JLabel();
        jcbsexo = new javax.swing.JComboBox<>();
        jcbmostrarcontrasena = new javax.swing.JCheckBox();
        jtfcontrasena = new javax.swing.JPasswordField();
        jtfcontrasena2 = new javax.swing.JPasswordField();
        panelverificar = new javax.swing.JPanel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabelNombre1 = new javax.swing.JLabel();
        jtfsegape = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabelNombre = new javax.swing.JLabel();
        jtfprimerape = new javax.swing.JTextField();
        jltitu = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        jBConsultar = new javax.swing.JButton();
        jLabelNombre3 = new javax.swing.JLabel();
        jlmensajeerror = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jtfnombre1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jtfnombre2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jtfnombre3 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jtfcedula = new javax.swing.JTextField();
        jlmensajeerror1 = new javax.swing.JLabel();
        panelbarrasuperior = new javax.swing.JPanel();
        jButtonminimizar = new javax.swing.JButton();
        jButtoncerrar = new javax.swing.JButton();
        jButtonregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setPreferredSize(new java.awt.Dimension(960, 980));

        paneldatospersonales.setBackground(new java.awt.Color(255, 255, 255));
        paneldatospersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 255))); // NOI18N
        paneldatospersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre4.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre4.setText("Sexo:");
        paneldatospersonales.add(jLabelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator11.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 116, 200, 10));

        jLabelNombre6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre6.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre6.setText("Telefono:");
        paneldatospersonales.add(jLabelNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabelNombre5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre5.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre5.setText("Fecha de nacimiento:");
        paneldatospersonales.add(jLabelNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator13.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 176, 200, 10));

        jSeparator12.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator12.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 176, 200, 10));

        jLabelNombre7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre7.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre7.setText("CURP:");
        paneldatospersonales.add(jLabelNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jtfcurp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfcurp.setForeground(new java.awt.Color(96, 83, 150));
        jtfcurp.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfcurp.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfcurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfcurpKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jtfcurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 200, 26));

        jedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jedadKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 200, 26));

        jtftelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtftelefono.setForeground(new java.awt.Color(96, 83, 150));
        jtftelefono.setMaximumSize(new java.awt.Dimension(48, 26));
        jtftelefono.setMinimumSize(new java.awt.Dimension(48, 26));
        jtftelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtftelefonoKeyTyped(evt);
            }
        });
        paneldatospersonales.add(jtftelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, 26));

        jSeparator14.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator14.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 236, 200, 10));

        jtfrfc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfrfc.setForeground(new java.awt.Color(96, 83, 150));
        jtfrfc.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfrfc.setMinimumSize(new java.awt.Dimension(48, 26));
        paneldatospersonales.add(jtfrfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 200, 26));

        jLabelNombre8.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre8.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre8.setText("RFC:");
        paneldatospersonales.add(jLabelNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 213, -1, 20));

        jltitulovalidar1.setBackground(new java.awt.Color(255, 255, 255));
        jltitulovalidar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jltitulovalidar1.setForeground(new java.awt.Color(181, 77, 180));
        jltitulovalidar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulovalidar1.setText("Información Personal:");
        paneldatospersonales.add(jltitulovalidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 40));

        jSeparator15.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator15.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 236, 200, 10));

        jtfespecialidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfespecialidad.setForeground(new java.awt.Color(96, 83, 150));
        jtfespecialidad.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfespecialidad.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfespecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfespecialidadMouseClicked(evt);
            }
        });
        jtfespecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfespecialidadKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jtfespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 26));

        jLabelNombre9.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre9.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre9.setText("Especialidad:");
        paneldatospersonales.add(jLabelNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jSeparator18.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator18.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 296, 200, 10));

        jtfcorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfcorreo.setForeground(new java.awt.Color(96, 83, 150));
        jtfcorreo.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfcorreo.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfcorreoKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jtfcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, 26));

        jLabelNombre10.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre10.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre10.setText("Correo:");
        paneldatospersonales.add(jLabelNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jSeparator19.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator19.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 356, 200, 10));

        jLabelNombre11.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre11.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre11.setText("Contraseña:");
        paneldatospersonales.add(jLabelNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jSeparator20.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator20.setForeground(new java.awt.Color(232, 201, 232));
        paneldatospersonales.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 356, 200, 10));

        jLabelNombre12.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre12.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre12.setText("Repetir contraseña: ");
        paneldatospersonales.add(jLabelNombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jbsalir.setBackground(new java.awt.Color(232, 201, 232));
        jbsalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(96, 83, 150));
        jbsalir.setText("Salir");
        jbsalir.setBorderPainted(false);
        jbsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbsalir.setFocusPainted(false);
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        paneldatospersonales.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 140, -1));

        jbagregar.setBackground(new java.awt.Color(232, 201, 232));
        jbagregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbagregar.setForeground(new java.awt.Color(96, 83, 150));
        jbagregar.setText("Agregar");
        jbagregar.setBorderPainted(false);
        jbagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbagregar.setFocusPainted(false);
        jbagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarActionPerformed(evt);
            }
        });
        paneldatospersonales.add(jbagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 140, -1));

        jlmensacont.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlmensacont.setForeground(new java.awt.Color(218, 2, 2));
        jlmensacont.setText("Contraseña no coincide");
        paneldatospersonales.add(jlmensacont, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 130, 20));

        jlmensajeerror4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlmensajeerror4.setForeground(new java.awt.Color(218, 2, 2));
        jlmensajeerror4.setText("Correo incorrecto");
        paneldatospersonales.add(jlmensajeerror4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 20));

        jlmensajeerror3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlmensajeerror3.setForeground(new java.awt.Color(218, 2, 2));
        jlmensajeerror3.setText("Llene todos los campos");
        paneldatospersonales.add(jlmensajeerror3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, 20));

        jcbsexo.setBackground(new java.awt.Color(251, 244, 251));
        jcbsexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcbsexo.setForeground(new java.awt.Color(96, 83, 150));
        jcbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jcbsexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbsexoKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jcbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, 26));

        jcbmostrarcontrasena.setBackground(new java.awt.Color(255, 255, 255));
        paneldatospersonales.add(jcbmostrarcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 20, 30));

        jtfcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfcontrasenaKeyPressed(evt);
            }
        });
        paneldatospersonales.add(jtfcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 26));

        jtfcontrasena2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfcontrasena2KeyPressed(evt);
            }
        });
        paneldatospersonales.add(jtfcontrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 200, 26));

        panelverificar.setBackground(new java.awt.Color(255, 255, 255));
        panelverificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(232, 201, 232))); // NOI18N
        panelverificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator17.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator17.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 250, 10));

        jLabelNombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre1.setText("Segundo apellido*");
        panelverificar.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jtfsegape.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfsegape.setForeground(new java.awt.Color(102, 102, 102));
        jtfsegape.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfsegape.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfsegape.setPreferredSize(new java.awt.Dimension(48, 26));
        jtfsegape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfsegapeMouseClicked(evt);
            }
        });
        jtfsegape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfsegapeKeyPressed(evt);
            }
        });
        panelverificar.add(jtfsegape, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 114, 250, 26));

        jSeparator16.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator16.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 140, 250, 10));

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre.setText("Primer apellido*");
        panelverificar.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, -1));

        jtfprimerape.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfprimerape.setForeground(new java.awt.Color(102, 102, 102));
        jtfprimerape.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfprimerape.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfprimerape.setPreferredSize(new java.awt.Dimension(48, 26));
        jtfprimerape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfprimerapeMouseClicked(evt);
            }
        });
        jtfprimerape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfprimerapeKeyPressed(evt);
            }
        });
        panelverificar.add(jtfprimerape, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 114, 250, 26));

        jltitu.setBackground(new java.awt.Color(255, 255, 255));
        jltitu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jltitu.setForeground(new java.awt.Color(181, 77, 180));
        jltitu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitu.setText("Verificacion de cedula:");
        panelverificar.add(jltitu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 40));

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(181, 77, 180));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("Agregar Medico:");
        panelverificar.add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 280, 40));

        jtfnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfnombre.setForeground(new java.awt.Color(102, 102, 102));
        jtfnombre.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfnombre.setMinimumSize(new java.awt.Dimension(48, 26));
        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfnombreKeyPressed(evt);
            }
        });
        panelverificar.add(jtfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 250, 26));

        jLabelNombre2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre2.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre2.setText("Número de Cedula:");
        panelverificar.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jBConsultar.setBackground(new java.awt.Color(232, 201, 232));
        jBConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBConsultar.setForeground(new java.awt.Color(96, 83, 150));
        jBConsultar.setText("Consultar");
        jBConsultar.setBorderPainted(false);
        jBConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBConsultar.setFocusPainted(false);
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        panelverificar.add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, -1));

        jLabelNombre3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNombre3.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre3.setText("Nombre(s)*");
        panelverificar.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jlmensajeerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlmensajeerror.setForeground(new java.awt.Color(218, 2, 2));
        jlmensajeerror.setText("Llene todos los campos");
        panelverificar.add(jlmensajeerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 20));

        jSeparator5.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator5.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 10));

        jSeparator6.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator6.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 10));

        jtfnombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfnombre1.setForeground(new java.awt.Color(102, 102, 102));
        jtfnombre1.setText("Carlos");
        jtfnombre1.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfnombre1.setMinimumSize(new java.awt.Dimension(48, 26));
        panelverificar.add(jtfnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 250, 26));

        jSeparator7.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator7.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 10));

        jtfnombre2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfnombre2.setForeground(new java.awt.Color(102, 102, 102));
        jtfnombre2.setText("Carlos");
        jtfnombre2.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfnombre2.setMinimumSize(new java.awt.Dimension(48, 26));
        panelverificar.add(jtfnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 250, 26));

        jSeparator8.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator8.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 10));

        jtfnombre3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfnombre3.setForeground(new java.awt.Color(102, 102, 102));
        jtfnombre3.setText("Carlos");
        jtfnombre3.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfnombre3.setMinimumSize(new java.awt.Dimension(48, 26));
        panelverificar.add(jtfnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 250, 26));

        jSeparator9.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator9.setForeground(new java.awt.Color(232, 201, 232));
        panelverificar.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 306, 250, 10));

        jtfcedula.setEditable(false);
        jtfcedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfcedula.setForeground(new java.awt.Color(102, 102, 102));
        jtfcedula.setText("a");
        jtfcedula.setMaximumSize(new java.awt.Dimension(48, 26));
        jtfcedula.setMinimumSize(new java.awt.Dimension(48, 26));
        panelverificar.add(jtfcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 280, 250, 26));

        jlmensajeerror1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlmensajeerror1.setForeground(new java.awt.Color(218, 2, 2));
        jlmensajeerror1.setText("Cedula inexistente");
        panelverificar.add(jlmensajeerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 20));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldatospersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelverificar, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                .addComponent(panelverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(paneldatospersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(panelprincipal);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 650));

        panelbarrasuperior.setBackground(new java.awt.Color(96, 83, 150));
        panelbarrasuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonminimizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        jButtonminimizar.setBorderPainted(false);
        jButtonminimizar.setContentAreaFilled(false);
        jButtonminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonminimizar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonminimizarMouseClicked(evt);
            }
        });
        panelbarrasuperior.add(jButtonminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 10, 34, 33));

        jButtoncerrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtoncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtoncerrar.setBorder(null);
        jButtoncerrar.setBorderPainted(false);
        jButtoncerrar.setContentAreaFilled(false);
        jButtoncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtoncerrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtoncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoncerrarMouseClicked(evt);
            }
        });
        panelbarrasuperior.add(jButtoncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 10, -1, -1));

        jButtonregresar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButtonregresar.setBorderPainted(false);
        jButtonregresar.setContentAreaFilled(false);
        jButtonregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonregresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panelbarrasuperior.add(jButtonregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 10, 35, 33));

        getContentPane().add(panelbarrasuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ocultamensajes(Color a) {
        jlmensajeerror1.setForeground(a);
        jlmensajeerror.setForeground(a);
        jlmensacont.setForeground(a);
        jlmensajeerror3.setForeground(a);
        jlmensajeerror4.setForeground(a);
    }

    public void mostcont(JCheckBox j) {
        if (j.isSelected()) {
            jtfcontrasena.setEchoChar((char) 0);
        }
    }
    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        jlmensajeerror.setForeground(Color.white);
        if (jtfnombre.getText().isEmpty() | jtfprimerape.getText().isEmpty() | jtfsegape.getText().isEmpty()) {
            jlmensajeerror.setForeground(Color.red);
        } else {
            //buscacedula();
            if (!jtfcedula.getText().isEmpty()) {
                camestado(true);
                jlmensajeerror1.setForeground(Color.blue);
                jlmensajeerror1.setText("Cedula valida");
                jcbsexo.requestFocus();
                jtfnombre.setEditable(false);
                jtfprimerape.setEditable(false);
                jtfsegape.setEditable(false);
            } else {
                jlmensajeerror1.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jButtoncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoncerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtoncerrarMouseClicked

    private void jButtonminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonminimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButtonminimizarMouseClicked

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbagregarActionPerformed
        Date edad = null;
        jlmensacont.setForeground(Color.white);
        if (jedad.getDate() != null) {
            edad = jedad.getDate();
            if (jtftelefono.getText().isEmpty() | jtfespecialidad.getText().isEmpty()
                    | jtfcorreo.getText().isEmpty() | jtfcurp.getText().isEmpty() | jtfrfc.getText().isEmpty()
                    | jtfcontrasena.getText().isEmpty() | jtfcontrasena2.getText().isEmpty()) {
                jlmensacont.setForeground(Color.red);
            } else {
                JOptionPane.showMessageDialog(null, "El medico ha sido agregado", "Medico Agregado", JOptionPane.WARNING_MESSAGE);///alerta
                limp();
                jedad.setDateFormatString("");
                ocultamensajes(Color.white);
                camestado(false);
                jtfnombre.setEditable(true);
                jtfprimerape.setEditable(true);
                jtfsegape.setEditable(true);
                jtfnombre.requestFocus();
            }
        } else {
            jlmensacont.setForeground(Color.red);
        }

    }//GEN-LAST:event_jbagregarActionPerformed

    private void jedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jedadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Robot Tecla = new Robot();
                Tecla.keyPress(KeyEvent.VK_TAB);
            } catch (AWTException ex) {
                Logger.getLogger(AM.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jedadKeyPressed

    private void jtfnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (!jtfnombre.getText().isEmpty() && jtfnombre.getText().length() > 1) {
                jtfprimerape.requestFocus();
            }
        }
    }//GEN-LAST:event_jtfnombreKeyPressed

    private void jtfprimerapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfprimerapeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (!jtfprimerape.getText().isEmpty() && jtfnombre.getText().length() > 1) {
                jtfsegape.requestFocus();
            }
        }
    }//GEN-LAST:event_jtfprimerapeKeyPressed

    private void jtfsegapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfsegapeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (!jtfsegape.getText().isEmpty() && jtfnombre.getText().length() > 1) {
                getRootPane().setDefaultButton(jBConsultar);
            }
        }
    }//GEN-LAST:event_jtfsegapeKeyPressed

    private void jtfprimerapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfprimerapeMouseClicked
        if (!jtfnombre.getText().isEmpty() && jtfnombre.getText().length() > 1) {
            jtfprimerape.requestFocus();
        } else {
            jtfnombre.requestFocus();
        }
    }//GEN-LAST:event_jtfprimerapeMouseClicked

    private void jtfsegapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfsegapeMouseClicked
        if (jtfnombre.getText().isEmpty()) {
            jtfnombre.requestFocus();
        } else if (jtfnombre.getText().length() <= 1) {
            jtfnombre.requestFocus();
        } else if (jtfprimerape.getText().isEmpty()) {
            jtfprimerape.requestFocus();
        } else if (jtfprimerape.getText().length() <= 1) {
            jtfprimerape.requestFocus();
        } else {
            jtfsegape.requestFocus();
        }

    }//GEN-LAST:event_jtfsegapeMouseClicked

    private void jcbsexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbsexoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Robot Tecla = new Robot();
                Tecla.keyPress(KeyEvent.VK_TAB);
            } catch (AWTException ex) {
                Logger.getLogger(AM.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jcbsexoKeyPressed

    private void jtftelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            jtfcurp.requestFocus();
        }
    }//GEN-LAST:event_jtftelefonoKeyPressed

    private void jtfcurpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcurpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            jtfespecialidad.requestFocus();
            asignarfc();
        }
    }//GEN-LAST:event_jtfcurpKeyPressed
    public void asignarfc() {
        if (!jtfcurp.getText().isEmpty()) {
            String a = jtfcurp.getText();
            String b = "";
            for (int i = 0; i < a.length(); i++) {
                if (i < 10) {
                    b = b + a.charAt(i);
                } else {
                    i = a.length();
                }
            }
            jtfrfc.setText(b);
        }
    }
    private void jtftelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtftelefonoKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isDigit(car)) {
            if (Character.isSpace(car)) {
            } else {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtftelefonoKeyTyped

    private void jtfespecialidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfespecialidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            jtfcorreo.requestFocus();
        }
    }//GEN-LAST:event_jtfespecialidadKeyPressed

    private void jtfcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            String a = jtfcorreo.getText();
            if (a.contains("@")) {
                jtfcontrasena.requestFocus();
                jlmensajeerror4.setForeground(Color.white);
            } else {
                jtfcorreo.requestFocus();
                jlmensajeerror4.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jtfcorreoKeyPressed

    private void jtfespecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfespecialidadMouseClicked
        asignarfc();
    }//GEN-LAST:event_jtfespecialidadMouseClicked

    private void jtfcontrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcontrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_TAB) {
            jtfcontrasena2.requestFocus();
        }
    }//GEN-LAST:event_jtfcontrasenaKeyPressed

    private void jtfcontrasena2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcontrasena2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String a = Arrays.toString(jtfcontrasena2.getPassword());

            if (a.equals(jtfcontrasena2)) {
                jlmensacont.setForeground(Color.white);
                getRootPane().setDefaultButton(jbagregar);
            }else{
                jtfcontrasena2.selectAll();
                jlmensacont.setForeground(Color.red);}
        }
    }//GEN-LAST:event_jtfcontrasena2KeyPressed
    public void longmax(JTextField a, java.awt.event.KeyEvent evt) {
        int max = 15;
        char car = evt.getKeyChar();
        if (a.getText().length() >= max) {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == 39) {
            getToolkit().beep();
            evt.consume();
        }
    }

    public void camestado(boolean t) {
        jtftelefono.setEditable(t);
        jtfespecialidad.setEditable(t);
        jtfcorreo.setEditable(t);
        jtfcurp.setEditable(t);
        jtfrfc.setEditable(t);
        jtfcontrasena.setEditable(t);
        jtfcontrasena2.setEditable(t);
        jedad.setEnabled(t);
        jbagregar.setEnabled(t);
        jcbsexo.setEnabled(t);
    }

    public void limp() {
        jtftelefono.setText("");
        jtfespecialidad.setText("");
        jtfcorreo.setText("");
        jtfcurp.setText("");
        jtfrfc.setText("");
        jtfcontrasena.setText("");
        jtfcontrasena2.setText("");
        jedad.cleanup();
        jbagregar.setText("");
        jtfnombre.setText("");
        jtfprimerape.setText("");
        jtfsegape.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        AM am = new AM();
        am.setResizable(false);
        am.setLocationRelativeTo(null);
        am.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jButtoncerrar;
    private javax.swing.JButton jButtonminimizar;
    private javax.swing.JButton jButtonregresar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre12;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbagregar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JCheckBox jcbmostrarcontrasena;
    private javax.swing.JComboBox<String> jcbsexo;
    private com.toedter.calendar.JDateChooser jedad;
    private javax.swing.JLabel jlmensacont;
    private javax.swing.JLabel jlmensajeerror;
    private javax.swing.JLabel jlmensajeerror1;
    private javax.swing.JLabel jlmensajeerror3;
    private javax.swing.JLabel jlmensajeerror4;
    private javax.swing.JLabel jltitu;
    private javax.swing.JLabel jltitulovalidar1;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JPasswordField jtfcontrasena;
    private javax.swing.JPasswordField jtfcontrasena2;
    private javax.swing.JTextField jtfcorreo;
    private javax.swing.JTextField jtfcurp;
    private javax.swing.JTextField jtfespecialidad;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtfnombre1;
    private javax.swing.JTextField jtfnombre2;
    private javax.swing.JTextField jtfnombre3;
    private javax.swing.JTextField jtfprimerape;
    private javax.swing.JTextField jtfrfc;
    private javax.swing.JTextField jtfsegape;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JPanel panelbarrasuperior;
    private javax.swing.JPanel paneldatospersonales;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JPanel panelverificar;
    // End of variables declaration//GEN-END:variables

}
