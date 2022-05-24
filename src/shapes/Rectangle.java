package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        System.out.println(area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * this.length + 2 * this.width;
        System.out.println(perimeter);
        return perimeter;
    }

}
