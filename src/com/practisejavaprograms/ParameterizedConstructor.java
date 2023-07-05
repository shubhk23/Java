package com.practisejavaprograms;

public class ParameterizedConstructor {
	
	
	static int num;
	static String str;
	
	ParameterizedConstructor(int n,String s){
		num=n;
		str=s;
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		// calling constructor
          ParameterizedConstructor obj=new ParameterizedConstructor(10, "Techouts");
          System.out.println("num= " +obj.num);
          System.out.println("String= "+obj.str);
	}

}
