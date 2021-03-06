/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.individu;

/**
 *
 * @author faldi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
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

        basePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        iconUsername = new javax.swing.JLabel();
        iconLock = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        loginButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        signupButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        basePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Bebas Neue", 0, 52)); // NOI18N
        title.setForeground(new java.awt.Color(240, 204, 153));
        title.setText("YUK KE MARS !");
        basePanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, 50));

        iconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon username.png"))); // NOI18N
        basePanel.add(iconUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        iconLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/password icon.png"))); // NOI18N
        basePanel.add(iconLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        txtUsername.setBackground(new java.awt.Color(34, 67, 153));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        basePanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, 20));

        password.setBackground(new java.awt.Color(34, 67, 153));
        password.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("12345666");
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        basePanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 20));
        basePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 220, -1));
        basePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 220, -1));
        basePanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, -1));

        loginButton.setBackground(new java.awt.Color(240, 204, 153));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Nexa Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 67, 153));
        jLabel6.setText("Log  in");
        loginButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        basePanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, 30));

        signupButton.setBackground(new java.awt.Color(211, 72, 64));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nexa Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 204, 153));
        jLabel4.setText("Sign up");

        javax.swing.GroupLayout signupButtonLayout = new javax.swing.GroupLayout(signupButton);
        signupButton.setLayout(signupButtonLayout);
        signupButtonLayout.setHorizontalGroup(
            signupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(signupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signupButtonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        signupButtonLayout.setVerticalGroup(
            signupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(signupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signupButtonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        basePanel.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Background login.png"))); // NOI18N
        basePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
      MainMenu mainmenu = new MainMenu();
      mainmenu.setVisible(true);
      dispose();
        
    }//GEN-LAST:event_loginButtonMouseClicked

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseClicked
        // TODO add your handling code here:
        Register register = new Register();
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel iconLock;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signupButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
