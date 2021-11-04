import java.util.Random;
import java.util.Scanner;

public class MathOperations {

    //Exercise 1:
    // void method is for interacting with user
//    public static void calculateUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Gimme two numbers: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("Would you like to add, subtract, multiply, divide or get modulus?");
//        String input = scanner.next();
//
//        calculate(num1, num2, input);
//
//    }

    //Method below void is for the functionality of interacting with user
    //Exercise 1:
//    public static void calculate(int num1, int num2, String input) {
//        switch (input) {
//            case "add":
//                System.out.println("Sum: " + addition(num1, num2));
//                break;
//            case "subtract":
//                System.out.println("Difference: " + subtraction(num1, num2));
//                break;
//            case "multiply":
//                System.out.println("Product: " + multiply(num1, num2));
//                break;
//            case "divide":
//                System.out.println("Dividend: " + divide(num1, num2));
//                break;
//            case "modulus":
//                System.out.println("Modulus: " + modulus(num1, num2));
//                break;
//            default:
//                System.out.println("idk how we got here, fam");
//                break;
//        }
//    }
//    public static int addition(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2){
//        return num1 - num2;
//    }
//
//    public static int multiply(int num1, int num2){
//        return num1 * num2;
//    }
//
//    public static int divide(int num1, int num2){
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }
    //End of Exercise 1:


    //Exercise 2 & 3:
    // void method is for interacting with user
//    public static void rangeOfNumbers(){
//        boolean userContinue = true;
//        do {
//            Scanner range = new Scanner(System.in);
//            System.out.println("Enter a number between 1 and 10: ");
//            int userNum = range.nextInt();
//
//            factorial(userNum);
//
//            System.out.println("Do you want to continue? [y/n]");
//            String userAnswer = range.next();
//            if (userAnswer.equals("y")) {
//                continue;
//            }
//            if (userAnswer.equals("n")) {
//                break;
//            }
//
//        }while(userContinue);
//    }
//
    //Method below void is for the functionality of interacting with user
//    public static long factorial(long userNum){
//        long factor = 1;
//
//        for(int i = 1; i <= userNum; i++){
//            factor *= i;
//        }
//
//        System.out.printf("%d! = %d \n", userNum, factor);
//
//        if(userNum >= 1 && userNum <= 10){
//            System.out.println("This number is valid!");
//        }else{
//            System.out.println("This number is not valid! But is still factored above.");
//        }
//        return userNum;
//    }
    //End of Exercise 2 & 3:

    //Exercise 4:
    // void method is for interacting with user
//    public static void diceRoll() {
//        boolean confirmRoll = true;
//        do {
//            System.out.println("Please enter the number of sides for a pair of dice. (I.E. a normal die has 6 sides.)");
//            Scanner userDice = new Scanner(System.in);
//            int userSide1 = userDice.nextInt();
//            int userSide2 = userDice.nextInt();
//
//            rollRandom(userSide1, userSide2);
//
//            System.out.println("Do you want to roll the dice again[y], or stop?[n]");
//            String userAnswer = userDice.next();
//            if (userAnswer.equals("y")) {
//                continue;
//            }
//            if (userAnswer.equals("n")) {
//                break;
//            }
//
//        } while (confirmRoll);
//    }
//
//    //Method below void is for the functionality of interacting with user
//    public static int rollRandom(int die1, int die2) {
//        Random randDice = new Random();
//        int roll1 = randDice.nextInt(die1);
//        int roll2 = randDice.nextInt(die2);
//
//        System.out.printf("You rolled a %d and a %d \n", roll1, roll2);
//        return roll1 + roll2;
//    }
    //End of Exercise 4

    //Exercise 5:
}
