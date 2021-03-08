
package View;

import dao.GenericDao;
import domains.Book;
import domains.BookCategory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BookViews extends javax.swing.JInternalFrame {

  GenericDao<BookCategory> bcDao=new GenericDao<>();
  GenericDao<Book> bkDao=new GenericDao<>();
  BookCategory bc=new BookCategory();
  Book bk=new Book();
  DefaultTableModel booktable;
  
  public BookViews() {
    initComponents();
    
    booktable=(DefaultTableModel)booktab.getModel();
    
    allBookCategory();
    allBooks();
  
  }
  
  public void allBooks(){
    List<Book> allB=(List<Book>) bkDao.findAll(bk);
    booktable.setRowCount(0);
        allB.forEach((x)->{
        
        booktable.insertRow(booktab.getRowCount(), new Object[]{x.getBookid(),x.getTittle(),x.getAuthor(),x.getPublishingHouse(),x.getPublicationDate(),x.isAvailable()});
        });
  }
  
  public void allBookCategory(){
      List<BookCategory> li=(List<BookCategory>)bcDao.findAll(bc);
    categorycombo.removeAllItems();
    li.forEach((x)->{
    categorycombo.addItem(x.getName());
    });
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    pages = new javax.swing.JTextField();
    categorycombo = new javax.swing.JComboBox<>();
    bookid = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    avstatus = new javax.swing.JComboBox();
    booktittle = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    bookauthor = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    bookhouse = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    publicationDate = new com.toedter.calendar.JDateChooser();
    jScrollPane1 = new javax.swing.JScrollPane();
    booktab = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    categorynametxt = new javax.swing.JTextField();
    categorycodetxt = new javax.swing.JTextField();

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

    jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        jPanel2FocusGained(evt);
      }
    });

    jLabel1.setText("Book Id");

    categorycombo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        categorycomboActionPerformed(evt);
      }
    });

    jLabel9.setText("Available");

    jLabel4.setText("Tittle");

    avstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));

    jButton2.setBackground(new java.awt.Color(0, 102, 255));
    jButton2.setText("SAVE");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel5.setText("Author");

    jLabel6.setText("Publishing house");

    jLabel7.setText("Publication Date");

    jLabel8.setText("Pages");

    jLabel10.setText("Book category");

    booktab.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "ID", "TITTLE", "AUTHOR", "PUBLISHING HOUSE", "DATE", "AVAILABILITY"
      }
    ));
    jScrollPane1.setViewportView(booktab);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(pages, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(avstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addGap(103, 103, 103)
              .addComponent(jButton2))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(booktittle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(bookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(bookhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(publicationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
              .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(categorycombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(132, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(56, 56, 56)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(booktittle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bookhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(9, 9, 9)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
          .addComponent(publicationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        .addGap(9, 9, 9)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(categorycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(pages, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(avstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton2)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(25, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Book", jPanel2);

    jButton1.setText("SAVE");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel2.setText("CODE");

    jLabel3.setText("NAME");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(categorycodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(categorynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(102, 102, 102)
            .addComponent(jButton1)))
        .addContainerGap(476, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(categorycodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(categorynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton1)
        .addContainerGap(363, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Book Catgeory", jPanel3);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    
    try{
    Book bu=new Book();
    
    bu.setBookid(bookid.getText());
    bu.setTittle(booktittle.getText());
    bu.setAvailable(Boolean.valueOf(avstatus.getSelectedItem().toString()));
    bu.setAuthor(bookauthor.getText());
    bu.setCategory(bcDao.findBookCategory(categorycombo.getSelectedItem().toString()));
    
    Date da=publicationDate.getDate();
    
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    LocalDate publicationDates=LocalDate.parse(sdf.format(da), formatter);
    bu.setPublicationDate(publicationDates);
    
    bu.setPages(Integer.parseInt(pages.getText()));
    bu.setPublishingHouse(bookhouse.getText());
    
    bkDao.create(bu);
    JOptionPane.showMessageDialog(null, "Saved");
    allBooks();
    
    
    }catch(Exception ex){
      JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    bcDao.create(new BookCategory(categorycodetxt.getText(), categorynametxt.getText()));
    JOptionPane.showMessageDialog(null, "SAVED");
    categorycodetxt.setText("");
    categorynametxt.setText("");
    allBookCategory();

  }//GEN-LAST:event_jButton1ActionPerformed

  private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
 
    allBookCategory();
    allBooks();
  }//GEN-LAST:event_jPanel2FocusGained

  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    allBookCategory();
    allBooks();
  }//GEN-LAST:event_formInternalFrameActivated

  private void categorycomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorycomboActionPerformed
    
  }//GEN-LAST:event_categorycomboActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox avstatus;
  private javax.swing.JTextField bookauthor;
  private javax.swing.JTextField bookhouse;
  private javax.swing.JTextField bookid;
  private javax.swing.JTable booktab;
  private javax.swing.JTextField booktittle;
  private javax.swing.JTextField categorycodetxt;
  private javax.swing.JComboBox<String> categorycombo;
  private javax.swing.JTextField categorynametxt;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField pages;
  private com.toedter.calendar.JDateChooser publicationDate;
  // End of variables declaration//GEN-END:variables
}
