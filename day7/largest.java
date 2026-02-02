class Largest{
  public static void main(String[] args) {
    int arr[][] = {{9, 4, 6}, {7, 2, 8}, {3, 4, 2}, {11, 12, 13}};

    int res[] = new int[arr.length];

    for(int i=0; i<arr.length; i++){
      int max = Integer.MIN_VALUE;
      for(int j=0; j<arr[0].length; j++){
        if(max < arr[i][j]) max = arr[i][j];
      }
      res[i] = max;
    }

    for(int i=0; i<res.length; i++){
      System.out.print(res[i]+" ");
    }
    System.out.println();
  }
}
