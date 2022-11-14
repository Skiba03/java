package Hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[]{"java","python","javascript","kotlin",};
        int random = new Random().nextInt(words.length);
        System.out.println("HANGMAN");
        String str1 = (words[random]);
        char letter1 = str1.charAt(0);
        String str2 = (words[random]);
        char letter2 = str2.charAt(1);
        int amount = 0;
        for(int i = 2; i < (words[random]).length(); i++) {
            amount++;
        }
        System.out.println("Guess the word "+ letter1 + letter2 + amount);
        String word = scan.next();
        if (word.equals(words[random])) {
            System.out.println("You survived");
        } else{
            System.out.println("You lost");
        }
    }
}
