package OutsidePackage;


import ForgotPassword.EnterID;
import InternalPackage.CustomersDB;
import InternalPackage.Dashboard;
import InternalPackage.ManagersDB;
import config.Session;
import config.dbconnect;
import static config.passwordHasher.hashPassword;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import java.sql.*;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class login extends javax.swing.JFrame {

    
  
    public login() {
        initComponents();
        
       
    }
       
public static boolean login(String username, String password) {
    dbconnect db = new dbconnect();
    String query = "SELECT * FROM customer WHERE cs_user = ? AND cs_status = 'active'";

    try (Connection conn = db.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, username);
        ResultSet resultSet = pstmt.executeQuery();

        if (resultSet.next()) {
            String storedPassword = resultSet.getString("cs_pass");
            String userType = resultSet.getString("cs_type");
            String hashedInputPassword = hashPassword(password);

            // Rehash if old password is plaintext
            if (!storedPassword.matches("[a-fA-F0-9]{64}")) {
                System.out.println("Rehashing old plaintext password...");
                String newHashedPassword = hashPassword(storedPassword);

                try (PreparedStatement updateStmt = conn.prepareStatement(
                        "UPDATE customer SET cs_pass = ? WHERE cs_user = ?")) {
                    updateStmt.setString(1, newHashedPassword);
                    updateStmt.setString(2, username);
                    updateStmt.executeUpdate();
                }

                storedPassword = newHashedPassword;
            }

            if (hashedInputPassword.equals(storedPassword)) {
                JOptionPane.showMessageDialog(null, "Login Successful!");

                // Store logged-in username
                dbconnect.loggedInUsername = username;

                // Load user session details
                Session sess = Session.getInstance();
                sess.setUid(resultSet.getString("id"));
                sess.setFname(resultSet.getString("cs_fname"));
                sess.setLname(resultSet.getString("cs_lname"));
                sess.setEmail(resultSet.getString("cs_email"));
                sess.setContact(resultSet.getString("cs_contact"));
                sess.setAddress(resultSet.getString("cs_address"));
                sess.setUser(username);
                sess.setType(userType);
                sess.setStatus(resultSet.getString("cs_status"));

                String actions = "Log in!";
                try (PreparedStatement logStmt = conn.prepareStatement(
                        "INSERT INTO logs (id, actions, date) VALUES (?, ?, ?)")) {
                    logStmt.setString(1, sess.getUid());
                    logStmt.setString(2, actions);
                    logStmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                    logStmt.executeUpdate();
                }

                // Open appropriate dashboard
                switch (userType.toLowerCase()) {
                    case "customer":
                        new CustomersDB().setVisible(true);
                        break;
                    case "manager":
                        new ManagersDB().setVisible(true);
                        break;
                    case "admin":
                        new Dashboard().setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unknown user type!", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "User not found or inactive!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
  
  
     Color hover = new Color(153,153,153);  
    Color defbutton = new Color(102,102,102);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RegAccButton = new javax.swing.JButton();
        Signin1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        logshow = new javax.swing.JLabel();
        loghide = new javax.swing.JLabel();
        logpass = new javax.swing.JPasswordField();
        loghide1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("First Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("First Name");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegAccButton.setBackground(new java.awt.Color(102, 102, 102));
        RegAccButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        RegAccButton.setText("Create new account");
        RegAccButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegAccButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegAccButtonMouseExited(evt);
            }
        });
        RegAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAccButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 280, 60));

        Signin1.setBackground(new java.awt.Color(102, 102, 102));
        Signin1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Signin1.setText("Sign In");
        Signin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Signin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Signin1MouseExited(evt);
            }
        });
        Signin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signin1ActionPerformed(evt);
            }
        });
        Signin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Signin1KeyPressed(evt);
            }
        });
        jPanel1.add(Signin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 141, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo_Logo-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 190, 380, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 70));

        logshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel2.add(logshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        loghide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        loghide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loghideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loghideMouseReleased(evt);
            }
        });
        jPanel2.add(loghide, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        logpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        logpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        logpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logpassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                logpassKeyTyped(evt);
            }
        });
        jPanel2.add(logpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, 70));

        loghide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        loghide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loghide1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loghide1MouseReleased(evt);
            }
        });
        jPanel2.add(loghide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 310, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/grubgo background (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 690, 480));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel3.setText("Welcome Back!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Please enter your details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        forgot.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        forgot.setText("Forgot Password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
        });
        jPanel1.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void RegAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAccButtonActionPerformed
        regform rfm = new regform(); 
        this.dispose(); 
        rfm.setVisible(true);
    }//GEN-LAST:event_RegAccButtonActionPerformed
 
    private void RegAccButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegAccButtonMouseEntered
        RegAccButton.setBackground(hover);
    }//GEN-LAST:event_RegAccButtonMouseEntered

    private void RegAccButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegAccButtonMouseExited
        RegAccButton.setBackground(defbutton);
    }//GEN-LAST:event_RegAccButtonMouseExited

    private void Signin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin1MouseEntered
        Signin1.setBackground(hover);
    }//GEN-LAST:event_Signin1MouseEntered

    private void Signin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin1MouseExited
        Signin1.setBackground(defbutton);
    }//GEN-LAST:event_Signin1MouseExited

    private void Signin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signin1ActionPerformed
                      
    String user = username.getText();
    String password = new String(logpass.getPassword()); 
   
    if (login(user, password)) {  
      System.out.println("Login successful, loading account info...");
}   else {
      System.out.println("Invalid login credentials.");
}
                
    }//GEN-LAST:event_Signin1ActionPerformed

    private void loghideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loghideMouseReleased
        logshow.setVisible(false);
        loghide.setVisible(true);
        logpass.setEchoChar('*');
    }//GEN-LAST:event_loghideMouseReleased

    private void loghideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loghideMousePressed
        logshow.setVisible(true);
        loghide.setVisible(false);
        logpass.setEchoChar((char)0);
    }//GEN-LAST:event_loghideMousePressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void Signin1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Signin1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Signin1KeyPressed

    private void logpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logpassKeyTyped
        // TODO add your handling code here:       
    }//GEN-LAST:event_logpassKeyTyped

    private void logpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logpassKeyPressed
        // TODO add your handling code here:
                 
    }//GEN-LAST:event_logpassKeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
    
       
    }//GEN-LAST:event_usernameKeyPressed

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
       EnterID eid = new EnterID();
       eid.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_forgotMouseClicked

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
     
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
  
    }//GEN-LAST:event_forgotMouseExited

    private void loghide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loghide1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loghide1MousePressed

    private void loghide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loghide1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loghide1MouseReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegAccButton;
    private javax.swing.JButton Signin1;
    private javax.swing.JLabel forgot;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel loghide;
    private javax.swing.JLabel loghide1;
    private javax.swing.JPasswordField logpass;
    private javax.swing.JLabel logshow;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
