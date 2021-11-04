package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        //Declare a variable of the type Measurable named myShape.
        //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

        Measurable myShape = new Rectangle(5,4);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

        Measurable myShape2 = new Square(5);
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
        System.out.println("myShape2.getArea() = " + myShape2.getArea());

        //--------------------------------------------------------------------------------------------
        //Test your code by creating a new class, shapes.ShapesTest (also inside of shapes) with a main method. Inside the main method,
        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());

//create a variable of the type Rectangle named box2 and assign it a new instance of the shapes.Square class that has a side value of 5.
//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//        Rectangle box2 = new shapes.Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
//In the shapes.Square class, override the getArea and getPerimeter methods with the following definitions for a square

    }
}
