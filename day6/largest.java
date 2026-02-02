class Largest{
  public static void main(String[] args) {
      int arr[] = {7, 7, 7, 7, 7, 7};

      int largest = arr[0], second = arr[0];

      for(int i=0; i<arr.length; i++){
          if(arr[i] > largest){
              second = largest;
              largest = arr[i];
          }else if(arr[i] > second && arr[i] != largest){
              second = arr[i];
          }
          
         
        
      }

      System.out.println("Largest: "+largest+" second: "+second);
  } 
}
