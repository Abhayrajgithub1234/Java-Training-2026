class Main{
    public static int digits(int num) {
      int sum = 0;
      for (int i = num; i > 0; i/=10) {
        sum += i%10;
      }

      return sum;
    }

    public static void main(String[] args) {
      int arr[] = {31, 45, 22, 1, 100, 234};

      for (int i = 0; i < arr.length; i++) {
        System.out.print(digits(arr[i])+" ");
      }

      System.out.println();
    }
}
