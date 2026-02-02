class Example {
  private int name;
  public void setter(int name) {
     this.name = name; 
  }
  public int getter() {
    return this.name;
  }
}

class Encapsulation {
  public static void main(String[] args) {
      Example ex = new Example();

      ex.setter(10);

      System.out.println("Your name: "+ex.getter());


  }
}
