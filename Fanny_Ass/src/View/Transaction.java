
package View;

import dao.BookTransactionInterface;
import dao.BookTransactionInterfaceImplementation;
import dao.GenericDao;
import domains.Book;
import domains.BookTransaction;
import domains.Client;
import domains.TransactionType;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Transaction extends javax.swing.JInternalFrame {

    GenericDao<BookTransaction> bkTransDao=new GenericDao<>();
    GenericDao<Book> bookDao=new GenericDao<>();
    GenericDao<Client> clientDao=new GenericDao<>();
    
    BookTransactionInterface bti=new BookTransactionInterfaceImplementation();
    
    BookTransaction bookTransaction=new BookTransaction();
    Book book=new Book();
    Client client=new Client();
    
    DefaultTableModel transTable;
    
    
    
    
    public Transaction() {
        initComponents();
        
        transTable=(DefaultTableModel)TransactionTable.getModel();
        AllTransaction();
        allTransactionType();
        allBook();
        allClient();
    }
    
    public void allBorrow(){
      List<BookTransaction> lib=(List<BookTransaction>) bkTransDao.findAllBorrow();
      transTable.setRowCount(0);
      
      lib.forEach((x)->{
      transTable.insertRow(transTable.getRowCount(), new Object[]{x.getId(),x.getClient().getRegId(),x.getBook().getBookid(),x.getTransactionDate(),x.getReturnDate(),x.getStatus()});
      });
    }
    
    
    public void allReturn(){
      List<BookTransaction> lib=(List<BookTransaction>) bkTransDao.findAllReturn();
      transTable.setRowCount(0);
      
      lib.forEach((x)->{
      transTable.insertRow(transTable.getRowCount(), new Object[]{x.getId(),x.getClient().getRegId(),x.getBook().getBookid(),x.getTransactionDate(),x.getReturnDate(),x.getStatus()});
      });
    }
    
    public void allTransactionType(){
      TransactionType types[]=TransactionType.values();
      transactiontypecombo.removeAllItems();
      for(TransactionType tt:types){
        transactiontypecombo.addItem(tt.toString());
      }
    }
    
    public void allClient(){
      List<Client> lic=(List<Client>) clientDao.findAll(client);
      clientcombo.removeAllItems();
      lic.forEach((x)->{
      clientcombo.addItem(x.getLastName()+" "+x.getFirstName());
      });
    }
    
    public void allBook(){
      List<Book> lib=(List<Book>) bookDao.findAll(book);
      bookcombo.removeAllItems();
      lib.forEach((x)->{
        bookcombo.addItem(x.getTittle());
      });
    }
    
    public void AllTransaction(){
      List<BookTransaction> trali=(List<BookTransaction>)bkTransDao.findAll(bookTransaction);
      
      transTable.setRowCount(0);
      
      trali.forEach((x)->{
      transTable.insertRow(transTable.getRowCount(), new Object[]{x.getId(),x.getClient().getRegId(),x.getBook().getBookid(),x.getTransactionDate(),x.getReturnDate(),x.getStatus()});
      });
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    TransactionTable = new javax.swing.JTable();
    transactionDate = new com.toedter.calendar.JDateChooser();
    bookcombo = new javax.swing.JComboBox<>();
    clientcombo = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    returnDate = new com.toedter.calendar.JDateChooser();
    transactiontypecombo = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    category = new javax.swing.JComboBox<>();
    jLabel6 = new javax.swing.JLabel();
    jButton3 = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    searchcat = new javax.swing.JComboBox<>();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
      public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
        formInternalFrameActivated(evt);
      }
      public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
      }
      public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
      }
    });

    jLabel1.setText("Client Id");

    jLabel2.setText("Book Id");

    jLabel3.setText("Transaction Date");

    jButton1.setBackground(new java.awt.Color(0, 102, 255));
    jButton1.setText("SAVE");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "ID", "CLIENT", "BOOK", "Transaction date", "return date", "Status"
      }
    ));
    jScrollPane1.setViewportView(TransactionTable);

    jLabel4.setText("Return Date");

    jLabel5.setText("Transaction type");

    jButton2.setBackground(new java.awt.Color(0, 153, 0));
    jButton2.setText("Export Excel");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Borrow", "Return" }));
    category.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        categoryItemStateChanged(evt);
      }
    });

    jLabel6.setText("Filter By");

    jButton3.setBackground(new java.awt.Color(255, 0, 0));
    jButton3.setText("Export Pdf");

    jTextField1.setText("search");

    jLabel7.setText("By");

    searchcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client Id", "Client name", " book tittle", " book category", "date" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bookcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(transactionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(clientcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(returnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(transactiontypecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addComponent(jButton1)
            .addGap(141, 141, 141)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton2)
            .addGap(18, 18, 18)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(searchcat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addGap(70, 70, 70))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(48, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(clientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(bookcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(transactionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7)
              .addComponent(searchcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(transactiontypecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addComponent(jButton1))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{
     
     Date td=transactionDate.getDate();
     Date d=returnDate.getDate();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
     TransactionType typ=TransactionType.valueOf(transactiontypecombo.getSelectedItem().toString());
     
     if(typ.equals(TransactionType.BORROW)){
       bti.borrowBookz(clientcombo.getSelectedItem().toString(), bookcombo.getSelectedItem().toString(), LocalDate.parse(sdf.format(td), formatter),  LocalDate.parse(sdf.format(d), formatter));
       JOptionPane.showMessageDialog(null, "Book borrowed");
       AllTransaction();
       allTransactionType();
     }
     if(typ.equals(TransactionType.RETURN)){
       bti.returnBook( bookcombo.getSelectedItem().toString(),clientcombo.getSelectedItem().toString(), LocalDate.parse(sdf.format(td), formatter),  LocalDate.parse(sdf.format(d), formatter));
       JOptionPane.showMessageDialog(null, "Book retunned");
       AllTransaction();
       allTransactionType();
     }
     
   }catch(Exception ex){
     JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
   }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    // TODO add your handling code here:
    AllTransaction();
    allTransactionType();
  }//GEN-LAST:event_formInternalFrameActivated

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    bti.printExcelSheet();
    JOptionPane.showMessageDialog(null, "done check it on desktop file called booktransctions.xls");
  }//GEN-LAST:event_jButton2ActionPerformed

  private void categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryItemStateChanged
    // TODO add your handling code here:
    if("All".equals(category.getSelectedItem().toString())){
      AllTransaction();
    }
    if("Borrow".equals(category.getSelectedItem().toString())){
      allBorrow();
    }
    if("Return".equals(category.getSelectedItem().toString())){
      allReturn();
    }
  }//GEN-LAST:event_categoryItemStateChanged


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable TransactionTable;
  private javax.swing.JComboBox<String> bookcombo;
  private javax.swing.JComboBox<String> category;
  private javax.swing.JComboBox<String> clientcombo;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField jTextField1;
  private com.toedter.calendar.JDateChooser returnDate;
  private javax.swing.JComboBox<String> searchcat;
  private com.toedter.calendar.JDateChooser transactionDate;
  private javax.swing.JComboBox<String> transactiontypecombo;
  // End of variables declaration//GEN-END:variables
}
