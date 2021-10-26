import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//  1.      Loop Basics
//   a.   While
//      Create an integer variable i with a value of 5.
//      Create a while loop that runs so long as i is less than or equal to 15
//      Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

//  b.    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 2;
//        } while (i <= 100);

//      Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        } while (i >= -10);

//     Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);


//        Refactor the previous two exercises to use a for loop instead.

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }

//   2.     Fizzbuzz

//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//        } while(i <= 100);


//  3.    Display a table of powers.

        boolean userInput = true;
        do {
            System.out.print("Enter an integer: ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            System.out.println("number  |  squared  |  cubed");
            System.out.println("------  |  -------  |  -----");
            for(int i = 1; i <= userNumber; i++){
//                System.out.println(i + "       |  " + i * i + "        |  " + i * i * i + "        ");
                System.out.printf("%-7d| %-9d| %-6d \n", i, i * i, i * i * i);
            }
            System.out.println("Here is your table!");
            System.out.println("Do you want to continue? [y/n]");
            String userAnswer = scanner.next();
            if(userAnswer.equals("y")){
                continue;
            }
            if(userAnswer.equals("n")){
                break;
            }
        }while(userInput);


//  4.      Convert given number grades into letter grades.

        boolean studentGrade = true;
        do {
            System.out.print("Enter your grade number here: ");
            Scanner scanner = new Scanner(System.in);
            int userGrade = scanner.nextInt();

            if (userGrade >= 88) {
                System.out.printf("Your grade is A, %d \n", userGrade);
            }
            else if(userGrade >= 80){
                System.out.printf("Your grade is B, %d \n", userGrade);
            }
            else if(userGrade >= 67){
                System.out.printf("Your grade is C, %d \n", userGrade);
            }
            else if(userGrade >= 60){
                System.out.printf("Your grade is D, %d \n", userGrade);
            }
            else{
                System.out.printf("Your grade is F, %d \n", userGrade);
            }

            System.out.println("Do you want to continue? [y/n]");
            String userAnswer = scanner.next();
            if(userAnswer.equals("y")){
                continue;
            }
            if(userAnswer.equals("n")){
                break;
            }
        }while(studentGrade);
    }
}
