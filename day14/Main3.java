
//Here removing multiple elements
//  1. removeAll()
//  2. retainAll()
//  3. clear()

import java.util.ArrayList;

class Main3 {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();

    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    arr.add(60);
    arr.add(70);
    arr.add(80);
    arr.add(90);
    arr.add(100); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

    arr2.add(10);
    arr2.add(20);
    arr2.add(30);
    arr2.add(40);
    arr2.add(75);
    arr2.add(69);//[10, 20, 30, 40, 75, 69]

    System.out.println(arr);
    System.out.println(arr2);

    //arr.removeAll(arr2); arr = [50, 60, 70, 80, 90, 100] ; arr2 unchanged
    arr.retainAll(arr2); // arr = [10, 20, 30, 40] ; arr2 unchanged
    arr.clear(); //arr = []

    System.out.println(arr);
    System.out.println(arr2);
   


  }
}
