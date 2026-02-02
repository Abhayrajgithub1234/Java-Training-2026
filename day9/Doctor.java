class Doc {
  int licence;
  Doc(int licence) {
    this.licence = licence;
  }
}

class Cardio extends Doc{
  int regNo;
  Cardio(int licence, int regNo) {
    super(licence);
    this.regNo = regNo;
  }
}

class Doctor {
  public static void main(String[] args) {
    Cardio cd = new Cardio(10, 20);
    System.out.println(cd.licence+" "+cd.regNo);
  }
}
