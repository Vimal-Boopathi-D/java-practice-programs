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

//package com.uniqcodes;
//
//public class Two extends One{
//	
//	void add() {
//		System.out.print("add from two");
//		}
//	void sub() {
//		System.out.print("sub from two");
//		}
//	void mul() {
//		System.out.print("mul from two");
//	}
//
//}

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

package com.uniqcodes;

public class Dynamic_binding {

	public static void main(String[] args) {
		One dybi=new Three();
		dybi.add();
		dybi.sub();
		//obj1.mul();  shows error because mul is neither from parent class nor from common between/overriden in child class three
		Three normal=new Three();
		normal.mul();//it works because it is multilevel inheritence not a dynamic binding
		normal.add();
		normal.sub();
	}

}
