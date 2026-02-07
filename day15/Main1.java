
import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        
        students.put(101, "name1");
        students.put(102, "name2");
        students.put(103, "name3");
        students.put(104, "name4");

        System.out.println("Initial HashMap:");
        System.out.println(students);
        System.out.println();

        int keyToSearch = 102;
        if (students.containsKey(keyToSearch)) {
            System.out.println("Student found: " + students.get(keyToSearch));
        } else {
            System.out.println("Student not found");
        }
        System.out.println();

        students.remove(103);
        System.out.println("After removing roll 103:");
        System.out.println(students);
        System.out.println();

        System.out.println("Iterating over HashMap:");
        for (Integer key : students.keySet()) {
            System.out.println("Roll: " + key + " Name: " + students.get(key));
        }
    }
}
