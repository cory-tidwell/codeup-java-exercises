public class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";

//    void drive() {
//        System.out.println("You drive the car");
//    }
//    void brake() {
//        System.out.println("You step on the brakes!");
//    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
