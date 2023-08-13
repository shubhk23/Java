package com.practisejavaprograms;

//Using a StringBuilder or StringBuffer
public class Stringreverse1 {
	
	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        
	        // Using StringBuilder
	        StringBuilder reversed = new StringBuilder(input).reverse();
	        System.out.println(reversed); // Output: !dlroW ,olleH
	        
	        // Using StringBuffer (for multi-threaded scenarios)
	        StringBuffer reversedBuffer = new StringBuffer(input).reverse();
	        System.out.println(reversedBuffer); // Output: !dlroW ,olleH
	    }
	}


