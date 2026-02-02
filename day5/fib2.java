import java.util.Scanner;


class Fib2{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        int first = 0;
        int second = 1;
        int thrid;

        System.out.print("Series: "+first+" "+second+" ");

        for(int i = 2; i<num; i++){
            thrid = first+second;
            System.out.print(thrid+" ");
            first = second;
            second = thrid;
        }
        System.out.println();
    }
}
