import java.util.Scanner;

class Salary{
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the B.S");
    double salary = sc.nextDouble();
    double hra = 0.0, da = 0.0;

    if(salary < 0){
      System.out.println("incorrect salary");
      return;
    }

    if(salary <= 10000){
      hra = (salary*0.2);
      da = (salary*0.8);
    }else if(salary <= 20000){
      hra = (salary*0.25);
      da = (salary*0.9);
    }else{
      hra = (salary*0.3);
      da = (salary*0.95);
    }
    
    double GrossSalary = salary+hra+da;

    int curYear, joiningYear;

    System.out.println("Enter the curYear and joiningYear: ");
    curYear = sc.nextInt();
    joiningYear = sc.nextInt();

    if(curYear < joiningYear){
      System.out.println("incorrect year");
      return;
    }

    if(curYear - joiningYear > 3){
      GrossSalary += 2500;
    }

    System.out.println("Gross Salary: "+GrossSalary);
  }
}
