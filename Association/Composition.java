package Association;


class Person2 {
   String name;
   int age;
   Birthday birthday;
   Person2(String name,int age,int date,int day,int year){
	   this.name=name;
	   this.age=age;
	   this.birthday=new Birthday(date, day, year);
   }
   void display() {
	   System.out.println("Name:"+name+"\nAge:"+age);
	   birthday.birthdayDisplay();
   }
   
    }


class Birthday {
    int date;
    int day;
    int year;

    Birthday(int date,int day,int year) {       
    	this.date=date;
        this.day=day;
        this.year=year;
       
    }
    void birthdayDisplay() {
    	System.out.println("\nDate:"+date+"\nDay"+day+"\nYear:"+year);
    }
}

public class Composition{
    public static void main(String args[]) {
        Person2 obj = new Person2( "Vimal", 23,19,06,2002);//composition => tightly coupled ,
        //values are passed to a containing class constructor and the object is created inside
        //a containing class constructor for contained class constructor
        obj.display();
        
//        obj=null;
//        obj.display(); 
        }
}

