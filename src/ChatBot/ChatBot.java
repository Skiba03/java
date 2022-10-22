package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Hello!My name is Bot.");
        System.out.println("I was created in 2022.");
        System.out.println("Please,remind me your name.");
        String input = stringScanner.next();
        System.out.println("What a great name you have,"+ input);
        stringScanner.close();

    }

        }