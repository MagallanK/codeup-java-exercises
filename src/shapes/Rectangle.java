package shapes;

public class Rectangle {

//    Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:

        protected int length;
        protected int width;

        public Rectangle() {
        }

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }


        //Method 1:
        public int getArea() {
            return this.length * this.width;
        }

        //Method 2:
        public int getPerimeter() {
            return (2 * this.length) + (2 * this.width);
        }

    }
