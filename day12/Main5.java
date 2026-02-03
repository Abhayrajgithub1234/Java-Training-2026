//To check the string is Anagram or not

import java.util.Arrays;


class Main5 {
  public static void main(String[] args) {
    String s1 = "care";
    String s2 = "race";

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    int len = s1.length();

    if (s1.length() != s2.length()) {
      System.out.println("Not Anagram");
      return;
    }
    /*
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    if (Arrays.equals(a, b))
      System.out.println("Anagram");
    else
      System.out.println("Not Anagram");
    */

  for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);

      int count1 = 0, count2 = 0;

      for (int j = 0; j < s1.length(); j++) {
        if (s1.charAt(j) == c) count1++;
        if (s2.charAt(j) == c) count2++;
      }

      if (count1 != count2) {
        System.out.println("Not Anagram");
        return;
      }
    }

    System.out.println("Anagram");
  }
}
