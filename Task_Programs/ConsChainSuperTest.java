package Task_Programs;

class Os{
	  
	  Os(){
		  System.out.println("Windows Runnig...");
	  }
	  Os(String os_name){
		  
		  System.out.println(os_name+" Runnig ....");
	  }
	  
	  
}
class Laptop extends Os{
	  
	  Laptop(){	  
		  super("linux");
	  }
}

public class ConsChainSuperTest {

	public static void main(String[] args) {
		
		new Laptop();
	}
}
