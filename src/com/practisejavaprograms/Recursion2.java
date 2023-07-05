package com.practisejavaprograms;

public class Recursion2 {
  static int count=0;
	static void p() {
		count++;
	//Calling the same method with finite values 
	if(count<=5) {
		System.out.println("Hello "+ count);
	p();	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    p();
    }

}
