package com.practisejavaprograms;

public class For_Each_Loop {
	public static void main(final String[] args) {
        final int[] array = { 11, 12, 13, 14, 15 };
        int[] array2;
        for (int length = (array2 = array).length, j = 0; j < length; ++j) {
            final int i = array2[j];
            System.out.println(i);
        }
    }
}
