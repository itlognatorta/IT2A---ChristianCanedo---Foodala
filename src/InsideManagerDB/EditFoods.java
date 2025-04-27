/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideManagerDB;

import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class EditFoods extends javax.swing.JFrame {

    int foodId;

    /**
     * Creates new form EditFoods
     */
    public EditFoods() {
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
        e_status = new javax.swing.JComboBox<>();
        e_name = new javax.swing.JTextField();
        e_price = new javax.swing.JTextField();
        e_cat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Edit Your Food");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 50));

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
        jPanel3.add(editbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 110, 40));

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
        jPanel3.add(canbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 110, 40));

        e_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        e_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose status", "Available", "Unavailable", " ", " " }));
        jPanel3.add(e_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 60));

        e_name.setBackground(new java.awt.Color(153, 153, 153));
        e_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        e_name.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        e_name.setCaretColor(new java.awt.Color(255, 255, 255));
        e_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_nameActionPerformed(evt);
            }
        });
        jPanel3.add(e_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 70));

        e_price.setBackground(new java.awt.Color(153, 153, 153));
        e_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        e_price.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel3.add(e_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, 70));

        e_cat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        e_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Meals", "Drinks", "Snacks", "Dessert" }));
        jPanel3.add(e_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 240, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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

     // Get trimmed input values
     String foodName = e_name.getText().trim();
     String foodPriceText = e_price.getText().trim();
     String foodCategory = e_cat.getSelectedItem().toString().trim();
     String foodStatus = e_status.getSelectedItem().toString().trim();

     // Validate Food Name
     if (foodName.isEmpty()) {
         e_name.setBorder(BorderFactory.createLineBorder(Color.RED));
         errorMessages.append("Food name is required.\n");
         isValid = false;
     } else {
         e_name.setBorder(BorderFactory.createLineBorder(Color.GRAY));
     }

     // Validate Food Price
     double foodPrice = 0.0;
     if (foodPriceText.isEmpty()) {
         e_price.setBorder(BorderFactory.createLineBorder(Color.RED));
         errorMessages.append("Food price is required.\n");
         isValid = false;
     } else {
         try {
             foodPrice = Double.parseDouble(foodPriceText);
             if (foodPrice < 0) {
                 throw new NumberFormatException("Food price cannot be negative.");
             }
             e_price.setBorder(BorderFactory.createLineBorder(Color.GRAY));  // Valid input
         } catch (NumberFormatException e) {
             e_price.setBorder(BorderFactory.createLineBorder(Color.RED));
             errorMessages.append("Enter a valid positive number for food price.\n");
             isValid = false;
         }
     }

     // Validate Category
     if (e_cat.getSelectedIndex() == 0) {
         e_cat.setBorder(BorderFactory.createLineBorder(Color.RED));
         errorMessages.append("Please select a food category.\n");
         isValid = false;
     } else {
         e_cat.setBorder(BorderFactory.createLineBorder(Color.GRAY));
     }

     // Validate Status
     if (e_status.getSelectedIndex() == 0) {
         e_status.setBorder(BorderFactory.createLineBorder(Color.RED));
         errorMessages.append("Please select a food status.\n");
         isValid = false;
     } else {
         e_status.setBorder(BorderFactory.createLineBorder(Color.GRAY));
     }

// Show validation errors
if (!isValid) {
    JOptionPane.showMessageDialog(null, errorMessages.toString(), "Validation Errors", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    
    Connection conn = dbc.getConnection();
    String sql = "UPDATE food_tbl SET f_name = ?, f_price = ?, f_category = ?, f_status = ? WHERE f_id = ?";
    PreparedStatement pst = conn.prepareStatement(sql);

  
    pst.setString(1, foodName);           
    pst.setDouble(2, foodPrice);  
    pst.setString(3, foodCategory);
    pst.setString(4, foodStatus);
    pst.setInt(5, foodId); 

    int rows = pst.executeUpdate();
    if (rows > 0) {
        // Log action
        Session sess = Session.getInstance();
        String actions = "Updated Food Item! ID: " + foodId;

        PreparedStatement logPst = conn.prepareStatement("INSERT INTO logs (id, actions, date) VALUES (?, ?, ?)");
        logPst.setString(1, sess.getUid());
        logPst.setString(2, actions);
        logPst.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
        logPst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Food item updated successfully!");

        // Optionally, go back to foods page
        FoodsDB fdb = new FoodsDB();
        this.dispose();
        fdb.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Update failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
}



    }//GEN-LAST:event_editbotActionPerformed

    private void canbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseClicked
        FoodsDB fdb = new FoodsDB();
        fdb.setVisible(true);
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

    private void e_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_nameActionPerformed

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
            java.util.logging.Logger.getLogger(EditFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFoods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canbot;
    public javax.swing.JComboBox<String> e_cat;
    public javax.swing.JTextField e_name;
    public javax.swing.JTextField e_price;
    public javax.swing.JComboBox<String> e_status;
    private javax.swing.JButton editbot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
