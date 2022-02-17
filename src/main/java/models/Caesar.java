package models;

public class Caesar {
    private String letters;

    public Caesar(String letter) {
      this.letters = letters;
    }

    public String getLettersToReplace() {
        letters = "the".replace('t','q');
        return letters;
    }
}
