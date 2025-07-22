package com.uniqcodes;

class A{
	
int a;
int b;
}
class B{
	public int assigna(){
	  A obj1=new A();
	  obj1.a=10;
	  return obj1.a;
	}
	public int assignb(){
	  A obj1=new A();
	  obj1.b=20;
	  return obj1.b;
	}
}
class C{
	public int add(){
	 B obj2=new B();
	 int c=obj2.assigna()+obj2.assignb();
	 return c;
	}
}
class Methods_task{
	public static void main(String[] args){
		C obj3=new C();
		int d=obj3.add();
		System.out.println(d);
	}
}

