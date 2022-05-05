
package job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    
    public Signup() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttype = new javax.swing.JComboBox<>();
        backb = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        tpass = new javax.swing.JTextField();
        tfull = new javax.swing.JTextField();
        tsur = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        signup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttype.setBackground(new java.awt.Color(22, 134, 236));
        txttype.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR Team Member", "Candidate", "Employee", "Team Manager" }));
        getContentPane().add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 190, 60));

        backb.setText(" ");
        backb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbMouseClicked(evt);
            }
        });
        getContentPane().add(backb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 90, 30));

        tuser.setBackground(new java.awt.Color(252, 250, 251));
        tuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tuser.setBorder(null);
        getContentPane().add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 160, 20));

        tpass.setBackground(new java.awt.Color(252, 250, 251));
        tpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tpass.setBorder(null);
        getContentPane().add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 160, 20));

        tfull.setBackground(new java.awt.Color(252, 250, 251));
        tfull.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfull.setBorder(null);
        getContentPane().add(tfull, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 20));

        tsur.setBackground(new java.awt.Color(252, 250, 251));
        tsur.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tsur.setBorder(null);
        getContentPane().add(tsur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 20));

        temail.setBackground(new java.awt.Color(252, 250, 251));
        temail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        temail.setBorder(null);
        getContentPane().add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 130, 20));

        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job/Signup.jpg"))); // NOI18N
        signup.setText(" ");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbMouseClicked
            Home a = new Home();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backbMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        String username = tuser.getText();
        String password = tpass.getText();
        String name = tfull.getText();
        String surname = tsur.getText();
        String email = temail.getText();
        String type = (String) txttype.getSelectedItem();
        
        if (username.equals("") || password.equals("")|| name.equals("") || surname.equals("")||email.equals("")){
            JOptionPane.showMessageDialog(this,"Some fields are blanked, Try again!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/jobplusdb","root","");
        
        pst = con.prepareStatement("insert into user (username,password,name,surname,email,type) values (?,?,?,?,?,?)");
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, name);
        pst.setString(4, surname);
        pst.setString(5, email);
        pst.setString(6, type);
        
        pst.executeUpdate();
        
        
        
        
       
        JOptionPane.showMessageDialog(this,"Account Created!");
        
        
      
             
            
            
             
             
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        } 
    }//GEN-LAST:event_signupMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backb;
    private javax.swing.JLabel signup;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfull;
    private javax.swing.JTextField tpass;
    private javax.swing.JTextField tsur;
    private javax.swing.JTextField tuser;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables
}
