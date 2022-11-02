package Hangman;

import java.util.Scanner;

import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[]{"java","python","javascript","kotlin",};
        int random = new Random().nextInt(words.length);
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        System.out.println("HANGMAN");
        System.out.println("Guess the word:");
        String word = scan.next();
        if (word.equals(words[random])) {
            System.out.println("You survived");
        } else{
            System.out.println("You lost");
        }
    }
}
