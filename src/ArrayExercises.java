import java.util.Arrays;

public class ArrayExercises {



    public static void main(String[] args){
//        What happens when you run the following code? Why is Arrays.toString necessary?
            //The system prints out the memory code not a string showing each element of the array we want to access. Arrays.toString is necessary, so we can convert the original array to a string which allows us to see the array as a whole in a string layout which is accepted by the console.

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        String[] Person;
        Person = new String[3];
        Person[0] = new String("Mag");
        Person[1] = new String("Kap");
        Person[2] = new String("Jon");

        System.out.println("Person[0] = " + Person[0]);
        System.out.println("Person[1] = " + Person[1]);
        System.out.println("Person[2] = " + Person[2]);

        for (String People : Person) {
            System.out.printf("%s is the name called%n", People);
        }

//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        String[] addPerson = Arrays.copyOf(Person, Person.length + 1);
        System.out.println("Person.length = " + Person.length);
        System.out.println("addPerson.length = " + addPerson.length);

        addPerson[addPerson.length - 1] = "Andrew";
        for(String peoplePlusOne : addPerson){
            System.out.println(peoplePlusOne);
        }


    }

}
