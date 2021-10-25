import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//  1.  Copy this code into your main method:
        double pi = 3.14159;
//    Write some Java code that uses the variable pi to output the following:
//    The value of pi is approximately 3.14.
//    Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.format("The value of pi is approximately %f%n", pi);

//    ---Explore the Scanner Class.---
//  1.  Prompt a user to enter an integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();
        scanner.nextLine(); // nextInt() does not create a new line. Habit this structure for nextInt();
        System.out.printf("The Integer you entered was: %s \n", userInteger);

//    What happens if you input something that is not an integer?
// The console shows an error message

//  2.  Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.print("Enter 3 words: ");
        String userWord1 = scanner.next();

        System.out.printf("Your first word is: %s \n", userWord1);
        String userWord2 = scanner.next();

        System.out.printf("Your second word is: %s \n", userWord2);
        String userWord3 = scanner.next();

        System.out.printf("Your third word is: %s \n", userWord3);
        scanner.nextLine();
        //Need here as well so we can make a new line again, since .next() does not create a new line either. It only goes at the end of this whole declaration because that's where we want the break at.

//    What happens if you enter less than 3 words?- The console waits until all entries have been made.
//    What happens if you enter more than 3 words?- The console only goes up to 3 words and does not display any words after the third.


//   3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.print("Please enter a sentence: \n");
//        String sentence = scanner.next();
//        System.out.printf("Here is the sentence you just made: --> %s \n", sentence);

//      do you capture all the words? - No it only captures the first word.

//  4.  Rewrite the above example using the nextLine method.

        System.out.print("Please enter a sentence: \n");
        String sentence2 = scanner.nextLine();
        System.out.printf("Here is the sentence you just made: --> %s \n", sentence2);
//
//    ---Calculate the perimeter and area of Codeup's classrooms.---
//  1.  Prompt the user to enter values of length and width of a classroom at Codeup.
//    Use the nextLine method to get user input and parse the resulting string to a numeric type.
//    Assume that the rooms are perfect rectangles.
//    Assume that the user will enter valid numeric data for length and width.

        System.out.print("Enter a length: ");
        String lString = scanner.nextLine();
        int len = Integer.parseInt(lString);

        System.out.print("Enter a width: ");
        String wString = scanner.nextLine();
        int width = Integer.parseInt(wString);


//  2.  Display the area and perimeter of that classroom.
        //    The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        int area = len * width;
        int perimeter = (2 * len) + (2 * width);

        System.out.printf("Area: %d\n Perimeter: %d\n", area, perimeter);


//
//            Bonuses
//    In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//    The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//            scanner.useDelimiter("\n");
//    How does this change the way your program operates?
//
//    Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
    }
}
