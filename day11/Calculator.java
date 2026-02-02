abstract class Calc {
  abstract int add(int a, int b);
  abstract int sub(int a, int b);
}

class Calci extends Calc {
  int add(int a, int b) {
    return a+b;
  }
  int sub(int a, int b) {
    return a-b;
  }
  double square(int a) {
    return a*a;
  }
}

class Calculator {
  public static void main(String[] args) {
    Calci c = new Calci();

    System.out.println("SUM: "+c.add(10, 20));
    System.out.println("SUB: "+c.sub(20, 10));
    System.out.println("square: "+c.square(10));
  }
}
