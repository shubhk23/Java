package com.practisejavaprograms;

public class Nested_If {
	public static void main(final String[] args) {
        final String x = "Testing Team";
        final int xx = 11;
        final int y = 9;
        final int z = 0;
        if (z > y) {
            System.out.println("Maharaja");
            if (xx > y && y > z) {
                System.out.println("Techouts");
                if (z == y) {
                    System.out.println("");
                }
                else {
                    System.out.println("TATA");
                }
            }
        }
        else {
            System.out.println("Deloitte");
        }
    }

}
