class Father {
  String name;
  public void earns() {
    System.out.println("Father is earning..");
  }
}

class Son extends Father{
  int age;

  Son(String name, int age) {
    super.name = name;
    this.age = age;
  }

  public void spend() {
    System.out.println("Son is spending..");
  }

  public void display() {
    System.out.println("Name: "+super.name);
    System.out.println("age: "+this.age); 
  }
}

class Inheritance {
  public static void main(String[] args) {
      Son s = new Son("Son1", 13);

      s.display();
      s.earns();
      s.spend();

  }
}
