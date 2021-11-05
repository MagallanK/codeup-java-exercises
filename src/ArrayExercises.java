import java.util.Arrays;

public class ArrayExercises {

    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] people, Person person1) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = person1;
        return newPeople;
    }

    public static void main(String[] args) {
//What happens when you run the following code? Why is Arrays.toString necessary?
// The system prints out the memory code not a string showing each element of the array we want to access. Arrays.toString is necessary, so we can convert the original array to a string which allows us to see the array as a whole in a string layout which is accepted by the console.

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] people;
        people = new Person[3];
        people[0] = new Person("Mag");
        people[1] = new Person("Kap");
        people[2] = new Person("Jon");

        System.out.println("Person[0] = " + people[0].getName());
        System.out.println("Person[1] = " + people[1].getName());
        System.out.println("Person[2] = " + people[2].getName());

        Person person1 = new Person("Andrew");

        Person[] people2 = addPerson(people, person1);

        for (Person person : people2) {
            System.out.printf("%s is the name called%n", person.getName());
        }
    }
}
