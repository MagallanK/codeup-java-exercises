public class PersonLecture {
    //A class: This is the template or a blueprint for a 'PERSON'

    //instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    };

    //make a static property - representing the world population
    public static long worldPop = 7_900_000_000L;



    public static void main(String[] args) {
        PersonLecture mag = new PersonLecture(); //PersonLecture is same as class name above and needs to be this way to work.

        mag.firstName = "Kapena";
        mag.lastName = "Magallan";

        System.out.println("mag = " + mag);
        System.out.println(mag.firstName + " " + mag.lastName + " is my name!");
        System.out.printf("%s %s is my name! \n", mag.firstName, mag.lastName);

        System.out.println(mag.joinChat());

        System.out.println("worldPop = " + worldPop);

        PersonLecture douglas = new PersonLecture();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //douglas didn't get counted in the worldPop, how would I add him into our count?

        //Would I - access the variable alone?
        // Maybe instead: Access through the class name. . and dot notation
        PersonLecture.worldPop += 1;

        System.out.println("worldPop with Douglas :D = " + worldPop);
        System.out.println(douglas.worldPop); // Again this WILL work, but it is NOT PROPER CODE and NOT BEST PRACTICE

        //can we . . talk to PersonLecture.firstName??

//        System.out.println(PersonLecture.firstName); //CTE - no going forward until we fix this

    }
}
