class Book {
  int price;
  String name;
  Book(String name, int price) {
    this.price = price;
    this.name = name;
  }

  public String toString() {
    return "Book name: "+name+"\t\tPrice: "+price;
  }

  public boolean equals(Object o) {
    Book b = (Book)o;
    return  this.name.equals(b.name) && this.price == b.price;
  }
}

class Main3 {
  public static void main(String[] args) {
  Book b = new Book("Java", 100);
  Book b2 = new Book("Java", 100);
  System.out.println(b);
  System.out.println(b2);
  System.out.println(b.equals(b2));    
  }
}
