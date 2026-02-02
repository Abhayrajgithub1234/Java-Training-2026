import java.util.Scanner;
class Jagged {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
      
        /*

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array for 3*n format: ");
        
        for(int i=0; i< arr.length; i++) {
          System.out.printf("Enter the %d col len: ", i+1);
          int colLen = sc.nextInt();
          arr[i] = new int[colLen];
          for(int j = 0; j< colLen; j++) {
              arr[i][j] = sc.nextInt();
          }
          System.out.println();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
