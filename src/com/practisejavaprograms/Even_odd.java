package com.practisejavaprograms;

import java.util.Scanner;

public class Even_odd {
	public static void findEvenodd(final int num) {
        if (num%2== 0) {
            System.out.println(String.valueOf(num) + " is even. ");
        }
        else {
            System.out.println(String.valueOf(num) + " is odd. ");
        }
    }
    
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        final int num = scan.nextInt();
        findEvenodd(num);
    }
}
