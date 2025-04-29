package InternalPackage;


import InsideManagerDB.AccManagerDB;
import InsideManagerDB.EditOrder;
import InsideManagerDB.FoodsDB;
import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ManagersDB extends javax.swing.JFrame {

    /**
     * Creates new form ManagersDB
     */
    public ManagersDB() {
        initComponents();
        loadProfilePicture();
        displayData();      
        displayOrderStats();
    }
    
    
   Color hover = new Color(102,102,102);  
    Color defbutton = new Color(204,204,204);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }

      public void loadProfilePicture() {
    String username = dbconnect.loggedInUsername;

    if (username == null || username.isEmpty()) {
        setDefaultProfilePicture();
        return;
    }

    try (Connection con = dbconnect.getConnection();
         PreparedStatement pst = con.prepareStatement("SELECT profile_picture FROM customer WHERE cs_user = ?")) {

        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String imagePath = rs.getString("profile_picture");

            if (imagePath != null && !imagePath.isEmpty()) {
                File imageFile = new File(imagePath);

                if (!imageFile.isAbsolute()) {
                    imageFile = new File("src/" + imagePath);  // fallback
                }

                if (imageFile.exists()) {
                    setProfilePicture(imageFile);
                    return;
                }
            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading profile picture: " + e.getMessage());
    }

    setDefaultProfilePicture(); // fallback to default if anything fails
}

private void setProfilePicture(File imageFile) {
    try {
        BufferedImage img = ImageIO.read(imageFile);
        ImageIcon icon = new ImageIcon(img.getScaledInstance(pfp.getWidth(), pfp.getHeight(), Image.SCALE_SMOOTH));
        pfp.setIcon(icon);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error setting profile picture: " + e.getMessage());
        setDefaultProfilePicture();
    }
}

private void setDefaultProfilePicture() {
    try {
        URL defaultImageUrl = getClass().getResource("/pfpimage/default.png");

        if (defaultImageUrl != null) {
            BufferedImage img = ImageIO.read(defaultImageUrl);
            ImageIcon icon = new ImageIcon(img.getScaledInstance(pfp.getWidth(), pfp.getHeight(), Image.SCALE_SMOOTH));
            pfp.setIcon(icon);
        } else {
            JOptionPane.showMessageDialog(null, "Default profile image is missing!", "Warning", JOptionPane.WARNING_MESSAGE);
            pfp.setIcon(null);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading default image: " + e.getMessage());
        pfp.setIcon(null);
    }
}

public void displayData(){
        
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT o_id, f_id , o_quantity, o_due, o_status FROM order_tbl");           
            order.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(SQLException ex){
            System.out.println("Errors"+ex.getMessage());
        }
        
    }

    public void displayOrderStats() {
    try {
        dbconnect dbc = new dbconnect();

        // Total Orders
        ResultSet totalOrdersRs = dbc.getData("SELECT COUNT(*) AS total FROM order_tbl");
        if (totalOrdersRs.next()) {
            int total = totalOrdersRs.getInt("total");
            total_ord.setText("<html><center>Total Orders<br><br>" + total + "</center></html>");
        }

        // Earned Funds
        ResultSet earnedRs = dbc.getData("SELECT SUM(o_due) AS total_earned FROM order_tbl");
        if (earnedRs.next()) {
            double total_earned = earnedRs.getDouble("total_earned");
            earned.setText("<html><center>Earned Funds<br><br>₱" + String.format("%.2f", total_earned) + "</center></html>");
        }

        // Successful Orders
        ResultSet successRs = dbc.getData("SELECT COUNT(*) AS successful FROM order_tbl WHERE o_status = 'Done'");
        if (successRs.next()) {
            int successful = successRs.getInt("successful");
            succ_ord.setText("<html><center>Successful Orders<br><br>" + successful + "</center></html>");
        }

        // Pending Orders
        ResultSet pendingRs = dbc.getData("SELECT COUNT(*) AS pending FROM order_tbl WHERE o_status = 'Pending'");
        if (pendingRs.next()) {
            int pending = pendingRs.getInt("pending");
            pend_ord.setText("<html><center>Pending Orders<br><br>" + pending + "</center></html>");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
}



  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        foods_db = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        acc3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        acc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        acc1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        db = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mgname = new javax.swing.JLabel();
        pfp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        total_ord = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pend_ord = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        earned = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        succ_ord = new javax.swing.JLabel();
        edit_user = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foods_db.setBackground(new java.awt.Color(204, 204, 204));
        foods_db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foods_dbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foods_dbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foods_dbMouseExited(evt);
            }
        });
        foods_db.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel11.setText("PRODUCT");
        foods_db.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));
        foods_db.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/cuisinelogo-removebg-preview (1).png"))); // NOI18N
        foods_db.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        acc3.setBackground(new java.awt.Color(204, 204, 204));
        acc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acc3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acc3MouseExited(evt);
            }
        });
        acc3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel12.setText("ACCOUNT");
        acc3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));
        acc3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        acc3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        foods_db.add(acc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 50));

        jPanel2.add(foods_db, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 190, 50));

        acc.setBackground(new java.awt.Color(204, 204, 204));
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accMouseExited(evt);
            }
        });
        acc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setText("ACCOUNT");
        acc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));
        acc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        acc.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        acc1.setBackground(new java.awt.Color(204, 204, 204));
        acc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acc1MouseExited(evt);
            }
        });
        acc1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel5.setText("ACCOUNT");
        acc1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));
        acc1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        acc1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        acc.add(acc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 50));

        jPanel2.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 50));

        db.setBackground(new java.awt.Color(204, 204, 204));
        db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbMouseExited(evt);
            }
        });
        db.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("DASHBOARD");
        db.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-dashboard-layout-96 (1).png"))); // NOI18N
        db.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 190, 50));

        mgname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        mgname.setText("Hello");
        jPanel2.add(mgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 40));

        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/mgpp-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 100));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total_ord.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        total_ord.setText("Total Orders");
        jPanel4.add(total_ord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, 90));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pend_ord.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pend_ord.setText("Pending Orders");
        jPanel5.add(pend_ord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 180, 90));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("List of Order");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jScrollPane1.setViewportView(order);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 670, 230));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        earned.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        earned.setText("Earned Funds");
        jPanel6.add(earned, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 80));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 140, 90));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        succ_ord.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        succ_ord.setText("Successful Orders");
        jPanel7.add(succ_ord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 80));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 180, 90));

        edit_user.setBackground(new java.awt.Color(0, 255, 0));
        edit_user.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edit_user.setText("EDIT");
        edit_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_userActionPerformed(evt);
            }
        });
        jPanel1.add(edit_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseEntered
        acc.setBackground(hover);
    }//GEN-LAST:event_accMouseEntered

    private void accMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseExited
        acc.setBackground(defbutton);
    }//GEN-LAST:event_accMouseExited

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
    
    }//GEN-LAST:event_dbMouseClicked

    private void dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseEntered
        db.setBackground(hover);
    }//GEN-LAST:event_dbMouseEntered

    private void dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseExited
        db.setBackground(defbutton);
    }//GEN-LAST:event_dbMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void acc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseEntered

    private void acc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseExited

    private void acc3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseEntered

    private void acc3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseExited

    private void foods_dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foods_dbMouseEntered
     foods_db.setBackground(hover);
    }//GEN-LAST:event_foods_dbMouseEntered

    private void foods_dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foods_dbMouseExited
        foods_db.setBackground(defbutton);
    }//GEN-LAST:event_foods_dbMouseExited

    private void foods_dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foods_dbMouseClicked
        FoodsDB fdb = new FoodsDB();
        fdb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_foods_dbMouseClicked

    private void accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseClicked
      AccManagerDB adb = new AccManagerDB();
      adb.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_accMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Session sess = Session.getInstance();
      mgname.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadProfilePicture();
    }//GEN-LAST:event_formWindowOpened

    private void edit_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_userActionPerformed
       int rowIndex = order.getSelectedRow();  // Get selected row index

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an order.");
    } else {
        try {
            dbconnect db = new dbconnect();
            TableModel tbl = order.getModel();  // Get the table model
            int orderId = Integer.parseInt(tbl.getValueAt(rowIndex, 0).toString());  // Get the order ID from the selected row

            // Corrected SQL query to fetch order status
            ResultSet rs = db.getData("SELECT o_status FROM order_tbl WHERE o_id = " + orderId);

            if (rs.next()) {
                // Create instance of EditOrder form
                EditOrder eo = new EditOrder();

               
                eo.status.setSelectedItem(rs.getString("o_status"));

               
                eo.orderId = orderId;  

               
                eo.setVisible(true);
                this.dispose();  // Close the current window
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
            JOptionPane.showMessageDialog(null, "An error occurred while loading order data.");
        }
    }


    }//GEN-LAST:event_edit_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int rowIndex = order.getSelectedRow();  // Get selected row index

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an order.");
} else {
    try {
        dbconnect db = new dbconnect();
        TableModel tbl = order.getModel();  // Get the table model
        int orderId = Integer.parseInt(tbl.getValueAt(rowIndex, 0).toString());  // Get the order ID from the selected row

        System.out.println("Selected Order ID: " + orderId);  // Debugging statement

        // ✅ CORRECTED SQL QUERY: join on customer ID, not order ID
        ResultSet rs = db.getData(
            "SELECT o.o_id, o.o_quantity, o.o_due, o.o_status, " +
            "f.f_name, f.f_price, u.cs_fname " +
            "FROM order_tbl o " +
            "JOIN food_tbl f ON o.f_id = f.f_id " +
            "JOIN customer u ON o.c_id = u.id " +  // ✅ Fix is here
            "WHERE o.o_id = " + orderId
        );

        if (rs.next()) {
            // Create the receipt content
            StringBuilder receipt = new StringBuilder();
            receipt.append("         GrubGo - Order Receipt\n");
            receipt.append("        ---------------------------\n\n");

            receipt.append("Order ID: ").append(rs.getInt("o_id")).append("\n");
            receipt.append("Customer: ").append(rs.getString("cs_fname")).append("\n");
            receipt.append("Item: ").append(rs.getString("f_name")).append("\n");
            receipt.append("Unit Price: ₱").append(String.format("%.2f", rs.getDouble("f_price"))).append("\n");
            receipt.append("Quantity: ").append(rs.getInt("o_quantity")).append("\n");
            receipt.append("Total Due: ₱").append(String.format("%.2f", rs.getDouble("o_due"))).append("\n");
            receipt.append("Status: ").append(rs.getString("o_status")).append("\n\n");

            receipt.append("        ---------------------------\n");
            receipt.append("        Thank you for ordering!\n");

            // Show the receipt in a JTextArea
            JTextArea textArea = new JTextArea(receipt.toString());
            textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Receipt", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No details found for this order.");
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex);
        JOptionPane.showMessageDialog(null, "An error occurred while loading order data.");
    }
}



    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagersDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagersDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc;
    private javax.swing.JPanel acc1;
    private javax.swing.JPanel acc3;
    private javax.swing.JPanel db;
    private javax.swing.JLabel earned;
    private javax.swing.JButton edit_user;
    private javax.swing.JPanel foods_db;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mgname;
    public javax.swing.JTable order;
    private javax.swing.JLabel pend_ord;
    private javax.swing.JLabel pfp;
    private javax.swing.JLabel succ_ord;
    private javax.swing.JLabel total_ord;
    // End of variables declaration//GEN-END:variables
}
