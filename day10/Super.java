class Parent {
  String name = "Father";
}

class Child extends Parent {
  String name = "child";

  void display() {
    String name = "sibling";
    System.out.println("sibling: "+name);
    System.out.println("Parent: "+super.name);
    System.out.println("Child: "+this.name);
  }
}

class Super {
  public static void main(String[] args) {
    Child c = new Child();
    c.display();
  }
}
