package com.practisejavaprograms;

public class Classabstraction extends Abstract {
	String s="Shubham";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Classabstraction ab=new Classabstraction();
   System.out.println(ab.s);
   ab.draw();
	}

	@Override
	void draw() {
		System.out.println("This is Abstract topic");
		
	}

}
