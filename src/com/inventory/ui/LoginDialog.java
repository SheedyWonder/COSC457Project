
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory.ui;

import com.inventory.database.ConnectionFactory;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JOptionPane;

public class LoginDialog extends javax.swing.JDialog {

 
    public LoginDialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox = new javax.swing.JComboBox();
        usernameLab = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginBttn = new javax.swing.JLabel();
        clearBttn = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRATOR", "NORMAL USER" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, 253, 54));

        usernameLab.setBackground(new java.awt.Color(255, 255, 255));
        usernameLab.setText("Username");
        getContentPane().add(usernameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 241, -1, -1));

        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 235, 188, 29));

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, -1, -1));

        loginBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/login_2.png"))); // NOI18N
        loginBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBttnMouseClicked(evt);
            }
        });
        loginBttn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBttnKeyPressed(evt);
            }
        });
        getContentPane().add(loginBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 337, -1, 48));

        clearBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/ui/images/clear_1.png"))); // NOI18N
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });
        getContentPane().add(clearBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 333, -1, -1));

        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTxtKeyTyped(evt);
            }
        });
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 295, 188, 29));

        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 386, -1, -1));

        jLabel4.setText("Clear");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 386, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("Total");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 102, 38));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setText("Health");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 122, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Centers");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, 166, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed
  
    private String encryptPassword(String input){
        String encPass=null;
        if(input==null) return null;
        
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return encPass;
    }
    
    String user;
    private void loginBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBttnMouseClicked
        String username=usernameTxt.getText();
        String p=passwordTxt.getText();
        String password= p;
        user=(String)comboBox.getSelectedItem();
        
        if(new ConnectionFactory().checkLogin(username,password,user)==true){
            dispose();
            new Dashboard(user,username);
        }else{
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }//GEN-LAST:event_loginBttnMouseClicked

    
    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        usernameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_clearBttnMouseClicked

    private void loginBttnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginBttnKeyPressed

    }//GEN-LAST:event_loginBttnKeyPressed

    private void passwordTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyTyped

    }//GEN-LAST:event_passwordTxtKeyTyped

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed
    
    public String getUser(){
        return user;
    }
    
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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clearBttn;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loginBttn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel usernameLab;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
