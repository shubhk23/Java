package com.practisejavaprograms;

public class String3 {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ShuBham";
		String s1="SHUBHAM";
		String s2="SHUBHAM";
		
		//s=s.concat("kale"); // it can appends the two  shubham and kale 
		System.out.println(s);
		
		// string compare by using equalsIgnoreCase 
		System.out.println(s.equalsIgnoreCase(s1)+" : equalsIgnoreCase");
		
		//string compare by using == operator 
		System.out.println(s1==s2+" :  == operator");
		
		//equals to 
		System.out.println(s1.equals(s2)+":  equals to ");
		
		//string compare by using compareTo 
		System.out.println(s2.compareTo(s));
		
        // concatenation method 
		System.out.println(s2. concat(s1));
		
		//String starts with 
		System.out.println("Startwith index 3 :  "+ s.substring(3));
		
		//ends with 
		System.out.println("Starts with 0 to 6 :  "+s1.substring(0, 7));
		
		//Contains
		System.out.println(s.contains("Shu"));
	}

}
