package Task_Programs;

public class Methods{
public void detail(){
  String name="person1";
  String role="dev";
  System.out.println(name+" "+role);
}
public void details(String name,String job){
System.out.println(name+" "+job);

}
public static void main(String[] args){
Methods ob=new Methods();
ob.detail();
ob.details("Person2","analyst");

}

}
