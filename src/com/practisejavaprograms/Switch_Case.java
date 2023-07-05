package com.practisejavaprograms;

public class Switch_Case {
	public static void main(final String[] args) {
        final int a = 20;
        final int b = 40;
        switch (a) {
            case 20: {
                System.out.println("display");
                break;
            }
        }
        System.out.println("camera");
        switch (b) {
            case 40: {
                System.out.println("display xxxx");
                break;
            }
            default: {
                System.out.println("camera");
                break;
            }
        }
    }
	
}
