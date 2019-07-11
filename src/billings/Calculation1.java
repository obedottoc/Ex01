/*****
 * to calculate the Electricitybill amount
 *  
 *Developed by
 *harsha
 *
 *reddyharsha298@gmail.com 
 */
package billings;

import billings.ElectricityBill;
	public class Calculation1 {
		  
        public static void main(String[] args) {
		ElectricityBill bill1,bill2;
		
		bill1=new ElectricityBill(1000,"unknown",0,0,"domestic or commercial");
		bill1.printData();
		bill2=new ElectricityBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();

      }
}
