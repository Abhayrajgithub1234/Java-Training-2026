
// This program shows how sorting works using Comparable and Comparator.
//
//  Comparable (compareTo) is used when you want a "natural ordering" for a class.
//    Example: Sorting Books by price.
//
//  Arrays.sort() will automatically use compareTo() ONLY IF the class implements Comparable
//    and you call: Arrays.sort(array);
//
//  Comparator is used when you want an "external/custom ordering" without changing natural order.
//    Example: Sorting Books by title.
//
// In this program:
// 1) compareTo() sorts books by price (natural sorting)
// 2) TitleComparator sorts books by title (custom sorting)

import java.util.*;

class TitleComparator implements Comparator<Book> {
  public int compare(Book b1, Book b2) {
    return b1.title.compareTo(b2.title); // sorting by title (ascending)
  }
}

class Book implements Comparable<Book> {
  int price;
  String title;

  Book(int price, String title) {
    this.price = price;
    this.title = title;
  }

  @Override
  public int compareTo(Book b) {
    return this.price - b.price; // natural order: sorting by price (ascending)
  }

  @Override
  public String toString() {
    return "Title: " + title + "\t\tPrice: " + price;
  }

  // Manual sorting method (Selection Sort) using compareTo()
  public static void sort(Book[] b) {
    int n = b.length;

    for (int i = 0; i < n - 1; i++) {
      int min = i;

      for (int j = i + 1; j < n; j++) {
        if (b[j].compareTo(b[min]) < 0) {  // uses compareTo() to compare prices
          min = j;
        }
      }

      Book temp = b[i];
      b[i] = b[min];
      b[min] = temp;
    }
  }
}

class Main8 {
  public static void main(String[] args) {
    Book[] b = new Book[4];

    b[0] = new Book(500, "book1");
    b[1] = new Book(200, "book2");
    b[2] = new Book(1500, "book3");
    b[3] = new Book(100, "book4");

    // Sorting using custom comparator (title wise)
    Arrays.sort(b, new TitleComparator());

    // If you want sorting by price (compareTo), you can do:
    // Arrays.sort(b);

    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}
