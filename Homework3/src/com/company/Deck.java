package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Deck {
    static ArrayList<Card> Deck = new ArrayList<>();

    private Deck() {
        Deck = new ArrayList<>();
    }

    public static void addCards() {
        for (int j = 0; j < Card.cardSuit.length; j++) {
            for (int i = 2; i < Card.cardRank.length + 1; i++) {
                Card cij = new Card(i, j);
                Deck.add(cij);
            }
        }
    }

    public static void displayCards() {
        System.out.println(Deck);
    }

    public static void randomCard() {
        Random random = new Random();
        int randomNumber = random.nextInt(52);
        System.out.println(Deck.get(randomNumber));
    }

    public static void shuffleCards() {
        Collections.shuffle(Deck);
    }

    public static void sortCards() {
        Comparator<Card> rankComparator = new RankComparator();
        Comparator<Card> suitComparator = new SuitComparator();
        Deck.sort(rankComparator);
        Deck.sort(suitComparator);
    }
}
