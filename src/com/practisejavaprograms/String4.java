package com.practisejavaprograms;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("Apple");
		String b=new String ("Boom");
		String d=new String ("Zoom");
		String e=new String("Room");
		//The %s%s is a format specifier that indicates two place holders for strings.
		String c=String.format("%s %s",a,b); 
		System.out.println(c.toString());
		
		String f=String.join(" ", d,e);
		System.out.println(f.toString());

	}

}
