/**
 * 
 * @author rodo
 * Employee pay
 *
 */

public class JFT4Ex3 {

	public static void main(String[] args) {
		// Declaring and Assingments
		String employeeName = "Alessandro Costacurta";
		String ppsNo = "20666KA";
		String department = "IT";
		double hoursBasic = 50.5;
		double basicPay = 29.35;
		double basicSalary = hoursBasic * basicPay;
		double hoursOvertime = 13.5;
		double overtimePay = 1.5 * basicPay;
		double overtimeSalary = hoursOvertime * overtimePay;
		double grossPay = basicSalary + overtimeSalary;
		double incomeTax = 0.35;
		double incomeTaxPayable = grossPay * incomeTax;
		double netPay = grossPay*(1-incomeTax);
		
		//Output
		System.out.println("********** Salary Report *************");
		System.out.println();
		System.out.println("********** Employee Details **********");
		System.out.println("Employee name: "+ employeeName);
		System.out.println("Employee PPS No: "+ ppsNo);
		System.out.println("Employee department: "+ department);
		System.out.println();
		System.out.println("********** Hours Worked **************");
		System.out.println("No of basic hours worked: "+ hoursBasic);
		System.out.println("The hourly rate of basic pay is: €"+basicPay);
		System.out.println("Basic salary: "+ basicSalary );
		System.out.println("No of overtime hours worked: "+ hoursOvertime);
		System.out.println("The hourly rate of overtime pay is at time and half");
		System.out.println("Overtime salary: "+ overtimeSalary);
		System.out.println();
		System.out.println("********** Take Home Pay *************");
		System.out.println("Gross Pay is: €"+ grossPay);
		System.out.println("Income Tax Payable at: "+ incomeTax + " is: €"+ incomeTaxPayable);
		System.out.println("Net pay is: €"+ netPay );
		System.out.println("**************************************");
		
		
				

	}

}