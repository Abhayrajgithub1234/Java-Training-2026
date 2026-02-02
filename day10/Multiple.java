class Mother {
  String motherName;

  public void motherEarn() {
    System.out.println("Mother is earning..");
  }
}


class Father {
  String fatherName;
  public void earns() {
    System.out.println("Father is earning..");
  }
}

class Son extends Father extends Mother{
  int age;
  String sonName;

  Son(String sonName, String fatherName, String motherName,  int age) {
    super.name = name;
    this.age = age;
    super.motherName = motherName;
  }

  public void spend() {
    System.out.println("Son is spending..");
  }

  public void display() {
    System.out.println("Father name: "+super.fatherName);
    System.out.println("Mother name: "+super.motherName);
    System.out.println("son age: "+this.age);
    System.out.println("Mother name"+super.motherName);
  }
}

class Inheritance {
  public static void main(String[] args) {
      Son s = new Son("Son1", 13);

      s.display();
      s.earns();
      s.motherEarn();
      s.spend();

  }
}
