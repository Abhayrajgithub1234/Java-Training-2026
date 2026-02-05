
//Implementation of ArrayList() => delete / remove the elements.
//  1. remove(index) -> based on index
//  2. remove(object) -> based on object

import java.util.ArrayList;

class Main1 {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<String> arr2 = new ArrayList<>();

    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    arr.add(60);
    arr.add(70);
    arr.add(80);
    arr.add(90);
    arr.add(100);

    arr2.add("name1");
    arr2.add("name2");
    arr2.add("name3");
    arr2.add("name4");
    arr2.add("name5");
    arr2.add("name6");

    //Integer ele = 50;

    System.out.println(arr);

    arr.remove((Integer)50);

    System.out.println(arr);
    System.out.println();

    System.out.println(arr2);

    arr2.remove("name4");
    System.out.println(arr2);
  }
}
