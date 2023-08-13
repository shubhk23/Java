package com.practisejavaprograms;

import java.util.StringTokenizer;

//StringTokenizer
public class SImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringTokenizer st=new StringTokenizer("My name shubham kale");
   while(st.hasMoreElements()) {
	   //countTokens
	   System.out.println("Total number of tokens: "+st.countTokens());
	   //nextToken
	   System.out.println(st.nextToken());

	  // System.out.println("Next token is :"+ st.nextToken(""));
	  
	   }
   
   
	}

}
