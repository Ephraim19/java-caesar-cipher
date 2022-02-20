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
            int originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);
            int newIndex = 0;
            newIndex = originalIndex - 3;
            if (newIndex== -1) {
                newIndex = 25;
            } else if (newIndex == -2){
                newIndex = 24;
            } else if (newIndex == -3){
                newIndex = 23;
            }
            System.out.println(newIndex);
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
            int newIndex = 0;
            if (originalIndex < 23) {
                newIndex = originalIndex + 3;
            } else if (newIndex == 23) {
                newIndex = 0;
            } else if (newIndex == 24){
                newIndex = 1;
            } else {
                newIndex = 2;
            }
            char newLetter = allLeters[newIndex];
            userLetters[i] = newLetter;
            returnLetters = String.valueOf(userLetters);
        }
        return returnLetters;
    }
}















