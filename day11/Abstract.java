abstract class Day11 {
  abstract void display();
}
class Child extends Day11 {
  void display() {
    System.out.println("Hello");
  }
}
public class Abstract {
  public static void main(String[] args) {
    Child c = new Child();

    c.display();
  }
}
