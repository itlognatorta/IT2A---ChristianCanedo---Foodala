package InternalPackage;


import InsideManagerDB.AccManagerDB;
import InsideManagerDB.FoodsDB;
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
        ProfilePicture();
        
    }

   Color hover = new Color(102,102,102);  
    Color defbutton = new Color(204,204,204);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }

    public void ProfilePicture() {
    File pathFile = new File("profile_pictures/image_path.txt");

    if (pathFile.exists()) { // Check if the saved path exists
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String imagePath = reader.readLine();
            if (imagePath != null && new File(imagePath).exists()) {
                ImageIcon ii = new ImageIcon(new ImageIcon(imagePath)
                        .getImage().getScaledInstance(pfp.getWidth(), pfp.getHeight(), Image.SCALE_SMOOTH));
                pfp.setIcon(ii); // ✅ Set the saved image
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
        jPanel2.add(mgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 40));

        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/mgpp-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 100));

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
      mgname.setText("Hello "+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       ProfilePicture();
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
    private javax.swing.JPanel foods_db;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mgname;
    private javax.swing.JLabel pfp;
    // End of variables declaration//GEN-END:variables
}
