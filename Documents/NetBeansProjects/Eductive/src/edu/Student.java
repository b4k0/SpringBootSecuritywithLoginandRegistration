/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Student extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Student() {
        initComponents();
        welcomeuser();
    }

     void welcomeuser(){
        String id = Signin.id.getText();
        
       
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            pst=con.prepareStatement("select name, surname from student where id = ?");
            pst.setString(1, id);
            rs=pst.executeQuery();
            
            if(rs.next()){
                name.setText(rs.getString("name"));     
                surname.setText(rs.getString("surname"));  
                
            }
            
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        StudentPage = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        calendar = new javax.swing.JButton();
        announcement = new javax.swing.JButton();
        homework = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 166, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        logo.setText("EDUCTIVE");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_exit_30px_1.png"))); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 60, -1));

        StudentPage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StudentPage.setText("Student Page");
        jPanel1.add(StudentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_sign_out_30px.png"))); // NOI18N
        logout.setText("Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 90, -1));

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome.setText("Welcome");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 20));

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 20));

        surname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 50)); // NOI18N
        jLabel2.setText("EDUCTIVE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 550, 43));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 522, 10));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("School Managment Application");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 260, 30));

        calendar.setBackground(new java.awt.Color(33, 166, 230));
        calendar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        calendar.setForeground(new java.awt.Color(255, 255, 255));
        calendar.setText("Calendar");
        calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarActionPerformed(evt);
            }
        });
        jPanel2.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 190, 90));

        announcement.setBackground(new java.awt.Color(33, 166, 230));
        announcement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        announcement.setForeground(new java.awt.Color(255, 255, 255));
        announcement.setText("Announcement");
        announcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementActionPerformed(evt);
            }
        });
        jPanel2.add(announcement, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 190, 90));

        homework.setBackground(new java.awt.Color(33, 166, 230));
        homework.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homework.setForeground(new java.awt.Color(255, 255, 255));
        homework.setText("Homework");
        homework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeworkActionPerformed(evt);
            }
        });
        jPanel2.add(homework, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 180, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
      int a= JOptionPane.showConfirmDialog(this,"Do you want to log out from your account?","Log out",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE ); 
        
        if(a==JOptionPane.YES_OPTION){
        
        Main b = new Main();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked
    }
    private void announcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementActionPerformed
         StudentAnnouncement b = new StudentAnnouncement();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_announcementActionPerformed

    private void homeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeworkActionPerformed
        StudentHomework b = new StudentHomework();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeworkActionPerformed

    private void calendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarActionPerformed
        StudentCalendar b = new StudentCalendar();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calendarActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudentPage;
    private javax.swing.JButton announcement;
    private javax.swing.JButton calendar;
    private javax.swing.JLabel exit;
    private javax.swing.JButton homework;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
