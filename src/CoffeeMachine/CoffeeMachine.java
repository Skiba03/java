package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    private void Information(UserInputClass user) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        menu(user);
    }
    public void menu(UserInputClass user) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take, remaining, exit):");
        String userChoose = input.next();
        switch (userChoose) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 'back'- to main menu:");
                String userChooseCoffee = input.next();
                switch (userChooseCoffee) {
                    case "1":
                        espresso(user);
                        break;
                    case "2":
                        latte(user);
                        break;
                    case "3":
                        cappuccino(user);
                        break;
                    case "back":
                        menu(user);
                        break;
                }
                break;
            case "fill":
                fill(user);
                break;
            case "take":
                take(user);
                break;
            case "remaining":
                Information(user);
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    private void espresso(UserInputClass user) {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
            menu(user);
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");

            menu(user);
        }
    }

    private void latte(UserInputClass user) {
        if(water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            money += 7;
            menu(user);
        } else if(water < 350){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");

            menu(user);
        }
    }

    private void cappuccino(UserInputClass user) {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            money += 6;
            menu(user);
        } else if (water < 200) {
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");

            menu(user);
        }
    }


    private void fill(UserInputClass user) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:");
        cups += userInput.nextInt();

        menu(user);
    }

    private void take(UserInputClass user) {
        System.out.println("I gave you " + money);
        money = 0;

        menu(user);
    }

}
