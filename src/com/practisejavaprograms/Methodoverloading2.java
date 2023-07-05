package com.practisejavaprograms;

public class Methodoverloading2 {
	
	//Method overloading by using different data type 
	 static int substract(int a, int b){
		 return (a-b);
	 }

	 static double substract (double a,double b) {
		return (a-b);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("First Subsracted Value="+substract(10, 20));
       
       System.out.println("Second Substracted Value="+substract(100000,50000));
	}

}
