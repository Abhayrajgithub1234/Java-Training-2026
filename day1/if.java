import java.util.Scanner;

class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total amount: ");
        double amount = sc.nextDouble();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age > 12 && age < 20) {
            amount = amount - (amount * 0.05);   

            if (amount > 5000) {
                amount = amount - (amount * 0.05);  
            }

        } else if (age <= 29) {
            amount = amount - (amount * 0.06);  

            if (amount > 4000) {
                amount = amount - (amount * 0.06); 
            }

        } else {
            amount = amount - (amount * 0.15);   
        }

        System.out.println("Your bill amount: " + amount);
        sc.close();
    }
}
