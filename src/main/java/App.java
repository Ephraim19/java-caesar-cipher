import models.Caesar;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     Scanner myConsole = new Scanner(System.in);
     System.out.println("Enter your word");
     String myWord = myConsole.nextLine();
     Caesar caesar = new Caesar(myWord);
     System.out.println("Do you want to decode or encode");
     String functionality = myConsole.nextLine();
     String wordResult;
     if (Objects.equals(functionality, "encode")){
         wordResult = caesar.encodeLetters();
     }else {
         wordResult = caesar.decodeLetters();
     }
     System.out.println(wordResult);
    }
}