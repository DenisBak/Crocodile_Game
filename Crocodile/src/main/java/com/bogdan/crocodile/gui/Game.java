/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bogdan.crocodile.gui;

import com.bogdan.crocodile.domain.GUIComponentText;
import com.bogdan.crocodile.domain.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game extends JPanel {
    private Timer timer;
    private Player active;
    private int order = 0;
    private JButton badScore;
    private JButton goodScore;
    private JLabel jLabel2;
    private JLabel minLabel;
    private JLabel objectToShow;
    private JLabel playerName;
    private JLabel secLabel;
    private JLabel showMessage;

    public Game() {
        initComponents();
        startTimer();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerName = new JLabel();
        showMessage = new JLabel();
        objectToShow = new JLabel();
        badScore = new JButton();
        goodScore = new JButton();
        minLabel = new JLabel();
        jLabel2 = new JLabel();
        secLabel = new JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        playerName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 0, 51));
        playerName.setText(GUIComponentText.DEFAULT_PLAYER_NAME.toString());

        showMessage.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        showMessage.setForeground(new java.awt.Color(51, 255, 51));
        showMessage.setText(GUIComponentText.YOU_SHOW.toString());

        objectToShow.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        objectToShow.setForeground(new java.awt.Color(51, 255, 51));
        objectToShow.setText(GUIComponentText.DEFAULT_OBJECT_TO_SHOW.toString());

        badScore.setText(GUIComponentText.BAD.toString());
        badScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badScoreActionPerformed(evt);
            }
        });

        goodScore.setText(GUIComponentText.GOOD.toString());
        goodScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodScoreActionPerformed(evt);
            }
        });

        minLabel.setBackground(new java.awt.Color(255, 255, 255));
        minLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minLabel.setForeground(new java.awt.Color(255, 255, 255));
        minLabel.setText("0");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(":");

        secLabel.setBackground(new java.awt.Color(255, 255, 255));
        secLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secLabel.setForeground(new java.awt.Color(255, 255, 255));
        secLabel.setText("2");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(49, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(badScore)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                                .addComponent(goodScore)
                                                .addGap(58, 58, 58))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(showMessage)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(objectToShow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(157, 157, 157)
                                                .addComponent(playerName, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(minLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(secLabel)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(playerName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(showMessage)
                                        .addComponent(objectToShow))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(badScore)
                                        .addComponent(goodScore))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(minLabel)
                                        .addComponent(jLabel2)
                                        .addComponent(secLabel))
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void badScoreActionPerformed(java.awt.event.ActionEvent evt) {

        active.decrementScore();
        try {
            changePlayer();
            startTimer();
        } catch (IllegalArgumentException e) {
            order = 0;
            CrocodileGUI.changeToEndMenu();
        }
    }

    private void goodScoreActionPerformed(java.awt.event.ActionEvent evt) {
        active.incrementScore();
        try {
            changePlayer();
            startTimer();
        } catch (IllegalArgumentException e) {
            order = 0;
            CrocodileGUI.changeToEndMenu();
        }
    }

    public void startTimer() {
        if (timer != null) timer.stop();

        secLabel.setText("05");
        minLabel.setText("0");

        timer = new Timer(1000, new ActionListener() {
            int sec = 5;
            int min = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (sec == 0 && min == 0) {
                    sec = 0;
                    min = 0;
                    timer.stop();
                } else if (sec == 0) {
                    sec = 59;
                    min--;
                }
                if (sec < 10) {
                    secLabel.setText("0" + sec);
                } else {
                    secLabel.setText("" + sec);
                }
                sec--;
                minLabel.setText("" + min);
            }
        });
        timer.start();
    }

    public void changePlayer() {
        active = CrocodileGUI.getUserByOrder(order);
        setPlayerNameText(active.getStringRepres());
        setObjectToShowText(CrocodileGUI.getTheme().getNextWord());
        order++;
    }

    public void setObjectToShowText(String text) {
        objectToShow.setText(text);
    }

    public void setPlayerNameText(String text) {
        playerName.setText(text);
    }
}
