package app;

import app.utils.*;
import assets.Truck;


public class Main {
    public static void main(String[] args) {
        Helper.log("Abhayraj");
        Car c1 = new Car("Zen", "Maruthi", "122B006", 34987599);
        Truck t1 = new Truck("Truck1", "Benz", "900BG231", 5000000);

        c1.testDrive();
        c1.stop();

        t1.testDrive();
        t1.stop();
    }
}