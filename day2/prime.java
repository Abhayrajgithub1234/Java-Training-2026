import java.util.Scanner;

class Prime{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    System.out.println("Enter the number: ");
    num = sc.nextInt();
    boolean isPrime = true;

    for(int i=2; i*i<=num; i++)
      if(num%i == 0)
      {
        System.out.println("Not Prime");
        return;
      }
    System.out.println("Prime");
  }
}
