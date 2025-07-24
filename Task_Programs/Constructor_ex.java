package Task_Programs;

public class Constructor_ex {
	int id;
	String name;
	public Constructor_ex() {
		id=20;
	}

	public static void main(String[] args) {
		
		Constructor_ex obj=new Constructor_ex();
		System.out.println(obj.id);
		System.out.println(obj.name);
	}

}

