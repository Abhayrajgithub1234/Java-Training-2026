import java.util.Arrays;

class Main{


  public static void linearSearch(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == target){
        System.out.printf("Element found in %d position\n", i+1);
        return;
      }
    }
    System.out.println("Search failed");
    
  }

  public static void BinarySearch(int arr[], int target) {
    int start = 0;
    int end = arr.length-1;
    while(start<=end) {
      int mid = start + (end-start) / 2;
      if(arr[mid] == target){
        System.out.printf("Element found at index: %d \n", mid+1);
        return;
      }else if(arr[mid] > target){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }

    System.out.println("Search failed");
  }


  public static void main(String[] args) {
    int arr[] = {5, 9, 4, 3};
    int sarr[] = {1, 2, 3, 4, 5};
    int target = 4;

    linearSearch(arr, target);
    BinarySearch(sarr, target);

  }
}
