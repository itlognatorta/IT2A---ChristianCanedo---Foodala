/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideManagerDB;

import InternalPackage.ManagersDB;
import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class EditOrder extends javax.swing.JFrame {

    public int orderId;

   
    
    public EditOrder() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        editbot = new javax.swing.JButton();
        canbot = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Edit Order Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 50));

        editbot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editbot.setText("EDIT");
        editbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editbotMouseExited(evt);
            }
        });
        editbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbotActionPerformed(evt);
            }
        });
        jPanel3.add(editbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 40));

        canbot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        canbot.setText("CANCEL");
        canbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canbotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                canbotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                canbotMouseExited(evt);
            }
        });
        canbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbotActionPerformed(evt);
            }
        });
        jPanel3.add(canbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose status", "Done", "Cancel" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 240, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editbotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbotMouseEntered
        editbot.setBackground(hover);
    }//GEN-LAST:event_editbotMouseEntered

    private void editbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbotMouseExited
        editbot.setBackground(defbutton);
    }//GEN-LAST:event_editbotMouseExited

    private void editbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbotActionPerformed
      dbconnect dbc = new dbconnect();
      boolean isValid = true;
      StringBuilder errorMessages = new StringBuilder();

      // Get the selected order status from JComboBox
      String orderStatus = status.getSelectedItem().toString().trim();

      // Validate Order Status
      if (!orderStatus.equals("Done") && !orderStatus.equals("Cancel")) {
          errorMessages.append("Invalid order status selected. Please choose 'Done' or 'Cancel'.\n");
          isValid = false;
      }



      // Show validation errors
      if (!isValid) {
          JOptionPane.showMessageDialog(null, errorMessages.toString(), "Validation Errors", JOptionPane.ERROR_MESSAGE);
          return;
      }

      try {
          // Establish connection
          Connection conn = dbc.getConnection();

          // Prepare the SQL update statement to update only the status
          String sql = "UPDATE order_tbl SET o_status = ? WHERE o_id = ?";
          PreparedStatement pst = conn.prepareStatement(sql);

          // Set the values for the prepared statement
          pst.setString(1, orderStatus);  // Set the new order status (either "Done" or "Cancel")
          pst.setInt(2, orderId);  // Set the order ID

          // Execute the update
          int rowsUpdated = pst.executeUpdate();

          if (rowsUpdated > 0) {
              // Log the action
              Session sess = Session.getInstance();
              String actions = "Updated Order Status! Order ID: " + orderId;
              PreparedStatement logPst = conn.prepareStatement("INSERT INTO logs (id, actions, date) VALUES (?, ?, ?)");
              logPst.setString(1, sess.getUid());
              logPst.setString(2, actions);
              logPst.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
              logPst.executeUpdate();

              JOptionPane.showMessageDialog(null, "Order status updated successfully!");

              ManagersDB mdb = new ManagersDB();
              mdb.setVisible(true);
              this.dispose();  

          } else {
              JOptionPane.showMessageDialog(null, "Update failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
          }

      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Invalid Order ID format. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
      }



    }//GEN-LAST:event_editbotActionPerformed

    private void canbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseClicked
        ManagersDB mdb = new ManagersDB();
        mdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_canbotMouseClicked

    private void canbotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseEntered
        canbot.setBackground(hover);
    }//GEN-LAST:event_canbotMouseEntered

    private void canbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseExited
        canbot.setBackground(defbutton);
    }//GEN-LAST:event_canbotMouseExited

    private void canbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canbotActionPerformed

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
            java.util.logging.Logger.getLogger(EditOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canbot;
    private javax.swing.JButton editbot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
