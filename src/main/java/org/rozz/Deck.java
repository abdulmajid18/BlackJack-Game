package org.rozz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Deck {

    private ArrayList<BlackjackCard> cardDeck;

    private ArrayList<BlackjackCard> shuffledCards;

    private Date creationDate;

    public Deck() {
        this.creationDate = new Date();
        this.cardDeck = new ArrayList<>();
        for (CardInfo cardInfo: CardInfo.values()) {
            String name = cardInfo.getName();
            int value = cardInfo.getValue();
            for (Suit suit: Suit.values()) {
                cardDeck.add(new BlackjackCard(name, suit, value));
            }
        }
    }

    public ArrayList<BlackjackCard> getDeckOfCards() {
        return cardDeck;
    }

    public void shuffle() {
        int cardCount = cardDeck.size();
        Random r = new Random();
        for (int i = cardCount-1 ; i >= 1 ; i--){
            int index = r.nextInt(cardCount+1);
            swap(i, index);
        }
    }

    private void swap(int i, int j) {
        Collections.swap(cardDeck, i, j);
    }

    /* Fix the code below*/
    public BlackjackCard dealCard() {
        return cardDeck.remove(1);
    }



}
