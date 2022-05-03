package com.company;
import java.util.Scanner;

//Задание №2
//Пункт a
class CardA {
    public int rank;
    public int suit;

    public CardA(){
        rank = 2;
        suit = 1;
    }
}
//Пункт b
class CardB {
    private final int rank;
    private final int suit;
    public String[] cardSuit = {"Clubs", "Diamonds", "Spades", "Hearts"};

    public CardB(int s, int r){
        rank = r;
        suit = s;
    }

    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }

    public void checkSuit(){
        System.out.println("Let me check if the suit of this card is correct.");
        if (suit > 0 && suit <= cardSuit.length) {
            System.out.println("The suit is correct.");
        }else{
            System.out.println("The suit is incorrect.");
        }
    }

}
//Пункт c
class CardC {
    private final int rank;
    private final int suit;
    static int selectedSuit;
    static int card1Suit;
    static int card2Suit;
    static int card1Rank;
    static int card2Rank;
    static int maxRank;
    public static String[] cardSuit = {"Clubs", "Diamonds", "Spades", "Hearts"};

    public CardC(int r, int s){
    rank = r;
    suit = s;
    }

    public CardC(int sameSuit){
        rank = maxRank + 1;
        suit = sameSuit;
    }

    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }

    public static void getMaxRank(int selectedSuit) {
        if (card1Suit == selectedSuit && card2Suit == selectedSuit){
            maxRank = Math.max(card1Rank, card2Rank);
            System.out.printf("Highest rank is %d \n", maxRank);
        }else if (card1Suit == selectedSuit){
            maxRank = card1Rank;
            System.out.printf("Highest rank is %d \n", maxRank);
        }else if (card2Suit == selectedSuit){
            maxRank = card2Rank;
            System.out.printf("Highest rank is %d \n", maxRank);
        }else{
            System.out.println("Error: There are no cards of this suit.");
            System.exit(0);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int task_num;
        System.out.println("Choose the task number. \n They are numerated as follows: 1 - a, 2 - b, 3 - c. \n");
        Scanner task = new Scanner(System.in);
        task_num = task.nextInt();
        switch (task_num) {
            case 1 -> {
                CardA myCard = new CardA();
                System.out.printf("The rank of your card is %d, the suit of your card is %d.", myCard.rank, myCard.suit);
            }
            case 2 -> {
                CardB myProtectedCard = new CardB(1, 4);
                System.out.println("This card is protected. \nThe suit of this card is");
                System.out.println(myProtectedCard.getSuit());
                System.out.println("The rank of this card is ");
                System.out.println(myProtectedCard.getRank());
                myProtectedCard.checkSuit();
            }
            case 3 -> {
                CardC myCard1 = new CardC(9, 3);
                CardC myCard2 = new CardC(7, 3);
                System.out.printf("Cards ranks are %d and %d \n", myCard1.getRank(), myCard2.getRank());
                CardC.card1Rank = myCard1.getRank();
                CardC.card2Rank = myCard2.getRank();
                CardC.card1Suit = myCard1.getSuit();
                CardC.card2Suit = myCard2.getSuit();
                System.out.println("Now I'm going to create a new card with rank = maximum rank of the suit + 1. \n Select the suit.");
                Scanner in = new Scanner(System.in);
                CardC.selectedSuit = in.nextInt();
                if (CardC.selectedSuit > 0 && CardC.selectedSuit <= CardC.cardSuit.length){
                    CardC.getMaxRank(CardC.selectedSuit);
                }else{
                    System.out.println("Error: The suit is incorrect.");
                    System.exit(0);
                }
                System.out.print("The rank of the new card is ");
                CardC myCard3 = new CardC(CardC.selectedSuit);
                System.out.println(myCard3.getRank());
            }
            default -> {
                System.out.println("Error: This task do not exist.");
            }
        }

    }
}
