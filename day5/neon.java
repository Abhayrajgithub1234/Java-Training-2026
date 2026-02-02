import java.util.Scanner;

class Neon{
    public static boolean isNeon(int num) {
        int square = num*num;
        int sum = 0;

        for(int i = square; i>0; i/=10) sum += i%10;

        return sum == num;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isNeon(num)?"Is neon":"Not Neon");
    }
}
