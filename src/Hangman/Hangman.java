package Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        System.out.println("HANGMAN");
        System.out.println("Guess the word:");
        String word = scan.next();
        if (word.equals("java")) {
            System.out.println("You survived");
        } else{
            System.out.println("You lost");
        }
    }
}
