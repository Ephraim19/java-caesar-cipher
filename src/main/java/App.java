import models.Caesar;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     Scanner myConsole = new Scanner(System.in);
     System.out.println("Enter your word");
     String myWord = myConsole.nextLine();
     Caesar caesar = new Caesar(myWord.toLowerCase(Locale.ROOT));
     System.out.println("Do you want to encrypt or decrypt");
     String functionality = myConsole.nextLine();
     String wordResult = "";
     if (Objects.equals(functionality, "encrypt")){
         wordResult = caesar.encodeLetters();
     }else if (Objects.equals(functionality,"decrypt")) {
         wordResult = caesar.decodeLetters();
     }else {
         System.out.println("Please enter the functionality");
     }
     System.out.println(wordResult.toUpperCase(Locale.ROOT));
    }
}