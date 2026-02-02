class Engine {
  int hp;
}

class Car {
  Engine e;
  public void createEngine() {
    if(e == null) e= new Engine();
  }
}

class Lazy {
  public static void main(String[] args) {
    Car c = new Car();
    c.createEngine();
    System.out.println("HP: "+c.e.hp);
  }
}
