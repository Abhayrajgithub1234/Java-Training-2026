//To implement different Stirng inbuilt methods
/*
    1. length()               => returns the length of the String.
    2. toLowerCase()          => converts all characters to lower case.
    3. toUpperCase()          => converts all characters to upper case.
    4. trim()                 => removes the leading and trailing white spaces.
    5. isEmpty()              => checks if the string is empty ("").
    6. isBlank()              => checks if the string is empty or contains only white spaces. (Java 11+)
    7. equals()               => checks if two strings are exactly same (case-sensitive).
    8. equalsIgnoreCase()     => checks equality ignoring case.
    9. compareTo()            => compares 2 strings lexicographically (0 equal, +ve s1>s2, -ve s1<s2).
   10. compareToIgnoreCase()  => same as compareTo but ignores case.
   11. indexOf()              => returns first occurrence index of char/substring (-1 if not found).
   12. lastIndexOf()          => returns last occurrence index of char/substring (-1 if not found).
   13. contains()             => checks if substring exists in string (true/false).
   14. startsWith()           => checks if string starts with given prefix.
   15. endsWith()             => checks if string ends with given suffix.
   16. replace()              => replaces character or substring with another.
   17. substring()            => extracts a part of string using indexes.
   18. concat()               => joins two strings.
   19. repeat(n)              => repeats the string n times. (Java 11+) 
   20. charAt(index)          => returns character at given index.
  */

class Main1{
  public static void main(String[] args) {
    String s1 = "AbhayrajBhatN";
    String s2 = "AbhaYRajBhatN";
    String s3 = "     Abhayraj    ";
    String s4 = "";
    String s5 = " ";

    System.out.println(s1.length());

    System.out.println(s2.toLowerCase());

    System.out.println(s2.toUpperCase());

    System.out.println(s3.trim());

    System.out.println(s4.isEmpty());

    System.out.println(s5.isBlank());

    System.out.println(s1.equals(s2));

    System.out.println(s1.equalsIgnoreCase(s2));

    System.out.println(s1.compareTo(s2));

    System.out.println(s1.compareToIgnoreCase(s2));

    System.out.println(s1.indexOf('a'));

    System.out.println(s1.lastIndexOf('a'));

    System.out.println(s1.contains("z"));

    System.out.println(s1.startsWith("Ab"));

    System.out.println(s1.endsWith("tN"));

    System.out.println(s1.replace("a", "p"));

    System.out.println(s2.concat(" is Good"));

    System.out.println("ha".repeat(4));

    System.out.println(s1.substring(5));

    System.out.println(s1.substring(0, 8));

    System.out.println(s1.substring(2, 3));

    //System.out.println(s1.substring(-1, -4)); -> This throws an run time exception StringIndexOutOfBoundException.
  }
}
