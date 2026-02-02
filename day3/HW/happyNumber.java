import java.util.Scanner;

class HappyNumber{
    public  static boolean isHappy(int num){
        
        while(true){
            switch(num) {
                case 1:
                    return true;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                    return false;
            }
            int sum = 0;
            for(int i = num; i > 0; i /= 10) sum += Math.pow(i%10, 2);

            num = sum;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isHappy(num)?"is happy":"not Happy");
    }
}
