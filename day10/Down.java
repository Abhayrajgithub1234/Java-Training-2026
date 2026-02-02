import java.util.Scanner;

class Shape {
  String color = "red";  
}

class Square extends Shape {
  int side = 10;
}

class Triangle extends Shape {
  int area = 45;
}

public class Down { 
  public static void main(String[] args) {
    
    Shape s = new Shape();

    if(s instanceof Square == false) {
      s = new Square();
      Square sq = (Square) s;
    }
    


  }
}
