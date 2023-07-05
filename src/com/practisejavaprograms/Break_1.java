package com.practisejavaprograms;

public class Break_1
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 10; ++i) {
            if (i == 5) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}