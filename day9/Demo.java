class Engine {
  String brand;
}

class Bike {
  Engine e = new Engine();
}

class Demo {
  public static void main(String[] args) {
    Bike b = new Bike();
    b.e.brand = "Java";

    System.out.println("Name: "+b.e.brand);
  }
}
