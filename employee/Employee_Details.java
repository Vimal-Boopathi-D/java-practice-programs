package employee;

abstract class EmployeeDetails extends Person{
int empId;
double salary;
EmployeeDetails(String name,int age,int empId,double salary){
	super(name,age);
	this.empId=empId;
	this.salary=salary;
}
abstract void calculateBonus(double percentage);
}
