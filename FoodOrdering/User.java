package FoodOrdering;

public class User {
private int phNo=0;;
private String email="",name="";
public User(int phNo, String name, String email) {
	// TODO Auto-generated constructor stub
	this.phNo=phNo;
    this.name=name;
    this.email=email;
}
public User() {
}
public  int getPhNo() {
	return this.phNo;
}
public String getMail() {
	return this.email;
}
public String getName() {
	return this.name;
}

public  void setPhNo(int phNo) {
	this.phNo=phNo;
}
public void setMail(String email) {
	this.email=email;
}
public  void setName(String name) {
	this.name=name;
}

}
