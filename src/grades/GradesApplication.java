package grades;

import util.Input;

import java.util.*; // adds all util classes.

import java.util.HashMap;
import java.util.Scanner; // used scanner at first, but replaced with util.input for my loop. Keeping for personal note to remind myself I don't need to use scanner but can use my other classes instead, such as util.Input.

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();

        Student mag = new Student("Magallan");
        Student kap = new Student("Kap");
        Student jon = new Student("Jon");
        Student andrew = new Student("Andrew");

        mag.addGrade(80);
        mag.addGrade(70);
        mag.addGrade(90);

        kap.addGrade(100);
        kap.addGrade(70);
        kap.addGrade(15);

        jon.addGrade(87);
        jon.addGrade(52);
        jon.addGrade(74);

        andrew.addGrade(1);
        andrew.addGrade(64);
        andrew.addGrade(75);

        students.put("MagallanK", String.valueOf(mag));
        students.put("KapLikeCap", String.valueOf(kap));
        students.put("JonNotWayne", String.valueOf(jon));
        students.put("AndrewM", String.valueOf(andrew));


        boolean confirmed; //Do we always need to use this for the do-while loop to have the confirmation at the bottom?
        do {
            Input userInput = new Input();
            System.out.println("Here are the GitHub usernames of our students:\n");
            System.out.println("|MagallanK|   |KapLikeCap|    |JonNotWayne|    |AndrewM|\n");
            System.out.println("What student would you like to see more information on?\nPlease enter one of the GitHub usernames from above here -->");
            String userChoice = userInput.getString();

            if (Objects.equals(userChoice, "MagallanK")) {
                System.out.println("Name: Mag - Github Username: MagallanK\n Current Average: " + mag.getGradeAverage() + "\n"); //Regular concatenation way.
            }
            else if (Objects.equals(userChoice, "KapLikeCap")) {
                System.out.printf("Name: %s - Github Username: KapLikeCap \n Current Average: %f\n", kap.getName(), kap.getGradeAverage()); // using printf style.
            }
            else if (Objects.equals(userChoice, "JonNotWayne")) {
                System.out.printf("Name: %s - Github Username: JonNotWayne \n Current Average: %f\n", jon.getName(), jon.getGradeAverage());
            }
            else if (Objects.equals(userChoice, "AndrewM")) {
                System.out.printf("Name: %s - Github Username: %s \n Current Average: %f\n", andrew.getName(), userChoice, andrew.getGradeAverage()); // Really condensed printf style. Didn't think would work, But it did!! :D
            }
            else {
                System.out.println("Sorry, no student found with the Github username of " + userChoice + "\n");
            }

            System.out.print("Do you want to continue? [Y/N] ");
            String userConfirm = userInput.getString();
            confirmed = userConfirm.equalsIgnoreCase("y"); //Will refactor later to try and use the yesNo() from my util.input
        } while (confirmed);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
