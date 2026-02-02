class Object{
    static int count;
}


public class Static {
    public static void main(String[] args) {
        Object c1 = new Object();
        Object.count = 10;

        Object c2 = new Object();
        Object.count = 20;

        System.out.println("count: "+Object.count);
        System.out.println("count: "+Object.count);

    }
    
}
