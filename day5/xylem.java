import java.util.Scanner;

class Xylem{

    public static boolean isXylem(int num){
        int e2 = num%10;
        int mid = 0;

        num /= 10;

        while(num > 0){
            if(num/10 != 0) {
                mid += num%10;
                num /= 10;
            }else{
                break;
            }
        }
        int e1 = num;

        if(e1+e2 == mid) return true;
        else return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println(isXylem(num)?"is Xylem":"is Pholem");
    }
}
