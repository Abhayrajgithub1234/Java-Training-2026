import java.util.Scanner;

class IsVowel{
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);

   String input = sc.next();
   char alpha = input.charAt(0);

   switch(alpha){
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':
        System.out.println("Vowel");
        break;
      default:
        System.out.println("Consonant");
        break;
   }
  }
}
