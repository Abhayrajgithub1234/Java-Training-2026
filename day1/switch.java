import java.util.Scanner;

class Switch {
  public static void main(String args[]) {
    int number;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    
    number = sc.nextInt();

    switch (number%2) {
      case 0:
        System.out.println("Even");
        break;
      case 1:
        System.out.println("Odd");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thrusday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;

      default:
        System.out.println("Invalid ouput");
        break;
    }
  }
}
