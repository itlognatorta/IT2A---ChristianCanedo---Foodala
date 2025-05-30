/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsideAdminDB;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import config.dbconnect;
import InternalPackage.Dashboard;
import config.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class AddUsersForm extends javax.swing.JFrame {

   List<String> existingUsernames = Arrays.asList("cs_user");
   List<String> existingEmails = Arrays.asList("cs_email");
   
    public AddUsersForm() {
    initComponents();
    add_noteadd.setText("Optional");
    add_noteadd.setForeground(new Color(153, 153, 153));
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

        jLabel16 = new javax.swing.JLabel();
        cancelregformButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        add_lname = new javax.swing.JTextField();
        add_address = new javax.swing.JTextField();
        add_noteadd = new javax.swing.JTextField();
        add_uname = new javax.swing.JTextField();
        add_contact = new javax.swing.JTextField();
        add_email = new javax.swing.JTextField();
        add_fname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_type = new javax.swing.JComboBox<>();
        regshow = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reghide = new javax.swing.JLabel();
        reghide1 = new javax.swing.JLabel();
        regshow1 = new javax.swing.JLabel();
        add_conpass = new javax.swing.JPasswordField();
        add_pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profilePicture = new javax.swing.JLabel();
        cancelregformButton1 = new javax.swing.JButton();
        RegDoneButton = new javax.swing.JButton();

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Last Name*");

        cancelregformButton.setBackground(new java.awt.Color(102, 102, 102));
        cancelregformButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelregformButton.setText("Cancel");
        cancelregformButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelregformButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelregformButtonMouseExited(evt);
            }
        });
        cancelregformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelregformButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("CREATE NEW USERS FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_lname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_lname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_lnameActionPerformed(evt);
            }
        });
        jPanel3.add(add_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 190, 50));

        add_address.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_addressActionPerformed(evt);
            }
        });
        jPanel3.add(add_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 190, 50));

        add_noteadd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_noteadd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_noteadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_noteaddActionPerformed(evt);
            }
        });
        jPanel3.add(add_noteadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 190, 50));

        add_uname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_uname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_unameActionPerformed(evt);
            }
        });
        jPanel3.add(add_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 50));

        add_contact.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_contact.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_contactActionPerformed(evt);
            }
        });
        jPanel3.add(add_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 50));

        add_email.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_emailActionPerformed(evt);
            }
        });
        jPanel3.add(add_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 190, 50));

        add_fname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_fname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fnameActionPerformed(evt);
            }
        });
        jPanel3.add(add_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 50));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("First Name*");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Email Address*");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Contact Number*");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("Username*");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Last Name*");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Address*");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Note Address*");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Password*");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password*");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        add_type.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select\t", "Customer", "Manager" }));
        add_type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_typeActionPerformed(evt);
            }
        });
        jPanel3.add(add_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 50));

        regshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel3.add(regshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Type*");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        reghide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        reghide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reghideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reghideMouseReleased(evt);
            }
        });
        jPanel3.add(reghide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        reghide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        reghide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reghide1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reghide1MouseReleased(evt);
            }
        });
        jPanel3.add(reghide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        regshow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel3.add(regshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        add_conpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_conpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_conpassActionPerformed(evt);
            }
        });
        jPanel3.add(add_conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 50));

        add_pass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        add_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_passActionPerformed(evt);
            }
        });
        jPanel3.add(add_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 50));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/default.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, 120));

        profilePicture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profilePicture.setText("ProfilePicture");
        jPanel3.add(profilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 630, 340));

        cancelregformButton1.setBackground(new java.awt.Color(102, 102, 102));
        cancelregformButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelregformButton1.setText("Cancel");
        cancelregformButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelregformButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelregformButton1MouseExited(evt);
            }
        });
        cancelregformButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelregformButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelregformButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 128, 49));

        RegDoneButton.setBackground(new java.awt.Color(102, 102, 102));
        RegDoneButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegDoneButton.setText("Sign Up");
        RegDoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegDoneButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegDoneButtonMouseExited(evt);
            }
        });
        RegDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDoneButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegDoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 128, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_emailActionPerformed

    private void add_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_contactActionPerformed

    private void add_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_addressActionPerformed

    private void add_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_lnameActionPerformed

    private void add_noteaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_noteaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_noteaddActionPerformed

    private void add_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_unameActionPerformed

    private void add_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fnameActionPerformed
      
    }//GEN-LAST:event_add_fnameActionPerformed

    private void cancelregformButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButtonMouseEntered
        cancelregformButton.setBackground(hover);
    }//GEN-LAST:event_cancelregformButtonMouseEntered

    private void cancelregformButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButtonMouseExited
        cancelregformButton.setBackground(defbutton);
    }//GEN-LAST:event_cancelregformButtonMouseExited

    private void cancelregformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelregformButtonActionPerformed

        Dashboard db = new Dashboard();
        this.dispose();
        db.setVisible(true);

    }//GEN-LAST:event_cancelregformButtonActionPerformed

    private void cancelregformButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButton1MouseEntered
        cancelregformButton.setBackground(hover);
    }//GEN-LAST:event_cancelregformButton1MouseEntered

    private void cancelregformButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButton1MouseExited
        cancelregformButton.setBackground(defbutton);
    }//GEN-LAST:event_cancelregformButton1MouseExited

    private void cancelregformButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelregformButton1ActionPerformed

        Dashboard db = new Dashboard();
        this.dispose();
        db.setVisible(true);

    }//GEN-LAST:event_cancelregformButton1ActionPerformed

    private void RegDoneButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegDoneButtonMouseEntered
        RegDoneButton.setBackground(hover);
    }//GEN-LAST:event_RegDoneButtonMouseEntered

    private void RegDoneButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegDoneButtonMouseExited
        RegDoneButton.setBackground(defbutton);
    }//GEN-LAST:event_RegDoneButtonMouseExited

    private void RegDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDoneButtonActionPerformed
        dbconnect dbc = new dbconnect();
        boolean isValid = true;
        StringBuilder errorMessages = new StringBuilder();

    // Get trimmed input values
    String fname = add_fname.getText().trim();
    String lname = add_lname.getText().trim();
    String email = add_email.getText().trim();
    String contact = add_contact.getText().trim();
    String username = add_uname.getText().trim();
    String password = new String(add_pass.getPassword());
    String confirmPassword = new String(add_conpass.getPassword());
    String address = add_address.getText().trim();
    String noteAddress = add_noteadd.getText().trim();
    String accountType = add_type.getSelectedItem().toString();

    // Validate First Name
    if (fname.isEmpty()) {
        add_fname.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("First name is required.\n");
        isValid = false;
    } else {
        add_fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Last Name
    if (lname.isEmpty()) {
        add_lname.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Last name is required.\n");
        isValid = false;
    } else {
        add_lname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Email
    if (email.isEmpty()) {
        add_email.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Email is required.\n");
        isValid = false;
    } else if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
        add_email.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Invalid email format.\n");
        isValid = false;
    } else {
        add_email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Account Type
    if (add_type.getSelectedIndex() == 0) {
        add_type.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Please select an account type.\n");
        isValid = false;
    } else {
        add_type.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Contact Number
    if (!contact.matches("\\d{11}")) {
        add_contact.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Contact number must be 11 digits.\n");
        isValid = false;
    } else {
        add_contact.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Username
    if (username.isEmpty()) {
        add_uname.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Username is required.\n");
        isValid = false;
    } else {
        add_uname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Password
    if (password.length() < 8) {
        add_pass.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Password must be at least 8 characters.\n");
        isValid = false;
    } else {
        add_pass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Confirm Password
    if (!password.equals(confirmPassword)) {
        add_conpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Passwords do not match.\n");
        isValid = false;
    } else {
        add_conpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Validate Address
    if (address.isEmpty()) {
        add_address.setBorder(BorderFactory.createLineBorder(Color.RED));
        errorMessages.append("Address is required.\n");
        isValid = false;
    } else {
        add_address.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }   

    // Show errors if any
    if (!isValid) {
        JOptionPane.showMessageDialog(null, errorMessages.toString(), "Validation Errors", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Insert into database
    try {
        Connection conn = dbc.getConnection();

        // Path to default profile picture
        String profilePicture = "pfpimage/default.jpg";  // use relative path inside the "profile_picture" folder

        String sql = "INSERT INTO customer (cs_fname, cs_lname, cs_email, cs_contact, cs_user, cs_pass, cs_address, cs_type, cs_status, profile_picture) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, fname);
        pst.setString(2, lname);
        pst.setString(3, email);
        pst.setString(4, contact);
        pst.setString(5, username);
        pst.setString(6, password);  // Consider hashing passwords in real applications
        pst.setString(7, address);
        pst.setString(8, accountType);
        pst.setString(9, "Active");
        pst.setString(10, profilePicture);  // Use the default image path

        int rows = pst.executeUpdate();
        if (rows > 0) {
            ResultSet keys = pst.getGeneratedKeys();
            int lastId = -1;
            if (keys.next()) {
                lastId = keys.getInt(1);
            }

            // Log action
            Session sess = Session.getInstance();
            String logMsg = "Created New User Account! ID: " + lastId;

            PreparedStatement logPst = conn.prepareStatement("INSERT INTO logs (id, actions, date) VALUES (?, ?, ?)");
            logPst.setString(1, sess.getUid());
            logPst.setString(2, logMsg);
            logPst.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            logPst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registration successful!");

            // Go to dashboard
            Dashboard db = new Dashboard();
            this.dispose();
            db.setVisible(true);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_RegDoneButtonActionPerformed

    private void add_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_typeActionPerformed

    private void add_conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_conpassActionPerformed

    private void add_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_passActionPerformed

    private void reghideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghideMousePressed
        regshow.setVisible(true);
        reghide.setVisible(false);
        add_pass.setEchoChar((char)0);
    }//GEN-LAST:event_reghideMousePressed

    private void reghideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghideMouseReleased
        regshow.setVisible(false);
        reghide.setVisible(true);
        add_pass.setEchoChar('*');
    }//GEN-LAST:event_reghideMouseReleased

    private void reghide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghide1MousePressed
        regshow1.setVisible(true);
        reghide1.setVisible(false);
        add_conpass.setEchoChar((char)0);
    }//GEN-LAST:event_reghide1MousePressed

    private void reghide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghide1MouseReleased
        regshow1.setVisible(false);
        reghide1.setVisible(true);
        add_conpass.setEchoChar('*');
    }//GEN-LAST:event_reghide1MouseReleased

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
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegDoneButton;
    private javax.swing.JTextField add_address;
    private javax.swing.JPasswordField add_conpass;
    public javax.swing.JTextField add_contact;
    public javax.swing.JTextField add_email;
    public javax.swing.JTextField add_fname;
    private javax.swing.JTextField add_lname;
    private javax.swing.JTextField add_noteadd;
    private javax.swing.JPasswordField add_pass;
    private javax.swing.JComboBox<String> add_type;
    private javax.swing.JTextField add_uname;
    private javax.swing.JButton cancelregformButton;
    private javax.swing.JButton cancelregformButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel profilePicture;
    private javax.swing.JLabel reghide;
    private javax.swing.JLabel reghide1;
    private javax.swing.JLabel regshow;
    private javax.swing.JLabel regshow1;
    // End of variables declaration//GEN-END:variables
}
