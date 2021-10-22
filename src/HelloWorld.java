public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World! ");

        //Lesson Syntax, Types, and Variables Exercise.
        //Exercise # 1 & 2- below
        int myFavoriteNumber = 23;
        String myString = " Here is a test string.";
        System.out.println(myFavoriteNumber);
        System.out.println(myString);

        //Exercise # 3- IntelliJ yells at you saying there are too many characters in character literal
        //Exercise # 4- IntelliJ says that the number is not a string

//        float myNumber = (float) 3.14;
//        System.out.print(myNumber);

        //Exercise # 5- When ran "java: variable myNumber might not have been initialized. Prevents rest of code from executing as well.
        //Exercise # 6- "java: incompatible types: possible lossy conversion from double to long. Will not work since long is for integers and not for floating-point numbers
        //exercise # 7- When myNumber has the integer value, the single L at the end does not print, but the integer value 123 does.
        //Exercise # 8- Will not work since long is for integers and not for floating-point numbers (numbers with decimal values)
        //Exercise # 9- "java: incompatible types: possible lossy conversion from double to float". Float works with decimal numbers as well, but on 1 value after the decimal. One way to fix this would be to explicit cast

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //Exercise # 10- The only difference I see is the post and pre decrement which still give the same results when printed to the console.

//        String class ="This is the variable with name of class";
        //Exercise # 11- This does not work because the 'class' is part of the object used in java and there can only be one class per java source file.
        //Exercise # 12- I think when the code below runs it will show the string "three" since the o is the object and takes in the string theNumberThree, which is then passed to the object o, which is then passed to the int three, which is explicit cast, but no int value is being shown only passed the object which is a string.
        //Result of #12- The code did not execute and returned this message: "Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:39)"

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
        //Exercise # 12 second c&p code block - intelliJ says that int cannot be passed because int does not accept a string value. and referred as an inconvertible type. The two different types of errors we see are incompatible and inconvertible types, both resulting in not allowing int to pass a string value.

        //Exercise # 13- below creating shorthand assignment will comment the original to show changes.
//        int x = 4;
////        x = x + 5; this is the original. double commented out since x is declared already.
//        x += 5;  this is the shorthand assignment for the x = x + 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x; this is the original.
//        y *= x;  this is the shorthand assignment for the y = y * x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y; this is the original. value of 5. shorthand method below
        x /= y;
//        y = y - x; this the original. value of -3. shorthand method below
        y -= x;

        System.out.println("#13 Here is the last code block value of x: " + x);
        System.out.println("#13 Here is the last code block value of y: " + y);

        //Exercise # 14 Question brought over - What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        //Exercise # 14 my answer/take for 1st question - If you assign a value to a numerical variable that is larger (or smaller) than the type it can hold, you will get errors in your program when it runs stating that the value is not compatible, and intelliJ will give a suggestion to use a certain type of identifier/type.
        //Exercise # 14 my answer/take for 2nd question - If you increment a numeric value past the type's capacity you would get an error when running the program because it will again exceed the limit of that current identifier/type that you may want to use, and you might have to use a different data type.
    }
}