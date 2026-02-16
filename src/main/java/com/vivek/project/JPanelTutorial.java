package com.vivek.project;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JPanelTutorial {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("hi");
        URL url = JPanelTutorial.class.getResource("/swing.png");
        label.setIcon(new ImageIcon(url));
        label.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
        label.setBounds(10,10,300,300);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,400,800);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,800,800,400);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(800,400,400,800);
        greenPanel.setLayout(null);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(400,0,800,400);



        JFrame frame = new JFrame();
        frame.setSize(1800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);
    }
}
