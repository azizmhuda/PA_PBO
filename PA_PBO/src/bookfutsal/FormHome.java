/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookfutsal;

import static java.awt.GridBagConstraints.BOTH;
import javax.swing.*;

        
public class FormHome extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FormHome() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIKE FUTSAL SPORT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 90, 490, 60);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Welcome Sportsa !! ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 150, 200, 80);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel3.setText("Username :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 290, 230, 80);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 410, 240, 80);

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername);
        txtusername.setBounds(860, 300, 180, 50);

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(860, 420, 180, 50);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jButton1.setText("Masuk");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 590, 100, 40);

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(890, 590, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookfutsal/Hijau Abstrak Lomba Futsal Pamflet.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1550, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtusername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"masukan username");
            txtusername.requestFocus(); 
  
        }
        else if(txtpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masukan Passord");
            txtpassword.requestFocus();
            
        }
        else if(txtusername.getText().contains("admin")&& txtpassword.getText().contains("123")){
            new FormBooking().show();
            this.dispose();
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Username atau Password tidak sesuai");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
        
    }

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
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
