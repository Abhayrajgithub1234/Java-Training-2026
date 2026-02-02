

class RangeSum{
  public static void main(String args[]) {

    int range = 20;

    int idx = 0;
    int sum = 0;

    do{
      if(idx % 2 == 0) sum += idx;
    }while(idx++<=range);

    System.out.println("sum: "+sum);
    
  }
}
