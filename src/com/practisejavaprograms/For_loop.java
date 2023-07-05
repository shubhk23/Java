package com.practisejavaprograms;

public class For_loop {
	public static void main(final String[] args) {
		//final keyword
        final int x = 1;
        final int y = 2;
        final int z = 300;
        int i;
        for (i = x + y, i = 4; i <= 10; ++i) {
            System.out.println(i);
            for (i = 50; i <= z; ++i) {
                System.out.println("Welcome to real world  " + i);
            }
            System.out.println("Welcome to software  " + i);
        }
    }

}
