
import java.util.Scanner;

class Notes{
  public static void main(String args[]) {
    int count = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the amount: ");
    int amount = sc.nextInt();

    
    int notes[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
//    int i = 0;

    for(int i=0; i<notes.length; i++){
      if(amount >= notes[i]){
        count += amount/notes[i];
        amount = amount%notes[i];
      }
    }
    System.out.println("count: "+count);
  }
}
