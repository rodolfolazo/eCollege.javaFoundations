/**
 * 
 * @author rodo
 * Coin Machine
 *
 */

public class JFT4Ex6 {

	public static void main(String[] args) {
		// Declaring and Assigning variables
		int money  = 57;
		int note20 = money / 20;
		int note10 = (money%20) / 10;
		int note5 = ((money%20) % 10) / 5;
		int coin = ((money%20) % 10) % 5;
		
		//Output
		System.out.println("Sum of money is : €"+ money);
		System.out.println("No of 20\'s is: "+ note20);
		System.out.println("No of 10\'s is: "+ note10);
		System.out.println("No of 5\'s is: "+ note5);
		System.out.println("No of coins is: "+ coin);

	}

}