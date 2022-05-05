
package natket;

public class Marketing extends javax.swing.JFrame {
    
    public Marketing() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        catalogs = new javax.swing.JLabel();
        insprod = new javax.swing.JLabel();
        inscatalog = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        marketing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 30));

        catalogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogsMouseClicked(evt);
            }
        });
        getContentPane().add(catalogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 160, 140));

        insprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insprodMouseClicked(evt);
            }
        });
        getContentPane().add(insprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 170, 140));

        inscatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscatalogMouseClicked(evt);
            }
        });
        getContentPane().add(inscatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 160, 140));

        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });
        getContentPane().add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 170, 140));

        marketing.setIcon(new javax.swing.ImageIcon("C:\\Users\\giann\\Documents\\NetBeansProjects\\NatKet\\build\\classes\\natket\\Marketing.jpg")); // NOI18N
        marketing.setText(" ");
        getContentPane().add(marketing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catalogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogsMouseClicked

        MarketingCatalogs a = new MarketingCatalogs();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_catalogsMouseClicked

    private void insprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insprodMouseClicked
        MarketingInsertProducts a = new MarketingInsertProducts();
        a.setVisible(true);
        this.dispose();
                       
        
        
    }//GEN-LAST:event_insprodMouseClicked

    private void inscatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscatalogMouseClicked
       
         MarketingInsertCatalogs a = new MarketingInsertCatalogs();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inscatalogMouseClicked

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        MarketingProducts a = new MarketingProducts();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_productsMouseClicked

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
            java.util.logging.Logger.getLogger(Marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Marketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel catalogs;
    private javax.swing.JLabel inscatalog;
    private javax.swing.JLabel insprod;
    private javax.swing.JLabel marketing;
    private javax.swing.JLabel products;
    // End of variables declaration//GEN-END:variables
}
