/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideCustomerDB;

import config.Session;
import config.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class AddOrder extends javax.swing.JFrame {

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
        displayData();
        
    }

    public void displayData(){
        
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT f_id, f_name , f_price, f_status FROM food_tbl");           
            cuisine.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(SQLException ex){
            System.out.println("Errors"+ex.getMessage());
        }
        
    }
    
   public void displayProductDetails() {
    try {
        String productIdText = p_id.getText().trim();
        String quantityText = p_quantity.getText().trim();

        if (productIdText.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both Product ID and Quantity first.");
            return; 
        }

        int productId = Integer.parseInt(productIdText);
        int quantity = Integer.parseInt(quantityText);

        dbconnect dbc = new dbconnect();
        ResultSet rs = dbc.getData("SELECT f_id, f_name, f_price, f_category FROM food_tbl WHERE f_id = " + productId);

        if (rs.next()) {
            String id = rs.getString("f_id");
            String name = rs.getString("f_name");
            double price = rs.getDouble("f_price");
            double totalPrice = price * quantity;

            f_id.setText("Food ID: " + id);
            f_name.setText("Food Name: " + name);
            f_quantity.setText("Quantity: " + quantity);
            total.setText("Total Price: " + totalPrice);
        } else {
            JOptionPane.showMessageDialog(null, "Product not found!");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers for Product ID and Quantity.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        p_quantity = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        f_id = new javax.swing.JLabel();
        f_name = new javax.swing.JLabel();
        f_quantity = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuisine = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Choose your favorite cuisine");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        p_quantity.setBackground(new java.awt.Color(153, 153, 153));
        p_quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p_quantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Quantity"));
        p_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_quantityActionPerformed(evt);
            }
        });
        jPanel1.add(p_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 150, 50));

        p_id.setBackground(new java.awt.Color(153, 153, 153));
        p_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p_id.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Product ID"));
        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        jPanel1.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 150, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        f_id.setText("Food ID:");
        jPanel2.add(f_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        f_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        f_name.setText("Food Name:");
        jPanel2.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        f_quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        f_quantity.setText("Quantity:");
        jPanel2.add(f_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("Total Price:");
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 600, 130));

        jScrollPane2.setViewportView(cuisine);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 430, 250));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 110, 40));

        insert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("ADD ORDER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void p_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_quantityActionPerformed

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm Cancel", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        OrderDB odb = new OrderDB();
        odb.setVisible(true);
        this.dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
    displayProductDetails();
    }//GEN-LAST:event_insertActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
    dbconnect dbc = new dbconnect();
    Connection conn = dbc.getConnection();

    // Insert into order_tbl
    String sql = "INSERT INTO order_tbl (f_id, c_id, o_quantity, o_due, o_status) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

    // Get data from input fields
    int foodId = Integer.parseInt(f_id.getText().replace("Food ID: ", "").trim());
    int quantity = Integer.parseInt(f_quantity.getText().replace("Quantity: ", "").trim());
    double due = Double.parseDouble(total.getText().replace("Total Price: ", "").trim());
    String status = "Pending";

    // Get customer ID from session (assumed)
    Session sess = Session.getInstance();
    String userId = sess.getUid();  // This should match the c_id (customer.id)

    if (userId == null || userId.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Customer not logged in. Cannot place order.");
        return;
    }

    int customerId = Integer.parseInt(userId); // Convert to int

    // Set values into query
    pst.setInt(1, foodId);
    pst.setInt(2, customerId);  // <- This was missing before
    pst.setInt(3, quantity);
    pst.setDouble(4, due);
    pst.setString(5, status);

    int rows = pst.executeUpdate();

    if (rows > 0) {
        ResultSet keys = pst.getGeneratedKeys();
        int lastOrderId = -1;
        if (keys.next()) {
            lastOrderId = keys.getInt(1);
        }

        // Log the action
        String actions = "Added New Order! Order ID: " + lastOrderId;

        PreparedStatement logPst = conn.prepareStatement(
            "INSERT INTO logs (id, actions, date) VALUES (?, ?, ?)"
        );
        logPst.setInt(1, customerId);
        logPst.setString(2, actions);
        logPst.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
        logPst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Order placed successfully!");

        // Clear inputs after inserting
        f_id.setText("");
        f_name.setText("");
        f_quantity.setText("");
        total.setText("");

        // Redirect back to OrderDB or refresh page
        OrderDB odb = new OrderDB();
        this.dispose();
        odb.setVisible(true);
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid number format: " + ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cuisine;
    private javax.swing.JLabel f_id;
    private javax.swing.JLabel f_name;
    private javax.swing.JLabel f_quantity;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_quantity;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
