package com.practisejavaprograms;

public class Methodoverload1 {
	
	//method overloading by different no. of arguments
	static int methodadd(int a, int b, int c){
		return(a+b+c);
	}
	static int methodadd(int a,int b){
		return(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodadd(11, 11, 11));
		System.out.println(methodadd(12,2));

	}

}
