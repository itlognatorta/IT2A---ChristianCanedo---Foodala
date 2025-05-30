package InsideAdminDB;


import InternalPackage.Dashboard;
import OutsidePackage.login;
import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
public class AccountsPanel extends javax.swing.JFrame {

    /**
     * Creates new form AccountsPanel
     */
    public AccountsPanel() {
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
    String username = dbconnect.loggedInUsername;

    if (username == null || username.isEmpty()) {
        setDefaultProfilePicture();
        return;
    }

    try (Connection con = dbconnect.getConnection();
         PreparedStatement pst = con.prepareStatement("SELECT profile_picture FROM customer WHERE cs_user = ?")) {

        pst.setString(1, username);

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                String imagePath = rs.getString("profile_picture");

                if (imagePath != null && !imagePath.isEmpty()) {
                    File imageFile = new File(imagePath);

                    if (!imageFile.isAbsolute()) {
                        imageFile = new File("src/" + imagePath);
                    }

                    if (imageFile.exists()) {
                        setProfilePicture(imageFile);
                        return;
                    }
                }
            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading profile picture: " + e.getMessage());
    }

    setDefaultProfilePicture(); // fallback
}

private void setProfilePicture(File imageFile) {
    try {
        BufferedImage img = ImageIO.read(imageFile);
        int width = pfp.getWidth() > 0 ? pfp.getWidth() : 150;
        int height = pfp.getHeight() > 0 ? pfp.getHeight() : 150;
        ImageIcon icon = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
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
            int width = pfp.getWidth() > 0 ? pfp.getWidth() : 150;
            int height = pfp.getHeight() > 0 ? pfp.getHeight() : 150;
            ImageIcon icon = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
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

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        changepp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        acc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        db = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pfp = new javax.swing.JLabel();
        adminname = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        adname = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ademail = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        adaddress = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        adcontact = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        adtype = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        adlname = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changepp.setBackground(new java.awt.Color(102, 102, 102));
        changepp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepp.setText("Change Profile Picture");
        changepp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeppMouseExited(evt);
            }
        });
        changepp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeppActionPerformed(evt);
            }
        });
        jPanel1.add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 170, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc.setBackground(new java.awt.Color(204, 204, 204));
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
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
        acc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/account1-removebg-preview (1).png"))); // NOI18N
        acc.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        mg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/manager.png"))); // NOI18N
        mg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(mg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 60));

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

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("DASHBOARD");
        db.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));
        db.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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
        });
        cs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel2.setText("CUSTOMER");
        cs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));
        cs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/customer-removebg-preview (1).png"))); // NOI18N
        cs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 60));

        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel2.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 150));

        adminname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adminname.setText("ADMIN");
        jPanel2.add(adminname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel26.setText("Personal Information");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 630, 80));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Log Out Account");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/logout-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 210, 50));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("First Name: ");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        adname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adname.setText("First Name:");
        jPanel10.add(adname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 290, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ademail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ademail.setText("EMAIL");
        jPanel7.add(ademail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setText("Email:");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 300, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adaddress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adaddress.setText("ADDRESS");
        jPanel8.add(adaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setText("Address:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 290, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adcontact.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adcontact.setText("CONTACT");
        jPanel5.add(adcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setText("Contact no. :");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 290, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adtype.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adtype.setText("TYPE");
        jPanel9.add(adtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setText("Type:");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 300, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setText("Last Name: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        adlname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adlname.setText("Last Name:");
        jPanel6.add(adlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 300, 40));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setText("ID : ");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        uid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        uid.setText("UID");
        jPanel12.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, -1));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 290, 40));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setText("Change Password");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setText("Set up Secret Question");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setText("Logs");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void mgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseEntered
        mg.setBackground(hover);
    }//GEN-LAST:event_mgMouseEntered

    private void mgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseExited
        mg.setBackground(defbutton);
    }//GEN-LAST:event_mgMouseExited

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
        Dashboard db = new Dashboard();
        this.dispose();
        db.setVisible(true);
    }//GEN-LAST:event_dbMouseClicked

    private void dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseEntered
        db.setBackground(hover);
    }//GEN-LAST:event_dbMouseEntered

    private void dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseExited
        db.setBackground(defbutton);
    }//GEN-LAST:event_dbMouseExited

    private void csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseClicked
        CustomerPanel cp = new CustomerPanel();
        this.dispose();
        cp.setVisible(true);
    }//GEN-LAST:event_csMouseClicked

    private void csMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseEntered
        cs.setBackground(hover);
    }//GEN-LAST:event_csMouseEntered

    private void csMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMouseExited
        cs.setBackground(defbutton);
    }//GEN-LAST:event_csMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void mgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgMouseClicked
         ManagerPanel mp = new ManagerPanel();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_mgMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
     
    int choice = JOptionPane.showConfirmDialog(
        null,
        "Are you sure you want to log out?",
        "Logout Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (choice == JOptionPane.YES_OPTION) {
       
        this.dispose();
        login lg = new login();
        lg.setVisible(true);
    }
    

    }//GEN-LAST:event_jPanel4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
        uid.setText(""+sess.getUid());
        adminname.setText(""+sess.getFname());
        adname.setText(""+sess.getFname());
        adlname.setText(""+sess.getLname());
        ademail.setText(""+sess.getEmail());
        adcontact.setText(""+sess.getContact());
        adaddress.setText(""+sess.getAddress());
        adtype.setText(""+sess.getType());
    }//GEN-LAST:event_formWindowActivated

    private void changeppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeppMouseEntered
        changepp.setBackground(hover);
    }//GEN-LAST:event_changeppMouseEntered

    private void changeppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeppMouseExited
        changepp.setBackground(defbutton);
    }//GEN-LAST:event_changeppMouseExited

    private void changeppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeppActionPerformed
       JFileChooser chooser = new JFileChooser();
int result = chooser.showOpenDialog(null);

if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = chooser.getSelectedFile();
    String filename = selectedFile.getAbsolutePath();

    try {
        // Validate the image
        BufferedImage testImage = ImageIO.read(selectedFile);
        if (testImage == null) {
            JOptionPane.showMessageDialog(null, "Selected file is not a valid image.");
            return;
        }

        // Get dimensions safely
        int width = pfp.getWidth() > 0 ? pfp.getWidth() : 150;
        int height = pfp.getHeight() > 0 ? pfp.getHeight() : 150;

        // Set scaled image as icon
        ImageIcon ii = new ImageIcon(testImage.getScaledInstance(width, height, Image.SCALE_SMOOTH));
        pfp.setIcon(ii);

        // Save image to local folder
        File destination = new File("src/pfpimage", selectedFile.getName());
        destination.getParentFile().mkdirs();

        try (InputStream fis = new FileInputStream(selectedFile);
             OutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }

        // Update image path in database
        String username = dbconnect.loggedInUsername;
        String relativePath = "pfpimage/" + selectedFile.getName();

        try (Connection con = dbconnect.getConnection();
             PreparedStatement pst = con.prepareStatement("UPDATE customer SET profile_picture = ? WHERE cs_user = ?")) {
            pst.setString(1, relativePath);
            pst.setString(2, username);
            pst.executeUpdate();
        }

        JOptionPane.showMessageDialog(null, "Profile Picture Updated Successfully!");

    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading or saving image: " + e.getMessage());
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error updating database: " + e.getMessage());
    }
}

        

    }//GEN-LAST:event_changeppActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Changepass cp = new Changepass();
        this.dispose();
        cp.setVisible(true);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        secretquest sq = new secretquest();      
        this.dispose();
        sq.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
       Logs lg = new Logs();
       this.dispose();
       lg.setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(AccountsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc;
    private javax.swing.JLabel adaddress;
    private javax.swing.JLabel adcontact;
    private javax.swing.JLabel ademail;
    private javax.swing.JLabel adlname;
    private javax.swing.JLabel adminname;
    private javax.swing.JLabel adname;
    private javax.swing.JLabel adtype;
    private javax.swing.JButton changepp;
    private javax.swing.JPanel cs;
    private javax.swing.JPanel db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel mg;
    private javax.swing.JLabel pfp;
    private javax.swing.JLabel uid;
    // End of variables declaration//GEN-END:variables
}
