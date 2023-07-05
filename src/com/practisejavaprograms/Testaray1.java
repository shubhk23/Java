package com.practisejavaprograms;

public class Testaray1 {

	
	public static void main(String[] args) {
		
	   int arry[]= {33,34,35,36};
	   //printing array using for loop 
	   for(int i = 0;i<arry.length;i++) {
		   System.out.println(arry[i]);
	   }
	  //printing array using for-each loop
       for (int i:arry) {
    	   System.out.println(i);
       } 
	}
}
