package com.company;

import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        return c1.card[1] - c2.card[1];
    }
}
