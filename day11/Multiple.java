interface Animal {
  void sound();
  void runs();
}


abstract class Dog implements Animal {
  public  void sound() {
    System.out.println("Bow...Bow...");
  }
}
class Puppy extends Dog {
  public  void runs() {
    System.out.println("Runs with 4 legs....");
  }
}

class Multiple {
  public static void main(String[] args) {
    Puppy p = new Puppy();

    p.sound();
    p.runs();
  }
}
