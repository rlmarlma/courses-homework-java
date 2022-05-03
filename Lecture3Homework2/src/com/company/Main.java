package com.company;

enum Card{
    TwoOfClubs(2, 1), ThreeOfClubs(3,1), FourOfClubs(4,1), FiveOfClubs(5,1), SixOfClubs(6,1), SevenOfClubs(7,1), EightOfClubs(8,1), NineOfClubs(9,1),
    TenOfClubs(10,1), JackOfClubs(11, 1), QueenOfClubs(12,1), KingOfClubs(13,1), AceOfClubs(14,1),
    TwoOfDiamonds(2,2), ThreeOfDiamonds(3,2), FourOfDiamonds(4,2), FiveOfDiamonds(5,2), SixOfDiamonds(6,2), SevenOfDiamonds(7,2), EightOfDiamonds(8,2),
    NineOfDiamonds(9,2), TenOfDiamonds(10,2), JackOfDiamonds(11,2), QueenOfDiamonds(12,2), KingOfDiamonds(13,2), AceOfDiamonds(14,2),
    TwoOfSpades(2,3), ThreeOfSpades(3,3), FourOfSpades(4,3), FiveOfSpades(5,3), SixOfSpades(6,3), SevenOfSpades(7,3), EightOfSpades(8,3),
    NineOfSpades(9,3), TenOfSpades(10,3), JackOfSpades(11,3), QueenOfSpades(12,3), KingOfSpades(13,3), AceOfSpades(14,3),
    TwoOfHearts(2,4), ThreeOfHearts(3,4), FourOfHearts(4,4), FiveOfHearts(5,4), SixOfHearts(6,4), SevenOfHearts(7,4), EightOfHearts(8,4),
    NineOfHearts(9,4), TenOfHearts(10,4), JackOfHearts(11,4), QueenOfHearts(12,4), KingOfHearts(13,4), AceOfHearts(14,4);

    private int rank;
    private int suit;

    Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int minSuit = 1;
    public int maxSuit = 4;

    public int getRank(){
        return rank;
    }

    public int getSuit(){
        return suit;
    }

    public void checkSuit(){
        if (suit >= minSuit && suit <= maxSuit){
            System.out.println("The suit is correct.");
        }else{
            System.out.println("The suit is incorrect.");
        }
    }

    public int maxRank = 14;
    public int minRank = 2;

    public void checkDeck(){
        if (rank >= minRank && rank <= maxRank){
            System.out.println("The card is from the deck.");
        }else{
            System.out.println("The card is not from the deck.");
        }
    }

    public boolean equals(Card card){
        if(!(card instanceof Card)){
            return false;
        }
        return rank == card.rank && suit == card.suit;
    }

    public String[] cardRankString = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"};
    public String[] cardSuitString = {"Clubs", "Diamonds", "Spades", "Hearts"};
    int rankOffset = 2;
    int suitOffset = 1;

    @Override
    public String toString(){
        int i = getRank() - rankOffset;
        int j = getSuit() - suitOffset;
        return "Suit: " + cardSuitString[j] + ", Rank: " + cardRankString[i];
    }

    public void compareCard(Card comparable){
        if (comparable instanceof Card) {
            if (suit == comparable.getSuit()) {
                if (rank > comparable.getRank()) {
                    System.out.println("This card is stronger.");
                } else {
                    System.out.println("This card is weaker.");
                }
            } else {
                System.out.println("They have different suits. Can't compare");
            }
        }else{
            System.out.println("This is not a card.");
        }
    }

    public int compareSuits(Card comparedSuit){
        return suit - comparedSuit.getSuit();
    }

    public static void staticComparison(Card Card1, Card Card2){
        if (Card1 instanceof Card && Card2 instanceof Card){
            int delta = Card1.getSuit() - Card2.getSuit();
            System.out.println(delta);
        }else{
            System.out.println("Can't compare. One of them or both are not a card.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Card card1 = Card.TwoOfClubs;
        Card card2 = Card.TenOfDiamonds;
        card1.checkSuit();
        System.out.printf("\nHashcodes: %d, %d\n", card1.hashCode(), card2.hashCode());
        System.out.println("\nCard1 is from the deck?");
        card1.checkDeck();
        System.out.println("Are they equal?");
        System.out.println(card1.equals(card2));
        System.out.println("Card 1 > Card 2?");
        card1.compareCard(card2);
        System.out.println("Card 1 and Card 2 have different suits?");
        System.out.println(card1.compareSuits(card2));
        System.out.println("Card 1 and Card 2 have different suits? (Static method)");
        Card.staticComparison(card1, card2);
    }
}






