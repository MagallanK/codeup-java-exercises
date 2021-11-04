package shapes;

public class Square extends Rectangle {

//    Create a class named shapes.Square, also inside of shapes, that extends Rectangle. shapes.Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
    public int side;

    public Square(int side){
        super(side, side);
        this.length = side;
        this.width = side;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return 4 * this.length;
    }

}
