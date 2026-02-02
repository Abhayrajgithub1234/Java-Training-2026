
import java.util.Scanner;


class Gcd2{
    public static int gcd(int a, int b){
        int n1 = a, n2 = b;
        while( b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("gcd(%d, %d) = %d\n", a, b, gcd(a, b));
        System.out.printf("LCM(%d, %d) = %d\n", a, b, ((a*b)/gcd(a, b)));
    }
}
