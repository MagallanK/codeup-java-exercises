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

    public int getInt(int min, int max){
        int userInt;
        do {
            System.out.printf("Please enter a whole number between %d and %d: \n", min, max);
            userInt = this.scanner.nextInt();
        }while(userInt > max || userInt < min);
        return userInt;
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max){
        Double userDouble;
        do{
            System.out.printf("Please enter a decimal number between %f and %f: \n", min, max);
            userDouble = this.scanner.nextDouble();
        }while(userDouble > min || userDouble < max);
        return userDouble;
    }

    double getDouble(){
        return this.scanner.nextDouble();
    }

}
