package employee;

public class Company {

	public static void main(String[] args) {
		Manager m=new Manager("abc", 23, 3220, 50000);
		double man=10;
		double dev=8;
		double test=5;
		System.out.println("Before :");
		m.displayDetails();
		m.calculateBonus(man);
		System.out.println("After :");
		m.displayDetails();
		
		
		System.out.println();
		
		
		System.out.println("Before :");
		Developer d=new Developer("def",22,3221,30000);
		d.displayDetails();
		d.calculateBonus(dev);
		System.out.println("After :");
		d.displayDetails();
		
		System.out.println();
		
		System.out.println("Before :");
		Tester t=new Tester ("ghi",21,3221,30000);
		t.displayDetails();
		t.calculateBonus(test);
		System.out.println("After :");
		t.displayDetails();
	}
}
