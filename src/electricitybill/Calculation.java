/******
 * To calculate the ElectricityBill amount 
 * 
 * Developed by
 * maniknta
 * 
 * amanikanta69@gmail.com
 * 
 */
package electricitybill;

import electricitybill.ElectricityBill;

public class Calculation {

	public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(2001,"Kamal",0,0,"domestic or commercial");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}