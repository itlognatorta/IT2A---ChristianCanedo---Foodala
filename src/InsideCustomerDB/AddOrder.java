/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideCustomerDB;

import config.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        DefaultTableModel cartModel = new DefaultTableModel(
        new Object[]{"ID", "Name", "Price", "Quantity", "Total"}, 0);
             
        cart.setModel(cartModel);      
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
    
    private void updateTotalPrice() {
    double total = 0.0;
    DefaultTableModel cartModel = (DefaultTableModel) cart.getModel();

    for (int i = 0; i < cartModel.getRowCount(); i++) {
        Object value = cartModel.getValueAt(i, 4);
        if (value != null) {
            try {
                total += Double.parseDouble(value.toString());
            } catch (NumberFormatException e) {
                System.err.println("Invalid subtotal value at row " + i);
            }
        }
    }

    TotalPrice.setText("Total: ₱" + String.format("%.2f", total));
}

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuisine = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Quantity = new javax.swing.JSpinner();
        AddToCart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TotalPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Selected Orders");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jScrollPane2.setViewportView(cuisine);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 220));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 40));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("PLACE ORDER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 120, 40));
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 60, 30));

        AddToCart.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddToCart.setText("ADD TO ORDER");
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });
        jPanel1.add(AddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 40));

        jScrollPane1.setViewportView(cart);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 320, 220));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Main Menu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TotalPrice.setText("TOTAL:");
        jPanel2.add(TotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 170, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLEAR ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm Cancel", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        OrderDB odb = new OrderDB();
        odb.setVisible(true);
        this.dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        String loggedInUsername = dbconnect.loggedInUsername; // the username saved at login
        int customerId = -1;

        dbconnect dbc = new dbconnect();

        try (Connection conn = dbc.getConnection()) {
            // Lookup user ID by username
            String query = "SELECT id FROM customer WHERE cs_user = ?";
            PreparedStatement pstUser = conn.prepareStatement(query);
            pstUser.setString(1, loggedInUsername);
            ResultSet rs = pstUser.executeQuery();

            if (rs.next()) {
                customerId = rs.getInt("id");
            } else {
                JOptionPane.showMessageDialog(this, "User not found. Please login again.");
                return;
            }

            DefaultTableModel cartModel = (DefaultTableModel) cart.getModel();

            if (cart.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Your cart is empty.");
                return;
            }

            String orderStatus = "Pending";

            // Insert orders using customerId
            for (int i = 0; i < cart.getRowCount(); i++) {
                String sql = "INSERT INTO order_tbl (f_id, c_id, o_quantity, o_due, o_status) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setInt(1, Integer.parseInt(cart.getValueAt(i, 0).toString())); // f_id
                pst.setInt(2, customerId); 
                pst.setInt(3, Integer.parseInt(cart.getValueAt(i, 3).toString())); // o_quantity
                pst.setDouble(4, Double.parseDouble(cart.getValueAt(i, 4).toString())); // o_due
                pst.setString(5, orderStatus); // o_status

                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Order placed successfully.");
            cartModel.setRowCount(0); 
            updateTotalPrice();       

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }



    }//GEN-LAST:event_jButton3ActionPerformed

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
        
        int selectedRow = cuisine.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a food item.");
            return;
        }

        String id = cuisine.getValueAt(selectedRow, 0).toString();
        String name = cuisine.getValueAt(selectedRow, 1).toString();
        String priceStr = cuisine.getValueAt(selectedRow, 2).toString();
        int qty = (Integer) Quantity.getValue();


        if (qty <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity greater than zero.");
            return;
        }

        double price = Double.parseDouble(priceStr);
        double total = price * qty;

        DefaultTableModel cartModel = (DefaultTableModel) cart.getModel();
        
        cartModel.addRow(new Object[]{id, name, price, qty, total});
        updateTotalPrice(); 
        // Optionally: clear selection and quantity
        cuisine.clearSelection();
        
    

    }//GEN-LAST:event_AddToCartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          int selectedRow = cart.getSelectedRow();
          
          DefaultTableModel cartModel = (DefaultTableModel) cart.getModel();
    if (selectedRow != -1) {
        cartModel.removeRow(selectedRow);
        updateTotalPrice();
    } else {
        JOptionPane.showMessageDialog(this, "Select an item to remove.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton AddToCart;
    private javax.swing.JSpinner Quantity;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JTable cart;
    private javax.swing.JTable cuisine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
