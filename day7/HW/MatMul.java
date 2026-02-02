class MatMul{
  public static void main(String[] args) {
    int a[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
    int b[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};


    int c[][] = new int[a.length][a[0].length];

    for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                for(int k = 0; k < a.length; k++) { 
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
    }
        for(int i=0; i<c.length; i++) {
          
          for(int j = 0; j<c[0].length; j++) {
              System.out.print(c[i][j]+" ");
          }
          System.out.println();
        }
    
  }
}
