class test{
  public static void main(String abhay[]) {
    System.out.println("Hello from java " + abhay[0]);
    System.out.println("Hello"+true);
    System.out.println(10+20+"Hello");
    System.out.println(10+"20"+"Hello");
    System.out.println("Hello"+10+20);
    String color = "Blue";
    System.out.println(color != "Green");
    System.out.println(!(color == "Green"));
    System.out.println(color=="Red" || color == "Blue");

    int num1 = 5;
    num1 += 5;
    System.out.println(num1);

    int a = 20;
    int b = -10;
    int c = a + --b;
    int d = a-- - b-- + --c;

    System.out.println("a: "+a+" b: "+b+" c: "+c+" d: "+d);

    //System.out.println(10++);
    
    int e = 10;
    int f = 5;

    System.out.println("largest: "+(e>f?e:f));
    
    int age = 100;

    if(age > 18)
      System.out.println("Eligible");
    else
      System.out.println("Not Eligible");
  }
}
