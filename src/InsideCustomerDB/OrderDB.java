/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideCustomerDB;

import InternalPackage.CustomersDB;
import config.Session;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class OrderDB extends javax.swing.JFrame {

    /**
     * Creates new form OrderDB
     */
    public OrderDB() {
        initComponents();
        loadProfilePicture();
    }

    Color hover = new Color(102,102,102);  
    Color defbutton = new Color(204,204,204);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }
    
    public void loadProfilePicture() {
    File pathFile = new File("profile_pictures/image_path.txt");

    if (pathFile.exists()) { // Check if the saved path exists
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String imagePath = reader.readLine();
            if (imagePath != null && new File(imagePath).exists()) {
                ImageIcon ii = new ImageIcon(new ImageIcon(imagePath)
                        .getImage().getScaledInstance(pfpimage.getWidth(), pfpimage.getHeight(), Image.SCALE_SMOOTH));
                pfpimage.setIcon(ii); // ✅ Set the saved image
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading profile picture: " + e.getMessage());
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        orderdb = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        acc3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        accdb = new javax.swing.JPanel();
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
        csname = new javax.swing.JLabel();
        pfpimage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Order List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderdb.setBackground(new java.awt.Color(204, 204, 204));
        orderdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderdbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderdbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderdbMouseExited(evt);
            }
        });
        orderdb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        orderdb.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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

        orderdb.add(acc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 50));

        jLabel28.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel28.setText("ORDERS");
        orderdb.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/order1-removebg-preview (2).png"))); // NOI18N
        orderdb.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(orderdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 190, 50));

        accdb.setBackground(new java.awt.Color(204, 204, 204));
        accdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accdbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accdbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accdbMouseExited(evt);
            }
        });
        accdb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setText("ACCOUNT");
        accdb.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 20));
        accdb.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        accdb.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

        accdb.add(acc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 50));

        jPanel2.add(accdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 50));

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

        csname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        csname.setText("Hello ");
        jPanel2.add(csname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        pfpimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/cspp-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(pfpimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 650, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 513));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acc3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseEntered

    private void acc3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseExited

    private void orderdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdbMouseClicked

    }//GEN-LAST:event_orderdbMouseClicked

    private void orderdbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdbMouseEntered
         orderdb.setBackground(hover);
    }//GEN-LAST:event_orderdbMouseEntered

    private void orderdbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdbMouseExited
        orderdb.setBackground(defbutton);
    }//GEN-LAST:event_orderdbMouseExited

    private void acc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseEntered

    private void acc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_acc1MouseExited

    private void accdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accdbMouseClicked
        AccCustomerDB acb = new AccCustomerDB();
        acb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accdbMouseClicked

    private void accdbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accdbMouseEntered
         accdb.setBackground(hover);
    }//GEN-LAST:event_accdbMouseEntered

    private void accdbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accdbMouseExited
        accdb.setBackground(defbutton);
    }//GEN-LAST:event_accdbMouseExited

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
        CustomersDB cdb = new CustomersDB();
        cdb.setVisible(true);
        this.dispose();
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
        csname.setText("Hello "+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadProfilePicture();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(OrderDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc1;
    private javax.swing.JPanel acc3;
    private javax.swing.JPanel accdb;
    private javax.swing.JLabel csname;
    private javax.swing.JPanel db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel orderdb;
    private javax.swing.JLabel pfpimage;
    // End of variables declaration//GEN-END:variables
}
