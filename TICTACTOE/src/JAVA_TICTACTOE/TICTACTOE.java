/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JAVA_TICTACTOE;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SHYAM K
 */
public class TICTACTOE extends javax.swing.JFrame {


    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    boolean checker;
    
    public TICTACTOE() {
        initComponents();
    }
    
    private void gameScore()
    {
        lblx.setText(String.valueOf(xCount));
        lblo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    
    private void winningGame()
    {
        String b1=j1.getText();
        String b2=j1.getText();
        String b3=j1.getText();
        String b4=j1.getText();
        String b5=j1.getText();
        String b6=j1.getText();
        String b7=j1.getText();
        String b8=j1.getText();
        String b9=j1.getText();
        
        if(b1==("X") && b2==("X") && b3==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.BLUE);
            j2.setBackground(Color.BLUE);
            j3.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if(b3==("X") && b5==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.BLUE);
            j5.setBackground(Color.BLUE);
            j7.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if(b1==("X") && b5==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.BLUE);
            j5.setBackground(Color.BLUE);
            j9.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if(b4==("X") && b5==("X") && b6==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j4.setBackground(Color.BLUE);
            j5.setBackground(Color.BLUE);
            j6.setBackground(Color.BLUE);
            xCount++;
            gameScore();
            
        }
        if(b7==("X") && b8==("X") && b9==("X"))
                {
                    JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j7.setBackground(Color.BLUE);
            j8.setBackground(Color.BLUE);
            j9.setBackground(Color.BLUE);
            xCount++;
            gameScore();
                    
                }
        if(b1==("X") && b4==("X") && b7==("X"))
                {
                    JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.BLUE);
            j4.setBackground(Color.BLUE);
            j7.setBackground(Color.BLUE);
            xCount++;
            gameScore();
                }
        if(b2==("X") && b5==("X") && b8==("X"))
                {
                    JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j2.setBackground(Color.BLUE);
            j5.setBackground(Color.BLUE);
            j8.setBackground(Color.BLUE);
            xCount++;
            gameScore();
                }
        if(b3==("X") && b6==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.BLUE);
            j6.setBackground(Color.BLUE);
            j9.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if((b1==("O") && b2==("O") && b3==("O")))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.RED);
            j2.setBackground(Color.RED);
            j3.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b3==("O") && b5==("O") && b7==("O"))){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b1==("O") && b5==("O") && b9==("O"))){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b3==("O") && b6==("O") && b9==("O"))){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j3.setBackground(Color.RED);
            j6.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b2==("O") && b5==("O") && b8==("O"))){
             JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j2.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j4.setBackground(Color.RED);
            j5.setBackground(Color.RED);
            j6.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b7==("O") && b8==("O") && b9==("O"))){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j7.setBackground(Color.RED);
            j8.setBackground(Color.RED);
            j9.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        if((b1==("O") && b4==("O") && b7==("O"))){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            j1.setBackground(Color.RED);
            j4.setBackground(Color.RED);
            j7.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lblx = new javax.swing.JLabel();
        lblo = new javax.swing.JLabel();
        jblplayerX = new javax.swing.JLabel();
        jblplayerO = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblx.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblx.setText("Player X:");
        jPanel15.add(lblx, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, -1));

        lblo.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblo.setText("Player O:");
        jPanel15.add(lblo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jblplayerX.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jblplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayerX.setText("0");
        jblplayerX.setOpaque(true);
        jPanel15.add(jblplayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 220, 70));

        jblplayerO.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jblplayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayerO.setText("0");
        jblplayerO.setOpaque(true);
        jPanel15.add(jblplayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 220, 70));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 510, 200));

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton14.setText("Reset");
        jButton14.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton14.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 70));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton15.setText("Exit");
        jButton15.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, 70));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton16.setText("New Game");
        jButton16.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton16.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton16.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 90));

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 520, 200));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 800, 550));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tic Tac Toe");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 420, 90));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        jButton17.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton17.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton17.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -210, -1, 150));

        j2.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j2.setMaximumSize(new java.awt.Dimension(200, 158));
        j2.setMinimumSize(new java.awt.Dimension(200, 158));
        j2.setPreferredSize(new java.awt.Dimension(200, 158));
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        jPanel17.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        j3.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j3.setMaximumSize(new java.awt.Dimension(200, 158));
        j3.setMinimumSize(new java.awt.Dimension(200, 158));
        j3.setPreferredSize(new java.awt.Dimension(200, 158));
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        jPanel17.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 18, -1, 160));

        j4.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j4.setMaximumSize(new java.awt.Dimension(200, 158));
        j4.setMinimumSize(new java.awt.Dimension(200, 158));
        j4.setPreferredSize(new java.awt.Dimension(200, 158));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        jPanel17.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 150));

        j5.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j5.setMaximumSize(new java.awt.Dimension(200, 158));
        j5.setMinimumSize(new java.awt.Dimension(200, 158));
        j5.setPreferredSize(new java.awt.Dimension(200, 158));
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        jPanel17.add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 150));

        j6.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j6.setMaximumSize(new java.awt.Dimension(200, 158));
        j6.setMinimumSize(new java.awt.Dimension(200, 158));
        j6.setPreferredSize(new java.awt.Dimension(200, 158));
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        jPanel17.add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 150));

        j7.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j7.setMaximumSize(new java.awt.Dimension(200, 158));
        j7.setMinimumSize(new java.awt.Dimension(200, 158));
        j7.setPreferredSize(new java.awt.Dimension(200, 158));
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });
        jPanel17.add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        j8.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j8.setMaximumSize(new java.awt.Dimension(200, 158));
        j8.setMinimumSize(new java.awt.Dimension(200, 158));
        j8.setPreferredSize(new java.awt.Dimension(200, 158));
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });
        jPanel17.add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        j9.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j9.setMaximumSize(new java.awt.Dimension(200, 158));
        j9.setMinimumSize(new java.awt.Dimension(200, 158));
        j9.setPreferredSize(new java.awt.Dimension(200, 158));
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        jPanel17.add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        j1.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        j1.setMaximumSize(new java.awt.Dimension(200, 158));
        j1.setMinimumSize(new java.awt.Dimension(200, 158));
        j1.setPreferredSize(new java.awt.Dimension(200, 158));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        jPanel17.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel10.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 700, 550));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1780, 1160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1770, 1070));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        j1.setEnabled(true);
        j2.setEnabled(true);
        j3.setEnabled(true);
        j4.setEnabled(true);
        j5.setEnabled(true);
        j6.setEnabled(true);
        j7.setEnabled(true);
        j8.setEnabled(true);
        j9.setEnabled(true);

        lblx.setText("0");
        lblo.setText("0");

        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
        j6.setText("");
        j7.setText("");
        j8.setText("");
        j9.setText("");

        j1.setBackground(Color.BLACK);
        j2.setBackground(Color.BLACK);
        j3.setBackground(Color.BLACK);
        j4.setBackground(Color.BLACK);
        j5.setBackground(Color.BLACK);
        j6.setBackground(Color.BLACK);
        j7.setBackground(Color.BLACK);
        j8.setBackground(Color.BLACK);
        j9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        j1.setEnabled(true);
        j2.setEnabled(true);
        j3.setEnabled(true);
        j4.setEnabled(true);
        j5.setEnabled(true);
        j6.setEnabled(true);
        j7.setEnabled(true);
        j8.setEnabled(true);
        j9.setEnabled(true);

        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
        j6.setText("");
        j7.setText("");
        j8.setText("");
        j9.setText("");

        j1.setBackground(Color.BLACK);
        j2.setBackground(Color.BLACK);
        j3.setBackground(Color.BLACK);
        j4.setBackground(Color.BLACK);
        j5.setBackground(Color.BLACK);
        j6.setBackground(Color.BLACK);
        j7.setBackground(Color.BLACK);
        j8.setBackground(Color.BLACK);
        j9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        j1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j1ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
         j9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j9ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
         j6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j6ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
         j4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j4ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
         j3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j3ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        j2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
         j5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j5ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
         j7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
         j8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_j8ActionPerformed
private JFrame frame;
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
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JLabel jblplayerO;
    private javax.swing.JLabel jblplayerX;
    private javax.swing.JLabel lblo;
    private javax.swing.JLabel lblx;
    // End of variables declaration//GEN-END:variables
}
