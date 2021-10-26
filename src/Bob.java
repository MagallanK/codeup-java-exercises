import java.util.Scanner;

public class Bob {
    public static void main(String [] args){

//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.


        boolean userContinue = true;
        do {
            System.out.println("Tell Bob anything, use ?, !, or neither to see his different responses.");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String bobResponse1 = "Sure.";
            String bobResponse2 = "Whoa, chill out!";
            String bobResponse3 = "Fine. Be that way!";
            String bobResponse4 = "Whatever.";

            if (userInput.endsWith("?")){
                System.out.println(bobResponse1);
            }
            if (userInput.endsWith("!")){
                System.out.println(bobResponse2);
            }
            if(userInput.isEmpty()){
                System.out.println(bobResponse3);
            }
            if(!userInput.endsWith("!") && !userInput.endsWith("?") && !userInput.isEmpty()){
                System.out.println(bobResponse4);
            }

            System.out.println("That was Bob");
            System.out.println("Do you want to keep talking with Bob? [y/n]");
            String userAnswer = scanner.next();
            if(userAnswer.equals("y")){
                continue;
            }
            if(userAnswer.equals("n")){
                break;
            }
        }while(userContinue);

    }
}
