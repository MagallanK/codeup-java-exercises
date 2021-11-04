package movies;

import util.Input;

import java.util.Objects;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    private static Movie[] moviesArray = findAll();

    //View all movies
    public static void one() {
        for (Movie movie : moviesArray) {
            System.out.println(movie.getMovieName());
        }
    }

    //View animated movies
    public static void two() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getMovieCat(), "animated")) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCat());
            }
        }
    }

    //View drama movies
    public static void three() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getMovieCat(), "drama")) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCat());
            }
        }
    }

    //View Horror movies
    public static void four() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getMovieCat(), "horror")) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCat());
            }
        }
    }

    //View Scifi movies
    public static void five() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getMovieCat(), "scifi")) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCat());
            }
        }
    }

    public static void main(String[] args) {

        boolean userConfirmed;
        do {
            Input userInput = new Input();
            System.out.println("What would you like to do? ");

            //IntelliJ options for text block? More readable than string concatenation
            System.out.println("""
                    0 - exit\s
                    1 - view all movies\s
                    2 - view movies in the drama category\s
                    3 - view all movies in the musical category\s
                    4 - view all movies in the scifi category\s
                    5 - view all movies in the horror category\s
                    """);
            System.out.println("Enter your choice: ");

            int userChoice = userInput.getInt();

            if (userChoice == 1) {
                one();
            } else if (userChoice == 2) {
                two();
            } else if (userChoice == 3) {
                three();
            } else if (userChoice == 4) {
                four();
            } else if (userChoice == 5) {
                five();
            }

            //Prompt to continue
            userInput.getString();
            System.out.println("Do you want to continue? [Yes / No] ");
            String userConfirm = userInput.getString();
            userConfirmed = userConfirm.equalsIgnoreCase("y") || userConfirm.equalsIgnoreCase("yes");
        } while (userConfirmed);
    }
}
