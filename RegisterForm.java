package april;

import java.sql.*;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        usernameT = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        showP = new javax.swing.JCheckBox();
        submitButton = new javax.swing.JButton();
        Success = new javax.swing.JLabel();
        passwordT = new javax.swing.JPasswordField();
        last = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        firstT = new javax.swing.JTextField();
        lastT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.cyan);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");

        first.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        first.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        first.setText("First Name:");

        user.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("Username:");

        usernameT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Password:");

        showP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showP.setText("Show");
        showP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        Success.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        passwordT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        last.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        last.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        last.setText("Last Name:");

        select.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        firstT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Login Now!");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitButton)))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(passwordT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showP)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(first, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(last, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showP))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(select))
                .addGap(18, 18, 18)
                .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPActionPerformed
        if(showP.isSelected()){
            passwordT.setEchoChar((char)0);
        }
        else{
            passwordT.setEchoChar('*');
        }
    }//GEN-LAST:event_showPActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://VAIBHAV:1433;databasename=Register;integratedSecurity=true";
            Connection con=DriverManager.getConnection(url,"","");
            String first =   firstT.getText();
            String last=     lastT.getText();
            String user =    usernameT.getText();
            String password= passwordT.getText();
            String sql="insert into Register values('"+first+"',' "+last+" ','"+user+"','"+password+"')";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Successfully Inserted");
            if(true){
                Success.setText("Registered Succesfully!");
                
            }else{
               // firstT.setText("");
               ///lastT.setText("");
              //  usernameT.setText("");
              //  passwordT.setText("");
                Success.setText("Try Again");
            }
           
        }
        catch(Exception e)
        {
            System.out.println("Error---"+e);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://VAIBHAV:1433;databasename=Register;integratedSecurity=true";
            Connection con=DriverManager.getConnection(url,"",""); 
            System.out.println("check1");
            String sqlquery="select * from Register where username='"+usernameT.getText()+"'";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sqlquery);
            System.out.println("check5");
while(rs.next())
{   
    System.out.println("hello");
    firstT.setText(rs.getString(1));
    lastT.setText(rs.getString(2));
    passwordT.setText(rs.getString(4));
    System.out.println("hi");
}
        }
        catch(Exception e)
        {
            System.out.println("error--"+e);
        }
    }//GEN-LAST:event_selectActionPerformed

    private void firstTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstTActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Success;
    private javax.swing.JLabel first;
    private javax.swing.JTextField firstT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel last;
    private javax.swing.JTextField lastT;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordT;
    private javax.swing.JButton select;
    private javax.swing.JCheckBox showP;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usernameT;
    // End of variables declaration//GEN-END:variables
}
