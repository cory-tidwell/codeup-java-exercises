package shapes;

public class ShapesTest {
    public static void main(String[] args) {

            Square test = new Square();
            test.Square(4);
            test.getArea();
            test.getPerimeter();

        Rectangle box1 = new Rectangle();
        box1.Rectangle(5,4);
        box1.getArea();
        box1.getPerimeter();

        Rectangle box2 = new Square();
        box2.Rectangle(5,5);
        box2.getPerimeter();
        box2.getArea();

        }
    }

