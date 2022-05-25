package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }


    public double getPerimeter() {
        double perimeter = (2*length)+(2*width);
        System.out.println("The perimeter is "+perimeter+".");
        return perimeter;
    }

    public double getArea() {
        double area = length*width;
        System.out.println("The area is "+area+".");
        return area;
    }


    @Override
    public void setLength(int len) {

    }

    @Override
    public void setWidth(int wid) {

    }

//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
}
