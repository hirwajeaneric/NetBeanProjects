package view;

public class LibrarySystem extends javax.swing.JFrame {

    public LibrarySystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Operation = new javax.swing.JMenu();
        OperationMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clientMenu = new javax.swing.JMenuItem();
        bookMenu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );

        Operation.setText("Operation ");
        Operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationActionPerformed(evt);
            }
        });

        OperationMenu.setText("Operation");
        OperationMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperationMenuActionPerformed(evt);
            }
        });
        Operation.add(OperationMenu);

        jMenuBar1.add(Operation);

        jMenu2.setText("System");

        clientMenu.setText("Client");
        clientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientMenuActionPerformed(evt);
            }
        });
        jMenu2.add(clientMenu);

        bookMenu.setText("Book");
        bookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookMenuActionPerformed(evt);
            }
        });
        jMenu2.add(bookMenu);

        jMenuItem3.setText("Mnemonic");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Accelerator");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientMenuActionPerformed
        ClientForm cl = new ClientForm();
        jDesktopPane1.add(cl);
        cl.show();
    }//GEN-LAST:event_clientMenuActionPerformed

    private void bookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookMenuActionPerformed
        BookForm bk = new BookForm();
        jDesktopPane1.add(bk);
        bk.show();
    }//GEN-LAST:event_bookMenuActionPerformed

    private void OperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperationActionPerformed
        
    }//GEN-LAST:event_OperationActionPerformed

    private void OperationMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperationMenuActionPerformed
        Operations op = new Operations();
        jDesktopPane1.add(op);
        op.show();
    }//GEN-LAST:event_OperationMenuActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Operation;
    private javax.swing.JMenuItem OperationMenu;
    private javax.swing.JMenuItem bookMenu;
    private javax.swing.JMenuItem clientMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
