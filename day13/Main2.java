
import java.util.ArrayList;

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

}

class Main2{
  public static void main(String[] args) {
    ArrayList<Employee> arr = new ArrayList<>();

    arr.add(new Employee(10001, "Abhayraj", 21, 2000000));
    arr.add(new Employee(10002, "raj", 22, 200000));
    arr.add(new Employee(10001, "Abhay", 20, 3000000));
    arr.add(new Employee(10001, "Abhinav", 15, 20000));

    System.out.println(arr);
    System.out.println(arr.size());
  }
}
