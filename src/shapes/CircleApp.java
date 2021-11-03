package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter a radius for a circle: ");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);

        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("The radius of the circle is %f \n", radius);
        System.out.printf("The circle's circumference is %f\n", circumference);
        System.out.printf("The circle's area is %f \n", area);

    }

}
