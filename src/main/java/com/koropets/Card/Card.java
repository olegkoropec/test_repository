package com.koropets.Card;


public class Card {
    private Rank rank;
    private Suit suit;
    private Card card;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    static Card card1 = new Card (Rank.ACE, Suit.HEARTS);
    static  Card card2 = new Card (Rank.ACE, Suit.DIAMONDS);
    static Card card3 = new Card (Rank.ACE, Suit.CLUBS);
    static  Card card4 = new Card (Rank.ACE, Suit.SPADES);
    static Card card5 = new Card (Rank.KING, Suit.HEARTS);
    static  Card card6 = new Card (Rank.KING, Suit.DIAMONDS);
    static Card card7 = new Card (Rank.KING, Suit.CLUBS);
    static  Card card8 = new Card (Rank.KING, Suit.SPADES);
    static Card card9 = new Card (Rank.QUEEN, Suit.HEARTS);
    static  Card card10 = new Card (Rank.QUEEN, Suit.DIAMONDS);
    static Card card11 = new Card (Rank.QUEEN, Suit.CLUBS);
    static  Card card12 = new Card (Rank.QUEEN, Suit.SPADES);
    static Card card13 = new Card (Rank.JACK, Suit.HEARTS);
    static  Card card14 = new Card (Rank.JACK, Suit.DIAMONDS);
    static Card card15 = new Card (Rank.JACK, Suit.CLUBS);
    static  Card card16 = new Card (Rank.JACK, Suit.SPADES);
    static Card card17 = new Card (Rank.TEN, Suit.HEARTS);
    static  Card card18 = new Card (Rank.TEN, Suit.DIAMONDS);
    static Card card19 = new Card (Rank.TEN, Suit.CLUBS);
    static  Card card20 = new Card (Rank.TEN, Suit.SPADES);
    static Card card21 = new Card (Rank.NINE, Suit.HEARTS);
    static  Card card22 = new Card (Rank.NINE, Suit.DIAMONDS);
    static Card card23 = new Card (Rank.NINE, Suit.CLUBS);
    static  Card card24 = new Card (Rank.NINE, Suit.SPADES);
    static Card card25 = new Card (Rank.EIGHT, Suit.HEARTS);
    static  Card card26 = new Card (Rank.EIGHT, Suit.DIAMONDS);
    static Card card27 = new Card (Rank.EIGHT, Suit.CLUBS);
    static  Card card28 = new Card (Rank.EIGHT, Suit.SPADES);
    static Card card29 = new Card (Rank.SEVEN, Suit.HEARTS);
    static  Card card30 = new Card (Rank.SEVEN, Suit.DIAMONDS);
    static Card card31 = new Card (Rank.SEVEN, Suit.CLUBS);
    static  Card card32 = new Card (Rank.SEVEN, Suit.SPADES);
    static Card card33 = new Card (Rank.SIX, Suit.HEARTS);
    static  Card card34 = new Card (Rank.SIX, Suit.DIAMONDS);
    static Card card35 = new Card (Rank.SIX, Suit.CLUBS);
    static  Card card36 = new Card (Rank.SIX, Suit.SPADES);

    static Card val[] = {card1, card2, card3, card4, card5, card6, card7, card8,
            card9, card10, card11, card12, card13, card14, card15, card16,
            card17, card18, card19, card20, card21, card22, card23, card24,
            card25, card26, card27, card28, card29, card30, card31, card32, card33, card34, card35, card36,};

    public static void main(String[] args){

        System.out.println(val[20].getRank().getName()+" "+val[2].getSuit().getName());


    }
}
