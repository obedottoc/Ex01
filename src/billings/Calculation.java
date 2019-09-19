/*created by Abhijith.S
abhijithabhi524@gmail.com
*/
package billings;

public class Calculation {

	public static void main(String[] args) {
		ElectricityBill E1,E2;
		E1=new ElectricityBill(5002,"Abhijith",4916,5316,"domestic");
		E2= new ElectricityBill();
		E2.getdata();
		E2.ComputeBillAmount();
	}

}