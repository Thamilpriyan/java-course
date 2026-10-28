class IfSalary{
	public static void main(String[] args) {
		int employeeSalary = 50000;
		double tax;
		double netSalary;
		
		System.out.println("Employee salary: " + employeeSalary);
		
		if (employeeSalary > 100000){
			tax = (employeeSalary / 100) * 3;
		}
		else{
			tax = (employeeSalary / 100) * 1;
		}
		
		netSalary = employeeSalary - tax;
		System.out.println("Tax : "+ tax);
		System.out.println("Net Salary : " + netSalary);
	}
}