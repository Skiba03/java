package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int cups;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.Ingredients();
        coffeeMachine.Cups();
    }

    public void Ingredients() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:");
        this.water = scan.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:");
        this.milk = scan.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:");
        this.beans = scan.nextInt();
        System.out.print("Write how many cups of coffee you will need:");
        this.cups = scan.nextInt();
    }

    public void Cups(){
        int coffeeCups = 0;

        while (true) {
            if (water >= 200 && milk >= 50 && beans >= 15) {
                water -= 200;
                milk -= 50;
                beans -= 15;
            } else {
                break;
            }
            coffeeCups++;
        }

        if (coffeeCups < cups) {
            System.out.println("No, I can make only " + cups + " cups of coffee");
        } else if (coffeeCups == cups) {
            System.out.println("Yes, I can make that amount of coffee.");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (coffeeCups - cups) + " more than that)");
        }
    }
}
