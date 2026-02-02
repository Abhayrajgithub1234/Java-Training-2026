import java.util.Scanner;


class Fib{
    
    public static int fib(int n){
        if( n == 0) return 0;
        else if( n == 1) return 1;
        else return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
    }
}
