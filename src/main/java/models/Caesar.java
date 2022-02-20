package models;

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
        String newWord = null;
        for (i = 0; i < userLetters.length; i++) {
            char firstLetter = userLetters[i];
            int originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);
            //System.out.println(originalIndex);
            int newIndex = originalIndex - 3;
            char newLetter = allLeters[newIndex];
            newWord = letters.replace(firstLetter, newLetter);
            letters = newWord;
            System.out.println(letters);
        }
        return letters;
    }

    public String decodeLetters() {
        char[] userLetters = letters.toCharArray();
        char[] allLeters = "abcdefghijklmnopqrstvuwxyz".toCharArray();
        int i = 0;
        String newWord = null;
        for (i = 0; i < userLetters.length; i++) {
            char firstLetter = userLetters[i];
            int originalIndex = "abcdefghijklmnopqrstvuwxyz".indexOf(firstLetter);
            //System.out.println(originalIndex);
            int newIndex = originalIndex + 3;
            char newLetter = allLeters[newIndex];
            newWord = letters.replace(firstLetter, newLetter);
            letters = newWord;
        }
        return newWord;
    }
}















