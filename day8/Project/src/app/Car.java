package app;

public class Car {
    String name;
    String brand;
    String modelNo;
    double price;

    public Car(String name, String brand, String modelNo, double price) {
        this.name = name;
        this.brand = brand;
        this.modelNo = modelNo;
        this.price = price;
    }

    public void testDrive() {
        System.out.println("Driving..");
    }

    public void stop() {
        System.out.println("Stoped..");
    }

}
