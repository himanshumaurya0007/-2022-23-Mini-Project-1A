package ams;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends javax.swing.JFrame {

    /**
     * Creates new form StudentDetails
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public StudentDetails() {
        initComponents();
        initialize();
        con = JavaDatabase.ConnectToDB();
        jTable();
    }

    private void initialize() {
        setTitle("View Student Details");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }

    public final void jTable() {
        try {
            String sql = "SELECT Student_ID,Name,Father_Name,Batch_ID,Joining_Date FROM student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableStudentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        } catch (SQLException e) {
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

        studentDetailsTable = new javax.swing.JScrollPane();
        tableStudentDetails = new javax.swing.JTable();
        panelBackColor = new javax.swing.JPanel();
        lbViewStudentDetails = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableStudentDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student_ID", "Name", "Father_Name", "Batch_ID", "Joining_Date"
            }
        ));
        studentDetailsTable.setViewportView(tableStudentDetails);

        getContentPane().add(studentDetailsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 850, 410));

        panelBackColor.setBackground(new java.awt.Color(0, 153, 255));
        panelBackColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbViewStudentDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbViewStudentDetails.setText("VIEW STUDENT DETAILS");
        panelBackColor.add(lbViewStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(panelBackColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        btnBack.setBackground(new java.awt.Color(0, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 850, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagementPortal managementPortal = new ManagementPortal();
        managementPortal.show();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lbViewStudentDetails;
    private javax.swing.JPanel panelBackColor;
    private javax.swing.JScrollPane studentDetailsTable;
    public javax.swing.JTable tableStudentDetails;
    // End of variables declaration//GEN-END:variables
}
