package Association;

class Person{
	int id;
	String name;
	Address address;
	Person(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.println(id+" "+name+" "+address.street+" "+address.state+" "+address.country+" "+address.pincode);
	}
	
}
class Address{
	String street;
	String state;
	String country;
	long pincode;
	Address(String street,String state,String country,long pincode){
		this.street=street;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
	}
	
	
}

public class Aggregation{
	public static void main(String args[]){
		Address address=new Address("abdul kalam street","TN","IND",614723);
		Person obj=new Person(1,"Suhail",address);
		obj.display();
		obj=null;
		//obj.
	}
	
}
