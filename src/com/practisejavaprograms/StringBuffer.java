package com.practisejavaprograms;

import java.io.IOException;

public class StringBuffer {

	static String t="Java";
	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("String constructor");
		
	}

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.append(t);//now original string is changed  
		System.out.println(sb);
		//prints Hello Java  
		}

	private void append(String string) {
		// TODO Auto-generated method stub
	
	}  
	} 