package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in); //Property

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

//    public int getInt(int min, int max){
//        int userInt;
//        do {
//            System.out.printf("Please enter a whole number between %d and %d: \n", min, max);
//            userInt = this.scanner.nextInt();
//        }while(userInt > max || userInt < min);
//        return userInt;
//    }
//
//    public int getInt(){
//        return this.scanner.nextInt();
//    }
//
//    public double getDouble(double min, double max){
//        double userDouble;
//        do{
//            System.out.printf("Please enter a decimal number between %f and %f: \n", min, max);
//            userDouble = this.scanner.nextDouble();
//        }while(userDouble > max || userDouble < min);
//        return userDouble;
//    }


    //EXCEPTIONS AND ERROR HANDLING EXERCISE:
    public int getInt() {
//        try{
//        String s = getString();
//        return Integer.valueOf(s);
//    }catch(NumberFormatException nfe){
//        System.out.println("Please enter an Integer:");
//        return getInt();
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("ERROR!\n Invalid Input");
            e.printStackTrace();
        }
        return getInt();
    }

    public double getDouble() {
//        try{
//        String s = getString();
//        return Double.valueOf(s);
//    }catch(NumberFormatException nfe){
//        System.out.println("Please enter a double:");
//        return getDouble();
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("ERROR!\n Invalid Input");
            e.printStackTrace();
        }
        return getDouble();
    }
    //Didn't have getInt(String prompt)? Or the getDouble(String prompt)? Not sure why they were missing but added in now with the new error handling.
    public int getInt(String prompt){
        int number;
        try{
            number = Integer.valueOf(prompt);
            return number;
        } catch(NumberFormatException e){
            System.out.println("Please enter an Integer:");
            return getInt(prompt);
        }
    }

    public double getDouble(String prompt){
        double number;
        try{
            number = Double.valueOf(prompt);
            return number;
        } catch(NumberFormatException e){
            System.out.println("Please enter a double:");
            return getDouble(prompt);
        }
    }

}
