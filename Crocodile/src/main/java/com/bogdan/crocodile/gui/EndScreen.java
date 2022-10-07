/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bogdan.crocodile.gui;

import com.bogdan.crocodile.domain.GUIComponentText;

import javax.swing.*;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class EndScreen extends JPanel {
    private static List<JLabel> labels;
    private static final Color BROWN = new java.awt.Color(51, 51, 51);
    private JButton menuButton;
    private static JLabel player1Label;
    private static JLabel player2Label;
    private static JLabel player3Label;
    private static JLabel player4Label;
    private static JLabel player5Label;
    private JLabel resultLabel;

    public EndScreen() {
        initComponents();
        labels = Arrays.asList(player1Label, player2Label, player3Label, player4Label, player5Label);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player1Label = new JLabel();
        player2Label = new JLabel();
        player3Label = new JLabel();
        player4Label = new JLabel();
        player5Label = new JLabel();
        menuButton = new JButton();
        resultLabel = new JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        player1Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        player1Label.setForeground(new java.awt.Color(51, 51, 51));
        player1Label.setText("jLabel1");

        player2Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        player2Label.setForeground(new java.awt.Color(51, 51, 51));
        player2Label.setText("jLabel2");

        player3Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        player3Label.setForeground(new java.awt.Color(51, 51, 51));
        player3Label.setText("jLabel3");

        player4Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        player4Label.setForeground(new java.awt.Color(51, 51, 51));
        player4Label.setText("jLabel4");

        player5Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        player5Label.setForeground(new java.awt.Color(51, 51, 51));
        player5Label.setText("jLabel5");

        menuButton.setText(GUIComponentText.MENU.toString());
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultLabel.setText(GUIComponentText.RESULT.toString());

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 120, Short.MAX_VALUE)
                                .addComponent(resultLabel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(player1Label, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(player2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(player3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(player4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(player5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menuButton, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(resultLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(player1Label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player2Label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player3Label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player4Label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player5Label)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(menuButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CrocodileGUI.showMenu();
    }

    public static List<JLabel> getLabels() {
        labels.forEach(l -> l.setForeground(BROWN));
        return labels;
    }
}
