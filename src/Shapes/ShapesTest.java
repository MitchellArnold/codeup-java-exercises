package Shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());

//        Rectangle box2 = new Square(5);

        myShape = new Rectangle(3,7);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
        
        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
