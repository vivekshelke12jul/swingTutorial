package com.vivek.project;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Frame extends JFrame {
    public Frame() {
        this.setSize(600,400);
        this.setResizable(false);
        this.setTitle("Swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        URL url = getClass().getResource("/code.jpg");
        ImageIcon icon = new ImageIcon(url);

        this.setIconImage(icon.getImage());

//        this.getContentPane().setBackground(Color.CYAN);
        this.getContentPane().setBackground(new Color(36,123,234));
    }
}
