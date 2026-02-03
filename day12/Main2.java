
//Build a java program to Reverse a string and store it in another string.


class Main2 {
  public static void main(String[] args) {
    String s1 = "Reverse";
    String s2="";


    int len = s1.length();

    for(int i=0; i<s1.length(); i++){
      s2 += s1.charAt(len-i-1);
    }

    System.out.println(s2);
  }
}
