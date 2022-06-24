package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWin {
    public static void main(String[] args) {
        //swing, SWT, JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(600,300);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //add Componemt
        JButton button = new JButton("Ok!");
        //Anonymous class
        button.addActionListener(new MyActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        //frame.add(new JButton("testing"));

        frame.setVisible(true);
        System.out.println("End?");
    }
}
