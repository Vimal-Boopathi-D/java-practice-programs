package employee;

 class Developer extends EmployeeDetails {

	Developer(String name, int age, int empId, double salary) {
		super(name, age, empId, salary);
		
	}

	@Override
	void calculateBonus(double percentage) {
		// TODO Auto-generated method stub
		double bonus=(percentage/100)*salary;
		salary+=bonus;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name :"+name +"\nAge :"+age+"\nEmployee Id :"+empId+"\nSalary :"+salary);
	}

}
