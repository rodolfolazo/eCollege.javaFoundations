/**
 * 
 * @author rodo
 * Carpet
 *
 */

public class JFT4Ex7 {

	public static void main(String[] args) {
		// Declaring and assigning variables
		double length = 25.00;
		double width = 42.00;
		double squareFeet = length * width;
		double squareYard = squareFeet / 9;
		double costCarpeting = squareYard * 37.99;
		
		//Output
		System.out.println("************************************");
		System.out.println("**** Carpeting Cost Analysis *******");
		System.out.println("************************************");
		System.out.println("Square feet: "+ squareFeet);
		System.out.println("Square yards: " + squareYard);
		System.out.println("Cost of carpeting in square Yards: €"+ costCarpeting);

	}

}