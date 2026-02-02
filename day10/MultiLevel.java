class GrandFather {
  int property;

  public void buiness() {
    System.out.println("Working..");
  }
}

class Father extends GrandFather {
  String name;
  public void earns() {
    System.out.println("Father is earning..");
  }
}

class Son extends Father{
  int age;

  Son(String name, int age, int property) {
    super.name = name;
    this.age = age;
    this.property = property;
  }

  public void spend() {
    System.out.println("Son is spending..");
  }

  public void display() {
    System.out.println("Name: "+super.name);
    System.out.println("age: "+this.age);
    System.out.println("property: "+this.property);
  }
}

class MultiLevel {
  public static void main(String[] args) {
      Son s = new Son("Son1", 13, 5000);

      s.display();
      s.earns();
      s.spend();
      s.buiness();

  }
}
