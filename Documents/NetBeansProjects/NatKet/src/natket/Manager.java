
package natket;

public class Manager extends javax.swing.JFrame {
    
    public Manager() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        transactions = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        employees = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 30));

        transactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionsMouseClicked(evt);
            }
        });
        getContentPane().add(transactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 160, 140));

        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });
        getContentPane().add(customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 170, 140));

        employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesMouseClicked(evt);
            }
        });
        getContentPane().add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 160, 140));

        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        getContentPane().add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 170, 140));

        manager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/natket/Manager.jpg"))); // NOI18N
        manager.setText(" ");
        getContentPane().add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionsMouseClicked
        ManagerTransactions a = new ManagerTransactions();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactionsMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        ManagerCustomers a = new ManagerCustomers();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customersMouseClicked

    private void employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseClicked
        ManagerEmployees a = new ManagerEmployees();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeesMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        ManagerSales a = new ManagerSales();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        HomePage a = new HomePage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel customers;
    private javax.swing.JLabel employees;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel transactions;
    // End of variables declaration//GEN-END:variables
}
