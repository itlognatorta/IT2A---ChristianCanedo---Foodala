
import config.dbconnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
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
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        displayData();
        displayUserCounts();
    }
   
    Color hover = new Color(102,102,102);  
    Color defbutton = new Color(204,204,204);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }

   public void displayData(){
        
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT * FROM customer");           
            users_table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(SQLException ex){
            System.out.println("Errors"+ex.getMessage());
        }
        
    }
   
   public void displayUserCounts() {
    try {
        dbconnect dbc = new dbconnect();
        ResultSet rs = dbc.getData("SELECT cs_type, COUNT(*) AS count FROM customer GROUP BY cs_type");
       
        
        int customerCount = 0;
        int managerCount = 0;

        while (rs.next()) {
            String userType = rs.getString("cs_type");
            int count = rs.getInt("count");

            if ("customer".equalsIgnoreCase(userType)) {
                customerCount = count;
            } else if ("manager".equalsIgnoreCase(userType)) {
                managerCount = count;
            }
        }
        
        // Optionally, you can display the counts in a GUI label
       CustomersLabel.setText("Customers: " + customerCount);
       ManagersLabel.setText("Managers: " + managerCount);

    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        acc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        db = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        mgno = new javax.swing.JPanel();
        ManagersLabel = new javax.swing.JLabel();
        csno = new javax.swing.JPanel();
        CustomersLabel = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel4.setText("ACCOUNT");
        acc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        acc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 60));

        mg.setBackground(new java.awt.Color(204, 204, 204));
        mg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mgMouseExited(evt);
            }
        });
        mg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel3.setText("MANAGER");
        mg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/manager.png"))); // NOI18N
        mg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(mg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 60));

        db.setBackground(new java.awt.Color(204, 204, 204));
        db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dbMousePressed(evt);
            }
        });
        db.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("DASHBOARD");
        db.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-dashboard-layout-96 (1).png"))); // NOI18N
        db.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 60));

        cs.setBackground(new java.awt.Color(204, 204, 204));
        cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                csMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                csMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                csMousePressed(evt);
            }
        });
        cs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel2.setText("CUSTOMER");
        cs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/customer-removebg-preview (1).png"))); // NOI18N
        cs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel5.setText("ADMIN'S DASHBOARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 630, 80));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Overall Users");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, 20));

        jScrollPane1.setViewportView(users_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 590, 250));

        mgno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManagersLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManagersLabel.setText("Managers:");
        mgno.add(ManagersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(mgno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 150, 50));

        csno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomersLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomersLabel.setText("Customers:");
        csno.add(CustomersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(csno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseClicked
        CustomerPanel csp = new CustomerPanel();
        this.dispose();
        csp.setVisible(true);
    }//GEN-LAST:event_csMouseClicked

    private void dbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMousePressed
  
    }//GEN-LAST:event_dbMousePressed

    private void csMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMousePressed
       
    }//GEN-LAST:event_csMousePressed

    private void dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseEntered
        db.setBackground(hover);
    }//GEN-LAST:event_dbMouseEntered

    private void dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseExited
        db.setBackground(defbutton);
    }//GEN-LAST:event_dbMouseExited

    private void csMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseEntered
       cs.setBackground(hover);
    }//GEN-LAST:event_csMouseEntered

    private void csMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseExited
        cs.setBackground(defbutton);
    }//GEN-LAST:event_csMouseExited

    private void mgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseEntered
       mg.setBackground(hover);
    }//GEN-LAST:event_mgMouseEntered

    private void mgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseExited
       mg.setBackground(defbutton);
    }//GEN-LAST:event_mgMouseExited

    private void accMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseEntered
       acc.setBackground(hover);
    }//GEN-LAST:event_accMouseEntered

    private void accMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseExited
        acc.setBackground(defbutton);
    }//GEN-LAST:event_accMouseExited

    private void mgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseClicked
        ManagerPanel mp = new ManagerPanel();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_mgMouseClicked

    private void accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseClicked
        AccountsPanel ap = new AccountsPanel();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_accMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomersLabel;
    private javax.swing.JLabel ManagersLabel;
    private javax.swing.JPanel acc;
    private javax.swing.JPanel cs;
    private javax.swing.JPanel csno;
    private javax.swing.JPanel db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mg;
    private javax.swing.JPanel mgno;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
