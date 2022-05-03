package com.company;

import java.util.Comparator;

public class RankComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        return c1.card[0] - c2.card[0];
    }
}
