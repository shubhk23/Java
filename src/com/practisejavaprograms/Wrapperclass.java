package com.practisejavaprograms;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		// Integer num1=new Integer(9); boxing creating object for Integer class
		Integer num1=9; // auto-boxing 
		System.out.println("Valuue by Auto-boxing ="+ num1);

		
        Integer num2=num1.intValue(); //Un-boxing
        System.out.println("Valuue by Un-boxing= "+num2);
	} 

}
