package com.practisejavaprograms;

public class Tostring {
	int rollno;
	String name;
	String city;
	
	Tostring(int rollno,String name, String city) {
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	
	public String toString() {
		return rollno+""+ name+""+city;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tostring s1=new Tostring(100, " Shubham"," Hinganghat");
		Tostring s2=new Tostring(101," Kale", " Wardha"); 
		System.out.println(s1);
		System.out.println(s2);
        
	}

}
