package com.practisejavaprograms;

public class Break_2
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= 5 && i != 2 && j != 2; ++j) {
                System.out.println("[" + i + "]");
                System.out.println("[" + j + "]");
                System.out.println(String.valueOf(i) + j);
            }
        }
    }
}