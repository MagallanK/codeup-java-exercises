package shapes;

//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

//--------------------------------------------------------------
//    Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:

//        protected int length;
//        protected int width;
//
//        public Rectangle() {
//        }
//
//        public Rectangle(int length, int width) {
//            this.length = length;
//            this.width = width;
//        }
//
//
//        //Method 1:
//        public int getArea() {
//            return this.length * this.width;
//        }
//
//        //Method 2:
//        public int getPerimeter() {
//            return (2 * this.length) + (2 * this.width);
//        }


    }
