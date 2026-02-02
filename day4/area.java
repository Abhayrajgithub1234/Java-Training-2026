import java.util.Scanner;


class Area{
  public static double area(double radius){
    return ((22/7)*radius*radius);
  }

  public static void main(String args[]) {
    System.out.println("Enter the radius: ");
    Scanner sc = new Scanner(System.in);

    double radius = sc.nextDouble();

    double result = area(radius);

    System.out.println("Area: "+result);
  }
}
