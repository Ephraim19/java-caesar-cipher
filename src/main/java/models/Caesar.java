package models;

import java.util.Locale;
import java.util.Objects;

public class Caesar {
    private String letters;
    private int shiftKey;
    public Caesar(String letters,int shiftKey) {
        this.letters = letters;
        this.shiftKey = shiftKey;
    }

    public String encodeLetters() {
        char[] userLetters = letters.toCharArray();
        char[] allLeters = "abcdefghijklmnopqrstvuwxyz".toCharArray();
        int i = 0;
        String returnLetters = null;
        for (i = 0; i < userLetters.length; i++) {
            char firstLetter = userLetters[i];
            int originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);

            Integer newIndex = originalIndex - shiftKey;
            char newLetter = 0;
            if (newIndex >= 0 && firstLetter != ' ') {
                newLetter = allLeters[newIndex];
            } else if (newIndex <= -1 && firstLetter != ' '){
                newLetter = allLeters[newIndex + 26];
            }else {
                newLetter = ' ';
            }
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
            Integer newIndex = originalIndex + shiftKey;
            char newLetter = 0;
            if (newIndex <= 25 && firstLetter != ' ' ) {
                newLetter = allLeters[newIndex];
            }else if (newIndex >= 26 && firstLetter != ' ') {
                newLetter =allLeters[newIndex - 26];
            }else {
                newLetter = ' ';
            }
            userLetters[i] = newLetter;
            returnLetters = String.valueOf(userLetters);
        }
            return returnLetters;
    }
}















