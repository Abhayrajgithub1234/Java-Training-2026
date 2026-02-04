// Searching in ArrayList

import java.util.ArrayList;
import java.util.ListIterator;

class Employee{
  long ssn;
  String name;
  int age;
  double salary;

  Employee(long ssn, String name, int age, double salary) {
    this.ssn = ssn;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String toString() {
    String res = "Name: "+this.name+" SSN: "+this.ssn+" age: "+this.age+" salary: "+this.salary;
    return res;
  }

  public boolean equals(Object o) {
    Employee e = (Employee)o;
    return this.ssn == e.ssn && this.name.equals(e.name) && this.age == e.age && this.salary == e.salary;
  }

}

class Main4{
  public static void main(String[] args) {
    ArrayList<Employee> arr = new ArrayList<>();

    arr.add(new Employee(10001, "Abhayraj", 21, 2000000));
    arr.add(new Employee(10002, "raj", 22, 200000));
    arr.add(new Employee(10003, "Abhay", 20, 3000000));
    arr.add(new Employee(10004, "Abhinav", 15, 20000));
    ListIterator<Employee> l = arr.listIterator();
    long key = 10002;
    System.out.println(arr.contains(new Employee(10001, "Abhayraj", 21, 2000000)));
    //System.out.println(arr.contains(10001)); => returns false.
    /*for(Employee e : arr) {
      if(e.ssn == key) {
        System.out.println(e);
        break;
      }
    }*/

    while(l.hasNext()) {
      Employee e = l.next();
      if(e.ssn == key) {
        System.out.println(e);
        break;
      }
    }
    System.out.println(arr.size());
  }
}
