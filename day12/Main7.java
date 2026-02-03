//Check if a string is panagram or not


class Main7{
  public static void main(String[] args) {
    String s1 = "The quick brown fox jumps over the lazy dog";
    s1 = s1.toLowerCase();
    for(char i='a'; i<'z'; i++) {
      if(s1.indexOf(i) < 0) {
        System.out.println("Not panagram");
        return;
      } 
    }

    System.out.println("Panagram");
  }
}
