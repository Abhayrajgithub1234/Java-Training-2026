import java.util.Scanner;

class test2{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    if(age <= 0){

      if(age <= 12){
        System.out.println("Child");
      }else if(age <= 19){
        System.out.println("Teenage");
      }else if(age <= 40){
        System.out.println("mid age");
      }else {
        System.out.println("old age");
      }
    }else{
      System.out.println("Enter a vaild age");
    }
    
  }
}
