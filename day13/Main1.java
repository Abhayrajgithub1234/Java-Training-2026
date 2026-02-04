//Implementation of ArrayList()

import java.util.ArrayList;

class Main1 {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    arr.add(10);

    arr.add(4, 40);

    System.out.println(arr);
  }
}
