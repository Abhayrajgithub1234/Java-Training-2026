import java.util.Scanner;

class Strong{
  public static boolean isStrong(int num){
      int sum = 0;

      for(int i = num; i > 0; i/=10){
          
          int fact = 1;
          for(int j = i%10; j > 0; j--) fact *= j;

          sum+=fact;
      }

      if(sum == num) return true;
      else return false;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number: ");
      int num = sc.nextInt();

      System.out.println(isStrong(num)?"Is Strong":"Not Strong");
  }
}
