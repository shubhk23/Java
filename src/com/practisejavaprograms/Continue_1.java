package com.practisejavaprograms;

public class Continue_1 {
	public static void main(final String[] args) {
        for (int num = 0; num <= 5; ++num) {
            if (num != 3) {
                System.out.print(String.valueOf(num) + "    ");
            }
            else {
                System.out.print("GRANDSTREAM   ");
                System.out.print(String.valueOf(num) + "   ");
            }
        }
    }

}
