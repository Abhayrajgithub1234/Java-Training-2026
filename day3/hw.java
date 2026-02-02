class HW{
  public static void main(String args[]) {
    int n = 10;

    int sum = n * (n+1) / 2;
    int prod = 1;

    System.out.println("sum: "+ sum);

    for(int i = 1; i<=n; i++){
      prod = prod*i;
    }

    System.out.println("Product: "+prod);

    int num = 123;
    int rev = 0;
    int mod;
    int copy = num;

    while(num > 0){
      mod = num%10;
      rev = rev*10+mod;
      num = num/10;
    }

    System.out.println("num: "+copy);
    System.out.println("reverse: "+rev);

    if(copy == rev)
      System.out.println("Pallindrome");
    else
      System.out.println("not Pallindrome");
  }
}
