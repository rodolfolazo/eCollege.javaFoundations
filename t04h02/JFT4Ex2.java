/**
 * 
 * @author rodo
 * Vat Payable and Total purchase price for a bottle of whisky
 *  
 */

public class JFT4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double purchaseAmount = 14.5;
		double vat = 0.23;
		double vatPayable = purchaseAmount * vat;
		double totalPrice = purchaseAmount + vatPayable;
		System.out.println("Purchase Amount: \u20AC"+ purchaseAmount);
		System.out.println("VAT payable: \u20AC"+ vatPayable);
		System.out.println("Total Price: \u20AC"+ totalPrice);
				

	}

}