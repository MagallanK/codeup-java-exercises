import java.util.Arrays;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.


    //Passed in hard code of "nouns" && "adjectives"
    public static String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Lazy", "Awful"};

    public static String[] nouns = {"Dog", "Cat", "Bear", "Lemur", "Goat", "Mouse", "Cow", "Monkey", "Horse", "Shark"};

    //Random number generator method:
    public static String randomSet(String[] randWords) {
        int randomGenerator = (int) Math.floor(Math.random() * 10);
        return randWords[randomGenerator];
    }

    public static void main(String[] args) {
        System.out.println(randomSet(adjectives) + "-" + randomSet(nouns));
    }

}
