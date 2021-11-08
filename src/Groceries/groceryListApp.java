package Groceries;

import util.Input;

public class groceryListApp {
    public static void main(String[] args) {

        Input userInput = new Input();
        System.out.println("Would you like to create a grocery list? [Y/N]");
        boolean startList = userInput.yesNo();

    }
}

