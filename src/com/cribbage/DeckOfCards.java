package com.cribbage;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    //    public DeckOfCards(ArrayList<Card> deck) {
//        this.deck = deck;
//    }

    public DeckOfCards() {
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit : suits) {
            for (String faceName : faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
    }

    public void shuffle() {
        ArrayList<Card> temp = new ArrayList<>();
        while (!deck.isEmpty()) {
            int shuffled = (int) (Math.random()*deck.size());
            temp.add(deck.get(shuffled));
            deck.remove(shuffled);
        }
        deck = temp;

        int CARDS_PER_ROUND = 5;
        for (int i = 0; i < CARDS_PER_ROUND; i++){
            System.out.println(deck.get(i));
        }
    }
    


}
