package com.practisejavaprograms;

public class Method3 {
	public static void main(final String[] args) {
        final int a = 10;
        final int b = 11;
        final int c = add(a, b);
        System.out.println("The sum of two number : " + c);
    }
    
    private static int add(final int a, final int b) {
        final int s = a + b;
        System.out.println("The Program");
        return s;
    }

}
