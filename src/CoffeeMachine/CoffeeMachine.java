package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int input = scan.nextInt();
        System.out.println("For"+ input +"cups of coffee you will need:");
        System.out.println(input * 200 +"ml of water");
        System.out.println(input * 50 +"ml of milk");
        System.out.println(input * 15 +"g of coffee beans");
    }
}
