public class EmployeeDetails {

	public static void main(String[] args) {
		// Variable Declaration and Assigments
		String firstName = "John";
		char middleInitial = 'B';
		String lastName = "Hayes";
		final String PPSNO = "5647314S";
		int age = 34;
		String department = "IT";
		byte performanceRating = 3;
		float basicSalary = 45909.56F;
		boolean bonusAwarded = true;
		double bonus = 10000.04;
		double totalSalary = (basicSalary + bonus);
		
		System.out.println("First Name: "+firstName);
		System.out.println("Middle Initial: "+middleInitial);
		System.out.println("Last Name: "+ lastName);
		System.out.println("PPS No: "+PPSNO);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
		System.out.println("Performance Rating: "+performanceRating);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Bonues awarded: "+bonusAwarded);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+totalSalary);		

	}

}