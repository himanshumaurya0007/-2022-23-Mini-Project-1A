package ams;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MarkAttendance extends javax.swing.JFrame {

    /**
     * Creates new form MarkAttendance
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public MarkAttendance() {
        initComponents();
        initialize();
        con = JavaDatabase.ConnectToDB();
    }

    private void initialize() {
        setTitle("Mark Attendance");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }

    public void SearchFromStudentDetails() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM student_details WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                tfStudentId.setText(rs.getString(1));
                tfFirstName.setText(rs.getString(2));
                tfLastName.setText(rs.getString(4));
                tfBatch.setText(rs.getString(7));
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Student ID");
            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void SearchFromSubject1() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_1 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void SearchFromSubject2() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_2 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void SearchFromSubject3() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_3 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void SearchFromSubject4() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_4 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void SearchFromSubject5() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_5 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void SearchFromSubject6() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "SELECT * FROM subject_6 WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                cbMonth.setSelectedItem(rs.getString(6));
                tfDate1.setText(rs.getString(7));
                tfDate2.setText(rs.getString(8));
                tfDate3.setText(rs.getString(9));
                tfDate4.setText(rs.getString(10));
                tfDate5.setText(rs.getString(11));
                tfDate6.setText(rs.getString(12));
                tfDate7.setText(rs.getString(13));
                tfDate8.setText(rs.getString(14));
                tfDate9.setText(rs.getString(15));
                tfDate10.setText(rs.getString(16));
                tfDate11.setText(rs.getString(17));
                tfDate12.setText(rs.getString(18));
                tfDate13.setText(rs.getString(19));
                tfDate14.setText(rs.getString(20));
                tfDate15.setText(rs.getString(21));
                tfDate16.setText(rs.getString(22));
                tfDate17.setText(rs.getString(23));
                tfDate18.setText(rs.getString(24));
                tfDate19.setText(rs.getString(25));
                tfDate20.setText(rs.getString(26));
                tfDate21.setText(rs.getString(27));
                tfDate22.setText(rs.getString(28));
                tfDate23.setText(rs.getString(29));
                tfDate24.setText(rs.getString(30));
                tfDate25.setText(rs.getString(31));
                tfDate26.setText(rs.getString(32));
                tfDate27.setText(rs.getString(33));
                tfDate28.setText(rs.getString(34));
                tfDate29.setText(rs.getString(35));
                tfDate30.setText(rs.getString(36));
                tfDate31.setText(rs.getString(37));

            }
            pst.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

    public void UpdateSubject1() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_1 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateSubject2() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_2 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateSubject3() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_3 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateSubject4() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_4 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateSubject5() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_5 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateSubject6() {
        int cdStudentId = Integer.parseInt(tfStudentId.getText());
        String sql = "UPDATE subject_6 SET Month=?,Date_1=?,Date_2=?,Date_3=?,Date_4=?,Date_5=?,Date_6=?,Date_7=?,Date_8=?,Date_9=?,Date_10=?,Date_11=?,Date_12=?,Date_13=?,Date_14=?,Date_15=?,Date_16=?,Date_17=?,Date_18=?,Date_19=?,Date_20=?,Date_21=?,Date_22=?,Date_23=?,Date_24=?,Date_25=?,Date_26=?,Date_27=?,Date_28=?,Date_29=?,Date_30=?,Date_31=? WHERE Student_ID = " + cdStudentId;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cbMonth.getSelectedItem().toString());
            pst.setString(2, tfDate1.getText());
            pst.setString(3, tfDate2.getText());
            pst.setString(4, tfDate3.getText());
            pst.setString(5, tfDate4.getText());
            pst.setString(6, tfDate5.getText());
            pst.setString(7, tfDate6.getText());
            pst.setString(8, tfDate7.getText());
            pst.setString(9, tfDate8.getText());
            pst.setString(10, tfDate9.getText());
            pst.setString(11, tfDate10.getText());
            pst.setString(12, tfDate11.getText());
            pst.setString(13, tfDate12.getText());
            pst.setString(14, tfDate13.getText());
            pst.setString(15, tfDate14.getText());
            pst.setString(16, tfDate15.getText());
            pst.setString(17, tfDate16.getText());
            pst.setString(18, tfDate17.getText());
            pst.setString(19, tfDate18.getText());
            pst.setString(20, tfDate19.getText());
            pst.setString(21, tfDate20.getText());
            pst.setString(22, tfDate21.getText());
            pst.setString(23, tfDate22.getText());
            pst.setString(24, tfDate23.getText());
            pst.setString(25, tfDate24.getText());
            pst.setString(26, tfDate25.getText());
            pst.setString(27, tfDate26.getText());
            pst.setString(28, tfDate27.getText());
            pst.setString(29, tfDate28.getText());
            pst.setString(30, tfDate29.getText());
            pst.setString(31, tfDate30.getText());
            pst.setString(32, tfDate31.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Attendance Marked Successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void SetBlank() {
        cbMonth.setSelectedIndex(-1);
        cbSubject.setSelectedIndex(-1);
        tfStudentId.setText("");
        tfFirstName.setText("");
        tfLastName.setText("");
        tfBatch.setText("");
        tfDate1.setText("");
        tfDate2.setText("");
        tfDate3.setText("");
        tfDate4.setText("");
        tfDate5.setText("");
        tfDate6.setText("");
        tfDate7.setText("");
        tfDate8.setText("");
        tfDate9.setText("");
        tfDate10.setText("");
        tfDate11.setText("");
        tfDate12.setText("");
        tfDate13.setText("");
        tfDate14.setText("");
        tfDate15.setText("");
        tfDate16.setText("");
        tfDate17.setText("");
        tfDate18.setText("");
        tfDate19.setText("");
        tfDate20.setText("");
        tfDate21.setText("");
        tfDate22.setText("");
        tfDate23.setText("");
        tfDate24.setText("");
        tfDate25.setText("");
        tfDate26.setText("");
        tfDate27.setText("");
        tfDate28.setText("");
        tfDate29.setText("");
        tfDate30.setText("");
        tfDate31.setText("");
        tfStudentId.requestFocus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        panelStudentDetails = new javax.swing.JPanel();
        lbStudentId = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        lbBatch = new javax.swing.JLabel();
        tfBatch = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfStudentId = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        tfLastName = new javax.swing.JTextField();
        panelAttendance = new javax.swing.JPanel();
        tfDate30 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfDate29 = new javax.swing.JTextField();
        tfDate28 = new javax.swing.JTextField();
        tfDate27 = new javax.swing.JTextField();
        tfDate26 = new javax.swing.JTextField();
        tfDate25 = new javax.swing.JTextField();
        tfDate24 = new javax.swing.JTextField();
        tfDate23 = new javax.swing.JTextField();
        tfDate22 = new javax.swing.JTextField();
        tfDate31 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDate1 = new javax.swing.JTextField();
        tfDate2 = new javax.swing.JTextField();
        tfDate3 = new javax.swing.JTextField();
        tfDate4 = new javax.swing.JTextField();
        tfDate5 = new javax.swing.JTextField();
        tfDate6 = new javax.swing.JTextField();
        tfDate7 = new javax.swing.JTextField();
        tfDate8 = new javax.swing.JTextField();
        tfDate9 = new javax.swing.JTextField();
        tfDate10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDate11 = new javax.swing.JTextField();
        tfDate12 = new javax.swing.JTextField();
        tfDate13 = new javax.swing.JTextField();
        tfDate14 = new javax.swing.JTextField();
        tfDate15 = new javax.swing.JTextField();
        tfDate16 = new javax.swing.JTextField();
        tfDate17 = new javax.swing.JTextField();
        tfDate18 = new javax.swing.JTextField();
        tfDate19 = new javax.swing.JTextField();
        tfDate20 = new javax.swing.JTextField();
        tfDate21 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSubmitRecord = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbMonth = new javax.swing.JComboBox<>();
        cbSubject = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbLogin.setText("MARK ATTENDANCE");
        jPanel1.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        panelStudentDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        panelStudentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbStudentId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbStudentId.setText("Student Id");
        panelStudentDetails.add(lbStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFirstName.setText("First Name");
        panelStudentDetails.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lbBatch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBatch.setText("Batch");
        panelStudentDetails.add(lbBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        tfBatch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfBatch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelStudentDetails.add(tfBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        tfFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelStudentDetails.add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, -1));

        tfStudentId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfStudentId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tfStudentId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfStudentIdKeyReleased(evt);
            }
        });
        panelStudentDetails.add(tfStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, -1));

        lbLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbLastName.setText("Last Name");
        panelStudentDetails.add(lbLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btnSearch.setBackground(new java.awt.Color(255, 153, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelStudentDetails.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 330, 40));

        tfLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelStudentDetails.add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, -1));

        getContentPane().add(panelStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 370));

        panelAttendance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        panelAttendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDate30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 30, -1));

        jLabel1.setText("  31");
        panelAttendance.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 30, 30));

        tfDate29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 30, -1));

        tfDate28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 30, -1));

        tfDate27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 30, -1));

        tfDate26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 30, -1));

        tfDate25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 30, -1));

        tfDate24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 30, -1));

        tfDate23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 30, -1));

        tfDate22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, -1));

        tfDate31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, -1));

        jLabel2.setText("    1           2           3           4           5           6           7           8           9         10");
        panelAttendance.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 390, 30));

        tfDate1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, -1));

        tfDate2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 30, -1));

        tfDate3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 30, -1));

        tfDate4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 30, -1));

        tfDate5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 30, -1));

        tfDate6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 30, -1));

        tfDate7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 30, -1));

        tfDate8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, -1));

        tfDate9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, -1));

        tfDate10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 30, -1));

        jLabel3.setText("   21        22         23         24        25          26        27        28         29         30");
        panelAttendance.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 390, 30));

        tfDate11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, -1));

        tfDate12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 30, -1));

        tfDate13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 30, -1));

        tfDate14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 30, -1));

        tfDate15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 30, -1));

        tfDate16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, -1));

        tfDate17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 30, -1));

        tfDate18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 30, -1));

        tfDate19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 30, -1));

        tfDate20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 30, -1));

        tfDate21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelAttendance.add(tfDate21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 30, -1));

        jLabel4.setText("  11         12         13        14         15         16        17        18         19         20");
        panelAttendance.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, 30));

        btnSubmitRecord.setBackground(new java.awt.Color(255, 153, 0));
        btnSubmitRecord.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubmitRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitRecord.setText("SUBMIT RECORD");
        btnSubmitRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRecordActionPerformed(evt);
            }
        });
        panelAttendance.add(btnSubmitRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 40));

        getContentPane().add(panelAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 430, 370));

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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 850, 40));

        cbMonth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cbMonth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });
        getContentPane().add(cbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 430, 35));

        cbSubject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5", "Subject 6" }));
        cbSubject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSubjectItemStateChanged(evt);
            }
        });
        getContentPane().add(cbSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 410, 35));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        ManagementPortal managePortal = new ManagementPortal();
        managePortal.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRecordActionPerformed
        // TODO add your handling code here:
        switch (cbSubject.getSelectedItem().toString()) {
            case "Subject 1" -> {
                UpdateSubject1();
                SetBlank();
            }
            case "Subject 2" -> {
                UpdateSubject2();
                SetBlank();
            }
            case "Subject 3" -> {
                UpdateSubject3();
                SetBlank();
            }
            case "Subject 4" -> {
                UpdateSubject4();
                SetBlank();
            }
            case "Subject 5" -> {
                UpdateSubject5();
                SetBlank();
            }
            case "Subject 6" -> {
                UpdateSubject6();
                SetBlank();
            }
            default -> {
            }
        }
    }//GEN-LAST:event_btnSubmitRecordActionPerformed

    private void tfStudentIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStudentIdKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tfStudentIdKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //SearchFromStudentDetails();
        switch (cbSubject.getSelectedItem().toString()) {
            case "Subject 1" -> {
                SearchFromStudentDetails();
                SearchFromSubject1();
            }
            case "Subject 2" -> {
                SearchFromStudentDetails();
                SearchFromSubject2();
            }
            case "Subject 3" -> {
                SearchFromStudentDetails();
                SearchFromSubject3();
            }
            case "Subject 4" -> {
                SearchFromStudentDetails();
                SearchFromSubject4();
            }
            case "Subject 5" -> {
                SearchFromStudentDetails();
                SearchFromSubject5();
            }
            case "Subject 6" -> {
                SearchFromStudentDetails();
                SearchFromSubject6();
            }
            default -> {
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSubjectItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSubjectItemStateChanged

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMonthActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnSearch;
    public javax.swing.JButton btnSubmitRecord;
    public javax.swing.JComboBox<String> cbMonth;
    public javax.swing.JComboBox<String> cbSubject;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbBatch;
    public javax.swing.JLabel lbFirstName;
    public javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbLogin;
    public javax.swing.JLabel lbStudentId;
    public javax.swing.JPanel panelAttendance;
    public javax.swing.JPanel panelStudentDetails;
    public javax.swing.JTextField tfBatch;
    public javax.swing.JTextField tfDate1;
    public javax.swing.JTextField tfDate10;
    public javax.swing.JTextField tfDate11;
    public javax.swing.JTextField tfDate12;
    public javax.swing.JTextField tfDate13;
    public javax.swing.JTextField tfDate14;
    public javax.swing.JTextField tfDate15;
    public javax.swing.JTextField tfDate16;
    public javax.swing.JTextField tfDate17;
    public javax.swing.JTextField tfDate18;
    public javax.swing.JTextField tfDate19;
    public javax.swing.JTextField tfDate2;
    public javax.swing.JTextField tfDate20;
    public javax.swing.JTextField tfDate21;
    public javax.swing.JTextField tfDate22;
    public javax.swing.JTextField tfDate23;
    public javax.swing.JTextField tfDate24;
    public javax.swing.JTextField tfDate25;
    public javax.swing.JTextField tfDate26;
    public javax.swing.JTextField tfDate27;
    public javax.swing.JTextField tfDate28;
    public javax.swing.JTextField tfDate29;
    public javax.swing.JTextField tfDate3;
    public javax.swing.JTextField tfDate30;
    public javax.swing.JTextField tfDate31;
    public javax.swing.JTextField tfDate4;
    public javax.swing.JTextField tfDate5;
    public javax.swing.JTextField tfDate6;
    public javax.swing.JTextField tfDate7;
    public javax.swing.JTextField tfDate8;
    public javax.swing.JTextField tfDate9;
    public javax.swing.JTextField tfFirstName;
    public javax.swing.JTextField tfLastName;
    public javax.swing.JTextField tfStudentId;
    // End of variables declaration//GEN-END:variables
}
