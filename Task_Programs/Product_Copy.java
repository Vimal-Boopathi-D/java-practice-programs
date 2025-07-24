package Task_Programs;

public  class Product_Copy {
	String name;
	int id;
	int price;
	int rating;


  Product_Copy(String name,int id,int price,int rating) {
		this.name=name;
		this.id=id;
		this.price=price;
		this.rating=rating;}
  Product_Copy(Product_Copy p1,Product_Copy p2,Product_Copy p3) {
		name=p1.name;
		id=p1.id;
		price=p1.price;
		rating=p1.rating;
		
		name=p2.name;
		id=p2.id;
		price=p2.price;
		rating=p2.rating;
		
		name=p3.name;
		id=p3.id;
		price=p3.price;
		rating=p3.rating;
  }
}
//}