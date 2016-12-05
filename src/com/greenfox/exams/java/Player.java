package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Rita on 2016-12-05.
 */
public class Player {
    String name;
    ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        played = new ArrayList<>();
    }

    int sum() {
        int sum = 0;
        for (Card card : played) {
            sum += card.getValue();
        }
        return sum;
    }

    void add(Card card) {
        played.add(card);
    }
}
