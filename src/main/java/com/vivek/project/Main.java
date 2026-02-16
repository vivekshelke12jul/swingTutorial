package com.vivek.project;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {


        JLabel label = new JLabel();
        label.setText("Swing GUI");

        URL url = Main.class.getResource("/swing.png");
        ImageIcon icon = new ImageIcon(url);
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.ORANGE);
        label.setFont(new Font("Arial", Font.ITALIC, 20));
        label.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,600,600);

        JFrameTutorial frame = new JFrameTutorial();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
//        frame.pack();???
    }
}