class Heart {
    private String color;
    private int contractibility;

    public Heart(String color, int contractibility) {
        this.color = color;
        this.contractibility = contractibility;
    }

    public void displayHeart() {
        System.out.println("Heart Color: " + color);
        System.out.println("Contractibility: " + contractibility);
    }
}

class Human {
    String name;
    int age;
    Heart h;

    private Human(String name, int age, String color, int contractibility) {
        this.name = name;
        this.age = age;
        this.h = new Heart(color, contractibility);
    }

    public static Human createHuman(String name, int age, String color, int contractibility) {
        return new Human(name, age, color, contractibility);
    }

    public void displayHuman() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        h.displayHeart();
    }
}

public class Bio {
    public static void main(String[] args) {
        Human h = Human.createHuman("Abhayraj", 21, "red", 123);
        h.displayHuman();
    }
}
