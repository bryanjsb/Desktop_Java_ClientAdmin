package Frames;

import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }

    private boolean checkUser(String user, String pass) {
        boolean result = false;

        if ("Admin".equals(user) && "Admin".equals(pass)) {
            result = true;
        } else if ("".equals(user) && "".equals(pass)) {
            result = true;
        }

        return result;
    }

    private void enterClientRegister() {
        System.out.println("Entrando a la ventana Registro de Clientes");
        this.setVisible(false);
        RegisterClient regClient = new RegisterClient();
        regClient.setVisible(true);
    }

    private void log() {
        String user = this.jTextField_User.getText();
        String pass;
        pass = this.jPasswordField_Password.getText();

//        System.out.printf("Usuario:%s%n", user);
//        System.out.printf("Contraseña:%s%n", pass);
        boolean init = checkUser(user, pass);
        if (init) {
            enterClientRegister();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña"
                    + " no corresponde. Intentelo de nuevo",
                    "Login Incorrecto", JOptionPane.WARNING_MESSAGE);
            this.jTextField_User.setText("");
            this.jPasswordField_Password.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_User = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        btn_LogIn = new javax.swing.JButton();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel_Footer = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion de registro de clientes");
        setLocationByPlatform(true);
        setName("frameLogin"); // NOI18N

        jLabel_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnuser.png"))); // NOI18N
        jLabel_User.setText("USUARIO");

        jLabel_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        jLabel_Password.setText("CONTRASEÑA");

        btn_LogIn.setBackground(new java.awt.Color(33, 45, 174));
        btn_LogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btn_LogIn.setText("Iniciar Sección");
        btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogInActionPerformed(evt);
            }
        });

        jLabel_Footer.setText("2020 Elaborated and designed by Bryan Sánchez Brenes.");

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N

        btn_Exit.setBackground(new java.awt.Color(198, 61, 61));
        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnExit.png"))); // NOI18N
        btn_Exit.setText("Salir");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Password)
                            .addComponent(jLabel_User)
                            .addComponent(jTextField_User)
                            .addComponent(btn_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jPasswordField_Password)
                            .addComponent(img1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Footer)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogInActionPerformed
        log();
    }//GEN-LAST:event_btn_LogInActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables

}
