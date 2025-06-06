/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideCustomerDB;

import InternalPackage.CustomersDB;
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

/**
 *
 * @author Administrator
 */
public class AccCustomerDB extends javax.swing.JFrame {
    
    String filename;
    byte[] person_image;

    /**
     * Creates new form AccCustomerDB
     */
    public AccCustomerDB() {
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        pfp = new javax.swing.JLabel();
        changepp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cscontact = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cslname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        csemail = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        csaddress = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cstype = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        csfname1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        u_id = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

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
        jPanel2.add(csname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 30));

        pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/cspp-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 140));

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
        jPanel2.add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/GrubGo Logo (1).jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 100));

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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cscontact.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cscontact.setText("CONTACT");
        jPanel5.add(cscontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setText("Contact no. :");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 280, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cslname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cslname.setText("LAST NAME");
        jPanel6.add(cslname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setText("Last Name: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 280, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        csemail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        csemail.setText("EMAIL");
        jPanel7.add(csemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setText("Email:");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 280, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        csaddress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        csaddress.setText("ADDRESS");
        jPanel8.add(csaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setText("Address:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 280, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cstype.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cstype.setText("TYPE");
        jPanel9.add(cstype, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Type:");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 280, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        csfname1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        csfname1.setText("FIRST NAME");
        jPanel10.add(csfname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("First Name: ");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 280, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel25.setText("Personal Information");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 380, 60));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        u_id.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        u_id.setText("user id");
        jPanel12.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setText("ID:");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, 40));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setText("Change Password");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setText("Set up Secret Question");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

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

    private void acc3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseEntered

    private void acc3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3MouseExited

    private void orderdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdbMouseClicked
        OrderDB odb = new OrderDB();
        odb.setVisible(true);
        this.dispose();
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

    }//GEN-LAST:event_accdbMouseClicked

    private void accdbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accdbMouseEntered
        accdb.setBackground(hover);
    }//GEN-LAST:event_accdbMouseEntered

    private void accdbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accdbMouseExited
        accdb.setBackground(defbutton);
    }//GEN-LAST:event_accdbMouseExited

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
        CustomersDB adb = new CustomersDB();
        adb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dbMouseClicked

    private void dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseEntered
         db.setBackground(hover);
    }//GEN-LAST:event_dbMouseEntered

    private void dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseExited
        db.setBackground(defbutton);
    }//GEN-LAST:event_dbMouseExited

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

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        ChangePass cps = new ChangePass();
        cps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        csname.setText(""+sess.getFname());
        u_id.setText(""+sess.getUid());
        csfname1.setText(""+sess.getFname());
        cslname.setText(""+sess.getLname());
        csemail.setText(""+sess.getEmail());
        cscontact.setText(""+sess.getContact());
        csaddress.setText(""+sess.getAddress());
        cstype.setText(""+sess.getType());
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

    // Set the image to the existing JLabel (pfp)
    ImageIcon ii = new ImageIcon(new ImageIcon(filename)
            .getImage().getScaledInstance(pfp.getWidth(), pfp.getHeight(), Image.SCALE_SMOOTH));
    pfp.setIcon(ii); // Update the JLabel

    // Define the target directory within the NetBeans project (src/pfpimage)
    File destination = new File("src/pfpimage", selectedFile.getName());

    // Ensure the directory exists
    destination.getParentFile().mkdirs();

    // Save the image
    try (InputStream fis = new FileInputStream(selectedFile);
         OutputStream fos = new FileOutputStream(destination)) {
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        // Now update the database with the relative image path
        String username = dbconnect.loggedInUsername; // Use logged-in username

        try {
            Connection con = dbconnect.getConnection(); // Get DB connection
            String sql = "UPDATE customer SET profile_picture = ? WHERE cs_user = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            String relativePath = "pfpimage/" + selectedFile.getName(); // Store relative path
            pst.setString(1, relativePath); 
            pst.setString(2, username); 
            pst.executeUpdate();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saving image path: " + e.getMessage());
            return;
        }

        JOptionPane.showMessageDialog(null, "Profile Picture Updated Successfully!");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving image: " + e.getMessage());
    }
}

        
    }//GEN-LAST:event_changeppActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadProfilePicture();

    }//GEN-LAST:event_formWindowOpened

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
    Secretquestion sq = new Secretquestion();
    this.dispose();
    sq.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

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
            java.util.logging.Logger.getLogger(AccCustomerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccCustomerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccCustomerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccCustomerDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccCustomerDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc1;
    private javax.swing.JPanel acc3;
    private javax.swing.JPanel accdb;
    private javax.swing.JButton changepp;
    private javax.swing.JLabel csaddress;
    private javax.swing.JLabel cscontact;
    private javax.swing.JLabel csemail;
    private javax.swing.JLabel csfname1;
    private javax.swing.JLabel cslname;
    private javax.swing.JLabel csname;
    private javax.swing.JLabel cstype;
    private javax.swing.JPanel db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel orderdb;
    private javax.swing.JLabel pfp;
    private javax.swing.JLabel u_id;
    // End of variables declaration//GEN-END:variables
}
