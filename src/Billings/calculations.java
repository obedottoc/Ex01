package Billings;

public class calculations {
	public static void main(String[] args) {
		Electricitybill B1,B2;
		B1=new Electricitybill("ag",2334,"dosmetic",1456,1800);
		B1.printData();
		B2=new Electricitybill();
		B2.getData();
		B1.billings();
		B2.billings();
	}

}