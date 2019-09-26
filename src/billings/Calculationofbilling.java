/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package billings;

public class Calculationofbilling
{

	public static void main(String[] args) {
		ElectricityBill B1,B2;
		B1=new ElectricityBill(1000,"gk",1010,1329,"Domestic");
		B1.printData();
		B2=new ElectricityBill();
		B2.getdata();
		B1.computeBillamount();
		B2.computeBillamount();

	}

}
