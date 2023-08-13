package com.practisejavaprograms;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="Welcome to java programing ";
		int size=t.length();
		
		System.out.println("Given string : "+""+ t +"");
		System.out.print("Reversed String:"+ "");
		for(int i=0;i<size;i++) {
			System.out.print(t.charAt(t.length() - 1 - i));
		}

	}

}
