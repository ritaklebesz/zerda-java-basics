package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Rita on 2016-12-05.
 */
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame app = new JFrame();
                app.setTitle("Black Jack");
                app.add(new BlackJack());
                app.setDefaultCloseOperation(3);
                app.setVisible(true);
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension dim = tk.getScreenSize();
                int xPos = (dim.width/2)-(app.getWidth()/2);
                int yPos = (dim.height/2)-(app.getHeight()/2);
                app.setLocation(xPos, yPos);
            }
        });
    }
}
