package org.rozz;

public enum CardName {

    One("Ace",1), Two("two",2),
    Three("three",3), Four("four", 4),
    Five("five", 5), Six("six",6),
    Seven("seven", 7), Eight("eight",8),
    Nine("nine",9), Ten("ten",10),
    Jack("jack", 10), Queen("queen", 10),
    King("king", 10);
    
    private String name;
    private int value;
    CardName(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
