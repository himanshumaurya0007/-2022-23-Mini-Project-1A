package ams;

import javax.swing.*;

public class ManagementPortal extends javax.swing.JFrame {

    /**
     * Creates new form ManagementPortal
     */
    public ManagementPortal() {
        initComponents();
        initialize();

    }

    private void initialize() {
        setTitle("Management Portal");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEmail = new javax.swing.JLabel();
        lbEmail1 = new javax.swing.JLabel();
        lbEmail2 = new javax.swing.JLabel();
        lbEmail3 = new javax.swing.JLabel();
        lbEmail5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnNewStudent = new javax.swing.JButton();
        lbEmail6 = new javax.swing.JLabel();
        btnMarkAttendance = new javax.swing.JButton();
        btnViewStudentDetails = new javax.swing.JButton();
        lbTeacher1 = new javax.swing.JLabel();
        lbWelcome1 = new javax.swing.JLabel();
        lbWelcome2 = new javax.swing.JLabel();
        lbUnder6 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lbUnder7 = new javax.swing.JLabel();
        lbUnder8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEmail.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail.setText("|");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 30, -1));

        lbEmail1.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail1.setText("|");
        getContentPane().add(lbEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 30, -1));

        lbEmail2.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail2.setText("|");
        getContentPane().add(lbEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 30, -1));

        lbEmail3.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail3.setText("|");
        getContentPane().add(lbEmail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, -1));

        lbEmail5.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail5.setText("|");
        getContentPane().add(lbEmail5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 30, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Student");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 360, 60));

        btnNewStudent.setBackground(new java.awt.Color(255, 102, 0));
        btnNewStudent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNewStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnNewStudent.setText("New Student");
        btnNewStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 360, 60));

        lbEmail6.setFont(new java.awt.Font("Lucida Bright", 0, 100)); // NOI18N
        lbEmail6.setText("|");
        getContentPane().add(lbEmail6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 30, -1));

        btnMarkAttendance.setBackground(new java.awt.Color(255, 102, 0));
        btnMarkAttendance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMarkAttendance.setForeground(new java.awt.Color(255, 255, 255));
        btnMarkAttendance.setText("Mark Attendance");
        btnMarkAttendance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMarkAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarkAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 360, 60));

        btnViewStudentDetails.setBackground(new java.awt.Color(255, 102, 0));
        btnViewStudentDetails.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnViewStudentDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStudentDetails.setText("View Student Details");
        btnViewStudentDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewStudentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 360, 60));

        lbTeacher1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbTeacher1.setText("MANAGEMENT");
        getContentPane().add(lbTeacher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        lbWelcome1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbWelcome1.setText("ATTENDANCE");
        getContentPane().add(lbWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbWelcome2.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbWelcome2.setText("SYSTEM");
        getContentPane().add(lbWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        lbUnder6.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbUnder6.setText("_________");
        getContentPane().add(lbUnder6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 40));

        btnLogout.setBackground(new java.awt.Color(0, 255, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 360, 40));

        lbUnder7.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbUnder7.setText("________________");
        getContentPane().add(lbUnder7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        lbUnder8.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lbUnder8.setText("________________");
        getContentPane().add(lbUnder8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        dispose();
        DeleteStudent deleteStudent = new DeleteStudent();
        deleteStudent.show();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewStudentActionPerformed
        // TODO add your handling code here:
        dispose();
        NewStudent newStudent = new NewStudent();
        newStudent.show();
    }//GEN-LAST:event_btnNewStudentActionPerformed

    private void btnMarkAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAttendanceActionPerformed
        // TODO add your handling code here:
        dispose();
        MarkAttendance markAttendance = new MarkAttendance();
        markAttendance.show();
    }//GEN-LAST:event_btnMarkAttendanceActionPerformed

    private void btnViewStudentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentDetailsActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.show();
    }//GEN-LAST:event_btnViewStudentDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login login = new Login();
        login.show();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagementPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMarkAttendance;
    private javax.swing.JButton btnNewStudent;
    private javax.swing.JButton btnViewStudentDetails;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lbEmail2;
    private javax.swing.JLabel lbEmail3;
    private javax.swing.JLabel lbEmail5;
    private javax.swing.JLabel lbEmail6;
    private javax.swing.JLabel lbTeacher1;
    private javax.swing.JLabel lbUnder6;
    private javax.swing.JLabel lbUnder7;
    private javax.swing.JLabel lbUnder8;
    private javax.swing.JLabel lbWelcome1;
    private javax.swing.JLabel lbWelcome2;
    // End of variables declaration//GEN-END:variables
}
