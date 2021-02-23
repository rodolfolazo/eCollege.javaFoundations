/**
 * 
 * @author rodo
 * My Investment
 *
 */
public class JFT4Ex5 {

	public static void main(String[] args) {
		// Declaring and assignment variables
		double principalSum = 1000.0;
		double interestRate = 0.05;
		double interest = principalSum * interestRate;
		double total = principalSum + interest;
		
		//Output
		System.out.println("The principal is: €" + principalSum);
		System.out.println("The rate of interest is: "+ interestRate);
		System.out.println("The interest earned is: €"+ interest);
		System.out.println("The value of the investment is: €"+ total);

	}

}