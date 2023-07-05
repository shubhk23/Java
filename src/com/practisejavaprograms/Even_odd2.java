package com.practisejavaprograms;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Even_odd2{



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(N<=100 && N%2==0){
	            System.out.println(String.valueOf(N) +"  : Not Weired");
	        }
	        else{
	            System.out.println("Weired");
	        }
	        scanner.close();
	    }
	}

