package com.uniqcodes;

class Instagram{
	void chat(){
	System.out.println("Normal chatting....");
	}
	void post(){
		System.out.println("Posting..");
	}
	void story(){
		System.out.println("Story uploading...");
	}
}
class InstaV1 extends Instagram{
	//void reels(){
	//	System.out.println("Reels playing...");
	//}
	void chat(){ //overriding
		System.out.println("Chatting with colourful background");
	}
	void story(){ //overriding
		System.out.println("Story with mention option");
	}
	
}

public class Override{
public static void main(String args[]){
	Instagram i=new InstaV1();// upcasting ,,only allowed to acess parent class..Down casting=>InstaV1 i1=(i)InstaV1
	i.chat();
	i.post();
	i.story();
	//i.reels();
	
}

}
