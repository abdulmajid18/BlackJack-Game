package org.rozz;

import java.util.ArrayList;
import java.util.Date;

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
}
