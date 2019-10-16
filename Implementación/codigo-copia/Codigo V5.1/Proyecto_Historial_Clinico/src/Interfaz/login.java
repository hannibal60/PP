/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.ConexionLog;
import modelo.Usuarios;

public class login extends javax.swing.JFrame {

    ConexionLog c = null;
    Connection cn;

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        c = new ConexionLog();
        cn = c.getConexion();
        jlerror.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabelFotoPefil = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelAPaterno = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jButtonConsultar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jlerror = new javax.swing.JLabel();
        jPanelDiseño3 = new javax.swing.JPanel();
        jButtoncerrar = new javax.swing.JButton();
        jButtoncerrar1 = new javax.swing.JButton();
        jButtonminimizar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150)));

        btnEntrar.setBackground(new java.awt.Color(232, 201, 232));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(96, 83, 150));
        btnEntrar.setText("Ingresar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabelFotoPefil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono cuenta-redonda-con-usuario-dentro.png"))); // NOI18N
        jLabelFotoPefil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(96, 83, 150));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Usuario:");

        jLabelAPaterno.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAPaterno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAPaterno.setForeground(new java.awt.Color(96, 83, 150));
        jLabelAPaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAPaterno.setText("Contraseña:");

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(181, 77, 180));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("INICIO DE SESIÓN");

        jButtonConsultar1.setBackground(new java.awt.Color(232, 201, 232));
        jButtonConsultar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConsultar1.setForeground(new java.awt.Color(96, 83, 150));
        jButtonConsultar1.setText("Recuperar");
        jButtonConsultar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConsultar1.setBorderPainted(false);
        jButtonConsultar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConsultar1.setFocusPainted(false);

        jSeparator2.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator2.setForeground(new java.awt.Color(232, 201, 232));

        jSeparator3.setBackground(new java.awt.Color(232, 201, 232));
        jSeparator3.setForeground(new java.awt.Color(232, 201, 232));

        jlerror.setForeground(new java.awt.Color(255, 51, 51));
        jlerror.setText("Usuario y/o contraseña incorrecta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabelFotoPefil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlerror, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(jSeparator3))
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFotoPefil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlerror)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 590));

        jPanelDiseño3.setBackground(new java.awt.Color(96, 83, 150));

        jButtoncerrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtoncerrar.setBorder(null);
        jButtoncerrar.setBorderPainted(false);
        jButtoncerrar.setContentAreaFilled(false);
        jButtoncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtoncerrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButtoncerrar1.setBackground(new java.awt.Color(255, 255, 255));
        jButtoncerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtoncerrar1.setBorder(null);
        jButtoncerrar1.setBorderPainted(false);
        jButtoncerrar1.setContentAreaFilled(false);
        jButtoncerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtoncerrar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtoncerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoncerrar1MouseClicked(evt);
            }
        });

        jButtonminimizar1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonminimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        jButtonminimizar1.setBorderPainted(false);
        jButtonminimizar1.setContentAreaFilled(false);
        jButtonminimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonminimizar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonminimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonminimizar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelDiseño3Layout = new javax.swing.GroupLayout(jPanelDiseño3);
        jPanelDiseño3.setLayout(jPanelDiseño3Layout);
        jPanelDiseño3Layout.setHorizontalGroup(
            jPanelDiseño3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDiseño3Layout.createSequentialGroup()
                .addContainerGap(930, Short.MAX_VALUE)
                .addComponent(jButtoncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonminimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtoncerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanelDiseño3Layout.setVerticalGroup(
            jPanelDiseño3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiseño3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDiseño3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtoncerrar1)
                    .addComponent(jButtonminimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoncerrar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDiseño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150)));
        jPanel2.setForeground(new java.awt.Color(96, 83, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 670, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuarios mod = new Usuarios();
        if (!txtUsuario.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
            String pass = new String(txtPassword.getPassword());
            String correo = txtUsuario.getText();
            if (c.existecorreo(txtUsuario.getText(), cn)) {
                String[] datosuario = c.infor(correo, cn);
                if (compruevapass(pass, datosuario)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido", JOptionPane.QUESTION_MESSAGE);///alerta
                    jlerror.setForeground(Color.white);
                    String nuevoPass = Hash.sha1(pass); ///HASH
                    //this.dispose();
                    //Pantallainicio p = new Pantallainicio();
                    Ventana_Paciente ir= new Ventana_Paciente();
                    ir.setVisible(true);
                    ir.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    jlerror.setText("Contraseña incorrecto");
                    jlerror.setForeground(Color.red);
                }
            } else {
                jlerror.setText("Usuario incorrecto");
                jlerror.setForeground(Color.red);
            }
        } else {
            jlerror.setForeground(Color.red);
        }
        limpiar();
        btnEntrar.getRootPane().setDefaultButton(null);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_btnEntrarActionPerformed
    public boolean compruevapass(String pass, String[] dato) {
        if (pass.equals(dato[3])) {
            return true;
        } else {
            return false;
        }
    }

    private void jButtoncerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoncerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtoncerrar1MouseClicked

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getRootPane().setDefaultButton(btnEntrar);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jButtonminimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonminimizar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButtonminimizar1MouseClicked

    private void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButtonConsultar1;
    private javax.swing.JButton jButtoncerrar;
    private javax.swing.JButton jButtoncerrar1;
    private javax.swing.JButton jButtonminimizar1;
    private javax.swing.JLabel jLabelAPaterno;
    private javax.swing.JLabel jLabelFotoPefil;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDiseño3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlerror;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
