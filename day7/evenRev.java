class EvenRev{
    public static void main(String[] args) {
        int arr[] = {10, 5, 9, 6};

        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            while(start % 2 != 0) start++;
            while(end %2 != 0) end--;
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
