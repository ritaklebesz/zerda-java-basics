package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Rita on 2016-12-05.
 */
public class Deck {
    ArrayList<Card> cards;
    ArrayList<Card> used;

    public Deck() {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14));
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("kor", "karo", "treff", "pikk"));
        cards = new ArrayList<>();
        for (String color : colors) {
            for (Integer i : values) {
                cards.add(new Card(color, i));
            }
        }
        shuffle();
        used = new ArrayList<>();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawACard() {
        if (cards.size() > 0) {
            Card card = cards.get(0);
            cards.remove(0);
            used.add(card);
            return card;
        } else {
            return null;
        }
    }
}
