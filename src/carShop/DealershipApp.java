package carShop;

import ObjectsAndClasses.House;


public class DealershipApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Cory", "Tidwell");
        Car newCar = new Car(newCustomer.getFirstName(), newCustomer.getLastName(), "Chevy", "Corvette", "red", 2022);
        newCustomer.describe(String.format("Hello"));
//        System.out.println(newCustomer.describe(String.format("Hello there %s %s, it looks like your %s, %s, %s, %s is ready to go!", newCustomer.getFirstName(), newCustomer.getLastName(), newCar.getColor(), newCar.getYear(), newCar.getMake(), newCar.getModel())));
    }
}
