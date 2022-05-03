package com.company;


class Card implements Comparable<Card> {
    private final int rank;
    private final int suit;
    public static String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"};
    public static String[] cardSuit = {"Clubs", "Diamonds", "Spades", "Hearts"};
    int rankOffset = 2;
    int suitOffset = 1;

    public Card() {
        rank = 12;
        suit = 3;
    }

    public Card(int r, int s){
        rank = r;
        suit = s;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public void checkSuit() {
        System.out.println("\nLet me check if the suit of this card is correct.");
        if (suit > 0 && suit <= cardSuit.length ) {
            System.out.println("The suit is correct.");
        } else {
            System.out.println("The suit is incorrect.");
        }
    }

    @Override
    public int hashCode(){
        return 27*rank + suit;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Card other)){
            return false;
        }
        return rank == other.rank && suit == other.suit;
    }

    @Override
    public String toString(){
        int i = rank - rankOffset; // rank - rankOffset -> Чтобы вносимое значение ранга соотносилось с рангом карты в массиве cardRank
        int j = suit - suitOffset; // То же самое, только для мастей (1 - Clubs, 2 - Diamonds, etc) ((Наверное так удобней...))
        return "Suit: " + cardSuit[j] + ", Rank: " + cardRank[i] + "\n";
    }

    public void checkDeck(){
        if (rank >= 0 && rank < cardRank.length){
            System.out.print("The card is from the deck. \n");
        }else{
            System.out.print("The card is not from the deck. \n");
        }
    }

    public void compareCard(Card comparable){
        if (comparable != null){
            if (rank > comparable.getRank()){
                System.out.println("This card is stronger.");
            }else{
                System.out.println("This card is weaker.");
            }
        }else{
            System.out.println("This is not a card.");
        }
    }

    @Override
    public int compareTo(Card comparedSuit) {
        return suit - comparedSuit.getSuit();
    }

    public static void staticComparison(Card Card1, Card Card2){
        if (Card1 != null && Card2 != null){
            int delta = Card1.getSuit() - Card2.getSuit();
            System.out.println(delta);
        }else{
            System.out.print("Can't compare. One of them is not a card.");
        }
    }
}
public class Main {

    public static void main(String[] args) {
    Card myPrivateCard = new Card();
    Card myPrivateCard2 = new Card(10, 3);
    myPrivateCard.checkSuit();
    System.out.printf("\nHash codes: %d, %d\n", myPrivateCard.hashCode(), myPrivateCard2.hashCode());
    System.out.println("\nCard 1 is from the deck?");
    myPrivateCard.checkDeck();
    System.out.println("Are they equal?");
    System.out.println(myPrivateCard.equals(myPrivateCard2));
    System.out.println("Card 1 > card 2?");
    myPrivateCard.compareCard(myPrivateCard2);
    System.out.println("Card 1 and Card 2 have different suits?");
    System.out.println(myPrivateCard.compareTo(myPrivateCard2));
    System.out.println("Card 1 and Card 2 have different suits? (Static method)");
    Card.staticComparison(myPrivateCard, myPrivateCard2);
    }
}

