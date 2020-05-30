package harsh07_guestmanagementsystem;

import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author harsh-0706
 */
public class FirstPage extends javax.swing.JFrame {

  /**
   * Creates new form FirstPage
   */
  public FirstPage() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jButton3 = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jPasswordField1 = new javax.swing.JPasswordField();
    jCheckBox1 = new javax.swing.JCheckBox();
    jLabel2 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jButton4 = new javax.swing.JButton();
    jPasswordField2 = new javax.swing.JPasswordField();
    jLabel6 = new javax.swing.JLabel();
    jCheckBox2 = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    jButton3.setText("X");
    jButton3.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton3ActionPerformed(evt);
        }
      }
    );

    jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel3.setText("UltraTech Cement Limited ");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel4.setText("Unit : Dalla Cement Works");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setText("Dalla, Dist. Sonebhadra 231207");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(
                      jPanel1Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                    )
                )
            )
            .addContainerGap()
        )
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel5)
            .addContainerGap()
        )
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    jLabel1.setText("Welcome to the Guest Management Portal");

    jButton2.setText("About the Project");
    jButton2.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton2ActionPerformed(evt);
        }
      }
    );

    jPanel2.setBorder(
      javax.swing.BorderFactory.createTitledBorder("Administrator Login")
    );

    jCheckBox1.setText("Show Password");
    jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jCheckBox1.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jCheckBox1ActionPerformed(evt);
        }
      }
    );

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setText("Enter Password");

    jButton1.setText("Login");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
      jPanel2
    );
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jCheckBox1)
                .addGroup(
                  jPanel2Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.LEADING
                    )
                    .addGroup(
                      jPanel2Layout
                        .createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(
                          jPasswordField1,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          183,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addGroup(
                      jPanel2Layout
                        .createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1)
                    )
                )
            )
            .addGap(49, 49, 49)
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGap(13, 13, 13)
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  jPasswordField1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  29,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(jLabel2)
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox1)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              11,
              Short.MAX_VALUE
            )
            .addComponent(jButton1)
            .addContainerGap()
        )
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
      jPanel3
    );
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(
              jPanel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap()
        )
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(
              jPanel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(11, Short.MAX_VALUE)
        )
    );

    jPanel4.setBorder(
      javax.swing.BorderFactory.createTitledBorder("User Login")
    );

    jButton4.setText("Login");
    jButton4.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton4ActionPerformed(evt);
        }
      }
    );

    jLabel6.setText("Enter Password");

    jCheckBox2.setText("Show Password");
    jCheckBox2.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jCheckBox2ActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
      jPanel4
    );
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel4Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel4Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel4Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.TRAILING
                    )
                    .addComponent(jCheckBox2)
                    .addGroup(
                      jPanel4Layout
                        .createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(
                          jPasswordField2,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          161,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  jPanel4Layout
                    .createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jButton4)
                )
            )
            .addContainerGap(77, Short.MAX_VALUE)
        )
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel4Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel4Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(
                  jPasswordField2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox2)
            .addGap(4, 4, 4)
            .addComponent(jButton4)
            .addContainerGap()
        )
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton3)
            .addGap(43, 43, 43)
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(
                      jPanel1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          jPanel3,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(jLabel1)
                        .addComponent(
                          jPanel4,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(jButton2)
                )
            )
            .addContainerGap(66, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jButton3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jPanel1,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGap(25, 25, 25)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(
              jPanel3,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jPanel4,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGap(18, 18, 18)
            .addComponent(jButton2)
            .addGap(41, 41, 41)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton3ActionPerformed
    System.exit(0);
  } //GEN-LAST:event_jButton3ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton2ActionPerformed
    About_the_Project f = new About_the_Project();
    f.setVisible(true);
  } //GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
    String in;
    in = jPasswordField1.getText();

    // System.out.println(fx.compute_hash1(pass)) ;
    // System.out.println(fx.compute_hash2(pass)) ;

    Functions fx = new Functions();

    long val1 = fx.compute_hash1(in);
    long val2 = fx.compute_hash2(in);

    long hash1 = fx.getHashValue1ofPassword(1);
    long hash2 = fx.getHashValue2ofPassword(1);

    System.out.println("" + val1 + " " + val2);
    System.out.println("" + hash1 + " " + hash2);

    if (val1 == hash1 && val2 == hash2) {
      // JOptionPane.showMessageDialog(null,"You are now logged in. Try to keep the password confidential. ");
      Front f = new Front();
      this.dispose();
      f.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(
        null,
        "The password is Incorrect. Please try again. "
      );
      jPasswordField1.setText("");
    }
  } //GEN-LAST:event_jButton1ActionPerformed

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jCheckBox1ActionPerformed
    // TODO add your handling code here:

    // to see the password field

    if (jCheckBox1.isSelected() == true) {
      jPasswordField1.setEchoChar((char) 0);
    } else {
      jPasswordField1.setEchoChar('*');
    }
  } //GEN-LAST:event_jCheckBox1ActionPerformed

  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jCheckBox2ActionPerformed
    // TODO add your handling code here:
    if (jCheckBox2.isSelected() == true) {
      jPasswordField2.setEchoChar((char) 0);
    } else {
      jPasswordField2.setEchoChar('*');
    }
  } //GEN-LAST:event_jCheckBox2ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    String in;
    in = jPasswordField2.getText();

    Functions fx = new Functions();

    long val1 = fx.compute_hash1(in);
    long val2 = fx.compute_hash2(in);

    long hash1 = fx.getHashValue1ofPassword(2);
    long hash2 = fx.getHashValue2ofPassword(2);

    System.out.println("" + val1 + " " + val2);
    System.out.println("" + hash1 + " " + hash2);

    if (val1 == hash1 && val2 == hash2) {
      //JOptionPane.showMessageDialog(null,"You are now logged in. Try to keep the password confidential. ");
      UserEnd f = new UserEnd();
      this.dispose();
      f.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(
        null,
        "The password is Incorrect. Please try again. "
      );
      jPasswordField1.setText("");
    }
  } //GEN-LAST:event_jButton4ActionPerformed

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
      java
        .util.logging.Logger.getLogger(FirstPage.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java
        .util.logging.Logger.getLogger(FirstPage.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java
        .util.logging.Logger.getLogger(FirstPage.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java
        .util.logging.Logger.getLogger(FirstPage.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {

        public void run() {
          new FirstPage().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JPasswordField jPasswordField2;
  // End of variables declaration//GEN-END:variables
}
