class Trainer {
  static String companyName = "QSpider";
  static {
    System.out.println("Hi");
  }
}

class Student {
  String collegeName = "VCET";
  {
    System.out.println("Student create");
  }
}

public class Initializer {
  private static void display() {
    System.out.println("Abhayraj");
  }
  static{
    display();
  }

  public static void main(String[] args) {
    Student s = new Student();
    Trainer t = new Trainer();
    int a = 6;
    int b = 9;

    System.out.println(a+b);
    System.out.println("Hello");
  }
}
