
/******
 * To calculate the Sale bill amount 
 * 
 * Developed by
 * C.Obed otto
 * 
 * obedotto@saveetha.ac.in
 * 
 */
package billings;

public class Calculation1 {

	public static void main(String[] args) {
		SaleBill bill1,bill2;
		
		bill1=new SaleBill(2001,"Kamal",10,"user",11);
		bill1.printData();
		bill2=new SaleBill();
		bill2.getData();
		bill1.computeBillAmount();
		bill2.computeBillAmount();
	}

}
