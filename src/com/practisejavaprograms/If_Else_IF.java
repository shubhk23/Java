package com.practisejavaprograms;

public class If_Else_IF {
	public static void main(final String[] args) {
        final int a = 100;
        final int b = 200;
        final int c = 300;
        if (a >= b) {
            System.out.println(c);
        }
        else if (c < a) {
            System.out.println("Hello  Hello");
        }
        else {
            System.out.println("I AM ME");
            for (int i = 0; i < a; ++i) {
                System.out.println("testing");
            }
        }
    }
}
