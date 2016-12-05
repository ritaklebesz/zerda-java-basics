package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rita on 2016-12-05.
 */
public class BlackJack extends JPanel implements ActionListener {
    JButton reset;
    JButton drawCard;
    Player user;
    Player house;
    Deck deck;
    JLabel userLabel;
    JLabel houseLabel;

    public BlackJack() {
        reset = new JButton("New Game");
        drawCard = new JButton("Draw a drawCard");
        user = new Player("User");
        house = new Player("House");
        userLabel = new JLabel(user.toString());
        houseLabel = new JLabel(house.toString());
        reset.addActionListener(this);
        drawCard.addActionListener(this);
        this.add(userLabel);
        this.add(houseLabel);
        this.add(reset);
        this.add(drawCard);
        deck = new Deck();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset) {
            deck = new Deck();
            user = new Player("User");
            house = new Player("House");
        } else if (e.getSource() == drawCard) {
            user.add(deck.drawCard());
            if (house.sum() < 17) {
                house.add(deck.drawCard());
            }
        }
        userLabel.setText(user.toString());
        houseLabel.setText(house.toString());
    }
}
