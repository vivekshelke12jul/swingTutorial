package com.vivek.project.jbutton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {

    JButton button;

    public MyJFrame() {
        button = new JButton();
        button.setText("Click");
        button.setBounds(200,200,100,100);
        button.addActionListener(e -> System.out.println("lambda"));
        button.addActionListener(this);

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Performed");
    }
}
