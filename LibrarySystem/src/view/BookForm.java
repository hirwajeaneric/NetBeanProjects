package view;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import controller.BookCategoryDao;
import java.util.Vector;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Book;
import controller.BookDao;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.BookCategory;
import java.text.*;
import java.awt.print.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookForm extends javax.swing.JInternalFrame {

    public Connection con = null;
    public ResultSet rs = null;
    public PreparedStatement ps = null;
    public Statement s = null;
    
    public BookForm() {
        initComponents();
        updateTableBook();
        updateBookCategoryTable();
        //userList();
    }
    
    /*
    public ArrayList<Book> userList(){
        ArrayList<Book> userList = new ArrayList<>();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM book");
            Book book;
            while(rs.next()){
                book = new Book(rs.getString(bookId),rs.getString(title),rs.getString(publishingHouse), rs.getString(dateOfPublication), rs.getString(author), rs.getString(pages),rs.getString(bookCategory));
                userList.add(book);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return userList;
    }
   */
    
    //DISPLAYING ELEMENTS IN THE BOOK TABLE
    public void updateTableBook(){
        try {
            int q,i;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM book");
            
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();
            
            DefaultTableModel record = (DefaultTableModel)bookTable.getModel();
            record.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for(i=1; i<=q;i++){
                    columnData.add(rs.getString("bookId"));
                    columnData.add(rs.getString("title"));
                    columnData.add(rs.getString("publishingHouse"));
                    columnData.add(rs.getString("dateOfPublication"));
                    columnData.add(rs.getString("author"));
                    columnData.add(rs.getString("pages"));
                    columnData.add(rs.getString("bookCategory"));
                }
                record.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //DISPLAYING ELEMENTS IN THE BOOK CATEGORY TABLE
    public void updateBookCategoryTable(){
        try {
            int i,q;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM bookcategory");
            
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount(); 
            
            DefaultTableModel record = (DefaultTableModel) bookCategoryTable.getModel();
            record.setRowCount(0);
            
            while(rs.next()){
                
                Vector columnData = new Vector();
                
                for(i=1; i<=q; i++){
                    columnData.add(rs.getString("categoryId"));
                    columnData.add(rs.getString("categoryName"));
                }
                record.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoryIdField = new javax.swing.JTextField();
        categoryNameField = new javax.swing.JTextField();
        saveButtonBookCategory = new javax.swing.JButton();
        exitButtonBookCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookCategoryTable = new javax.swing.JTable();
        printButtonBookCategory = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        bookTitleField = new javax.swing.JTextField();
        publishingHouseField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        PagesField = new javax.swing.JTextField();
        saveButtonBook = new javax.swing.JButton();
        exitButtonBook = new javax.swing.JButton();
        publicationDateField = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        bookCategoryField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Book Category");

        jLabel3.setText("Category Id");

        jLabel4.setText("Category Name");

        categoryIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdFieldActionPerformed(evt);
            }
        });

        saveButtonBookCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButtonBookCategory.setText("Save");
        saveButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonBookCategoryActionPerformed(evt);
            }
        });

        exitButtonBookCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButtonBookCategory.setText("Exit");
        exitButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonBookCategoryActionPerformed(evt);
            }
        });

        bookCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category Id", "Category Name"
            }
        ));
        bookCategoryTable.setShowHorizontalLines(false);
        bookCategoryTable.setShowVerticalLines(false);
        bookCategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookCategoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookCategoryTable);

        printButtonBookCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButtonBookCategory.setText("Print");
        printButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonBookCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(saveButtonBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(printButtonBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(exitButtonBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButtonBookCategory)
                    .addComponent(exitButtonBookCategory)
                    .addComponent(printButtonBookCategory))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Book category", jDesktopPane2);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Books");

        jLabel5.setText("Book Id");

        jLabel6.setText("Book title");

        jLabel7.setText("Publishing house");

        jLabel10.setText("Number of pages");

        jLabel11.setText("Author");

        jLabel12.setText("Publication date");

        bookTitleField.setText(" ");
        bookTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitleFieldActionPerformed(evt);
            }
        });

        publishingHouseField.setText(" ");

        authorField.setText(" ");

        PagesField.setText(" ");

        saveButtonBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButtonBook.setText("Save");
        saveButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonBookActionPerformed(evt);
            }
        });

        exitButtonBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButtonBook.setText("Exit");
        exitButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonBookActionPerformed(evt);
            }
        });

        jLabel13.setText("Category");

        bookCategoryField.setText(" ");

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book Id", "Book Title", "Publishing House", "Publication date", "Author", "Number of pages", "category"
            }
        ));
        bookTable.setColumnSelectionAllowed(true);
        bookTable.setShowHorizontalLines(false);
        bookTable.setShowVerticalLines(false);
        bookTable.setUpdateSelectionOnSort(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);
        bookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Update1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update1.setText("Print");
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bookIdField)
                                    .addComponent(bookTitleField)
                                    .addComponent(publishingHouseField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(authorField)
                                    .addComponent(PagesField)
                                    .addComponent(publicationDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(bookCategoryField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(saveButtonBook)
                        .addGap(22, 22, 22)
                        .addComponent(Update)
                        .addGap(24, 24, 24)
                        .addComponent(Update1)
                        .addGap(30, 30, 30)
                        .addComponent(exitButtonBook)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(publicationDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publishingHouseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButtonBook)
                    .addComponent(exitButtonBook)
                    .addComponent(Update)
                    .addComponent(Update1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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

        jTabbedPane2.addTab("Book", jDesktopPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bookTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitleFieldActionPerformed

    private void categoryIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdFieldActionPerformed

    private void saveButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonBookActionPerformed
        String bookId = bookIdField.getText();
        String booktitle = bookTitleField.getText();
        String publishingHouse = publishingHouseField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfPublication = sdf.format(publicationDateField.getDate());
        String author = authorField.getText();
        String page =PagesField.getText();
        int pages = Integer.parseInt(page);
        String bookCategory = bookCategoryField.getText();
        
        Book bk = new Book();
        bk.setBookId(bookId);
        bk.setTitle(booktitle);
        bk.setPublishingHouse(publishingHouse);
        bk.setDateOfPublication(dateOfPublication);
        bk.setAuthor(author);
        bk.setPages(pages);
        bk.setBookCategory(bookCategory);
        
        BookDao bd = new BookDao();
        bd.SaveBookData(bk);
        updateTableBook();
        JOptionPane.showMessageDialog(this, "Book records added!");
    }//GEN-LAST:event_saveButtonBookActionPerformed
    
    private void saveButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonBookCategoryActionPerformed
        String categoryId = categoryIdField.getText();
        String categoryName = categoryNameField.getText();
        
        BookCategory bc = new BookCategory();
        bc.setCategoryId(categoryId);
        bc.setCategoryName(categoryName);
        
        BookCategoryDao bcd = new BookCategoryDao();
        bcd.SavingBookCategory(bc);
        
        updateBookCategoryTable();
        JOptionPane.showMessageDialog(this,"Book Category records added!");        
    }//GEN-LAST:event_saveButtonBookCategoryActionPerformed

    private JFrame frame;
    private void exitButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonBookActionPerformed
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Hook form",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }   
    }//GEN-LAST:event_exitButtonBookActionPerformed
    
    private void exitButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonBookCategoryActionPerformed
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Book Form",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonBookCategoryActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        try {
            DefaultTableModel record = (DefaultTableModel)bookTable.getModel();
            int SelectedRows = bookTable.getSelectedRow();
            
            bookIdField.setText(record.getValueAt(SelectedRows, 0).toString());
            bookTitleField.setText(record.getValueAt(SelectedRows, 1).toString());
            publishingHouseField.setText(record.getValueAt(SelectedRows, 2).toString());
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)record.getValueAt(SelectedRows, 3));
            publicationDateField.setDate(date);
            authorField.setText(record.getValueAt(SelectedRows, 4).toString());
            PagesField.setText(record.getValueAt(SelectedRows, 5).toString());
            categoryNameField.setText(record.getValueAt(SelectedRows, 6).toString());
        } catch (ParseException ex) {
            Logger.getLogger(BookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookCategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookCategoryTableMouseClicked
        int i = bookCategoryTable.getSelectedRow();
        TableModel model = bookCategoryTable.getModel();
        
        categoryIdField.setText(model.getValueAt(i, 0).toString());
        categoryNameField.setText(model.getValueAt(i, 1).toString());
        
    }//GEN-LAST:event_bookCategoryTableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            bookTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("No printer found!!", ex.getMessage());
        }
    }//GEN-LAST:event_Update1ActionPerformed

    private void printButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonBookCategoryActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            bookCategoryTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.err.format("No printer found!!", ex.getMessage());
        }
    }//GEN-LAST:event_printButtonBookCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PagesField;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update1;
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField bookCategoryField;
    private javax.swing.JTable bookCategoryTable;
    private javax.swing.JTextField bookIdField;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JTextField categoryIdField;
    private javax.swing.JTextField categoryNameField;
    private javax.swing.JButton exitButtonBook;
    private javax.swing.JButton exitButtonBookCategory;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton printButtonBookCategory;
    private com.toedter.calendar.JDateChooser publicationDateField;
    private javax.swing.JTextField publishingHouseField;
    private javax.swing.JButton saveButtonBook;
    private javax.swing.JButton saveButtonBookCategory;
    // End of variables declaration//GEN-END:variables
}
