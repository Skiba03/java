package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.menu();
    }
    public void Information() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        menu();
    }
    public void menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take, remaining, exit):");
        String userChoose = userInput.next();
        switch (userChoose) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 'back'- to main menu:");
                String userChooseCoffee = userInput.next();
                switch (userChooseCoffee) {
                    case "1":
                        espresso();
                        break;
                    case "2":
                        latte();
                        break;
                    case "3":
                        cappuccino();
                        break;
                    case "back":
                        menu();
                        break;
                }
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                Information();
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    public void espresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
            menu();
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
            menu();
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
            menu();
        } else {
            System.out.println("Sorry, not enough cups!");

            menu();
        }
    }

    public void latte() {
        if(water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            money += 7;
            menu();
        } else if(water < 350){
            System.out.println("Sorry, not enough water!");
            menu();
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            menu();
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
            menu();
        } else {
            System.out.println("Sorry, not enough cups!");

            menu();
        }
    }

    public void cappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            money += 6;
            menu();
        } else if (water < 200) {
            System.out.println("Sorry, not enough water!");
            menu();
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            menu();
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
            menu();
        } else {
            System.out.println("Sorry, not enough cups!");

            menu();
        }
    }


    public void fill() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:");
        cups += userInput.nextInt();

        menu();
    }

    public void take() {
        System.out.println("I gave you " + money);
        money = 0;

        menu();
    }
}
