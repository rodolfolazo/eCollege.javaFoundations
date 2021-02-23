import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingrese 3 números enteros: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int avg = (i1 + i2 + i3) / 3;
		System.out.println("La media es: " + avg);

	}

}
