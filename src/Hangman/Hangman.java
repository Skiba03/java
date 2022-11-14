package Hangman;

import java.util.Scanner;

public class Hangman {

    private static String[] words = {"java","python","javascript","kotlin",};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String minus = new String(new char[word.length()]).replace("\0", "-");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HANGMAN");

        while (count < 8 && minus.contains("-")) {
            System.out.println(minus);
            String guess = scan.next();
            hang(guess);
        }
        scan.close();
    }

    public static void hang(String guess) {
        String newminus = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newminus += guess.charAt(0);
            } else if (minus.charAt(i) != '-') {
                newminus += word.charAt(i);
            } else {
                newminus += "-";
            }
        }

        if (minus.equals(newminus)) {
            count++;
            Try();
        }else {
            minus = newminus;
            count++;
        }
        if (minus.equals(word)) {
            System.out.println("You win!");
            System.out.println("Thanks for playing!");
            System.out.println("We'll see how well you did in the next stage");
        }
    }

    public static void Try() {
        if (count == 1) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 2) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 3) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 4) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 5) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 6) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 7) {
            System.out.println("That letter doesn't appear in the word");
        }
        if (count == 8) {
            System.out.println("Thanks for playing");
            System.out.println("We'll see how well you did in the next stage");
        }
    }
}
