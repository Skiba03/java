package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!My name is Bot.");
        System.out.println("I was created in 2022.");
        System.out.println("Please,remind me your name.");
        String input = scan.nextLine();
        System.out.println("What a great name you have,"+ input);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3,5 and 7");
        int remainder3 = scan.nextInt();
        int remainder5 = scan.nextInt();
        int remainder7 = scan.nextInt();
        int age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Your age is "+ age +"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = scan.nextInt();
        for(int i =0 ; i <=number; i++){
            System.out.println(i+"!");
        }
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (true) {
            int question = scan.nextInt();
            if (question == 2){
                System.out.println("Great, you right!");
                break;
            }
            System.out.println("Please,try again.");
        }
        System.out.println("Goodbye,have a nice day!");
    }
        }
