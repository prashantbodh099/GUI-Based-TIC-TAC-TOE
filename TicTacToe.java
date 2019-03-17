/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashant
 */
import java.awt.Color;
import javax.swing.*;

public class TicTacToe extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int yCount = 0;
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
    
    private void choosepl() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        }
        else {
            startGame = "X";
        }
    }
    private void Reset() {
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.lightGray);
        jButton2.setBackground(Color.lightGray);
        jButton3.setBackground(Color.lightGray);
        jButton4.setBackground(Color.lightGray);
        jButton5.setBackground(Color.lightGray);
        jButton6.setBackground(Color.lightGray);
        jButton7.setBackground(Color.lightGray);
        jButton8.setBackground(Color.lightGray);
        jButton9.setBackground(Color.lightGray);
    }
    private void winGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if((b1 == ("X")) && (b2 == ("X")) && (b3 == ("X"))){
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
            
            xCount++;
            gameScore();
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            
            xCount++;
            gameScore();
            jButton7.setBackground(Color.magenta);
            jButton8.setBackground(Color.magenta);
            jButton9.setBackground(Color.magenta);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton7.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.red);
            jButton5.setBackground(Color.red);
            jButton9.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.blue);
            jButton4.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
            
            xCount++;
            gameScore();
            jButton2.setBackground(Color.black);
            jButton5.setBackground(Color.black);
            jButton8.setBackground(Color.black);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.orange);
            jButton6.setBackground(Color.orange);
            jButton9.setBackground(Color.orange);
            JOptionPane.showMessageDialog(this, "player X win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        if((b1 == ("O")) && (b2 == ("O")) && (b3 == ("O"))){
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
            
            xCount++;
            gameScore();
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            
            xCount++;
            gameScore();
            jButton7.setBackground(Color.magenta);
            jButton8.setBackground(Color.magenta);
            jButton9.setBackground(Color.magenta);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton7.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.red);
            jButton5.setBackground(Color.red);
            jButton9.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.blue);
            jButton4.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
            
            xCount++;
            gameScore();
            jButton2.setBackground(Color.black);
            jButton5.setBackground(Color.black);
            jButton8.setBackground(Color.black);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.orange);
            jButton6.setBackground(Color.orange);
            jButton9.setBackground(Color.orange);
            JOptionPane.showMessageDialog(this, "player O win","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
    }
    private JFrame frame  = new JFrame();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMain = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jX = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLX = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jO = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLO = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jBReset = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMain.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jMain.setText("TIC TAC TOE");
        getContentPane().add(jMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 0, 180, -1));

        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(null);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(null);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(null);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(null);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jX.setFont(new java.awt.Font("aakar", 0, 24)); // NOI18N
        jX.setText("Player X");
        jPanel5.add(jX, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(null);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLX.setFont(new java.awt.Font("aakar", 0, 36)); // NOI18N
        jLX.setText("0");
        jLX.setBorder(null);
        jPanel6.add(jLX, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(null);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(null);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(null);
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(null);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jO.setFont(new java.awt.Font("aakar", 0, 24)); // NOI18N
        jO.setText("Player O");
        jPanel10.add(jO, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(null);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLO.setFont(new java.awt.Font("aakar", 0, 36)); // NOI18N
        jLO.setText("0");
        jPanel11.add(jLO, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(null);
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(null);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(null);
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(null);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jBReset.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jBReset.setText("Reset");
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });
        jPanel15.add(jBReset, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(null);
        jPanel16.setLayout(new java.awt.BorderLayout());

        jBExit.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jBExit.setText("Exit");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });
        jPanel16.add(jBExit, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 694, 447));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
       frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if u want to exit","TIC TAC TOE",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION) {
            System.exit(0); 
        }  
    }//GEN-LAST:event_jBExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.green);
        }
        else {
            jButton1.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.green);
        }
        else {
            jButton2.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.green);
        }
        else {
            jButton3.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.green);
        }
        else {
            jButton4.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.green);
        }
        else {
            jButton5.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.green);
        }
        else {
            jButton6.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.green);
        }
        else {
            jButton7.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.green);
        }
        else {
            jButton8.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.green);
        }
        else {
            jButton9.setForeground(Color.blue);
        }
        choosepl();
        winGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        Reset();
    }//GEN-LAST:event_jBResetActionPerformed
    //private JFrame frame;
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }
    private void gameScore() {
        jLX.setText(String.valueOf(xCount));
        jLO.setText(String.valueOf(yCount));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLO;
    private javax.swing.JLabel jLX;
    private javax.swing.JLabel jMain;
    private javax.swing.JLabel jO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables
}
