
import java.awt.Color;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.JButton;
import javax.swing.border.Border;


public class regform extends javax.swing.JFrame {

   List<String> existingUsernames = Arrays.asList("user1", "admin", "johndoe");
   List<String> existingEmails = Arrays.asList("user1@example.com", "admin@example.com", "johndoe@example.com");
    
    public regform() {
        initComponents();
    }

    Color hover = new Color(255,255,153);  
    Color defbutton = new Color(255,204,102);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        reguname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        cancelregformButton = new javax.swing.JButton();
        RegDoneButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        noteaddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        regconfirmshow = new javax.swing.JLabel();
        regconfirmhide = new javax.swing.JLabel();
        regconfirmpass = new javax.swing.JPasswordField();
        regpassshow = new javax.swing.JLabel();
        regpasshide = new javax.swing.JLabel();
        regpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 361, -1, 47));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 172, -1, 47));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 295, -1, 47));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 232, -1, 47));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 422, -1, 47));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 482, -1, 47));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 172, -1, 42));

        reguname.setBackground(new java.awt.Color(255, 204, 102));
        reguname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        reguname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        reguname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regunameActionPerformed(evt);
            }
        });
        jPanel1.add(reguname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, 60));

        contact.setBackground(new java.awt.Color(255, 204, 102));
        contact.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 60));

        fname.setBackground(new java.awt.Color(255, 204, 102));
        fname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 60));

        lname.setBackground(new java.awt.Color(255, 204, 102));
        lname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 310, 60));

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
        jPanel1.add(cancelregformButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 128, 49));

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
        jPanel1.add(RegDoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 128, 49));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 227, -1, 47));

        noteaddress.setBackground(new java.awt.Color(255, 204, 102));
        noteaddress.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        noteaddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        noteaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteaddressActionPerformed(evt);
            }
        });
        jPanel1.add(noteaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 310, 60));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 329, -1, 47));

        address.setBackground(new java.awt.Color(255, 204, 102));
        address.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 310, 60));

        regconfirmshow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\showeye-removebg-preview (2).png")); // NOI18N
        jPanel1.add(regconfirmshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        regconfirmhide.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\hideeye-removebg-preview (1).png")); // NOI18N
        regconfirmhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regconfirmhideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                regconfirmhideMouseReleased(evt);
            }
        });
        jPanel1.add(regconfirmhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        regconfirmpass.setBackground(new java.awt.Color(255, 204, 102));
        regconfirmpass.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        regconfirmpass.setText("jPasswordField1");
        regconfirmpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        regconfirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regconfirmpassActionPerformed(evt);
            }
        });
        jPanel1.add(regconfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 310, 60));

        regpassshow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\showeye-removebg-preview (2).png")); // NOI18N
        jPanel1.add(regpassshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        regpasshide.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Downloads\\hideeye-removebg-preview (1).png")); // NOI18N
        regpasshide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regpasshideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                regpasshideMouseReleased(evt);
            }
        });
        jPanel1.add(regpasshide, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        regpass.setBackground(new java.awt.Color(255, 204, 102));
        regpass.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        regpass.setText("jPasswordField1");
        regpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        regpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpassActionPerformed(evt);
            }
        });
        jPanel1.add(regpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 310, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("First Name*");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Email Address*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Contact Number*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Last Name*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("Username*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Address*");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Note Address*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Password*");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        email.setBackground(new java.awt.Color(255, 204, 102));
        email.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void RegDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDoneButtonActionPerformed
        boolean isValid = true;
        
        
    String username = reguname.getText().trim();
    String emails = email.getText().trim();
        
          if (fname.getText().isEmpty()) {
        fname.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (lname.getText().isEmpty()) {
        lname.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        lname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (email.getText().isEmpty()) {
        this.email.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
        
    } else if (existingEmails.contains(emails)) {
        email.setBorder(BorderFactory.createLineBorder(Color.RED));
        JOptionPane.showMessageDialog(null, "Email is already registered. Please use another email.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
    } else {
        email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
    
      if (!emails.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
        email.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        JOptionPane.showMessageDialog(null, "Email must be in the format 'username@domain.com'.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}   else {
        email.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
}

    if (contact.getText().isEmpty()) {
        contact.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        contact.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
    }
    
     String contactNumber = contact.getText().trim();
        if (!contactNumber.matches("\\d{11}")) {
            contact.setBorder(BorderFactory.createLineBorder(Color.RED)); 
            JOptionPane.showMessageDialog(null, "Contact number must contain exactly 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
            isValid = false;
        }else {
            contact.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

     if (username.isEmpty()) {
        reguname.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else if (existingUsernames.contains(username)) {
        reguname.setBorder(BorderFactory.createLineBorder(Color.RED));
        JOptionPane.showMessageDialog(null, "Username is already taken. Please choose another one.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
    } else {
        reguname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

        
      if (regpass.getPassword().length == 0) {
        regpass.setBorder(BorderFactory.createLineBorder(Color.RED));  
        isValid = false;
    } else if (regpass.getPassword().length < 8) {
        regpass.setBorder(BorderFactory.createLineBorder(Color.RED));  
        JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}   else {
        regpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
}      

    if (regconfirmpass.getPassword().length == 0) {
        regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
    
        if (!String.valueOf(regpass.getPassword()).equals(String.valueOf(regconfirmpass.getPassword()))) {
        regpass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.RED)); 
        JOptionPane.showMessageDialog(null, "Password does not match", "Error", JOptionPane.ERROR_MESSAGE);
        isValid = false;
}    else {
        regpass.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
}

    if (address.getText().isEmpty()) {
        address.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        address.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    if (noteaddress.getText().isEmpty()) {
        noteaddress.setBorder(BorderFactory.createLineBorder(Color.RED));
        isValid = false;
    } else {
        noteaddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
    
    if (!isValid) {
        JOptionPane.showMessageDialog(null, "Some fields are required", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        
        JOptionPane.showMessageDialog(null, "Registration Completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        
        login lg = new login();
        this.dispose();
        lg.setVisible(true);
    }
       
    
    
      
       
        
    
    }//GEN-LAST:event_RegDoneButtonActionPerformed

    private void cancelregformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelregformButtonActionPerformed
        
        login lg = new login(); 
        this.dispose();
        lg.setVisible(true);
        
    }//GEN-LAST:event_cancelregformButtonActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void regunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regunameActionPerformed

    private void noteaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteaddressActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
       
       }//GEN-LAST:event_emailActionPerformed

    private void regpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regpassActionPerformed

    private void regconfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regconfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regconfirmpassActionPerformed

    private void RegDoneButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegDoneButtonMouseEntered
        RegDoneButton.setBackground(hover);
    }//GEN-LAST:event_RegDoneButtonMouseEntered

    private void RegDoneButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegDoneButtonMouseExited
        RegDoneButton.setBackground(defbutton);
    }//GEN-LAST:event_RegDoneButtonMouseExited

    private void cancelregformButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButtonMouseEntered
        cancelregformButton.setBackground(hover);
    }//GEN-LAST:event_cancelregformButtonMouseEntered

    private void cancelregformButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelregformButtonMouseExited
        cancelregformButton.setBackground(defbutton);
    }//GEN-LAST:event_cancelregformButtonMouseExited

    private void regpasshideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regpasshideMousePressed
        regpassshow.setVisible(true);
        regpasshide.setVisible(false);
        regpass.setEchoChar((char)0);
    }//GEN-LAST:event_regpasshideMousePressed

    private void regpasshideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regpasshideMouseReleased
        regpassshow.setVisible(false);
        regpasshide.setVisible(true);
        regpass.setEchoChar('*');
    }//GEN-LAST:event_regpasshideMouseReleased

    private void regconfirmhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regconfirmhideMousePressed
        regconfirmshow.setVisible(true);
        regconfirmhide.setVisible(false);
        regconfirmpass.setEchoChar((char)0);
    }//GEN-LAST:event_regconfirmhideMousePressed

    private void regconfirmhideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regconfirmhideMouseReleased
        regconfirmshow.setVisible(false);
        regconfirmhide.setVisible(true);
        regconfirmpass.setEchoChar('*');
    }//GEN-LAST:event_regconfirmhideMouseReleased

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
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegDoneButton;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancelregformButton;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField noteaddress;
    private javax.swing.JLabel regconfirmhide;
    private javax.swing.JPasswordField regconfirmpass;
    private javax.swing.JLabel regconfirmshow;
    private javax.swing.JPasswordField regpass;
    private javax.swing.JLabel regpasshide;
    private javax.swing.JLabel regpassshow;
    private javax.swing.JTextField reguname;
    // End of variables declaration//GEN-END:variables
}
