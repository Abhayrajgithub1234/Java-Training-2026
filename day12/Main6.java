//Java program to check if the string is pallindrome or not

class Main6 {
  public static void main(String[] args) {
    String s = "aabaa";
    int start = 0;
    int end = s.length()-1;
    while(start < end) {
      if(s.charAt(start++) != s.charAt(end--)) {
        System.out.println("Not pallindrome");
        return;
      }
    }

    System.out.println("pallindrome");
  }
}
