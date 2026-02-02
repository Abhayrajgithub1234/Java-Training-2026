import java.util.Scanner;

class Cab {

  public void display() {
    System.out.println("Thanks for booking our cab");
  }
}

class NonAc extends Cab {
  String type = "Non Ac";
}

class Ac extends Cab {
  String type = "Ac";
}

class Luxury extends Cab {
  String type = "Luxury";
}

public class DownCasting {
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

    if(cab instanceof NonAc) {
      NonAc typ = (NonAc)cab;
      System.out.println("Type: "+typ.type);
    }else if(cab instanceof Ac) {
      Ac typ = (Ac)cab;
      System.out.println("Type: "+typ.type);
    }else {
      Luxury typ = (Luxury)cab;
      System.out.println("Type: "+typ.type);
    }


    cab.display();
  }
}
