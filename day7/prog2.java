class Prog2{
    public static void main(String[] args) {
        int arr[] = {10, 5, 9, 6};

        int start = 0;
        int mid = (start+arr.length-1)/2;
        int end = mid;

        while(start < mid){
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");

        System.out.println();
    }
}
