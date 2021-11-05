package util;

import java.util.Scanner;

//Methods Exercise 5:
public class HighLow {

//The specs for the game are:

//Game picks a random number between 1 and 100.

    public static int randomNumber() {
        return (int) Math.floor(Math.random() * 100);
    }

    //Prompts user to guess the number.
    // All user inputs are validated.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100 ");
        int userInput = scanner.nextInt();
        scanner.nextLine();


//If user's guess is less than the number, it outputs "HIGHER".
        if(userInput < randomNumber()){
            System.out.println("HIGHER");
        }

//If user's guess is more than the number, it outputs "LOWER".
        if(userInput > randomNumber()){
            System.out.println("LOWER");
        }

//If a user guesses the number, the game should declare "GOOD GUESS!"
        if(userInput == randomNumber()){
            System.out.println("GOOD GUESS!");
        }

    }
}
