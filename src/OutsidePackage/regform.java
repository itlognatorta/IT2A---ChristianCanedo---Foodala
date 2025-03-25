package OutsidePackage;


import config.dbconnect;
import config.passwordHasher;
import java.awt.Color;
import java.awt.HeadlessException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.border.Border;


public class regform extends javax.swing.JFrame {

   List<String> existingUsernames = Arrays.asList("cs_user");
   List<String> existingEmails = Arrays.asList("cs_email");
   
    
    
    public regform() {
        initComponents();
    }

    Color hover = new Color(153,153,153);  
    Color defbutton = new Color(102,102,102);  
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void resetButtonColor(JButton button){
        button.setBackground(defbutton);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cancelregformButton = new javax.swing.JButton();
        RegDoneButton = new javax.swing.JButton();
        reghide1 = new javax.swing.JLabel();
        regshow1 = new javax.swing.JLabel();
        regconfirmpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        reguname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        reghide = new javax.swing.JLabel();
        regshow = new javax.swing.JLabel();
        regpass = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        noteaddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setText("Create Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 50));

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
        jPanel2.add(cancelregformButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 128, 49));

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
        jPanel2.add(RegDoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 128, 49));

        reghide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        reghide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reghide1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reghide1MouseReleased(evt);
            }
        });
        jPanel2.add(reghide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 30, -1));

        regshow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel2.add(regshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        regconfirmpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        regconfirmpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        regconfirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regconfirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(regconfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 240, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        reguname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        reguname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        reguname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regunameActionPerformed(evt);
            }
        });
        jPanel2.add(reguname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 240, 50));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("Username*");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 50));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Contact Number*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        email.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 50));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Email Address*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 50));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("First Name*");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 240, 50));

        reghide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/hideeye-removebg-preview (1).png"))); // NOI18N
        reghide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reghideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reghideMouseReleased(evt);
            }
        });
        jPanel2.add(reghide, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        regshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/showeye-removebg-preview (2).png"))); // NOI18N
        jPanel2.add(regshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        regpass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        regpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        regpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpassActionPerformed(evt);
            }
        });
        jPanel2.add(regpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 240, 50));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Password*");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        noteaddress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        noteaddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        noteaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteaddressActionPerformed(evt);
            }
        });
        jPanel2.add(noteaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 50));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Note Address*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        address.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 240, 50));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Address*");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Last Name*");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Type*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        type.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select\t", "Customer", "Manager" }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/gradientbackground.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 620));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("First Name*");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 540, 620));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/background (2).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 730, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void RegDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDoneButtonActionPerformed
    dbconnect dbc = new dbconnect();
    boolean isValid = true;

String username = reguname.getText().trim();
String emails = email.getText().trim();



StringBuilder errorMessages = new StringBuilder();


// First Name Validation
if (fname.getText().isEmpty()) {
    fname.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("First name is required.\n");
    isValid = false;
} else {
    fname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Last Name Validation
if (lname.getText().isEmpty()) {
    lname.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Last name is required.\n");
    isValid = false;
} else {
    lname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Email Validation
if (email.getText().isEmpty()) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Email is required.\n");
    isValid = false;
} else {
    email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Check if Email already exists in the list
if (existingEmails.contains(email.getText())) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Email is already registered.\n");
    isValid = false;
}

// Email Format Validation
if (!email.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
    email.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Email must be in the format 'username@domain.com'.\n");
    isValid = false;
} else {
    email.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Contact Number Validation
if (contact.getText().isEmpty()) {
    contact.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Contact number is required.\n");
    isValid = false;
} else {
    contact.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

String contactNumber = contact.getText().trim();
if (!contactNumber.matches("\\d{11}")) {
    contact.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Contact number must contain exactly 11 digits.\n");
    isValid = false;
} else {
    contact.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Username Validation
if (username.isEmpty()) {
    reguname.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Username is required.\n");
    isValid = false;
} else {
    reguname.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Check if Username already exists
if (existingUsernames.contains(username)) {
    reguname.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Username is already taken.\n");
    isValid = false;
}

// Password Length Validation
if (regpass.getPassword().length < 8) {
    regpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Password must contain at least 8 characters.\n");
    isValid = false;
} else {
    regpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Password Match Validation
if (!String.valueOf(regpass.getPassword()).equals(String.valueOf(regconfirmpass.getPassword()))) {
    regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Passwords do not match.\n");
    isValid = false;
} else {
    regpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Address Validation
if (address.getText().isEmpty()) {
    address.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Address is required.\n");
    isValid = false;
} else {
    address.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Note Address Validation
if (noteaddress.getText().isEmpty()) {
    noteaddress.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Note Address is required.\n");
    isValid = false;
} else {
    noteaddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Account Type Validation
if (type.getSelectedIndex() == 0) {
    type.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Account type must be selected.\n");
    isValid = false;
} else {
    type.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Password Empty Check
if (regpass.getPassword().length == 0) {
    regpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Password is required.\n");
    isValid = false;
} else {
    regpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Confirm Password Empty Check
if (regconfirmpass.getPassword().length == 0) {
    regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.RED));
    errorMessages.append("Confirm password is required.\n");
    isValid = false;
} else {
    regconfirmpass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}
       try {
    // Final Validation Check (Do this before inserting into the database)
    if (!isValid) {
        JOptionPane.showMessageDialog(null, errorMessages.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop execution if validation fails
    }

    // Hash the password properly
    char[] passwordChars = regpass.getPassword();
    String pass = passwordHasher.hashPassword(new String(passwordChars));
    Arrays.fill(passwordChars, ' '); // Clear password from memory for security

    // Use the hashed password correctly in the SQL query
    String sql = "INSERT INTO customer (cs_fname, cs_lname, cs_email, cs_contact, cs_user, cs_pass, cs_address, cs_type, cs_status) "
            + "VALUES ('" + fname.getText().replace("'", "''") + "','" 
            + lname.getText().replace("'", "''") + "','" 
            + email.getText().replace("'", "''") + "','" 
            + contact.getText().replace("'", "''") + "','" 
            + reguname.getText().replace("'", "''") + "','" 
            + pass + "','"  // Use hashed password instead of plain text
            + address.getText().replace("'", "''") + "','" 
            + type.getSelectedItem().toString().replace("'", "''") + "','Pending')";

    // Database Insertion
    if (dbc.insertData(sql) == 1) {
        JOptionPane.showMessageDialog(null, "Registration Completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        login lg = new login();
        this.dispose();
        lg.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Database insertion failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (HeadlessException ex) { // Catch general exceptions to avoid unexpected crashes
    Logger.getLogger(regform.class.getName()).log(Level.SEVERE, "Unexpected error", ex);
    JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void regconfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regconfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regconfirmpassActionPerformed

    private void reghideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghideMousePressed
        regshow.setVisible(true);
        reghide.setVisible(false);
        regpass.setEchoChar((char)0);
    }//GEN-LAST:event_reghideMousePressed

    private void reghideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghideMouseReleased
        regshow.setVisible(false);
        reghide.setVisible(true);
        regpass.setEchoChar('*');
    }//GEN-LAST:event_reghideMouseReleased

    private void reghide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghide1MousePressed
        regshow1.setVisible(true);
        reghide1.setVisible(false);
        regconfirmpass.setEchoChar((char)0);
    }//GEN-LAST:event_reghide1MousePressed

    private void reghide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reghide1MouseReleased
        regshow1.setVisible(false);
        reghide1.setVisible(true);
        regconfirmpass.setEchoChar('*');
    }//GEN-LAST:event_reghide1MouseReleased

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField noteaddress;
    private javax.swing.JPasswordField regconfirmpass;
    private javax.swing.JLabel reghide;
    private javax.swing.JLabel reghide1;
    private javax.swing.JPasswordField regpass;
    private javax.swing.JLabel regshow;
    private javax.swing.JLabel regshow1;
    private javax.swing.JTextField reguname;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
