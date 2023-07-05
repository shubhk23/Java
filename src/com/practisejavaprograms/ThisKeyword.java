package com.practisejavaprograms;

public class ThisKeyword {
	
	int rollno=10;
	String name="Shubham";
	float fee=5.11f;
	public void keyword(int rollno, String name,float fee) {
	    this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display(){
      System.out.println(rollno+" "+name+" "+fee);		
	}
	
	public static void main(String[] args) {
		ThisKeyword k1=new ThisKeyword();
		ThisKeyword k2=new ThisKeyword();
		k1.display();
		k2.display();

	}

}
