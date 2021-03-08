
package View;

import dao.GenericDao;
import domains.Client;
import domains.ClientCategory;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public final class ClientView extends javax.swing.JInternalFrame {

    ImageIcon img;
    String FilePath;
    
    GenericDao<Client> clientDao=new GenericDao<>();
    Client cl=new Client();
    
    
    DefaultTableModel clientTable;
    
    public ClientView() {
        initComponents();
        
        clientTable=(DefaultTableModel) clienttab.getModel();
        allClient();
        
    }

    
    public void allClient(){
      List<Client> li=(List<Client>) clientDao.findAll(cl);
      
      clientTable.setRowCount(0);
      
      li.forEach((x)->{
      clientTable.insertRow(clienttab.getRowCount(), new Object[]{x.getRegId(),x.getFirstName(),x.getLastName(),x.getPhoneNumber(),x.getEmail(),x.getPhoto()});
      });
    }
    
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    regid = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    firstname = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    lastname = new javax.swing.JTextField();
    phonenumber = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    email = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    photo = new javax.swing.JTextField();
    chooseBTN = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    clientcategory = new javax.swing.JComboBox();
    clientSaveBTN = new javax.swing.JButton();
    photoDisplayer = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    clienttab = new javax.swing.JTable();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        formFocusGained(evt);
      }
    });

    jLabel1.setText("RegID");

    regid.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        regidActionPerformed(evt);
      }
    });

    jLabel2.setText("FIRST NAME");

    jLabel3.setText("LAST NAME");

    jLabel4.setText("PHONE NUMBER");

    jLabel5.setText("e-MAIL");

    jLabel6.setText("PHOTO");

    chooseBTN.setText("CHOOSE");
    chooseBTN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        chooseBTNActionPerformed(evt);
      }
    });

    jLabel7.setText("CLIENT CATEGORY");

    clientcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "STUDENT", "STAFF" }));

    clientSaveBTN.setBackground(new java.awt.Color(0, 102, 255));
    clientSaveBTN.setText("SAVE");
    clientSaveBTN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clientSaveBTNActionPerformed(evt);
      }
    });

    clienttab.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Reg Id", "First Name", "Last Name", "Phone Number", "email", "photo"
      }
    ));
    jScrollPane1.setViewportView(clienttab);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(regid))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(firstname))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lastname))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(phonenumber))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(email))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(chooseBTN))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(clientcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGap(69, 69, 69)
            .addComponent(clientSaveBTN)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        .addComponent(photoDisplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(406, 406, 406))
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(regid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(chooseBTN)))
          .addGroup(layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addComponent(photoDisplayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(clientcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(clientSaveBTN)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(144, 144, 144))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void regidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regidActionPerformed

    private void chooseBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBTNActionPerformed
        // TODO add your handling code here:
        JFileChooser file=new JFileChooser();
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("IMAGE", "png","jpeg","jpg");
        file.setFileFilter(fnef);
        if(file.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            File filec=file.getSelectedFile();
            FilePath= filec.getAbsolutePath();
            photo.setText(FilePath);
            img=new ImageIcon(FilePath);
            Image image=img.getImage().getScaledInstance(photoDisplayer.getWidth(), photoDisplayer.getHeight(), Image.SCALE_DEFAULT);
            photoDisplayer.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_chooseBTNActionPerformed

  private void clientSaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientSaveBTNActionPerformed
    try{
    clientDao.create(new Client(regid.getText(), firstname.getText(), lastname.getText(), phonenumber.getText(), email.getText(), photo.getText(),ClientCategory.valueOf(clientcategory.getSelectedItem().toString())));
    JOptionPane.showMessageDialog(null, "Saved");
    allClient();
    }catch(Exception ex){
      JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_clientSaveBTNActionPerformed

  private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    allClient();
  }//GEN-LAST:event_formFocusGained


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton chooseBTN;
  private javax.swing.JButton clientSaveBTN;
  private javax.swing.JComboBox clientcategory;
  private javax.swing.JTable clienttab;
  private javax.swing.JTextField email;
  private javax.swing.JTextField firstname;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField lastname;
  private javax.swing.JTextField phonenumber;
  private javax.swing.JTextField photo;
  private javax.swing.JLabel photoDisplayer;
  private javax.swing.JTextField regid;
  // End of variables declaration//GEN-END:variables
}
