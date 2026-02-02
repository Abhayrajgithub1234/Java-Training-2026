abstract class Shape {
  abstract void area();
  abstract void perimeter();
}

class Circle extends Shape {
  int radius;

  Circle(int r) {
    this.radius = r;
  }
  public void area() {
    System.out.println("Area: "+(22/7)*radius*radius);
  }
  public void perimeter() {
    System.out.println("Circumference: "+(2*(22/7))*radius);
  }
}

class Rectangle extends Shape {
  int len;
  int wid;

  Rectangle(int l, int w) {
    this.len = l;
    this.wid = w;
  }
  
  public void area() {
    System.out.println("Area: "+len*wid);
  }
  public void perimeter() {
    System.out.println("perimeter: "+2*(len+wid));
  }
}

class Main1 {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(10, 20);
    Circle c = new Circle(5);

    r.area();
    c.area();

  }
}
