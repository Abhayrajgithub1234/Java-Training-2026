class Gen {
  int a, b, c;
  public void gen() {
    System.out.println("Gen");
  }
}

class Spe extends Gen {
  int d, c, e;
  public void spe() {
    System.out.println("Spe");
  }
}

class Test {
  public static void main(String[] args) {
    Spe s = new Spe();
    s.gen();
    s.spe();
  }
}
