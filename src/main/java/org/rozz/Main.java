package org.rozz;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Deck deck = new Deck();

        System.out.println(deck.getCardDeck());

        Shoe shoe = new Shoe(2);
        System.out.println(shoe.getCards().size());
    }
}