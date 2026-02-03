
//Build a java program to count the vowel and consonant characters in a given string

class Main3{
  public static void main(String[] args) {
    int vowel=0;
    int consonant = 0;

    String s = "Abhayraj is a good boy";
    String str = s.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch >= 'a' && ch <= 'z') {
        switch (ch) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            vowel++;
            break;
          default:
            consonant++;
        }
      }
    }

    System.out.printf("Vowel: %d\nConsonant: %d\n", vowel, consonant);
  }
}
