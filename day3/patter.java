class Pattern{
  public static void main(String args[]) {
    
    int n = 5;
    /*
     patter 1=
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
      int num = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        num++;

        if (num < 10) {
          System.out.print(" " + num + " ");
        } else {
          System.out.print(num + " ");
        }
      }
      System.out.println();
    }
    System.out.println("\n");
    /*
        1  2  3  4  5
     1  A  3  4  5  6
     2  3  B  5  6  7 
     3  4  5  C  7  8
     4  5  6  7  D  9
     5  6  7  8  9  E
     */

    char c = 65;
    

    for(int i=0; i<n; i++){
      num = i+2;
      for(int j=0; j<n; j++){
        if(i==j){
          System.out.print(c++ + " ");
          num++;
        }else{
          System.out.print(num++ + " ");
        }

      }System.out.println();
    }
     
  }
}
