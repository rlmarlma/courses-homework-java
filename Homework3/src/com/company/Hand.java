package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//Используется, чтобы помещать куда-то извлеченные из колоды карты и возврата карты обратно в колоду.
public class Hand {
    static ArrayList<Card> Hand = new ArrayList<>();

    Hand() {
        Hand = new ArrayList<>();
    }

    public void getCard() {
        Scanner in = new Scanner(System.in);
        int numIt = in.nextInt();
        for (int i = 1; i < numIt + 1; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(Deck.Deck.size());
            Hand.add(Deck.Deck.get(randomNumber));
            Deck.Deck.remove(randomNumber);
        }
    }

    public void displayCards(){
        System.out.println(Hand);
    }

    public void checkDeckHand() {
        for (Card card : Hand) {
            boolean ans = Deck.Deck.contains(card);
            if (ans) {
                System.out.println("The deck contains this card.");
            } else {
                System.out.println("There is no such card in the deck.");
            }
        }
    }


    public void returnCard(){
        for (int i = 0; i < Hand.size(); i++){
            Deck.Deck.add(Hand.get(i));
            Hand.remove(i);
        }
    }
}
