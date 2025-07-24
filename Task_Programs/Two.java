//package com.uniqcodes;
//
//public class One {
//
//	void add() {
//		System.out.print("add from One");
//		}
//	void sub() {
//		System.out.print("sub from One");
//		}
//	
//}

package Task_Programs;

public class Two extends One{
	
	void add() {
		System.out.println("add from two");
		}
	void sub() {
		System.out.println("sub from two");
		}
	void mul() {
		System.out.println("mul from two");
	}

}

//package com.uniqcodes;
//
//public class Three extends Two {
//	void add() {
//		System.out.print("add from One");
//		}
//	void sub() {
//		System.out.print("sub from One");
//		}
//
//}

//package com.uniqcodes;
//
//public class Dynamic_binding {
//
//	public static void main(String[] args) {
//		One obj1=new Three();
//		obj1.add();
//		obj1.sub();
//		//obj1.mul();  shows error because mul is neither from parent class nor from common between/overriden in child class three
//		
//	}
//
//}
