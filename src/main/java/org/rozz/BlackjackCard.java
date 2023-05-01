package org.rozz;

public class BlackjackCard extends Card{
    public int getGameValue() {
        return gameValue;
    }
    private int gameValue;

    public BlackjackCard(String name, Suit suit, int faceValue) {
        super(name, suit, faceValue);
        this.gameValue = faceValue;
        if (this.gameValue > 10) {
            this.gameValue = 10;
        }
    }
}


