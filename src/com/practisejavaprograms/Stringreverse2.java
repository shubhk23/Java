package com.practisejavaprograms;

//Using character array 
public class Stringreverse2 {
	
	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        
	        // Convert the string to a character array
	        char[] charArray = input.toCharArray();
	        
	        // Reverse the character array
	        int left = 0;
	        int right = charArray.length - 1;
	        while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }
	        
	        // Convert the reversed character array back to a string
	        String reversed = new String(charArray);
	        System.out.println(reversed); // Output: !dlroW ,olleH
	    }
	}

