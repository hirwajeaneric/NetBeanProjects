package view;

import controller.CheckInDao;
import controller.CheckOutDao;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.CheckIn;
import model.CheckOut;
 

public class Operations extends javax.swing.JInternalFrame {

    public Connection con = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    public Statement s = null;
    
    public Operations() {
        initComponents();
        updateTableCheckIn();
        updateTableCheckOut();
        updateNamesComboBox();
        updateBooksComboBox();
        updateNameCombo();
        updateBookCombo();
        
    }
    
    /**
     * MY PERSONAL METHODS
     */
    
//COMBO BOXES
    
    private void updateNameCombo(){
        try{
            String sql ="SELECT firstName, lastName FROM client";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String fname = rs.getString("firstName");
                String lname = rs.getString("lastName");
                clientNamesInComboBox.addItem(fname +" "+ lname);
                clientNamesOutComboBox.addItem(fname +" "+ lname);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    
    public void updateBookCombo(){
        try{
            ps = con.prepareStatement("SELECT * FROM book");
            rs = ps.executeQuery();
            
            while(rs.next()){
                String nameofbook = rs.getString("title");
                titleOfbookInComboBox.addItem(nameofbook);
                titleOfBookOutComboBox.addItem(nameofbook);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void updateNamesComboBox(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("select firstName, lastName from client");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    
    public void updateBooksComboBox(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("select title from book");
        
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
//UPDATING TABLES
    
    public void updateTableCheckIn(){
        try {
            int i,q;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("select * from checkin");
            
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            
            q = stData.getColumnCount();
            DefaultTableModel record = (DefaultTableModel) checkInTable.getModel();
            record.setRowCount(0);
            
            while(rs.next()){
            
                Vector columnData = new Vector();
                
                for (i = 1;  i<= q; i++) {
                    columnData.add(rs.getString("clientName"));
                    columnData.add(rs.getString("title"));
                    columnData.add(rs.getString("dateIn"));
                    columnData.add(rs.getString("status"));
                }
                record.addRow(columnData);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void updateTableCheckOut(){
        try {
            int i,q;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("select * from checkOut");
            
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            
            q = stData.getColumnCount();
            DefaultTableModel record = (DefaultTableModel) checkOutTable.getModel();
            record.setRowCount(0);
            
            while(rs.next()){
            
                Vector columnData = new Vector();
                
                for (i = 1;  i<= q; i++) {
                    columnData.add(rs.getString("clientName"));
                    columnData.add(rs.getString("title"));
                    columnData.add(rs.getString("dateOut"));
                    columnData.add(rs.getString("status"));
                }
                record.addRow(columnData);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkOut = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clientNamesInComboBox = new javax.swing.JComboBox<>();
        titleOfbookInComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkInTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateInField = new com.toedter.calendar.JDateChooser();
        statusInComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        exitButtonCheckIn = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clientNamesOutComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titleOfBookOutComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        dateOutField = new com.toedter.calendar.JDateChooser();
        statusOutComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        printButtonCheckOut = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        checkOutTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        exitButtonCheckOut = new javax.swing.JButton();

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Check In");

        jLabel3.setText("Client");

        jLabel4.setText("Book");

        clientNamesInComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNamesInComboBoxActionPerformed(evt);
            }
        });

        checkInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client", "Book", "DateIn", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(checkInTable);

        jLabel7.setText("Date");

        jLabel8.setText("Status");

        statusInComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Check In", "Check out" }));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        exitButtonCheckIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButtonCheckIn.setText("Exit");
        exitButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(titleOfbookInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(clientNamesInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(dateInField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statusInComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(saveButton)
                        .addGap(36, 36, 36)
                        .addComponent(printButton)
                        .addGap(39, 39, 39)
                        .addComponent(exitButtonCheckIn)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(clientNamesInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(titleOfbookInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(dateInField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(statusInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(printButton)
                    .addComponent(exitButtonCheckIn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkOut.addTab("Check In", jDesktopPane2);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setText("Book");

        jLabel14.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Check Out");

        jLabel15.setText("Status");

        statusOutComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Check In", "Check out" }));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        printButtonCheckOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButtonCheckOut.setText("Print");
        printButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonCheckOutActionPerformed(evt);
            }
        });

        checkOutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client", "Book", "DateOut", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        checkOutTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOutTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(checkOutTable);

        jLabel16.setText("Client");

        exitButtonCheckOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButtonCheckOut.setText("Exit");
        exitButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(titleOfBookOutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(clientNamesOutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(dateOutField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statusOutComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(36, 36, 36)
                                        .addComponent(printButtonCheckOut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exitButtonCheckOut)
                                        .addGap(33, 33, 33)))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(clientNamesOutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(titleOfBookOutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addComponent(dateOutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(statusOutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(printButtonCheckOut)
                    .addComponent(exitButtonCheckOut))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        checkOut.addTab("Check Out", jDesktopPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkOut)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BUTTONS
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name = (String)clientNamesInComboBox.getSelectedItem();
        String book = (String)titleOfbookInComboBox.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateIn = sdf.format(dateInField.getDate());
        String status = (String)statusInComboBox.getSelectedItem();
        
        CheckIn in = new CheckIn(name, book, dateIn, status);
        CheckInDao inda = new CheckInDao();
        inda.SavingCheckIn(in);
        
        updateTableCheckIn();
        JOptionPane.showMessageDialog(this, "Successfully updated table check in!!");
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clientNamesInComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNamesInComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNamesInComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = (String)clientNamesOutComboBox.getSelectedItem();
        String book = (String)titleOfBookOutComboBox.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateOut = sdf.format(dateOutField.getDate());
        String status = (String)statusOutComboBox.getSelectedItem();
        
        CheckOut ou = new CheckOut(name, book, dateOut, status);
        CheckOutDao ouda = new CheckOutDao();
        ouda.SavinCheckOut(ou);
        
        updateTableCheckOut();
        JOptionPane.showMessageDialog(this, "Successfully updated table check out!");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void exitButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonCheckOutActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Book Form",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonCheckOutActionPerformed

    private void exitButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonCheckInActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Book Form",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonCheckInActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            checkInTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("No printer found!!", ex.getMessage());
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void printButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonCheckOutActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            checkOutTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("No printer found!!", ex.getMessage());
        }
    }//GEN-LAST:event_printButtonCheckOutActionPerformed

    private void checkOutTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutTableMouseClicked
        int i = checkOutTable.getSelectedRow();
        TableModel model = checkOutTable.getModel();
        
        clientNamesOutComboBox.setSelectedItem(model.getValueAt(i, 1));
        titleOfBookOutComboBox.setSelectedItem(model.getValueAt(i, 2));
        //Calendar clndr = null;
        //dateOutField.setCalendar(model.getValueAt(i, 3).toString());
        //statusOutComboBox.setSelectedItem(model.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_checkOutTableMouseClicked

    
    private JFrame frame;    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable checkInTable;
    private javax.swing.JTabbedPane checkOut;
    private javax.swing.JTable checkOutTable;
    private javax.swing.JComboBox<String> clientNamesInComboBox;
    private javax.swing.JComboBox<String> clientNamesOutComboBox;
    private com.toedter.calendar.JDateChooser dateInField;
    private com.toedter.calendar.JDateChooser dateOutField;
    private javax.swing.JButton exitButtonCheckIn;
    private javax.swing.JButton exitButtonCheckOut;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton printButton;
    private javax.swing.JButton printButtonCheckOut;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> statusInComboBox;
    private javax.swing.JComboBox<String> statusOutComboBox;
    private javax.swing.JComboBox<String> titleOfBookOutComboBox;
    private javax.swing.JComboBox<String> titleOfbookInComboBox;
    // End of variables declaration//GEN-END:variables
}
