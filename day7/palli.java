class Main{
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 20, 10};

    int start = 0;
    int end = arr.length-1;

    while(start < end){
      if(arr[start] != arr[end]) {
        System.out.println("Not pallindrome");
        return;
      }
      start++;
      end--;
    }

    System.out.println("pallindrome");
  }
}
