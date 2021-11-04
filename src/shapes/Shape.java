package shapes;

//Create an abstract Shape class inside of the shapes directory.
abstract class Shape{

}

//# 9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
// The code fails to compile because the getPerimeter method in Rectangle is extending off the Quadrilateral class and also implementing the Measurable class which the Measurable class has the getPerimeter method which trickles down to Rectangle.

//# 10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//IntelliJ will not let you resolve this since the getLength or getWidth methods do not exist in the Measurable class which again trickles down to the Quadrilateral class and then into the square and rectangle classes. Since these methods do not exist in the Measurable class they cannot be called when we want to test in the ShapesTest class.
