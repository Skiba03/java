package CoffeeMachine;

public class CoffeeMachineStartgame {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        UserInputClass userInputClass = new UserInputClass();
        coffeeMachine.menu(userInputClass);
    }
}
