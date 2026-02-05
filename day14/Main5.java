import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator → Custom sorting (by name)
class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

// Comparable → Natural sorting (by SSN)
class Employee implements Comparable<Employee> {
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

    @Override
    public String toString() {
        return "Name: " + name + " | SSN: " + ssn + " | Age: " + age + " | Salary: " + salary;
    }

    // Natural order → sort by SSN
    @Override
    public int compareTo(Employee e) {
        return Long.compare(this.ssn, e.ssn);
    }
}

class Main5 {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();

        arr.add(new Employee(10001, "Abhayraj", 21, 2000000));
        arr.add(new Employee(10003, "Raj", 22, 200000));
        arr.add(new Employee(10002, "Abhay", 20, 3000000));
        arr.add(new Employee(10004, "Abhinav", 15, 20000));

        // Sorting using Comparable (by SSN)
        Collections.sort(arr);
        System.out.println("Sorted by SSN:");
        System.out.println(arr);

        // Sorting using Comparator (by Name)
        Collections.sort(arr, new NameComparator());
        System.out.println("\nSorted by Name:");
        System.out.println(arr);

        System.out.println("\nSize: " + arr.size());
    }
}
