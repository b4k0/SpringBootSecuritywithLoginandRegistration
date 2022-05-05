
package natket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class LoginPage extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst,pst1,pst2,pst3,pst4,pst5;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5;
    
    public LoginPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        LoginButton = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        log = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText(" ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 40));

        txtuser.setBackground(new java.awt.Color(193, 15, 15));
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 230, 30));

        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 250, 60));

        txtpass.setBackground(new java.awt.Color(193, 15, 15));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 250, 30));

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/natket/Loginpage.jpg"))); // NOI18N
        log.setText(" ");
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       HomePage a = new HomePage();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        
        String username = txtuser.getText();
        String password = txtpass.getText();
        
       
        if(username.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Username or Password are blank","Error",JOptionPane.ERROR_MESSAGE); 
        }
        else
        {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/natketdb","root","");
            
            pst=con.prepareStatement("select * from users where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs=pst.executeQuery();
            
           if(rs.next())
            {
   
            JOptionPane.showMessageDialog(this,"You have logged in successfully!");
            
            
             String user =rs.getString("username");
             
             pst1 = con.prepareStatement("select * from manager where username=? ");
             pst1.setString(1, user);
             rs1=pst1.executeQuery();
             
             if(rs1.next()){
                 Manager b = new Manager();
                b.setVisible(true);
                this.dispose();
             }
             
             pst2 = con.prepareStatement("select * from marketing where username=? ");
             pst2.setString(1, user);
             rs2=pst2.executeQuery();
             
             if(rs2.next()){
                Marketing b = new Marketing();
                b.setVisible(true);
                this.dispose();
             }
             pst3 = con.prepareStatement("select * from accounting where username=? ");
             pst3.setString(1, user);
             rs3=pst3.executeQuery();
             
             if(rs3.next()){
                Accounting b = new Accounting();
                b.setVisible(true);
                this.dispose();
             }
             pst4 = con.prepareStatement("select * from sales where username=? ");
             pst4.setString(1, user);
             rs4=pst4.executeQuery();
             
             if(rs4.next()){
                Sales b = new Sales();
                b.setVisible(true);
                this.dispose();
             }
             pst5 = con.prepareStatement("select * from warehouse where username=? ");
             pst5.setString(1, user);
             rs5=pst5.executeQuery();
             
             if(rs5.next()){
                Warehouse b = new Warehouse();
                b.setVisible(true);
                this.dispose();
             }
                
            }
           else
           {
               
            JOptionPane.showMessageDialog(this,"Username or Password are incorrect","Error",JOptionPane.ERROR_MESSAGE); 
            txtuser.setText("");
            txtpass.setText("");
            
        
           }
            
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel log;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
