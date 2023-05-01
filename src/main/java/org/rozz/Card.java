package org.rozz;

public class Card {
    private String name;

    private Suit suit;

    private int faceValue;

    public Card(String name, Suit suit, int faceValue) {
        this.name = name;
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", suit=" + suit +
                ", faceValue=" + faceValue +
                '}';
    }
}


