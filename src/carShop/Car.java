package carShop;

public class Car extends Customer {
    String make = "Chevrolet";
    String model = "Corvette";
    String color = "blue";
    int year = 2022;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String fName, String lName, String make, String model, String color, int year) {
        super(fName, lName);
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
