/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Model.Employee;
import Model.EmployeeModify;
import java.awt.*;
import javax.swing.*;
import projectsem2.Main;

/**
 *
 * @author KHANH VY
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        txtPass2.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMini = new javax.swing.JPanel();
        txtPass = new javax.swing.JTextField();
        txtPass2 = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        chkBox = new javax.swing.JCheckBox();
        javax.swing.JLabel btnExit = new javax.swing.JLabel();
        javax.swing.JLabel btnExit1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 400, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 3, 430, 500));

        btnMini.setBackground(new java.awt.Color(255, 255, 255));
        btnMini.setForeground(new java.awt.Color(51, 51, 51));
        btnMini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        txtPass.setForeground(new java.awt.Color(51, 51, 51));
        txtPass.setText("Enter Password...");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        btnMini.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 50));

        txtPass2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        txtPass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPass2FocusLost(evt);
            }
        });
        btnMini.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        txtUser.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setText("Enter Username...");
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        btnMini.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 50));

        btnSignIn.setBackground(new java.awt.Color(0, 181, 204));
        btnSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        lblLogin.setText(" SIGN IN");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        btnSignIn.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        btnMini.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 160, 60));

        chkBox.setBackground(new java.awt.Color(255, 255, 255));
        chkBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        chkBox.setText(" Show Password");
        chkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxActionPerformed(evt);
            }
        });
        btnMini.add(chkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 30));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 181, 204));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnMini.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        btnExit1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(0, 181, 204));
        btnExit1.setText("_");
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit1MouseEntered(evt);
            }
        });
        btnMini.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        lblError.setForeground(new java.awt.Color(255, 0, 51));
        btnMini.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        getContentPane().add(btnMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 430, 510));

        setSize(new java.awt.Dimension(857, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
// CODE OF EDIT TEXT IN USER AND PASS FIELD    
    
    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
         if(txtUser.getText().equals("Enter Username..."))
            {
                txtUser.setText("");
                repaint();
                revalidate();
                lblError.setText("");
            }    
    }//GEN-LAST:event_txtUserMousePressed

    
    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(txtPass.getText().equals(""))
            { 
                txtPass.setText("Enter Password...");
                repaint();
                revalidate();
            }   
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if(txtPass.getText().equals("Enter Password..."))
            {
                txtPass.setText("");
                repaint();
                revalidate();
                txtPass.setVisible(false);
                txtPass2.setVisible(true);
                txtPass2.requestFocusInWindow();
                lblError.setText("");
            }  
        
        //txtPass.setEchoChar("*");
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusLost
        if(txtPass2.getText().equals(""))
            { 
                txtPass.setVisible(true);
                txtPass.setText("Enter Password...");
                repaint();
                revalidate();
            }  
    }//GEN-LAST:event_txtPass2FocusLost

    private void chkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxActionPerformed
        if (chkBox.isSelected()) 
        {
            txtPass2.setEchoChar((char)0);
        }else
        {
            txtPass2.setEchoChar('*');
        }
    }//GEN-LAST:event_chkBoxActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseEntered
        //btnExit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExit1MouseEntered

// CODE OF LOGIN VALIDATION AND ERROR DISPLAY
    
    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        String user  = txtUser.getText();
        String pass  = txtPass.getText();
        String pass2 = txtPass2.getText();
        
        if (user.trim().equals("")  || user.trim().equals("Enter Username...") ||
            pass2.trim().equals("") || pass.trim().equals("Enter Password..."))
        {
            lblError.setText("Please enter username and password!");
        } else 
        {
            Employee emp = EmployeeModify.checkLogin(user, pass2);
             if(emp==null) {
                 lblError.setText("Username and Password not valid!");
             }
             else{
            //Home home = new Home();
            //home.show();
            lblError.setText("Login Successfull!");
            Main main = new Main();
            main.show();
            this.dispose();
             }
        }
    }//GEN-LAST:event_lblLoginMouseClicked

//CODE OF SIGN IN BUTTON WHEN HOVER
    
    public void setColor(JPanel p){
        p.setBackground(new Color(0, 204, 204)); 
    }
    
    public void resetColor(JPanel p1){
        p1.setBackground(new Color(0, 181, 204)); 
    }
    
    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        setColor(btnSignIn);
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        resetColor(btnSignIn);
    }//GEN-LAST:event_lblLoginMouseExited

    
    
    
// CODE OF EDIT TEXT IN USER AND PASS FIELD (cont)
    
    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().equals(""))
            { 
                txtUser.setText("Enter Username...");
                repaint();
                revalidate();
            }   
    }//GEN-LAST:event_txtUserFocusLost

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnMini;
    private javax.swing.JPanel btnSignIn;
    private javax.swing.JCheckBox chkBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}