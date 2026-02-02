class A {
  int a;
  int b;
  A(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void work () {
    System.out.println("This this class A");
  }
}

class B extends A{
  int b;
  B(int a, int b) {
    super(a, b);
    this.b = b;
  }

  @Override
  public void work() {
    System.out.println("This is class B");
  }
}

class UpcastingSingle {
  public static void main(String[] args) {
    A a;
    B b = new B(10, 20);
    a = b;
    //System.out.println("b: "+a.b); Here b is inaccessiable only possible when methods are overridden
    System.out.println("a: "+a.a);
    System.out.println("b: "+a.b);
    a.work();
  }
}
