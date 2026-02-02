import java.util.Scanner;

class Cab {
  public String getType() {
    return "generic";
  }

  public void display() {
    System.out.println("Thanks for booking our cab");
  }
}

class NonAc extends Cab {
  @Override
  public String getType() {
    return "NonAc";
  }
}

class Ac extends Cab {
  @Override
  public String getType() {
    return "Ac";
  }
}

class Luxury extends Cab {
  @Override
  public String getType() {
    return "Luxury";
  }
}

public class CabDriver {
  public static void main(String[] args) {
    int choice;
    Cab cab = null;

    Scanner sc = new Scanner(System.in);

    System.out.println("1) NonAc  2) Ac  3) Luxury");
    System.out.print("Enter your choice: ");
    choice = sc.nextInt();

    switch (choice) {
      case 1:
        cab = new NonAc();
        break;
      case 2:
        cab = new Ac();
        break;
      case 3:
        cab = new Luxury();
        break;
      default:
        System.out.println("Invalid choice!");
        return;
    }

    System.out.println("Type: " + cab.getType());
    cab.display();
  }
}

