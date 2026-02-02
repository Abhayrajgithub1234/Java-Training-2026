class Main{
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50, 60};

    int start = 0;
    int end = arr.length-1;

    while(start < end){
      if(start % 2 !=0){
        int temp = arr[start];
        arr[start] = arr[start+1];
        arr[start+1] = temp;
        
      }
      start++;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
