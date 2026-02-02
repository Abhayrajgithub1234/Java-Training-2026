import java.util.Scanner;

class Print{
    public static void main(String[] args) {
        /*
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         */
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for rows, cols: ");
        n = sc.nextInt();
        m = sc.nextInt();

        
        int[][] arr = new int[n][m];
        
        System.out.println("Enter the elements");

        for(int i=0; i<n; i++) {
          for(int j = 0; j<m; j++) {
              arr[i][j] = sc.nextInt();
          }
        }
        for(int i=0; i<n; i++) {
          for(int j = 0; j<m; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
        }


    }
}
