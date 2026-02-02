package factory;
public class Car{

    String name;
    String company;
    int batchNo;
    float priceF;

    public Car(String name, String company, int batchNo, float price) {
        this.batchNo = batchNo;
        this.name = name;
        this.company = company;
        this.priceF = price;
    }
    public void run() {
        System.out.println(this.name+" car has started...");
    }
    public void stop() {
        System.out.println(this.name+" car has stopped..");
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Company: "+this.company);
        System.out.println("Batch No: "+this.batchNo);
    }
}







