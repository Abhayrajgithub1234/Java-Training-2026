

//Remove the Duplicate

class Main4 {
  public static void main(String[] args) {
    String s = "Abhayraj Bhat N";
    String s2 = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (s2.indexOf(c) == -1) {
        s2 += c;
      }
    }

    System.out.println(s2);
  }
}
