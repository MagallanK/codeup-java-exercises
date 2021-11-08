import util.Input;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

//        System.out.println("Enter a string: ");
//        String userString = input.getString();
//        System.out.println("Your string was: " + userString);
//
//        System.out.println("Do you like steaks?");
//        boolean userBool = input.yesNo();
//        System.out.println("The result is: " + userBool);
//
        System.out.println("Enter a number: ");
        int userInt = input.getInt();
        System.out.println("userInt = " + userInt);
//
//        int userInput = input.getInt(0, 20);
//        System.out.println("userInput = " + userInput);

        System.out.println("Please enter a decimal number:");
        double userDouble = input.getDouble();
        System.out.println("userDouble = " + userDouble);

//        double userDouble2 = input.getDouble(0, 50);
//        System.out.println("userDouble2 = " + userDouble2);

    }

}
