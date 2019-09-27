/*****package for representing electricity bill
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package Billings;

import Billings.ElectricityBill;

public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2000,"Sarathi",300,"domestic",200);
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}


