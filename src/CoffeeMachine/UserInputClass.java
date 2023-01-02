package CoffeeMachine;

import java.util.Scanner;

public class UserInputClass {

    public String userInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}