class Shape {
    private int sides;

    Shape() {
        this(0); 
    }

    Shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void area() {
        System.out.println("Area not defined for generic Shape");
    }

    public void whichShape() {
        System.out.println("Shape with " + sides + " sides");
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    Rectangle() {
        this(0, 0); 
    }

    Rectangle(int length, int breadth) {
        super(4); 
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    @Override
    public void whichShape() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    Triangle() {
        this(0, 0);
    }

    Triangle(int base, int height) {
        super(3); 
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }

    @Override
    public void whichShape() {
        System.out.println("Triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle(10, 20);
        s.whichShape();
        s.area();

        s = new Triangle(10, 20);
        s.whichShape();
        s.area();

        Shape s2 = new Rectangle();
        s2.whichShape();
        s2.area();
    }
}
