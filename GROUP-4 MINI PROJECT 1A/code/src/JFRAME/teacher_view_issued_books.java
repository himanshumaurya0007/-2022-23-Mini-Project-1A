
package JFRAME;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class teacher_view_issued_books extends javax.swing.JFrame {
Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public final void Connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lms", "root", "Devanshk$1104");
        } catch (ClassNotFoundException ex) {
        }
    }

    public final void table_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM teacher_issued_books");
            rs = pst.executeQuery();
            teacher_issuebookDetails.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
        }
    }
    public teacher_view_issued_books() throws SQLException {
        initComponents();
        Connect();
        table_load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teacher_issuebookDetails = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 48, 32));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 220, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel4.setText("Welcome , User");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 220, 50));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel6.setText(" Home Page");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 60));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Features");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 60));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel9.setText(" Dashboard");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel12.setBackground(new java.awt.Color(153, 255, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel10.setText(" LMS DASHBOARD");
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 60));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 60));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel5.setText(" Issue Books");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 340, 60));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel8.setText(" Manage Books");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 340, 60));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jLabel11.setText("  View Records");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 340, 60));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel12.setText(" View Issued Books");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel12)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 340, 60));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jLabel13.setText(" Defaulter List");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 340, 60));

        jPanel16.setBackground(new java.awt.Color(51, 102, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel14.setText(" Logout");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 340, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 960));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFRAME/apsit_logo-removebg-preview.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 40));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel15.setText(" Home Page");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 60));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Features");
        jPanel19.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 60));

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(153, 255, 102));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel18.setText(" LMS DASHBOARD");
        jPanel21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 60));

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 60));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jLabel25.setText("Edit Profile ");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel25)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 340, 60));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel20.setText(" View My Profile");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(14, 14, 14))
        );

        jPanel17.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 340, 60));

        jPanel24.setBackground(new java.awt.Color(255, 51, 51));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel26.setText(" View Issued Books");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel26)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 340, 60));

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel27.setText(" Logout");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(14, 14, 14))
        );

        jPanel17.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 340, 60));

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 340, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel17.setText("  View My Records");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 380, 90));

        jPanel27.setBackground(new java.awt.Color(255, 51, 51));
        jPanel27.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, 5));

        teacher_issuebookDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Student ID", "Issue Date"
            }
        ));
        teacher_issuebookDetails.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        teacher_issuebookDetails.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        teacher_issuebookDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        teacher_issuebookDetails.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        teacher_issuebookDetails.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        teacher_issuebookDetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        teacher_issuebookDetails.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        teacher_issuebookDetails.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        teacher_issuebookDetails.setRowHeight(40);
        jScrollPane1.setViewportView(teacher_issuebookDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 1070, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1537, 835));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ManageBooks books = new ManageBooks();
        books.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        teacher_pov_homepage home = new teacher_pov_homepage();
        home.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        teacher_edit_profile alp = null;
    try {
        alp = new teacher_edit_profile();
    } catch (SQLException ex) {
        Logger.getLogger(teacher_view_issued_books.class.getName()).log(Level.SEVERE, null, ex);
    }
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        teacher_VIEW_PROFILE_NEW alp = null;
    try {
        alp = new teacher_VIEW_PROFILE_NEW();
    } catch (SQLException ex) {
        Logger.getLogger(teacher_view_issued_books.class.getName()).log(Level.SEVERE, null, ex);
    }
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        teacher_view_profile alp = null;
        alp = new teacher_view_profile();
        alp.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        teacher_view_issued_books alp = null;
    try {
        alp = new teacher_view_issued_books();
    } catch (SQLException ex) {
        Logger.getLogger(teacher_view_issued_books.class.getName()).log(Level.SEVERE, null, ex);
    }
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        student_login alp = new student_login();
        alp.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
teacher_pov_homepage dsk = new teacher_pov_homepage();
dsk.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(teacher_view_issued_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher_view_issued_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher_view_issued_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher_view_issued_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new teacher_view_issued_books().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(teacher_view_issued_books.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public rojerusan.RSTableMetro teacher_issuebookDetails;
    // End of variables declaration//GEN-END:variables

    private static class teacher_view_profile {

        public teacher_view_profile() {
        }

        private void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
