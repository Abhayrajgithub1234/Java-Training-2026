class SelectionSorting {
  public static void Sort(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      int min = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }

    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {10, 9, 50, 23, 7};

    System.out.println("Unsorted array: ");
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
    System.out.println("sorted array: ");
    Sort(arr);
  }
}
