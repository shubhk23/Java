package com.practisejavaprograms;

public class String1 {

	public static void main(String[] args) {
		
		//creating string object by string literal 
		String s="Shubham"; 
		// Character position 
		char c=s.charAt(3); 
		System.out.println("Char at 3 = "+c);
		//Converting array to string 
		char ch[] = {'s','h','u','b','h','a','m'};
		String obj=new String(ch);
		//Creating string by new keyword
		String obj1=new String("kale");
		//Length of the string 
		System.out.println("Lenghth of s = "+s.length());
		System.out.println(s);
		System.out.println(obj);
        System.out.println(obj1);
	}

}
