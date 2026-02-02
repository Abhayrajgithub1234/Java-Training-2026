import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        /*
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         */
        /*int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for rows, cols: ");
        n = sc.nextInt();
        m = sc.nextInt();
*/
        
        int[][] arr1 = {{1, 6, 5}, {7, 2, 4}, {9, 8, 3}};
        int[][] arr2 = {{8, 3, 4}, {2, 7, 5}, {0, 1, 6}};
        int[][] arr3 = new int [3][3];
        //System.out.println("Enter the elements");

        //for(int i=0; i<n; i++) {
          //for(int j = 0; j<m; j++) {
              //arr[i][j] = sc.nextInt();
          //}
        //}

        //Add
        for(int i=0; i<arr1.length; i++){
          for (int j = 0; j<arr1[i].length; j++){
              arr3[i][j] = arr1[i][j] + arr2[i][j];
          }
        }

        for(int i=0; i<arr3.length; i++) {
          for(int j = 0; j<arr3.length; j++) {
              System.out.print(arr3[i][j]+" ");
          }
          System.out.println();
        }


    }
}
