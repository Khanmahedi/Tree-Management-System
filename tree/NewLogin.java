/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahedi Hasan
 */
public class NewLogin extends javax.swing.JFrame {

    /**
     * Creates new form NewLogin
     */
    public NewLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bbfbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        apass = new javax.swing.JPasswordField();
        aname = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        bbfbtn.setBackground(new java.awt.Color(0, 51, 51));
        bbfbtn.setForeground(new java.awt.Color(255, 255, 255));
        bbfbtn.setText("Back");
        bbfbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bbfbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbfbtn.setFocusable(false);
        bbfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bbfbtn);
        bbfbtn.setBounds(10, 10, 70, 21);

        loginbtn.setBackground(new java.awt.Color(0, 204, 153));
        loginbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.setFocusPainted(false);
        loginbtn.setVerifyInputWhenFocusTarget(false);
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        jPanel1.add(loginbtn);
        loginbtn.setBounds(580, 360, 260, 30);

        apass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(apass);
        apass.setBounds(620, 290, 220, 30);

        aname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(aname);
        aname.setBounds(620, 230, 220, 30);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(580, 330, 260, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(580, 270, 260, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree/password.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(580, 290, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree/Communication.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(580, 230, 32, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree/avator (2).png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(640, 70, 100, 80);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 2, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Admin Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(600, 50, 180, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree/pcccc.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 80, 340, 310);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree/wave - Copy.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
             String name = aname.getText() ;
             String pass =  apass.getText() ;
            
        
             if(name.toLowerCase().equals("mahedikhan") && pass.equals("01722181811")) {
                 this.dispose();
                 
                  JOptionPane.showMessageDialog(null,"Login Successful") ;
                  AdminHome ad = new AdminHome() ;
                  this.dispose();
                  ad.setVisible(true);
                  
                 
             } else {
                 JOptionPane.showMessageDialog(null,"Wrong Username or Password") ;
             }
             
             
    }//GEN-LAST:event_loginbtnMouseClicked

    private void bbfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfbtnActionPerformed
        HomePage hm = new HomePage() ;
        this.dispose();
        hm.setVisible(true);
    }//GEN-LAST:event_bbfbtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aname;
    private javax.swing.JPasswordField apass;
    private javax.swing.JButton bbfbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton loginbtn;
    // End of variables declaration//GEN-END:variables
}
