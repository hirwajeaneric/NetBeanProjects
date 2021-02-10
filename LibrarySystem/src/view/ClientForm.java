package view; 

import java.sql.*;
import model.Client;
import controller.ClientDao;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.*;
import java.awt.print.*;

public class ClientForm extends javax.swing.JInternalFrame {
    
    public Connection con = null;
    public ResultSet rs = null;
    public PreparedStatement ps = null;
    public Statement s = null;
    
    public ClientForm() {
        initComponents();
        updateTableClient();
    }

    public void updateTableClient(){
        int i,q;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM client;");
            
            ResultSetMetaData stData = (ResultSetMetaData)rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel record = (DefaultTableModel)clientTable.getModel();
            record.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("regNo"));
                    columnData.add(rs.getString("firstName"));
                    columnData.add(rs.getString("lastName"));
                    columnData.add(rs.getString("phoneNumber"));
                    columnData.add(rs.getString("emailAddress"));
                    columnData.add(rs.getString("photo"));
                    columnData.add(rs.getString("clientCategory"));
                }
                record.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registrationNumberField = new javax.swing.JTextField();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        PhotoField = new javax.swing.JTextField();
        EmailAddressField = new javax.swing.JTextField();
        PhoneNumberField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        UpdateClientButton = new javax.swing.JButton();
        PrintClientButton = new javax.swing.JButton();
        ClientExitButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Client");

        jLabel2.setText("Registration Number");

        jLabel3.setText("First Name");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Last Name");

        jLabel6.setText("Photo");

        jLabel7.setText("Email Address");

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Registration Number", "First Name", "Last Name", "Phone Number", "Email Address", "Phone Number", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        clientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientTable);

        jLabel8.setText("Category");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Staff", "External" }));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        UpdateClientButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateClientButton.setText("Update");
        UpdateClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateClientButtonActionPerformed(evt);
            }
        });

        PrintClientButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PrintClientButton.setText("Print");
        PrintClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintClientButtonActionPerformed(evt);
            }
        });

        ClientExitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClientExitButton.setText("Exit");
        ClientExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(registrationNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(113, 113, 113)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(saveButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(UpdateClientButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(PrintClientButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(ClientExitButton)
                                    .addGap(32, 32, 32)))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CategoryComboBox, 0, 146, Short.MAX_VALUE)
                                .addComponent(EmailAddressField)
                                .addComponent(PhotoField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(293, 293, 293)
                            .addComponent(jLabel1))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(registrationNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhotoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(UpdateClientButton)
                    .addComponent(PrintClientButton)
                    .addComponent(ClientExitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String regNo = registrationNumberField.getText();
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        String phoneNumber = PhoneNumberField.getText();
        String emailAddress = EmailAddressField.getText();
        String photo = PhotoField.getText();
        String clientCategory = (String)CategoryComboBox.getSelectedItem();
        
        Client cl = new Client();
        cl.setRegNo(regNo);
        cl.setFirstName(firstName);
        cl.setLastName(lastName);
        cl.setPhoneNumber(phoneNumber);
        cl.setEmailAddress(emailAddress);
        cl.setPhoto(photo);
        cl.setClientCategory(clientCategory);
        
        ClientDao cld = new ClientDao();
        cld.SaveClientData(cl);
        updateTableClient();
        JOptionPane.showMessageDialog(this, "Successfully saved Client info!!");      
    }//GEN-LAST:event_saveButtonActionPerformed

    private void UpdateClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateClientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateClientButtonActionPerformed

    private void PrintClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintClientButtonActionPerformed
         MessageFormat header = new MessageFormat("Report Print");
         MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try{
            
            }catch(java.awt.print.PrinterException e){
                System.err.format("Cannot print", os)
            }
    }//GEN-LAST:event_PrintClientButtonActionPerformed

    private void ClientExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientExitButtonActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to leave the client form?","Client Form",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ClientExitButtonActionPerformed

    private void clientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTableMouseClicked
        int i = clientTable.getSelectedRow();
        TableModel model = clientTable.getModel();
        
        registrationNumberField.setText(model.getValueAt(i, 0).toString());
        FirstNameField.setText(model.getValueAt(i, 1).toString());
        LastNameField.setText(model.getValueAt(i, 2).toString());
        PhoneNumberField.setText(model.getValueAt(i, 3).toString());
        EmailAddressField.setText(model.getValueAt(i, 4).toString());
        PhotoField.setText(model.getValueAt(i, 5).toString());
        String clientCategory = model.getValueAt(i, 6).toString();
            switch (clientCategory){
                case "Student":
                    CategoryComboBox.setSelectedItem(0);
                    break;
                case "Staff":
                    CategoryComboBox.setSelectedItem(1);
                    break;
                case "External":
                    CategoryComboBox.setSelectedItem(2);
                    break;
            }
    }//GEN-LAST:event_clientTableMouseClicked

    private JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JButton ClientExitButton;
    private javax.swing.JTextField EmailAddressField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JTextField PhotoField;
    private javax.swing.JButton PrintClientButton;
    private javax.swing.JButton UpdateClientButton;
    private javax.swing.JTable clientTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField registrationNumberField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
