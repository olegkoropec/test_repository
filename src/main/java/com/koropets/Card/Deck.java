package com.koropets.Card;
import java.util.Random;

public class Deck {
    int length = 36;
    String st[] = new String [length];
    int u = 0;

    public void shuffle() {
        Random rnd = new Random();
        String temp;
        for (int i = 0; i < length; i++) {
            int d = rnd.nextInt(length);
            if (i != d) {
                temp = st[i];
                st[i] = st[d];
                st[d] = temp;
            }
        }
        for (int j = 0; j < length; j++) {
            //System.out.println(st[j]);
        }
    }

    public void order() {
        for (int i=0; i<4; i++){
            for (int j=0; j<9; j++){
                st[u] = Suit.values[i].getName()+" "+ Rank.values[j].getName();
                //System.out.println(st [u]);
                u++;
            }
        }
    }


    public boolean hasNext() {
        if(length >0 )
            return true;
        else {
            System.out.println("not any card");
            return false;}
    }

    public String drawOne() {
        if (hasNext() == true){
            String last = st[length-1];
            System.out.println(last);
            length --;
            return last;
        }
        return null;

    }

    public static void main (String[] args){
        Deck deck = new Deck();
        deck.order();
        //deck.shuffle();
        for (int i = 0; i < 39; i++){
            deck.drawOne();
        }
    }
} 