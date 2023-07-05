package com.practisejavaprograms;

public class Continue_2 {
	public static void main(final String[] args) {
        for (int x = 5; x <= 8; ++x) {
            for (int y = 5; y <= 8; ++y) {
                if (y == 7) {
                    for (int z = 0; z <= 2; ++z) {
                        System.out.println(x);
                        System.out.println(y);
                        System.out.println(z);
                    }
                }
                else {
                    System.out.println("India");
                }
            }
        }
    }
}
