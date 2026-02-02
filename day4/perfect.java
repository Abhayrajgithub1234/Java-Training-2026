import java.util.Scanner;

class Perfect{

  public static boolean perfect(int num){
    int sum = 0;
    for(int i=1; i<num; i++){
      if(num%i == 0) sum += i;
    }

    if(sum == num) return true;
    else return false;
  }
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();
  
    System.out.println(perfect(number) == true?"Is perfect":"not perfect");
    
  }
}
