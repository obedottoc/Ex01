package billings;

public class billings {

public static void main(String[] args) {

ElectricityBill B1,B2;
B1=new ElectricityBill(5010,"Bairavan",1000,2000,"Domestic");
B1.printData(null);
B2=new ElectricityBill();
B2.getData();
B1.computeBillAmount();
B2.computeBillAmount();
}

}