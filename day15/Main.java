interface Shape {
  void area ();
}

class Rectangle implements Shape {
  int length;
  int breadth;

  Rectangle(int len, int bre) {
    this.length = len;
    this.breadth = bre;
  }
  
  @Overriding
  public void area() {
    System.out.println("Area: "+(double)(this.length+this.breadth));
  }
}

class Triangle implements Shape {
  int base;
  int height;
  Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  @Overriding
  public void area () {
    System.out.println("Area: "+(double)((0.5)*base*height));
  }
}

class Main {
  public static void main(String[] args) {

    Shape sh = new Shape();
    Rectangle rc = new Rectangle(10, 20);
    Triangle tr = new Triangle(6, 3);
    sh = rc;
    sh.area();
    sh = tr;
    sh.area();
  }
}
