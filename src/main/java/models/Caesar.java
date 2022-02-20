package models;

import java.util.Locale;
import java.util.Objects;

public class Caesar {
    private String letters;

    public Caesar(String letters) {
        this.letters = letters;
    }

    public String getLettersToReplace() {
        letters = "the".replace('t','q');
        return letters;
    }

    public String encodeLetters() {
        char[] userLetters = letters.toCharArray();
        char[] allLeters = "abcdefghijklmnopqrstvuwxyz".toCharArray();
        int i = 0;
        String returnLetters = null;
        for (i = 0; i < userLetters.length; i++) {
            char firstLetter = userLetters[i];
            Integer originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);
            Integer newIndex = 0;
            if (originalIndex > 2) {
                newIndex = originalIndex - 3;
            } else if (newIndex.equals(2)) {
                newIndex = 25;
            } else if (newIndex.equals(1)){
                newIndex = 24;
            } else if(newIndex.equals(0)) {
                newIndex = 23;
            }else {
                newIndex = Integer.valueOf("");
            }
            char newLetter = allLeters[newIndex];
            userLetters[i] = newLetter;
            returnLetters = String.valueOf(userLetters);
        }
        return returnLetters;
    }

    public String decodeLetters() {
        char[] userLetters = letters.toCharArray();
        char[] allLeters = "abcdefghijklmnopqrstvuwxyz".toCharArray();
        int i = 0;
        String returnLetters = null;
        for (i = 0; i < userLetters.length; i++) {
            char firstLetter = userLetters[i];
            int originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);
            Integer newIndex = 0;
            if (originalIndex < 23) {
                newIndex = originalIndex + 3;
            } else if (newIndex.equals(23)) {
                newIndex = 0;
            } else if (newIndex.equals(24)){
                newIndex = 1;
            } else if(newIndex.equals(25)) {
                newIndex = 2;
            }else {
                newIndex = Integer.valueOf("");
            }
            char newLetter = allLeters[newIndex];
            userLetters[i] = newLetter;
            returnLetters = String.valueOf(userLetters);
        }
        return returnLetters;
    }
}















