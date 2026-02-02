import java.util.Scanner;

class Games{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the week: ");
    String str = sc.next();

    
    switch (str) {
      case "Monday":
      case "monday":
        System.out.println("Basket Ball");
        break;
      case "Tuesday":
      case "tuesday":
        System.out.println("Volley ball");
        break;
      case "Wednesday":
      case "wednesday":
        System.out.println("Cricket");
        break;
      case "Thrusday":
      case "thrusday":
        System.out.println("Volley Ball");
        break;
      case "Friday":
      case "friday":
        System.out.println("Kabaddi");
        break;
      case "Saturday":
      case "saturday":
        System.out.println("Cricket");
        break;
      case "Sunday":
      case "sunday":
        System.out.println("Holiday");
        break;

      default:
        System.out.println("Invalid ouput");
        break;
    }
  }
}
