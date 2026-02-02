

import java.util.Scanner;

class Divide{
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);

   int num = sc.nextInt();

   System.out.println((num%5==0 && num%11==0)?"Yes":"No");
  }
 
}
