package ams;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    Connection con;
    PreparedStatement pst;

    public NewStudent() {
        initComponents();
        initialize();
        con = JavaDatabase.ConnectToDB();
        Random();
    }

    private void initialize() {
        setTitle("New Student");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }

    public final void Random() {
        Random rd = new Random();
        tfStudentId.setText("" + rd.nextInt(1000 + 1));
    }

    public void AddToStudentDetails() {

        String sql = "INSERT INTO student_details(Student_ID,First_Name,Middle_Name,Last_Name,Department,Semester,Batch) VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbDepartment.getSelectedItem().toString());
            pst.setString(6, cbSemester.getSelectedItem().toString());
            pst.setString(7, cbBatchId.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added New Student");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject1() {
        String sql = "INSERT INTO subject_1(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject2() {
        String sql = "INSERT INTO subject_2(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject3() {
        String sql = "INSERT INTO subject_3(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject4() {
        String sql = "INSERT INTO subject_4(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject5() {
        String sql = "INSERT INTO subject_5(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AddToSubject6() {
        String sql = "INSERT INTO subject_6(Student_ID,First_Name,Middle_Name,Last_Name,Batch) VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(tfStudentId.getText()));
            pst.setString(2, tfFirstName.getText());
            pst.setString(3, tfMiddleName.getText());
            pst.setString(4, tfLastName.getText());
            pst.setString(5, cbBatchId.getSelectedItem().toString());
            pst.execute();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackColor = new javax.swing.JPanel();
        lbRegistration = new javax.swing.JLabel();
        lbAnswer = new javax.swing.JLabel();
        lbYourSecurityQuestion = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbUsername4 = new javax.swing.JLabel();
        tfMiddleName = new javax.swing.JTextField();
        tfStudentId = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbYourSecurityQuestion1 = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        cbBatchId = new javax.swing.JComboBox<>();
        cbDepartment = new javax.swing.JComboBox<>();
        lbYourSecurityQuestion2 = new javax.swing.JLabel();
        lbYourSecurityQuestion3 = new javax.swing.JLabel();
        cbSemester = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackColor.setBackground(new java.awt.Color(0, 153, 255));
        panelBackColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRegistration.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbRegistration.setText("NEW STUDENT");
        panelBackColor.add(lbRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        getContentPane().add(panelBackColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        lbAnswer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbAnswer.setText("Batch Id");
        getContentPane().add(lbAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 30));

        lbYourSecurityQuestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbYourSecurityQuestion.setText("Middle Name");
        getContentPane().add(lbYourSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbName.setText("First Name");
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        lbUsername4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbUsername4.setText("Student Id");
        getContentPane().add(lbUsername4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

        tfMiddleName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfMiddleName.setToolTipText("");
        tfMiddleName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMiddleNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 450, 30));

        tfStudentId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfStudentId.setToolTipText("");
        tfStudentId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 450, 30));

        tfFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfFirstName.setToolTipText("");
        tfFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 450, 30));

        btnAdd.setBackground(new java.awt.Color(255, 102, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 360, 40));

        btnBack.setBackground(new java.awt.Color(0, 255, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 360, 40));

        lbYourSecurityQuestion1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbYourSecurityQuestion1.setText("Department");
        getContentPane().add(lbYourSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        tfLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfLastName.setToolTipText("");
        tfLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 450, 30));

        cbBatchId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbBatchId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "Batch 1", "Batch 2", "Batch 3", "Batch 4", "Batch 5" }));
        cbBatchId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cbBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 450, 30));

        cbDepartment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science and Engineering [CSE]", "Computer Science and Engineering (Data Science) [CSE - DS]", "Computer Science and Engineering (AI-ML) [CSE  AIML]", "Mechanical Engineering [Mech]", "Information Technology [IT]", "Civil Engineering [Civil]" }));
        cbDepartment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 450, 30));

        lbYourSecurityQuestion2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbYourSecurityQuestion2.setText("Semester");
        getContentPane().add(lbYourSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 30));

        lbYourSecurityQuestion3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbYourSecurityQuestion3.setText("Last Name");
        getContentPane().add(lbYourSecurityQuestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        cbSemester.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5", "Sem 6", "Sem 7", "Sem 8" }));
        cbSemester.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(cbSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 450, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMiddleNameActionPerformed

    private void tfStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentIdActionPerformed

    private void tfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddToStudentDetails();
        AddToSubject1();
        AddToSubject2();
        AddToSubject3();
        AddToSubject4();
        AddToSubject5();
        AddToSubject6();
        tfStudentId.setText("");
        tfFirstName.setText("");
        tfMiddleName.setText("");
        tfLastName.setText("");
        cbDepartment.setSelectedIndex(-1);
        cbSemester.setSelectedIndex(-1);
        cbBatchId.setSelectedIndex(-1);
        tfStudentId.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagementPortal managementPortal = new ManagementPortal();
        managementPortal.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastNameActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbBatchId;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbSemester;
    private javax.swing.JLabel lbAnswer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRegistration;
    private javax.swing.JLabel lbUsername4;
    private javax.swing.JLabel lbYourSecurityQuestion;
    private javax.swing.JLabel lbYourSecurityQuestion1;
    private javax.swing.JLabel lbYourSecurityQuestion2;
    private javax.swing.JLabel lbYourSecurityQuestion3;
    private javax.swing.JPanel panelBackColor;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfMiddleName;
    private javax.swing.JTextField tfStudentId;
    // End of variables declaration//GEN-END:variables
}
