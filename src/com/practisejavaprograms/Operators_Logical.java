package com.practisejavaprograms;

public class Operators_Logical {

	public static void main(final String[] args) {
        int a = 10;
        final int b = 20;
        int c = 30;
        System.out.println(a < b || a > b);
        System.out.println(++a > b && b > a);
        System.out.println(a);
        System.out.println(a < b & c++ > b);
    }
}
