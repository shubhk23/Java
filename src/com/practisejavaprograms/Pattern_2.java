package com.practisejavaprograms;

public class Pattern_2 {
	public static void main(final String[] args) {
        for (int term = 6, number = 1; number <= term; ++number) {
            for (int value = term; value >= number; --value) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }
}
