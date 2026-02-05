//Sorting Collections using Collections

import java.util.Collections;
import java.util.ArrayList;

class Main4{
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();

    arr.add(10);
    arr.add(20);
    arr.add(100);
    arr.add(40);
    arr.add(50);
    arr.add(21);
    arr.add(70);
    arr.add(33);
    arr.add(90);

    Collections.sort(arr);
    System.out.println(arr);
  }
}
