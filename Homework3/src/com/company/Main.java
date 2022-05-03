package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

//Задание №4
public class Main {
    public static void main(String[] args) {
        System.out.println("\nCreating a deck of cards.\n");
        Deck.addCards();
        Hand myHand = new Hand();
        Deck.displayCards();
        System.out.println("Now I will shuffle the deck. \nNew deck order is: ");
        Deck.shuffleCards();
        Deck.displayCards();
        System.out.println("Now I will show you a random card. \nYour card is: ");
        Deck.randomCard();
        System.out.println("Now I will sort the cards. \nNew deck order is: ");
        Deck.sortCards();
        Deck.displayCards();
        System.out.println("Now I will shuffle the cards again and give you some cards. \n " + "How many cards would you like?");
        Deck.shuffleCards();
        myHand.getCard();
        System.out.println("Now your hand is: ");
        myHand.displayCards();
        System.out.println("Let me check if your cards are no longer in my deck.");
        myHand.checkDeckHand();
        System.out.println("Now I will return your card in to the deck.");
        myHand.returnCard();
        System.out.println("The card is back in the deck.");
    }
}
