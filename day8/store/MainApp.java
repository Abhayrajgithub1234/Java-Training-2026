package store;

import factory.Car;

public class MainApp{
    public static void main(String[] args) {
        Car c1 = new Car("Zen", "Maruthi", 10001, (float) 1056.22);

        c1.display();
        c1.run();
        c1.stop();
    }
}





