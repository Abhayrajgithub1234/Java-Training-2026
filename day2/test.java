class test{
  static int b;
  public static void main(String args[]) {
    int a=1;

    while(a <= 9){
      if(a%2 == 0)
          System.out.println(a);
      a++;
    }
    System.out.println("a: "+a);
    System.out.println("b: "+b);
  }
}
