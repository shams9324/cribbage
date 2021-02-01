package com.cribbage;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * Validates argument and sets instance variable
     * @param faceName 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        if(validFaceNames.contains(faceName)) {
            this.faceName = faceName;
        } else {
            throw new IllegalArgumentException("invalid face name. valid face names are: " +
                            validFaceNames);
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toUpperCase();
        if (validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("invalid suit. valid suits are: " +
                            validSuits);
        }
    }

    // This method returns a list of valid face names
    public static List<String> getValidFaceNames() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
    }

    public String toString() {
        return String.format("%s%s", faceName, suit);
    }

    //This method returns a list of valid suits
    public static List<String> getValidSuits() {
        return Arrays.asList("S", "H", "C", "D");
    }
}
