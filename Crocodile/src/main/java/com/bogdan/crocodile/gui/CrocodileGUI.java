/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bogdan.crocodile.gui;

import com.bogdan.crocodile.domain.GUIComponentText;
import com.bogdan.crocodile.domain.Player;
import com.bogdan.crocodile.domain.theme.Theme;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class CrocodileGUI extends JFrame {
    private static List<Player> users;
    private static Theme theme;
    private static Game panel;
    private static EndScreen endPanel;
    private static JFrame frame;
    private JToggleButton playButton;
    private JComboBox<String> playersCountDropbox;
    private JLabel playersCountLabel;
    private static JPanel startPanel;
    private static JComboBox<String> themeDropbox;
    private JLabel themeLabel;
    private JLabel welcomeLabel;

    public CrocodileGUI() {
        initComponents();
    }

    private void initComponents() {
        startPanel = new JPanel();
        welcomeLabel = new JLabel();
        playersCountLabel = new JLabel();
        playButton = new JToggleButton();
        playersCountDropbox = new JComboBox<>();
        themeLabel = new JLabel();
        themeDropbox = new JComboBox<>();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        startPanel.setBackground(new java.awt.Color(51, 51, 51));

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText(GUIComponentText.WELCOME.toString());

        playersCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        playersCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        playersCountLabel.setText(GUIComponentText.SELECT_PLAYERS_COUNT.toString());

        playButton.setText(GUIComponentText.PLAY.toString());
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        playersCountDropbox.setModel(new DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5"}));

        themeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        themeLabel.setForeground(new java.awt.Color(255, 255, 255));
        themeLabel.setText(GUIComponentText.SELECT_THEME.toString());

        themeDropbox.setModel(new DefaultComboBoxModel<>(new String[]{Theme.SPORT_NAME, Theme.ANIMAL_NAME, Theme.MUSIC_NAME, Theme.FOOD_NAME, Theme.PROFESSION_NAME, Theme.STATIONER_NAME}));
        themeDropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeDropboxActionPerformed(evt);
            }
        });

        GroupLayout startPanelLayout = new GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
                startPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                                .addContainerGap(107, Short.MAX_VALUE)
                                .addGroup(startPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(welcomeLabel))
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(playButton))
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addComponent(playersCountLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(playersCountDropbox, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(themeLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(themeDropbox, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(89, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
                startPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                                .addContainerGap(118, Short.MAX_VALUE)
                                .addComponent(welcomeLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(startPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(playersCountDropbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playersCountLabel))
                                .addGap(6, 6, 6)
                                .addGroup(startPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(themeLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(themeDropbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playButton)
                                .addContainerGap(104, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(startPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(startPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {
        changeToGamePanel();
        theme = Theme.getThemeByName(themeDropbox.getSelectedItem().toString());
        panel.setObjectToShowText(theme.getNextWord());

        users = new ArrayList<>();
        for (int i = 1; i <= playersCountDropbox.getSelectedIndex() + 1; i++) {
            users.add(new Player("Игрок " + i, 0));
        }
        panel.changePlayer();
    }

    private void themeDropboxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrocodileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrocodileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrocodileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrocodileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            frame = new CrocodileGUI();
            frame.setVisible(true);
            frame.setTitle("Crocodile");
        });

    }

    public static void showMenu() {
        frame.setContentPane(startPanel);
        endPanel.setVisible(false);
        startPanel.setVisible(true);
    }

    private void changeToGamePanel() {
        startPanel.setVisible(false);
        if (panel == null) panel = new Game();
        frame.setContentPane(panel);
        panel.setVisible(true);
        panel.startTimer();
    }

    public static void changeToEndMenu() {
        if (endPanel == null) endPanel = new EndScreen();
        frame.setContentPane(endPanel);
        endPanel.setVisible(true);

        int userPosition = 0;
        List<JLabel> labels = EndScreen.getLabels();
        JLabel label;

        for (Player u : users) {
            label = labels.get(userPosition);
            label.setForeground(Color.white);
            label.setText(u.getStringRepresWithScore());
            userPosition++;
        }
    }

    public static Player getUserByOrder(int order) {
        if (order == users.size()) throw new IllegalArgumentException();
        return users.get(order);
    }

    public static Theme getTheme() {
        return theme;
    }
}
