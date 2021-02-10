/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.StaffDao;
import controller.DepartmentDao;
import model.staff;
import model.department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

//import com.toedter.calendar.JDateChooser;
//import util.ConnectionToDB;
//import java.util.List;
//import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.text.MessageFormat;
//import java.text.ParseException;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import java.awt.print.PrinterException;


public class NewRegistation extends javax.swing.JInternalFrame {
    /*
    DepartmentDao dao = new DepartmentDao();
    StaffDao sao = new StaffDao();
    department d = new department();
    
    public Connection con = null;
    public ResultSet rs = null;
    public PreparedStatement ps = null;
    public Statement s = null; */
   /**
     * Creates new form NewRegistation
     */
    public NewRegistation() {
        initComponents();
        //updateDb();
        //comb();
        //updateTableStaff();
    }
    /*
    public void updateDb(){
        int q,i;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","");
            s = con.createStatement();
            String sql = "SELECT * FROM department";
            rs = s.executeQuery(sql);
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel record = (DefaultTableModel)departTable.getModel();
            record.setRowCount(0);
            while(rs.next()){
                Vector columnData = new Vector();
                for(i=1; i<=q;i++){
                    columnData.add(rs.getString("departmentId"));
                    columnData.add(rs.getString("departmentName"));
                }
                record.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void updateTableStaff(){
        int q,i;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","");
            s = con.createStatement();
            String sql = "SELECT * FROM staff";
            rs = s.executeQuery(sql);
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel record = (DefaultTableModel) jTable1.getModel();
            record.setRowCount(0);
            while(rs.next()){
                Vector columnData = new Vector();
                for (i = 1;  i<= q; i++) {
                    columnData.add(rs.getString("staffId"));
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("dateOfBirth"));
                    columnData.add(rs.getInt("nationalId"));
                    columnData.add(rs.getString("phoneNumber"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("departmentName"));
                    columnData.add(rs.getString("gender"));
                }
                record.addRow(columnData);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void comb() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","");
            //s = con.createStatement();
            String sql = "SELECT name FROM department";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                //jComboBox1.addItem(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public String combSelect(String nam) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","");
            //s = con.createStatement();
            ps = con.prepareStatement("select code from staff where name=?");
            ps.setString(1, nam);
            ps.executeUpdate();
            String coded = rs.getString("code");
            jTextField7.setText(nam);
            return coded;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
 */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        NationalField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        DepartmentField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DateField = new com.toedter.calendar.JDateChooser();
        GenderComboBox = new javax.swing.JComboBox<>();
        exitButton = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departIdField = new javax.swing.JTextField();
        departNameField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("STAFF DATA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 14, 121, -1));

        jLabel5.setText("Staff Id");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel7.setText("National Id Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel8.setText("Data of Birth");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel9.setText("Department Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel11.setText("Email address");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel12.setText("Phone Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        IdField.setText(" ");
        jPanel2.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, -1));

        NameField.setText(" ");
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, -1));

        NationalField.setText(" ");
        jPanel2.add(NationalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 170, -1));

        PhoneField.setText(" ");
        jPanel2.add(PhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, -1));

        EmailField.setText(" ");
        jPanel2.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, -1));

        DepartmentField.setText(" ");
        jPanel2.add(DepartmentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 170, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));
        jPanel2.add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, -1));

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jPanel2.add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 170, -1));

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Staff", jDesktopPane1);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DEPARTMENT DATA");

        jLabel3.setText("Department Id");

        jLabel4.setText("Department Name");

        departIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departIdFieldActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(departIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(260, 260, 260))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Department", jDesktopPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void departIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departIdFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String id = IdField.getText();
        String name = NameField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfBirth = sdf.format(DateField.getDate());
        String nationalId = NationalField.getText();
        String phoneNumber = PhoneField.getText();
        String email = EmailField.getText();
        String gender = (String)GenderComboBox.getSelectedItem();
        String departmentName = DepartmentField.getText();
        
        //staff s = new staff(id, name, dateOfBirth, nationalId, phoneNumber, email, gender, departmentName);
        
        staff st = new staff();
        st.setId(id);
        st.setName(name);
        st.setDateOfBirth(dateOfBirth);
        st.setNationalId(nationalId);
        st.setPhoneNumber(phoneNumber);
        st.setEmail(email);
        st.setGender(gender);
        st.setDepartmentName(departmentName);
        //sao.saveStaff(s);
        //JOptionPane.showMessageDialog(this, "Staff Record Added");
        //updateTableStaff();
        
        StaffDao stdo = new StaffDao();
        stdo.insertingStaff(st);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String depId = departIdField.getText();
        String depName = departNameField.getText();
        
        //department d = new department(depId, depName);
        department de = new department();
        de.setDepartmentId(depId);
        de.setDepartmentName(depName);
        
        DepartmentDao depdo = new DepartmentDao();
        depdo.insertingDepartment(de);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        
        
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateField;
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JTextField IdField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NationalField;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JTextField departIdField;
    private javax.swing.JTextField departNameField;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
