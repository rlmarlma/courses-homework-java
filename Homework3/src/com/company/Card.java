package com.company;

// Карта
public class Card {
    public int[] card;
    public static String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"};
    public static String[] cardSuit = {"Clubs", "Diamonds", "Spades", "Hearts"};
    public int rankOffset = 2;

    public Card(int rank, int suit) {
        card = new int[]{rank, suit};
    }

    @Override
    public String toString() {
        int i = card[0] - rankOffset ;
        int j = card[1];
        return "Suit: " + cardSuit[j] + ", Rank: " + cardRank[i] + "\n";
    }
}
