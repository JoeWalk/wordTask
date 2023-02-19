import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Character> secondWordLetters = new ArrayList<>();
        ArrayList <Character> firstWordLetters = new ArrayList<>();
        boolean valid = true;
        char letterLookingFor;
        String firstWord;
        String secondWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        firstWord = input.next();
        System.out.println("Enter your second word");
        secondWord = input.next();
        for (int i = 0; i < firstWord.length(); i++) {
            firstWordLetters.add(firstWord.charAt(i));
        }
        for (int i = 0; i < secondWord.length(); i++) {
            secondWordLetters.add(secondWord.charAt(i));
        }
        for (int i = 0; i < firstWordLetters.size(); i++) {
            if (valid == true) {
                valid = false;
                letterLookingFor = firstWordLetters.get(i);
                for (int a = 0; a < secondWordLetters.size(); a++) {
                    if (secondWordLetters.get(a) == letterLookingFor) {
                        valid = true;
                        secondWordLetters.set(a, '#');
                        a = secondWordLetters.size();
                    }
                }
                if (valid == false) {
                    System.out.println("You cannot make " + firstWord + " out of " + secondWord);
                }
            }

        }
        if (valid == true) {
            System.out.println("You can make " + firstWord + " out of " + secondWord);
        }
    }
}