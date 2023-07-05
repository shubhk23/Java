package com.practisejavaprograms;


//to invoke current class method
public class This2 {
	 void display() {
		System.out.println("Shuham++");
	}
	void play() {
		System.out.println("Shubham--");
		this.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  This2 t1=new This2();
  This2 t2=new This2();
  //t1.display();
  t2.play(); 
	}

}
