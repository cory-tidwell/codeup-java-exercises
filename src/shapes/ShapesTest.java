package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        myShape.getPerimeter();
        Measurable myShape2 = new Rectangle(4, 5);
        myShape2.getPerimeter();
        System.out.println();

//            Square test = new Square();
//            test.Square(4);
//            test.getArea();
//            test.getPerimeter();
//
//        Rectangle box1 = new Rectangle();
//        box1.Rectangle(5,4);
//        box1.getArea();
//        box1.getPerimeter();
//
//        Rectangle box2 = new Square();
//        box2.Rectangle(5,5);
//        box2.getPerimeter();
//        box2.getArea();

        }
    }

