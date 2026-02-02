import java.util.Scanner;


class Calc{
  
  public static void add(int a, int b){
    System.out.println(a+b);
  }
  public static void sub(int a, int b){
    System.out.println(a-b);
  }
  public static void mul(int a, int b){
    System.out.println(a*b);
  }
  public static void div(int a, int b){
    if(b>0)
      System.out.println(a/b);
    else
      System.out.println("Divide by zero execption");
  }

  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the expression: ");
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();

      switch(op){
        case "+":
          {
            add(a, b);
            break;
          }

        case "-":
          sub(a, b);
          break;
        case "*":
          mul(a, b);
          break;
        case "/":
          div(a, b);
          break;
        default:
          System.out.println("Invalid expression");
          break;
      }

  }
}
