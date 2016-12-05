package com.greenfox.exams.java;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by Rita on 2016-12-05.
 */
public class Card {
    String color;
    int value;

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return color + " " + value;
    }
}
