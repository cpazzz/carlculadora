package br.java.carlculadora.screens;

import br.java.carlculadora.classes.Operations;
import br.java.carlculadora.classes.DivideByZeroException;
import java.util.ArrayList;

public class Carlculadora extends javax.swing.JFrame {

    private String a, b;
    private String operation = "nula";
    private final String INVALID = "Inválido";

    public Carlculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPlFundo = new javax.swing.JPanel();
        jBt0 = new javax.swing.JButton();
        jBt1 = new javax.swing.JButton();
        jBt2 = new javax.swing.JButton();
        jBt3 = new javax.swing.JButton();
        jBt4 = new javax.swing.JButton();
        jBt5 = new javax.swing.JButton();
        jBt6 = new javax.swing.JButton();
        jBt7 = new javax.swing.JButton();
        jBt8 = new javax.swing.JButton();
        jBt9 = new javax.swing.JButton();
        jBtMol = new javax.swing.JButton();
        jBtFloatP = new javax.swing.JButton();
        jBtEquals = new javax.swing.JButton();
        jBtAdd = new javax.swing.JButton();
        jBtSubtract = new javax.swing.JButton();
        jBtMultiply = new javax.swing.JButton();
        jBtDivide = new javax.swing.JButton();
        jBtPow = new javax.swing.JButton();
        jBtDeleteLastValue = new javax.swing.JButton();
        jBtClearAll = new javax.swing.JButton();
        jLbScreen1 = new javax.swing.JLabel();
        jLbScreen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPlFundo.setBackground(new java.awt.Color(31, 31, 31));
        jPlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBt0.setBackground(new java.awt.Color(41, 41, 41));
        jBt0.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt0.setForeground(new java.awt.Color(255, 255, 255));
        jBt0.setText("0");
        jBt0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt0.setBorderPainted(false);
        jBt0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt0.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt0.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt0.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt0MouseExited(evt);
            }
        });
        jBt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt0ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 364, 75, 55));

        jBt1.setBackground(new java.awt.Color(41, 41, 41));
        jBt1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt1.setForeground(new java.awt.Color(255, 255, 255));
        jBt1.setText("1");
        jBt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt1.setBorderPainted(false);
        jBt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt1.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt1.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt1.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt1MouseExited(evt);
            }
        });
        jBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt1ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 308, 75, 55));

        jBt2.setBackground(new java.awt.Color(41, 41, 41));
        jBt2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt2.setForeground(new java.awt.Color(255, 255, 255));
        jBt2.setText("2");
        jBt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt2.setBorderPainted(false);
        jBt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt2.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt2.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt2.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt2MouseExited(evt);
            }
        });
        jBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt2ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 308, 75, 55));

        jBt3.setBackground(new java.awt.Color(41, 41, 41));
        jBt3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt3.setForeground(new java.awt.Color(255, 255, 255));
        jBt3.setText("3");
        jBt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt3.setBorderPainted(false);
        jBt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt3.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt3.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt3.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt3MouseExited(evt);
            }
        });
        jBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt3ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 308, 75, 55));

        jBt4.setBackground(new java.awt.Color(41, 41, 41));
        jBt4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt4.setForeground(new java.awt.Color(255, 255, 255));
        jBt4.setText("4");
        jBt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt4.setBorderPainted(false);
        jBt4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt4.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt4.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt4.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt4MouseExited(evt);
            }
        });
        jBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt4ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 252, 75, 55));

        jBt5.setBackground(new java.awt.Color(41, 41, 41));
        jBt5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt5.setForeground(new java.awt.Color(255, 255, 255));
        jBt5.setText("5");
        jBt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt5.setBorderPainted(false);
        jBt5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt5.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt5.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt5.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt5MouseExited(evt);
            }
        });
        jBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt5ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 252, 75, 55));

        jBt6.setBackground(new java.awt.Color(41, 41, 41));
        jBt6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt6.setForeground(new java.awt.Color(255, 255, 255));
        jBt6.setText("6");
        jBt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt6.setBorderPainted(false);
        jBt6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt6.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt6.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt6.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt6MouseExited(evt);
            }
        });
        jBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt6ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 252, 75, 55));

        jBt7.setBackground(new java.awt.Color(41, 41, 41));
        jBt7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt7.setForeground(new java.awt.Color(255, 255, 255));
        jBt7.setText("7");
        jBt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt7.setBorderPainted(false);
        jBt7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt7.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt7.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt7.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt7MouseExited(evt);
            }
        });
        jBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt7ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 196, 75, 55));

        jBt8.setBackground(new java.awt.Color(41, 41, 41));
        jBt8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt8.setForeground(new java.awt.Color(255, 255, 255));
        jBt8.setText("8");
        jBt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt8.setBorderPainted(false);
        jBt8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt8.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt8.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt8.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt8MouseExited(evt);
            }
        });
        jBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt8ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 196, 75, 55));

        jBt9.setBackground(new java.awt.Color(41, 41, 41));
        jBt9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBt9.setForeground(new java.awt.Color(255, 255, 255));
        jBt9.setText("9");
        jBt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBt9.setBorderPainted(false);
        jBt9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBt9.setMaximumSize(new java.awt.Dimension(75, 55));
        jBt9.setMinimumSize(new java.awt.Dimension(75, 55));
        jBt9.setPreferredSize(new java.awt.Dimension(75, 55));
        jBt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBt9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBt9MouseExited(evt);
            }
        });
        jBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt9ActionPerformed(evt);
            }
        });
        jPlFundo.add(jBt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 196, 75, 55));

        jBtMol.setBackground(new java.awt.Color(41, 41, 41));
        jBtMol.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtMol.setForeground(new java.awt.Color(255, 255, 255));
        jBtMol.setText("+/-");
        jBtMol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtMol.setBorderPainted(false);
        jBtMol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtMol.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtMol.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtMol.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtMol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtMolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtMolMouseExited(evt);
            }
        });
        jBtMol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtMolActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtMol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 364, 75, 55));

        jBtFloatP.setBackground(new java.awt.Color(41, 41, 41));
        jBtFloatP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtFloatP.setForeground(new java.awt.Color(255, 255, 255));
        jBtFloatP.setText(",");
        jBtFloatP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtFloatP.setBorderPainted(false);
        jBtFloatP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtFloatP.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtFloatP.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtFloatP.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtFloatP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtFloatPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtFloatPMouseExited(evt);
            }
        });
        jBtFloatP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtFloatPActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtFloatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 364, 75, 55));

        jBtEquals.setBackground(new java.awt.Color(103, 68, 255));
        jBtEquals.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtEquals.setForeground(new java.awt.Color(255, 255, 255));
        jBtEquals.setText("=");
        jBtEquals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jBtEquals.setBorderPainted(false);
        jBtEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtEquals.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtEquals.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtEquals.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtEqualsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtEqualsMouseExited(evt);
            }
        });
        jBtEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEqualsActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 364, 75, 55));

        jBtAdd.setBackground(new java.awt.Color(41, 41, 41));
        jBtAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtAdd.setForeground(new java.awt.Color(150, 150, 150));
        jBtAdd.setText("+");
        jBtAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtAdd.setBorderPainted(false);
        jBtAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtAdd.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtAdd.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtAdd.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtAddMouseExited(evt);
            }
        });
        jBtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 308, 75, 55));

        jBtSubtract.setBackground(new java.awt.Color(41, 41, 41));
        jBtSubtract.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtSubtract.setForeground(new java.awt.Color(150, 150, 150));
        jBtSubtract.setText("-");
        jBtSubtract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtSubtract.setBorderPainted(false);
        jBtSubtract.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtSubtract.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtSubtract.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtSubtract.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtSubtractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtSubtractMouseExited(evt);
            }
        });
        jBtSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubtractActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 252, 75, 55));

        jBtMultiply.setBackground(new java.awt.Color(41, 41, 41));
        jBtMultiply.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtMultiply.setForeground(new java.awt.Color(150, 150, 150));
        jBtMultiply.setText("x");
        jBtMultiply.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtMultiply.setBorderPainted(false);
        jBtMultiply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtMultiply.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtMultiply.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtMultiply.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtMultiplyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtMultiplyMouseExited(evt);
            }
        });
        jBtMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtMultiplyActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 196, 75, 55));

        jBtDivide.setBackground(new java.awt.Color(41, 41, 41));
        jBtDivide.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtDivide.setForeground(new java.awt.Color(150, 150, 150));
        jBtDivide.setText("/");
        jBtDivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtDivide.setBorderPainted(false);
        jBtDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtDivide.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtDivide.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtDivide.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtDivideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtDivideMouseExited(evt);
            }
        });
        jBtDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDivideActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 140, 75, 55));

        jBtPow.setBackground(new java.awt.Color(41, 41, 41));
        jBtPow.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtPow.setForeground(new java.awt.Color(150, 150, 150));
        jBtPow.setText("^");
        jBtPow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtPow.setBorderPainted(false);
        jBtPow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtPow.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtPow.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtPow.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtPow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtPowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtPowMouseExited(evt);
            }
        });
        jBtPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPowActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtPow, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 140, 75, 55));

        jBtDeleteLastValue.setBackground(new java.awt.Color(41, 41, 41));
        jBtDeleteLastValue.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtDeleteLastValue.setForeground(new java.awt.Color(255, 255, 255));
        jBtDeleteLastValue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/java/carlculadora/media/icon-apagar.png"))); // NOI18N
        jBtDeleteLastValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtDeleteLastValue.setBorderPainted(false);
        jBtDeleteLastValue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtDeleteLastValue.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtDeleteLastValue.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtDeleteLastValue.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtDeleteLastValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtDeleteLastValueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtDeleteLastValueMouseExited(evt);
            }
        });
        jBtDeleteLastValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDeleteLastValueActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtDeleteLastValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 140, 75, 55));

        jBtClearAll.setBackground(new java.awt.Color(41, 41, 41));
        jBtClearAll.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtClearAll.setForeground(new java.awt.Color(103, 68, 255));
        jBtClearAll.setText("C");
        jBtClearAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 68, 255)));
        jBtClearAll.setBorderPainted(false);
        jBtClearAll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtClearAll.setMaximumSize(new java.awt.Dimension(75, 55));
        jBtClearAll.setMinimumSize(new java.awt.Dimension(75, 55));
        jBtClearAll.setPreferredSize(new java.awt.Dimension(75, 55));
        jBtClearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtClearAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtClearAllMouseExited(evt);
            }
        });
        jBtClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtClearAllActionPerformed(evt);
            }
        });
        jPlFundo.add(jBtClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 140, 75, 55));

        jLbScreen1.setFont(new java.awt.Font("Segoe UI", 1, 62)); // NOI18N
        jLbScreen1.setForeground(new java.awt.Color(103, 68, 255));
        jLbScreen1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLbScreen1.setText("0");
        jPlFundo.add(jLbScreen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 55, 290, 70));

        jLbScreen2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbScreen2.setForeground(new java.awt.Color(204, 204, 255));
        jLbScreen2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPlFundo.add(jLbScreen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 289, 20));

        getContentPane().add(jPlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 305, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Main">
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carlculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        Carlculadora tp = new Carlculadora();
        tp.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
        tp.setResizable(false);
        tp.setTitle("Carlculadora");
        tp.setAlwaysOnTop(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ActionPerformed Commands">
    private void jBt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt0ActionPerformed
        input(jBt0.getText(), evt);
    }//GEN-LAST:event_jBt0ActionPerformed

    private void jBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt1ActionPerformed
        input(jBt1.getText(), evt);
    }//GEN-LAST:event_jBt1ActionPerformed

    private void jBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt2ActionPerformed
        input(jBt2.getText(), evt);
    }//GEN-LAST:event_jBt2ActionPerformed

    private void jBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt3ActionPerformed
        input(jBt3.getText(), evt);
    }//GEN-LAST:event_jBt3ActionPerformed

    private void jBt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt4ActionPerformed
        input(jBt4.getText(), evt);
    }//GEN-LAST:event_jBt4ActionPerformed

    private void jBt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt5ActionPerformed
        input(jBt5.getText(), evt);
    }//GEN-LAST:event_jBt5ActionPerformed

    private void jBt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt6ActionPerformed
        input(jBt6.getText(), evt);
    }//GEN-LAST:event_jBt6ActionPerformed

    private void jBt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt7ActionPerformed
        input(jBt7.getText(), evt);
    }//GEN-LAST:event_jBt7ActionPerformed

    private void jBt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt8ActionPerformed
        input(jBt8.getText(), evt);
    }//GEN-LAST:event_jBt8ActionPerformed

    private void jBt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt9ActionPerformed
        input(jBt9.getText(), evt);
    }//GEN-LAST:event_jBt9ActionPerformed

    private void jBtMolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtMolActionPerformed
        if (jLbScreen2.getText().endsWith("=")) {

            String s1 = jLbScreen1.getText();
            jBtClearAllActionPerformed(evt);
            jLbScreen1.setText(Operations.moreOrLess(s1));

        } else {

            jLbScreen1.setText(Operations.moreOrLess(jLbScreen1.getText()));

        }
    }//GEN-LAST:event_jBtMolActionPerformed

    private void jBtFloatPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtFloatPActionPerformed
        if (jLbScreen2.getText().endsWith("=")) {

            jBtClearAllActionPerformed(evt);
            jLbScreen1.setText("0,");

        } else {

            String s1 = jLbScreen1.getText();
            jLbScreen1.setText((s1.contains(",")) ? s1 : s1.concat(","));

        }
    }//GEN-LAST:event_jBtFloatPActionPerformed

    private void jBtEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEqualsActionPerformed
        if (operation.equals("nula")) {

            jLbScreen1.setText(deleteTrailingZeros(jLbScreen1.getText()));
            jLbScreen2.setText(new StringBuilder(jLbScreen1.getText()).append(" =").toString());

        } else if (jLbScreen2.getText().contains("=")) {

            a = deleteTrailingZeros(jLbScreen1.getText());
            jLbScreen1.setText(calculate(operation, a, b));
            jLbScreen2.setText(new StringBuilder(ifNegative(a)).append(operation).append(ifNegative(b)).append(" =").toString());
            if (jLbScreen1.getText().equals(INVALID)) {
                disableButtons();
            }

        } else if (jLbScreen2.getText().endsWith(operation)) {

            b = deleteTrailingZeros(jLbScreen1.getText());
            jLbScreen1.setText(calculate(operation, a, b));
            jLbScreen2.setText(new StringBuilder(jLbScreen2.getText()).append(ifNegative(b)).append(" =").toString());
            if (jLbScreen1.getText().equals(INVALID)) {
                disableButtons();
            }
        }
    }//GEN-LAST:event_jBtEqualsActionPerformed

    private void jBtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddActionPerformed
        setOperation(" + ");
    }//GEN-LAST:event_jBtAddActionPerformed

    private void jBtSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubtractActionPerformed
        setOperation(" - ");
    }//GEN-LAST:event_jBtSubtractActionPerformed

    private void jBtMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtMultiplyActionPerformed
        setOperation(" x ");
    }//GEN-LAST:event_jBtMultiplyActionPerformed

    private void jBtDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDivideActionPerformed
        setOperation(" / ");
    }//GEN-LAST:event_jBtDivideActionPerformed

    private void jBtPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPowActionPerformed
        setOperation(" ^ ");
    }//GEN-LAST:event_jBtPowActionPerformed

    private void jBtDeleteLastValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDeleteLastValueActionPerformed
        if (jLbScreen2.getText().contains("=")) {

            String screen_01 = jLbScreen1.getText();
            jBtClearAllActionPerformed(evt);
            jLbScreen1.setText(screen_01);

        } else {

            StringBuilder s = new StringBuilder(jLbScreen1.getText());
            jLbScreen1.setText(s.deleteCharAt(s.length() - 1).toString());

            if (s.toString().endsWith("E+")) {
                jLbScreen1.setText(s.delete(s.indexOf("E"), s.length()).toString());
            }

            if (s.toString().equals("-")) {
                jLbScreen1.setText(s.deleteCharAt(s.length() - 1).toString());
            }

            if (s.toString().equals("")) {
                jLbScreen1.setText("0");
            }
        }
    }//GEN-LAST:event_jBtDeleteLastValueActionPerformed

    private void jBtClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtClearAllActionPerformed
        if (stateButtons == false) {
            enableButtons();
        }
        jLbScreen1.setText("0");
        jLbScreen2.setText("");
        operation = "nula";
        a = "";
        b = "";
    }//GEN-LAST:event_jBtClearAllActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Entered/Exited Commands">
    private void jBt0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt0MouseEntered
        setBorderPainted(jBt0);
    }//GEN-LAST:event_jBt0MouseEntered

    private void jBt0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt0MouseExited
        setBorderPainted(jBt0);
    }//GEN-LAST:event_jBt0MouseExited

    private void jBt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt1MouseEntered
        setBorderPainted(jBt1);
    }//GEN-LAST:event_jBt1MouseEntered

    private void jBt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt1MouseExited
        setBorderPainted(jBt1);
    }//GEN-LAST:event_jBt1MouseExited

    private void jBt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt2MouseEntered
        setBorderPainted(jBt2);
    }//GEN-LAST:event_jBt2MouseEntered

    private void jBt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt2MouseExited
        setBorderPainted(jBt2);
    }//GEN-LAST:event_jBt2MouseExited

    private void jBt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt3MouseEntered
        setBorderPainted(jBt3);
    }//GEN-LAST:event_jBt3MouseEntered

    private void jBt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt3MouseExited
        setBorderPainted(jBt3);
    }//GEN-LAST:event_jBt3MouseExited

    private void jBt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt4MouseEntered
        setBorderPainted(jBt4);
    }//GEN-LAST:event_jBt4MouseEntered

    private void jBt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt4MouseExited
        setBorderPainted(jBt4);
    }//GEN-LAST:event_jBt4MouseExited

    private void jBt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt5MouseEntered
        setBorderPainted(jBt5);
    }//GEN-LAST:event_jBt5MouseEntered

    private void jBt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt5MouseExited
        setBorderPainted(jBt5);
    }//GEN-LAST:event_jBt5MouseExited

    private void jBt6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt6MouseEntered
        setBorderPainted(jBt6);
    }//GEN-LAST:event_jBt6MouseEntered

    private void jBt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt6MouseExited
        setBorderPainted(jBt6);
    }//GEN-LAST:event_jBt6MouseExited

    private void jBt7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt7MouseEntered
        setBorderPainted(jBt7);
    }//GEN-LAST:event_jBt7MouseEntered

    private void jBt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt7MouseExited
        setBorderPainted(jBt7);
    }//GEN-LAST:event_jBt7MouseExited

    private void jBt8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt8MouseEntered
        setBorderPainted(jBt8);
    }//GEN-LAST:event_jBt8MouseEntered

    private void jBt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt8MouseExited
        setBorderPainted(jBt8);
    }//GEN-LAST:event_jBt8MouseExited

    private void jBt9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt9MouseEntered
        setBorderPainted(jBt9);
    }//GEN-LAST:event_jBt9MouseEntered

    private void jBt9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt9MouseExited
        setBorderPainted(jBt9);
    }//GEN-LAST:event_jBt9MouseExited

    private void jBtMolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtMolMouseEntered
        setBorderPainted(jBtMol);
    }//GEN-LAST:event_jBtMolMouseEntered

    private void jBtMolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtMolMouseExited
        setBorderPainted(jBtMol);
    }//GEN-LAST:event_jBtMolMouseExited

    private void jBtEqualsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEqualsMouseEntered
        setBorderPainted(jBtEquals);
    }//GEN-LAST:event_jBtEqualsMouseEntered

    private void jBtEqualsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEqualsMouseExited
        setBorderPainted(jBtEquals);
    }//GEN-LAST:event_jBtEqualsMouseExited

    private void jBtAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtAddMouseEntered
        setBorderPainted(jBtAdd);
    }//GEN-LAST:event_jBtAddMouseEntered

    private void jBtAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtAddMouseExited
        setBorderPainted(jBtAdd);
    }//GEN-LAST:event_jBtAddMouseExited

    private void jBtSubtractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtSubtractMouseEntered
        setBorderPainted(jBtSubtract);
    }//GEN-LAST:event_jBtSubtractMouseEntered

    private void jBtSubtractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtSubtractMouseExited
        setBorderPainted(jBtSubtract);
    }//GEN-LAST:event_jBtSubtractMouseExited

    private void jBtMultiplyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtMultiplyMouseEntered
        setBorderPainted(jBtMultiply);
    }//GEN-LAST:event_jBtMultiplyMouseEntered

    private void jBtMultiplyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtMultiplyMouseExited
        setBorderPainted(jBtMultiply);
    }//GEN-LAST:event_jBtMultiplyMouseExited

    private void jBtDivideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDivideMouseEntered
        setBorderPainted(jBtDivide);
    }//GEN-LAST:event_jBtDivideMouseEntered

    private void jBtDivideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDivideMouseExited
        setBorderPainted(jBtDivide);
    }//GEN-LAST:event_jBtDivideMouseExited

    private void jBtPowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtPowMouseEntered
        setBorderPainted(jBtPow);
    }//GEN-LAST:event_jBtPowMouseEntered

    private void jBtPowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtPowMouseExited
        setBorderPainted(jBtPow);
    }//GEN-LAST:event_jBtPowMouseExited

    private void jBtDeleteLastValueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDeleteLastValueMouseEntered
        setBorderPainted(jBtDeleteLastValue);
    }//GEN-LAST:event_jBtDeleteLastValueMouseEntered

    private void jBtDeleteLastValueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDeleteLastValueMouseExited
        setBorderPainted(jBtDeleteLastValue);
    }//GEN-LAST:event_jBtDeleteLastValueMouseExited

    private void jBtClearAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtClearAllMouseEntered
        setBorderPainted(jBtClearAll);
    }//GEN-LAST:event_jBtClearAllMouseEntered

    private void jBtClearAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtClearAllMouseExited
        setBorderPainted(jBtClearAll);
    }//GEN-LAST:event_jBtClearAllMouseExited

    private void jBtFloatPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtFloatPMouseEntered
        setBorderPainted(jBtFloatP);
    }//GEN-LAST:event_jBtFloatPMouseEntered

    private void jBtFloatPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtFloatPMouseExited
        setBorderPainted(jBtFloatP);
    }//GEN-LAST:event_jBtFloatPMouseExited
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Enable/Disable Buttons">
    private final ArrayList<java.awt.Color> COLOR_BUTTONS = new ArrayList<>();
    private final ArrayList<javax.swing.JButton> BUTTONS = new ArrayList<>();
    private boolean stateButtons = true;

    private void setArray() {
        BUTTONS.add(jBtMol);
        BUTTONS.add(jBtFloatP);
        BUTTONS.add(jBtEquals);
        BUTTONS.add(jBtAdd);
        BUTTONS.add(jBtSubtract);
        BUTTONS.add(jBtMultiply);
        BUTTONS.add(jBtDivide);
        BUTTONS.add(jBtPow);
        BUTTONS.add(jBtDeleteLastValue);

        for (int i = 0; i < BUTTONS.size(); i++) {
            COLOR_BUTTONS.add(i, new java.awt.Color(BUTTONS.get(i).getBackground().getRGB()));
        }
    }

    private void disableButtons() {
        stateButtons = false;
        setArray();

        for (javax.swing.JButton bt : BUTTONS) {
            bt.setEnabled(false);
            bt.setBackground(new java.awt.Color(30, 30, 30));
        }
    }

    private void enableButtons() {
        stateButtons = true;
        int i = 0;

        for (javax.swing.JButton bt : BUTTONS) {
            bt.setEnabled(true);
            bt.setBackground(COLOR_BUTTONS.get(i));
            i++;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    private void input(String value, java.awt.event.ActionEvent evt) {
        if (stateButtons == false | jLbScreen2.getText().endsWith("=")) {

            jBtClearAllActionPerformed(evt);
            jLbScreen1.setText(value);

        } else if (jLbScreen1.getText().equals("0")) {

            jLbScreen1.setText(value);

        } else {

            jLbScreen1.setText(new StringBuilder(jLbScreen1.getText()).append(value).toString());

        }
    }

    private void setOperation(String operation) {

        String s2 = jLbScreen2.getText();

        if (s2.equals("") | s2.contains("=")) {

            this.operation = operation;
            a = deleteTrailingZeros(jLbScreen1.getText());
            jLbScreen1.setText("0");
            jLbScreen2.setText(new StringBuilder(ifNegative(a)).append(operation).toString());

        } else if (s2.endsWith(this.operation)) {

            b = deleteTrailingZeros(jLbScreen1.getText());
            String c = a;
            a = calculate(this.operation, a, b);

            if (a.equals(INVALID)) {

                jLbScreen1.setText(INVALID);
                jLbScreen2.setText(new StringBuilder(ifNegative(c)).append(this.operation).append(ifNegative(b)).append(" =").toString());
                disableButtons();

            } else {

                jLbScreen1.setText("0");
                this.operation = operation;
                jLbScreen2.setText(new StringBuilder(ifNegative(a)).append(this.operation).toString());

            }
        }
    }

    private String ifNegative(String s) {
        return (s.startsWith("-")) ? new StringBuilder("()").insert(1, s).toString() : s;
    }

    private String floatP(String value) {
        return (value.contains(",")) ? value.replace(",", ".") : value.replace(".", ",");
    }

    private String deleteTrailingZeros(String value) {
        if (value.contains(",")) {

            StringBuilder sb = new StringBuilder(value);

            while (sb.toString().charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            }

            return (sb.toString().endsWith(",")) ? sb.deleteCharAt(sb.length() - 1).toString() : sb.toString();

        } else {

            return value;

        }
    }

    private String calculate(String operation, String valorA, String valorB) {

        valorA = floatP(valorA);
        valorB = floatP(valorB);
        String result = "";

        switch (operation) {
            case " + ":
                result = Operations.add(valorA, valorB);
                break;

            case " - ":
                result = Operations.subtract(valorA, valorB);
                break;

            case " x ":
                result = Operations.multiply(valorA, valorB);
                break;

            case " / ":
                try {

                result = Operations.divide(valorA, valorB);

            } catch (DivideByZeroException ex) {

                return INVALID;

            }

            break;

            case " ^ ":
                result = Operations.pow(valorA, valorB);
                break;

            default:
                return null;
        }

        return deleteTrailingZeros(floatP(result));

    }

    private void setBorderPainted(javax.swing.JButton bt) {
        bt.setBorderPainted(!(bt.isBorderPainted()));
    }
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt0;
    private javax.swing.JButton jBt1;
    private javax.swing.JButton jBt2;
    private javax.swing.JButton jBt3;
    private javax.swing.JButton jBt4;
    private javax.swing.JButton jBt5;
    private javax.swing.JButton jBt6;
    private javax.swing.JButton jBt7;
    private javax.swing.JButton jBt8;
    private javax.swing.JButton jBt9;
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtClearAll;
    private javax.swing.JButton jBtDeleteLastValue;
    private javax.swing.JButton jBtDivide;
    private javax.swing.JButton jBtEquals;
    private javax.swing.JButton jBtFloatP;
    private javax.swing.JButton jBtMol;
    private javax.swing.JButton jBtMultiply;
    private javax.swing.JButton jBtPow;
    private javax.swing.JButton jBtSubtract;
    private javax.swing.JLabel jLbScreen1;
    private javax.swing.JLabel jLbScreen2;
    private javax.swing.JPanel jPlFundo;
    // End of variables declaration//GEN-END:variables
}
