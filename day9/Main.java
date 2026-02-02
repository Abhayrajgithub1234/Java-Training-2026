class Board{
  int price;
  private Board(int price){
    this.price = price;
  }
  public static Board createBoard(int price) {
    return new Board(10);
  }
}

class Chair {
  private int price;
  private String color;

  public Chair setPrice(int price) {
    this.price = price;
    return this;
  }
  public int getPrice() {
    return this.price;
  }
  public Chair setColor(String color) {
    this.color = color;
    return this;
  }
  public String getColor() {
    return this.color;
  }
}

class Main {
  public static void main(String[] args) {
    Board b = Board.createBoard(10);
    Chair c = new Chair();
    
    System.out.println("Chair price: "+c.setPrice(1000).getPrice());
    System.out.println("Chair color: "+c.setColor("Red").getColor());

    System.out.println("Price: "+b.price);

  }
}
