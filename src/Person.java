import util.Input;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name =  name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("This is the person's name = " + this.name);
    }

    public static void main(String[] args) {

//        Person mag = new Person("Kapena");
//        String magName = mag.getName();
//        System.out.println("magName = " + magName);
//
//        mag.setName("Andrew");
//        mag.sayHello();



//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //Returns true and false because .equals returns boolean.
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John"); //Returns John twice since person2 is person1 and person1 was assigned "John"
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //Returns John since person 2 is person1.
//        System.out.println(person2.getName()); //Returns John since person 2 is person1.
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Returns Jane since person2 was set to "Jane" and person2 is person1.
//        System.out.println(person2.getName()); //Returns Jane since person2 was set to "Jane" and person2 is person1.




    }

}
