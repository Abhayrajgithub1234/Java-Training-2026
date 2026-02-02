import java.util.Scanner;

class Auto{
  public static boolean isAuto(int num) {
      int square = num*num;
      int mod1, mod2;
      while(num > 0){
        mod1 = square%10;
        mod2 = num%10;
        if(mod1 != mod2){
          return false;
        }
        num /= 10;
        square /= 10;
      }
      return true;
  }

  public static void main(String args[]) {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      num = sc.nextInt();
      System.out.println(isAuto(num)?"is Automorphic":"not Automorophic");
  }
}
