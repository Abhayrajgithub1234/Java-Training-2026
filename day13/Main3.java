


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.NoSuchElementException;

class Main3 {
  public static void main(String[] args) {

    ArrayList<String> arr = new ArrayList<>();
    arr.add("Name1");
    arr.add("Name2");
    arr.add("Name3");
    arr.add("Name4");
    arr.add("Name5");

    ArrayList<String> arr2 = new ArrayList<>();
    arr2.add("number1");
    arr2.add("number2");

    ArrayList<String> arr3 = new ArrayList<>();
    arr3.addAll(arr);
    arr3.addAll(arr2);
    
    //Prints all the arr3 elements with its value (since the arr3 is string value itself so no need to override toString())
    //System.out.println(arr3);

    Iterator<String> i = arr3.iterator();
    ListIterator<String> l = arr3.listIterator(arr3.size());
    //This is to print the forward 
    while (i.hasNext()) {
      System.out.println(i.next());
    }
    //This is print Backward
    System.out.println("Backward iterator");
    while(l.hasPrevious()) {
      System.out.println(l.previous());
    }

    //To handle the exception

    /*try {
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next());
      System.out.println(i.next()); // will cause exception here
    } catch (NoSuchElementException e) {
      System.out.println("No more elements in iterator");
    }

    // Create a new iterator again because old one is already finished
    i = arr3.iterator();*/

    //This is to have a loop without creating the iterator object.
    /*for (String var : arr3) {
      System.out.println(var);
    }*/

    //This is advanced for loop and we can have either Object type or the exact type
    System.out.println("Using advanced for loop");
    for(String var: arr3) {
      System.out.println(var);
      System.out.println(var.length());
    }
    
    System.out.println("Using get()");
    for(int k=0; k<arr3.size(); k++) {
      System.out.println(arr3.get(k));
    }


  }


}
