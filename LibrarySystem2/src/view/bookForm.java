 package view;

import controller.BookCategoryDao;
import controller.BookDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.BookCategory;

/**
 * @author hirwa
 */
public class bookForm extends javax.swing.JInternalFrame {

    public Connection con = null;
    public ResultSet rs = null;
    public PreparedStatement ps = null;
    public Statement s = null;

    public bookForm() {
        initComponents();
        updateBookTable();
        updateBookCategoryTable();
    }

    public void updateBookTable(){
        try {
            int i,q;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
            s = con.createStatement();
            rs = s.executeQuery("SELECT * FROM book");

            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            q = stData.getColumnCount();

            DefaultTableModel record = (DefaultTableModel) bookTable.getModel();
            record.setRowCount(0);

            while(rs.next()){

                Vector columnData = new Vector();

                for(i=1; i<=q; i++){
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

    public void updateBookCategoryTable(){
        try {
            int i,q;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        pageField = new javax.swing.JTextField();
        bookCategoryField = new javax.swing.JTextField();
        saveButtonBook = new javax.swing.JButton();
        resetButtonBook = new javax.swing.JButton();
        deleteButtonBook = new javax.swing.JButton();
        exitButtonBook = new javax.swing.JButton();
        publicationHouseField = new javax.swing.JTextField();
        printButtonBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        dateOfPublicationField = new com.toedter.calendar.JDateChooser();
        authorField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        categoryIdField = new javax.swing.JTextField();
        categoryNameField = new javax.swing.JTextField();
        exitButtonBookCategory = new javax.swing.JButton();
        printButtonBookCategory = new javax.swing.JButton();
        saveButtonBookCategory = new javax.swing.JButton();
        resetButtonBookCategory = new javax.swing.JButton();
        deleteButtonBookCategory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookCategoryTable = new javax.swing.JTable();
        updateButtonCat = new javax.swing.JButton();

        setTitle("Book");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("BOOK");

        jLabel2.setText("Book Id");

        jLabel3.setText("Title");

        jLabel4.setText("Publication House");

        jLabel5.setText("Book Category");

        jLabel6.setText("Date of publication");

        jLabel7.setText("Author");

        jLabel8.setText("Pages");

        pageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageFieldActionPerformed(evt);
            }
        });

        saveButtonBook.setText("SAVE");
        saveButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonBookActionPerformed(evt);
            }
        });

        resetButtonBook.setText("RESET");
        resetButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonBookActionPerformed(evt);
            }
        });

        deleteButtonBook.setText("DELETE");
        deleteButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonBookActionPerformed(evt);
            }
        });

        exitButtonBook.setText("EXIT");
        exitButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonBookActionPerformed(evt);
            }
        });

        printButtonBook.setText("PRINT");
        printButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonBookActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book id", "Title", "Publication House", "Date of publication", "Author", "Pages", "Book Category"
            }
        ));
        bookTable.setShowHorizontalLines(false);
        bookTable.setShowVerticalLines(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationHouseField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfPublicationField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pageField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(saveButtonBook)
                .addGap(12, 12, 12)
                .addComponent(resetButtonBook)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printButtonBook)
                .addGap(14, 14, 14)
                .addComponent(deleteButtonBook)
                .addGap(18, 18, 18)
                .addComponent(exitButtonBook))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bookIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(publicationHouseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateOfPublicationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(pageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(bookCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButtonBook)
                    .addComponent(resetButtonBook)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(printButtonBook)
                        .addComponent(updateButton))
                    .addComponent(deleteButtonBook)
                    .addComponent(exitButtonBook))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Book", jPanel1);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("BOOK CATEGORY");

        jLabel10.setText("Category Id");

        jLabel11.setText("Category Name");

        categoryIdField.setText("  ");

        categoryNameField.setText(" ");

        exitButtonBookCategory.setText("EXIT");
        exitButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonBookCategoryActionPerformed(evt);
            }
        });

        printButtonBookCategory.setText("PRINT");
        printButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonBookCategoryActionPerformed(evt);
            }
        });

        saveButtonBookCategory.setText("SAVE");
        saveButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonBookCategoryActionPerformed(evt);
            }
        });

        resetButtonBookCategory.setText("RESET");
        resetButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonBookCategoryActionPerformed(evt);
            }
        });

        deleteButtonBookCategory.setText("DELETE");
        deleteButtonBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonBookCategoryActionPerformed(evt);
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
                "Category Id", "Category  Name"
            }
        ));
        bookCategoryTable.setShowHorizontalLines(false);
        bookCategoryTable.setShowVerticalLines(false);
        bookCategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookCategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookCategoryTable);

        updateButtonCat.setText("UPDATE");
        updateButtonCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel9))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(saveButtonBookCategory)
                .addGap(12, 12, 12)
                .addComponent(resetButtonBookCategory)
                .addGap(18, 18, 18)
                .addComponent(updateButtonCat)
                .addGap(12, 12, 12)
                .addComponent(printButtonBookCategory)
                .addGap(14, 14, 14)
                .addComponent(deleteButtonBookCategory)
                .addGap(18, 18, 18)
                .addComponent(exitButtonBookCategory))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButtonBookCategory)
                    .addComponent(resetButtonBookCategory)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(printButtonBookCategory)
                        .addComponent(updateButtonCat))
                    .addComponent(deleteButtonBookCategory)
                    .addComponent(exitButtonBookCategory))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Book Category", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 469));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageFieldActionPerformed

    private void printButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonBookActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try{
            bookTable.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("No printer Found", e.getMessage());
        }
    }//GEN-LAST:event_printButtonBookActionPerformed

    private void printButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonBookCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printButtonBookCategoryActionPerformed

    private void exitButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonBookActionPerformed
        JFrame frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Bookform",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonBookActionPerformed

    private void saveButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonBookActionPerformed
        String bookId = bookIdField.getText();
        String booktitle = titleField.getText();
        String publishingHouse = publicationHouseField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfPublication = sdf.format(dateOfPublicationField.getDate());
        String author = authorField.getText();
        String page = pageField.getText();
        int pages = Integer.parseInt(page);
        String bookCategory = bookCategoryField.getText();

        Book bk = new Book(bookId, title, publishingHouse, dateOfPublication, author, page, bookCategory);
       
        BookDao bd = new BookDao();
        bd.SaveBookData(bk);

        updateBookTable();
        JOptionPane.showMessageDialog(this, "Book records added!");
    }//GEN-LAST:event_saveButtonBookActionPerformed

    private void saveButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonBookCategoryActionPerformed
        String categoryId = categoryIdField.getText();
        String categoryName = categoryNameField.getText();

        BookCategory bc = new BookCategory();
        bc.setBookCategoryId(categoryId);
        bc.setBookCategoryName(categoryName);

        BookCategoryDao bcd = new BookCategoryDao();
        bcd.SaveBookCategoryData(bc);

        updateBookCategoryTable();
        JOptionPane.showMessageDialog(this,"Book Category records added!");
    }//GEN-LAST:event_saveButtonBookCategoryActionPerformed

    private void exitButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonBookCategoryActionPerformed
        JFrame frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!","Bookform",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonBookCategoryActionPerformed

    private void resetButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonBookActionPerformed
        bookIdField.setText("");
        titleField.setText("");
        publicationHouseField.setText("");
        dateOfPublicationField.setDate(null);
        authorField.setText("");
        pageField.setText("");
        bookCategoryField.setText("");
    }//GEN-LAST:event_resetButtonBookActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
          try {
            DefaultTableModel record = (DefaultTableModel)bookTable.getModel();
            int SelectedRows = bookTable.getSelectedRow();

            bookIdField.setText(record.getValueAt(SelectedRows, 0).toString());
            titleField.setText(record.getValueAt(SelectedRows, 1).toString());
            publicationHouseField.setText(record.getValueAt(SelectedRows, 2).toString());
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)record.getValueAt(SelectedRows, 3));
            dateOfPublicationField.setDate(date);
            authorField.setText(record.getValueAt(SelectedRows, 4).toString());
            pageField.setText(record.getValueAt(SelectedRows, 5).toString());
            bookCategoryField.setText(record.getValueAt(SelectedRows, 6).toString());
        } catch (ParseException ex) {
            Logger.getLogger(bookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookCategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookCategoryTableMouseClicked
        DefaultTableModel record = (DefaultTableModel)bookCategoryTable.getModel();
        int SelectedRows = bookCategoryTable.getSelectedRow();

        categoryIdField.setText(record.getValueAt(SelectedRows, 0).toString());
        categoryNameField.setText(record.getValueAt(SelectedRows, 1).toString());
    }//GEN-LAST:event_bookCategoryTableMouseClicked

    private void resetButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonBookCategoryActionPerformed
        categoryIdField.setText("");
        categoryNameField.setText("");
    }//GEN-LAST:event_resetButtonBookCategoryActionPerformed

    private void deleteButtonBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonBookCategoryActionPerformed
        DefaultTableModel model = (DefaultTableModel)bookCategoryTable.getModel();
        int SelectedRows = bookCategoryTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(SelectedRows, 0).toString());
        int deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item","Warning",JOptionPane.YES_NO_OPTION);
        if (deleteItem == JOptionPane.YES_OPTION){

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
                s = con.createStatement();
                ps = con.prepareStatement("DELETE FROM bookcategory where categoryId=?");

                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book category Record updated Successfully!");
                updateBookCategoryTable();

                categoryIdField.setText("");
                categoryNameField.setText("");


            } catch (SQLException ex) {
                Logger.getLogger(bookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_deleteButtonBookCategoryActionPerformed

    private void updateButtonCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonCatActionPerformed
        try {
            DefaultTableModel record = (DefaultTableModel)bookCategoryTable.getModel();
            int SelectedRows = bookCategoryTable.getSelectedRow();

            int id = Integer.parseInt(record.getValueAt(SelectedRows, 0).toString());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
            s = con.createStatement();
            ps = con.prepareStatement("UPDATE bookcategory SET categoryId=?, categoryName=? WHERE categoryId=?");

            ps.setString(1, categoryIdField.getText());
            ps.setString(2, categoryNameField.getText());
            ps.setInt(3, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Book category record successfully updated!!");
            updateBookCategoryTable();
        } catch (SQLException ex) {
            Logger.getLogger(bookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonCatActionPerformed

    private void deleteButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonBookActionPerformed
        DefaultTableModel model = (DefaultTableModel)bookTable.getModel();
        int SelectedRows = bookCategoryTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(SelectedRows, 0).toString());
        int deletedItem = JOptionPane.showConfirmDialog(null, "Do you want to delete the selected row?","Warning",JOptionPane.YES_NO_OPTION);
        if(deletedItem == JOptionPane.YES_OPTION){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
                s = con.createStatement();
                ps = con.prepareStatement("DELETE FROM book WHERE bookId=?");

                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book category Record updated Successfully");
                updateBookTable();

                bookIdField.setText("");
                titleField.setText("");
                publicationHouseField.setText("");
                //dateOfPublicationField.
                authorField.setText("");
                pageField.setText("");
                bookCategoryField.setText("");


            } catch (SQLException ex) {
                Logger.getLogger(bookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButtonBookActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            DefaultTableModel record = (DefaultTableModel)bookTable.getModel();
            int SelectedRows = bookTable.getSelectedRow();

            int id = Integer.parseInt(record.getValueAt(SelectedRows, 0).toString());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
            s = con.createStatement();
            ps = con.prepareStatement("UPDATE book SET bookId=?, title=?, publishingHouse=?, dateOfPublication=?, author=?, pages=?, bookCategory=? WHERE bookId=?");

            ps.setString(1, bookIdField.getText());
            ps.setString(2, titleField.getText());
            ps.setString(3, publicationHouseField.getText());
            ps.setString(4, dateOfPublicationField.getDateFormatString());
            ps.setString(5, authorField.getText());
            ps.setString(6, pageField.getText());
            ps.setString(7, bookCategoryField.getText());
            ps.setInt(8, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Client Record successfully updated!!");
            updateBookTable();
        } catch (SQLException ex) {
            Logger.getLogger(bookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField bookCategoryField;
    private javax.swing.JTable bookCategoryTable;
    private javax.swing.JTextField bookIdField;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField categoryIdField;
    private javax.swing.JTextField categoryNameField;
    private com.toedter.calendar.JDateChooser dateOfPublicationField;
    private javax.swing.JButton deleteButtonBook;
    private javax.swing.JButton deleteButtonBookCategory;
    private javax.swing.JButton exitButtonBook;
    private javax.swing.JButton exitButtonBookCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField pageField;
    private javax.swing.JButton printButtonBook;
    private javax.swing.JButton printButtonBookCategory;
    private javax.swing.JTextField publicationHouseField;
    private javax.swing.JButton resetButtonBook;
    private javax.swing.JButton resetButtonBookCategory;
    private javax.swing.JButton saveButtonBook;
    private javax.swing.JButton saveButtonBookCategory;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButtonCat;
    // End of variables declaration//GEN-END:variables
}
