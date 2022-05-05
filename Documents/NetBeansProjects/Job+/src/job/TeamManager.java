/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

/**
 *
 *
 */
public class TeamManager extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public TeamManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JLabel();
        meet = new javax.swing.JLabel();
        persdata = new javax.swing.JLabel();
        empl = new javax.swing.JLabel();
        review = new javax.swing.JLabel();
        cal = new javax.swing.JLabel();
        apps = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setText(" ");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 110, 30));

        meet.setText(" ");
        meet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meetMouseClicked(evt);
            }
        });
        getContentPane().add(meet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 110, 30));

        persdata.setText(" ");
        persdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persdataMouseClicked(evt);
            }
        });
        getContentPane().add(persdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 130, 30));

        empl.setText(" ");
        empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emplMouseClicked(evt);
            }
        });
        getContentPane().add(empl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 120, 30));

        review.setText(" ");
        review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewMouseClicked(evt);
            }
        });
        getContentPane().add(review, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 130, 30));

        cal.setText(" ");
        cal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calMouseClicked(evt);
            }
        });
        getContentPane().add(cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 120, 30));

        apps.setText(" ");
        apps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appsMouseClicked(evt);
            }
        });
        getContentPane().add(apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        manager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job/Team Manager.jpg"))); // NOI18N
        manager.setText(" ");
        getContentPane().add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meetMouseClicked
           TeamManagerMeetings a = new TeamManagerMeetings();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_meetMouseClicked

    private void persdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_persdataMouseClicked
            TeamManagerPersonalData a = new TeamManagerPersonalData();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_persdataMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
         Home a = new Home();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void emplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emplMouseClicked
        TeamManagerEmployees a = new TeamManagerEmployees();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_emplMouseClicked

    private void reviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewMouseClicked
        TeamManagerReview a = new TeamManagerReview();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_reviewMouseClicked

    private void calMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calMouseClicked
        TeamManagerCalendar a = new TeamManagerCalendar();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_calMouseClicked

    private void appsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsMouseClicked
        TeamManagerApplications a = new TeamManagerApplications();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_appsMouseClicked

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
            java.util.logging.Logger.getLogger(TeamManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apps;
    private javax.swing.JLabel cal;
    private javax.swing.JLabel empl;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel meet;
    private javax.swing.JLabel persdata;
    private javax.swing.JLabel review;
    // End of variables declaration//GEN-END:variables
}