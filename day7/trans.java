class Trans{
  public static void main(String[] args) {
    int[][] a = {{2, 3, 4}, {5, 6, 9}};
    int[][] res = new int[a[0].length][a.length];

    for(int i=0; i<res.length; i++){
      for(int j=0; j<res[0].length; j++){
        res[i][j] = a[j][i];
      }
    }

    for(int i=0; i<res.length; i++){
      for(int j=0; j<res[i].length; j++){
        System.out.print(res[i][j]+" ");
      }
      System.out.println();
    }
  }
}
