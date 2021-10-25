import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        String name = "Magallan";
//        System.out.printf("Hello there, %s. Nice to see you. \n", name);
//
//      printf() is like string templates in es6 and allows for less concatenation.

//        String greeting = "Howdy";
//        String cohortName= "Quasar";
//        System.out.printf("%s, %s", greeting, cohortName);

        System.out.print("Enter something: ");

        String userInput = scanner.nextLine();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //To display a % sign when using printf you double up the %% like so. Example
        System.out.printf("Here is the example with a percent symbol included: --> %% %s", userInput);

//        System.out.printf("You entered: %s", userInput);

    }



}
