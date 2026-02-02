interface Payment {
  void pay();
}

class CreditCard implements Payment {
  int rupees;
  CreditCard(int r) {
    this.rupees = r;
  }
  public void pay() {
    System.out.printf("Transaction completed in %d rupees..\n", this.rupees);
  }
}

class PayPal implements Payment {
  int dollers;
  PayPal(int d) {
    this.dollers = d;
  }
  public void pay() {
    System.out.printf("Transaction completed of %d dollers..\n", this.dollers);
  }
}

class Main2 {
  public static void main(String[] args) {
    CreditCard c = new CreditCard(20000000);
    PayPal p = new PayPal(3000000);

    c.pay();
    p.pay();

  }
}
