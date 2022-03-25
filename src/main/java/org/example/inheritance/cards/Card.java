package org.example.inheritance.cards;

public class Card implements Comparable<Card> {

    private Suit suit;
    private FaceValue value;

    private Card()  {

    }

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && value == card.value;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}
