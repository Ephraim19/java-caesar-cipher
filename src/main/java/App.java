import models.Caesar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     Scanner myConsole = new Scanner(System.in);
     System.out.println("Enter your word");
     String myWord = myConsole.nextLine();
     Caesar caesar = new Caesar(myWord);
     String wordResult = caesar.encodeLetters();
     System.out.println(wordResult);
    }
}