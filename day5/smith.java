import java.util.Scanner;

class Smith {

    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isSmith(int num) {
        int original = num;

        int sumD = 0;
        int sumP = 0;

        for (int i = num; i > 0; i /= 10) sumD += i % 10;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                if (prime(i)) {
                    for (int j = i; j > 0; j /= 10) sumP += j % 10;
                    num /= i;
                }
            }
        }

        return sumD == sumP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (prime(num)) {
            System.out.println("Enter a composite number");
            return;
        }

        System.out.println(isSmith(num) ? "is Smith" : "not Smith");
    }
}
