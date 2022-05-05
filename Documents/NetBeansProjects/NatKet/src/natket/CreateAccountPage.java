
package natket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class CreateAccountPage extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;

   
    public CreateAccountPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createaccount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsur = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        ca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createaccount.setText(" ");
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccountMouseClicked(evt);
            }
        });
        getContentPane().add(createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 200, 50));

        jLabel3.setText(" ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 40));

        txtsur.setBackground(new java.awt.Color(193, 15, 15));
        txtsur.setForeground(new java.awt.Color(255, 255, 255));
        txtsur.setText(" ");
        txtsur.setBorder(null);
        getContentPane().add(txtsur, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, 20));

        txtuser.setBackground(new java.awt.Color(193, 15, 15));
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setText(" ");
        txtuser.setBorder(null);
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 180, 20));

        txtadd.setBackground(new java.awt.Color(193, 15, 15));
        txtadd.setForeground(new java.awt.Color(255, 255, 255));
        txtadd.setText(" ");
        txtadd.setBorder(null);
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 180, 20));

        txtcity.setBackground(new java.awt.Color(193, 15, 15));
        txtcity.setForeground(new java.awt.Color(255, 255, 255));
        txtcity.setText(" ");
        txtcity.setBorder(null);
        getContentPane().add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 160, 20));

        txtname.setBackground(new java.awt.Color(193, 15, 15));
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setText(" ");
        txtname.setBorder(null);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 20));

        txtpass.setBackground(new java.awt.Color(193, 15, 15));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setToolTipText("");
        txtpass.setBorder(null);
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 236, 160, 20));

        ca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/natket/CreateAccountpage.jpg"))); // NOI18N
        ca.setText(" ");
        getContentPane().add(ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       HomePage a = new HomePage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseClicked
         
          String name = txtname.getText();
          String surname = txtsur.getText();
          String username = txtuser.getText();
          String password = txtpass.getText();
          String address = txtadd.getText();
          String city = txtcity.getText();
          
          if(username.equals("") || password.equals("") || name.equals("")|| surname.equals("") || address.equals("") || city.equals(""))
          {
              JOptionPane.showMessageDialog(this,"One or more credentialss are blank","Error",JOptionPane.ERROR_MESSAGE); 
          }
          else
          {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/natketdb","root","");
            
            pst=con.prepareStatement("insert into users (username,password,name,surname,address,city) values (?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, surname);
            pst.setString(5, address);
            pst.setString(6, city);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Account Created!");
            
             HomePage a = new HomePage();
            a.setVisible(true);
            this.dispose();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateAccountPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountPage.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
    }//GEN-LAST:event_createaccountMouseClicked

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
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ca;
    private javax.swing.JLabel createaccount;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtsur;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
