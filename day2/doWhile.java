import java.util.Scanner;

class Dowhile{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String res;
    do {
     System.out.println("Welcome");
     System.out.println("Do you want welcome once more: ");
     res = sc.next();
    } while (res.equals("Yes"));

    System.out.println("Thank you");
  }
}
