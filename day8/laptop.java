

class LaptopManufac {
    String brand;
    String name;
    double price;

    LaptopManufac() {
        System.out.println("Laptop has been created");
    }

    LaptopManufac(String name) {
        this();
        this.name = name;
    }

    LaptopManufac(String name, String brand){
        this(name);
        this.brand = brand;
    }

    LaptopManufac(String name, String brand, double price) {
        this(name, brand);
        this.price = price;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Brand: "+this.brand);
        System.out.println("price: "+this.price);
    }

}



public class laptop {
    public static void main(String[] args) {
        LaptopManufac L1 = new LaptopManufac("HPGaming");
        LaptopManufac L2 = new LaptopManufac("DellGaming", "Dell");
        LaptopManufac L3 = new LaptopManufac("AsusGame", "Asus", 150000.99);

        L1.display();
        L2.display();
        L3.display();
    }
}
