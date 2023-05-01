package org.rozz;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int value;
    private ArrayList<BlackjackCard> cards;

    public Hand(BlackjackCard c1, BlackjackCard c2) {
        this.cards = new ArrayList<>();
        this.cards.add(c1);
        this.cards.add(c2);
    }

    private List<Integer> getScores() {
        List<Integer> totals = new ArrayList<>();
        totals.add(0);

        for (BlackjackCard card : cards) {
            List<Integer> newTotals = new ArrayList<>();
            for(int score: totals) {
                newTotals.add(card.getFaceValue() + score);
                if (card.getFaceValue() == 1)
                    newTotals.add(11 + score);
            }
            totals =newTotals;
        }
        return totals;
    }

    public void addCard(BlackjackCard card) {
        cards.add(card);
    }

    public int resolveScore() {
        List<Integer> scores = getScores();
        int bestScore = 0;
        for(int score: scores) {
            if(score <= 21 && score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }

    public void showHand() {
        for (BlackjackCard card: cards)
            System.out.println(card);
    }
}

