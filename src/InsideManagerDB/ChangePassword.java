/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideManagerDB;

import config.Session;
import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    Color hover = new Color(153,153,153);  
    Color defbutton = new Color(102,102,102);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        oldshow = new javax.swing.JLabel();
        oldhide = new javax.swing.JLabel();
        new1show = new javax.swing.JLabel();
        new1hide = new javax.swing.JLabel();
        newpass1 = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JPasswordField();
        newshow = new javax.swing.JLabel();
        newhide = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        canedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setBackground(new java.awt.Color(102, 102, 102));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setText("Save");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 128, 49));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("CHANGE PASSWORD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 230, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Type Old Password*");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Type New Password*");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Re-Type New Password*");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        oldshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel3.add(oldshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        oldhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        oldhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                oldhideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                oldhideMouseReleased(evt);
            }
        });
        jPanel3.add(oldhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        new1show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel3.add(new1show, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        new1hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        new1hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new1hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new1hideMouseReleased(evt);
            }
        });
        jPanel3.add(new1hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        newpass1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newpass1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        newpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpass1ActionPerformed(evt);
            }
        });
        jPanel3.add(newpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 50));

        oldpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        oldpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel3.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 50));

        newshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel3.add(newshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        newhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        newhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newhideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newhideMouseReleased(evt);
            }
        });
        jPanel3.add(newhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        newpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        newpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel3.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 290, 260));

        canedit.setBackground(new java.awt.Color(102, 102, 102));
        canedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        canedit.setText("Cancel");
        canedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caneditMouseExited(evt);
            }
        });
        canedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caneditActionPerformed(evt);
            }
        });
        jPanel1.add(canedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 128, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caneditMouseEntered
        canedit.setBackground(hover);
    }//GEN-LAST:event_caneditMouseEntered

    private void caneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caneditMouseExited
        canedit.setBackground(defbutton);
    }//GEN-LAST:event_caneditMouseExited

    private void caneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caneditActionPerformed

        AccManagerDB amdb = new AccManagerDB();
        this.dispose();
        amdb.setVisible(true);
    }//GEN-LAST:event_caneditActionPerformed

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        Save.setBackground(hover);
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        Save.setBackground(defbutton);
    }//GEN-LAST:event_SaveMouseExited

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
   try {          
    dbconnect dbc = new dbconnect();
    Session sess = Session.getInstance();
    
    // Ensure password fields are initialized
    if (oldpass == null || newpass == null || newpass1 == null) {
        JOptionPane.showMessageDialog(null, "Error: Password fields not initialized!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String query = "SELECT cs_pass FROM customer WHERE id = '" + sess.getUid() + "'";    
    ResultSet rs = dbc.getData(query);

    if (rs.next()) {
        String storedPasswordHash = rs.getString("cs_pass");  // Password stored in DB
        
        // Get old password from JPasswordField
        String oldInput = new String(oldpass.getPassword()); 
        String oldHash = passwordHasher.hashPassword(oldInput); // Hash user input

        if (storedPasswordHash.equals(oldHash)) {    
            // Get new password and confirm password from JPasswordField
            String newInput = new String(newpass.getPassword()); 
            String confirmInput = new String(newpass1.getPassword());

            // Validate new password length
            if (newInput.length() < 8) {
                JOptionPane.showMessageDialog(null, "New password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate if new password matches confirm password
            if (!newInput.equals(confirmInput)) {
                JOptionPane.showMessageDialog(null, "New password and confirm password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hash new password
            String newpassHash = passwordHasher.hashPassword(newInput); 
            
            String updateQuery = "UPDATE customer SET cs_pass = '" + newpassHash + "' WHERE id = '" + sess.getUid() + "'";  
            dbc.updateData(updateQuery);

            JOptionPane.showMessageDialog(null, "Password updated successfully!");
                AccManagerDB amb = new AccManagerDB();
                amb.setVisible(true);
                this.dispose();
        } else {    
            JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "User not found!");
    }    
} catch (SQLException ex) {
    System.out.println("Error: " + ex.getMessage());
}
       
    }//GEN-LAST:event_SaveActionPerformed

    private void newpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpass1ActionPerformed

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void oldhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oldhideMousePressed
        oldshow.setVisible(true);
        oldhide.setVisible(false);
        oldpass.setEchoChar((char)0);
    }//GEN-LAST:event_oldhideMousePressed

    private void oldhideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oldhideMouseReleased
        oldshow.setVisible(false);
        oldhide.setVisible(true);
        oldpass.setEchoChar('*');
    }//GEN-LAST:event_oldhideMouseReleased

    private void newhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhideMousePressed
        newshow.setVisible(true);
        newhide.setVisible(false);
        newpass.setEchoChar((char)0);
    }//GEN-LAST:event_newhideMousePressed

    private void newhideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhideMouseReleased
        newshow.setVisible(false);
        newhide.setVisible(true);
        newpass.setEchoChar('*');
    }//GEN-LAST:event_newhideMouseReleased

    private void new1hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new1hideMousePressed
        new1show.setVisible(true);
        new1hide.setVisible(false);
        newpass1.setEchoChar((char)0);
    }//GEN-LAST:event_new1hideMousePressed

    private void new1hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new1hideMouseReleased
        new1show.setVisible(false);
        new1hide.setVisible(true);
        newpass1.setEchoChar('*');
    }//GEN-LAST:event_new1hideMouseReleased

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton canedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel new1hide;
    private javax.swing.JLabel new1show;
    private javax.swing.JLabel newhide;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JLabel newshow;
    private javax.swing.JLabel oldhide;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel oldshow;
    // End of variables declaration//GEN-END:variables
}
