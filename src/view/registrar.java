/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.UserController;
import javax.swing.*;
/**
 *
 * @author Camilo Jurado
 */
public class registrar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public registrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        JTextField_nombreReg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        JTextField_ApellidoReg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextField_TelReg = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        JTextField_UsuarioReg = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        JTextField_IdReg = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        JTextField_EmailReg = new javax.swing.JTextField();
        jPasswordField_passLogin = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 10));

        jLabel6.setText("nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 51, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 210, 10));

        JTextField_nombreReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_nombreRegActionPerformed(evt);
            }
        });
        jPanel2.add(JTextField_nombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 213, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\Resourse\\usuario.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 66, -1, -1));

        jLabel2.setText("Correo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 66, 51, -1));

        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 137, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\Resourse\\candado.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 137, -1, -1));

        button.setText("Ingresar");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        jPanel2.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 94, 38));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 210, 10));

        jLabel7.setText("Apellido:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 51, 20));

        JTextField_ApellidoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_ApellidoRegActionPerformed(evt);
            }
        });
        jPanel2.add(JTextField_ApellidoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 213, 30));

        jLabel9.setText("Telefono:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 51, 20));

        JTextField_TelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_TelRegActionPerformed(evt);
            }
        });
        jPanel2.add(JTextField_TelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 213, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 210, 40));

        jLabel10.setText("Usuario:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 51, 20));

        JTextField_UsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_UsuarioRegActionPerformed(evt);
            }
        });
        jPanel2.add(JTextField_UsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 213, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        jLabel11.setText("identificacion:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 90, 20));

        JTextField_IdReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_IdRegActionPerformed(evt);
            }
        });
        jPanel2.add(JTextField_IdReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 213, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 20));
        jPanel2.add(JTextField_EmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, -1));
        jPanel2.add(jPasswordField_passLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 560, 430));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 190, 490));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\Nueva carpeta\\download (9).jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String correo = JTextField_EmailReg.getText();
        String nombre = JTextField_nombreReg.getText();
        String apellido = JTextField_ApellidoReg.getText();
        String user = JTextField_UsuarioReg.getText();
        String contraseña = jPasswordField_passLogin.getText();
        String telefono = JTextField_TelReg.getText();
        String id = JTextField_IdReg.getText();
        
        if (correo.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || 
              user.isEmpty() || contraseña.isEmpty()){     
            JOptionPane.showMessageDialog(this, "Por favor, digite todos los campos");   
            return;
            
        }   
        
       UserController controlador = new UserController();
    boolean registrado = controlador.registroUsuario(id, nombre, apellido, correo, telefono, user, contraseña);

    if (registrado) {
        JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
              new Sesion().setVisible (true);
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el usuario. Inténtelo de nuevo.");}
        
        
  
    }//GEN-LAST:event_buttonActionPerformed

    private void JTextField_nombreRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_nombreRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_nombreRegActionPerformed

    private void JTextField_ApellidoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_ApellidoRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_ApellidoRegActionPerformed

    private void JTextField_TelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_TelRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_TelRegActionPerformed

    private void JTextField_UsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_UsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_UsuarioRegActionPerformed

    private void JTextField_IdRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_IdRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_IdRegActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar().setVisible(true);
}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextField_ApellidoReg;
    private javax.swing.JTextField JTextField_EmailReg;
    private javax.swing.JTextField JTextField_IdReg;
    private javax.swing.JTextField JTextField_TelReg;
    private javax.swing.JTextField JTextField_UsuarioReg;
    private javax.swing.JTextField JTextField_nombreReg;
    private javax.swing.JButton button;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_passLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
