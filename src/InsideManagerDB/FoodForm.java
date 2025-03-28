/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideManagerDB;

import InternalPackage.ManagersDB;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author Administrator
 */
public class FoodForm extends javax.swing.JFrame {

    /**
     * Creates new form FoodForm
     */
    public FoodForm() {
        initComponents();
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

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        f_name = new javax.swing.JPanel();
        f_price = new javax.swing.JPanel();
        f_cat = new javax.swing.JPanel();
        addbot = new javax.swing.JButton();
        canbot = new javax.swing.JButton();
        f_status = new javax.swing.JComboBox<>();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Add Food To Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 50));

        f_name.setBackground(new java.awt.Color(153, 153, 153));
        f_name.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        f_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 60));

        f_price.setBackground(new java.awt.Color(153, 153, 153));
        f_price.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        f_price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(f_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, 60));

        f_cat.setBackground(new java.awt.Color(153, 153, 153));
        f_cat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        f_cat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(f_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, 60));

        addbot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addbot.setText("ADD");
        addbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbotMouseExited(evt);
            }
        });
        addbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbotActionPerformed(evt);
            }
        });
        jPanel3.add(addbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 110, 40));

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

        f_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        f_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose status", "Available", "Unavailable", " ", " " }));
        jPanel3.add(f_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbotActionPerformed

    private void canbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canbotActionPerformed

    private void addbotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbotMouseEntered
         addbot.setBackground(hover);
    }//GEN-LAST:event_addbotMouseEntered

    private void addbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbotMouseExited
         addbot.setBackground(defbutton);
    }//GEN-LAST:event_addbotMouseExited

    private void canbotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseEntered
        canbot.setBackground(hover);
    }//GEN-LAST:event_canbotMouseEntered

    private void canbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseExited
         canbot.setBackground(defbutton);
    }//GEN-LAST:event_canbotMouseExited

    private void canbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canbotMouseClicked
        ManagersDB mdb = new ManagersDB();
        mdb.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_canbotMouseClicked

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
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbot;
    private javax.swing.JButton canbot;
    private javax.swing.JPanel f_cat;
    private javax.swing.JPanel f_name;
    private javax.swing.JPanel f_price;
    private javax.swing.JComboBox<String> f_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
