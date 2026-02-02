interface  Parent {
  void display();
}

class Child implements Parent {
  public  void display() {
    System.out.println("Iam Child");
  }
}

class Interface {
  public static void main(String[] args) {
    Child c = new Child();
    c.display();
  }
}
