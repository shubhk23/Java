package com.practisejavaprograms;

public class Excepton {
	//Exception handling by try catch 
	public static void main(String[] args) {
		
		int a=1,b=10 ;
		try {
	    int c=a/b;
	    System.out.println(c);
		}
		catch(ArithmeticException e ){
			System.out.println(e);
		}
	
       
	}

}
