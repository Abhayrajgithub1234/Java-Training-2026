class Parent {
  public void display() {
    System.out.println("We are doing business..");
  }
}

class Child extends Parent {
  @Override
  public void display() {
   System.out.println("I am good for nothing"); 
  }
}

class Driver {
  public static void main(String[] args) {
    Parent p = new Parent();
    p.display();
    p = new Child();
    p.display();
  }
}

