package com.practisejavaprograms;

import java.awt.List;
import java.util.ArrayList;

public class HelloWorld {
	public static void main(final String[] args) {
        System.out.println("Hello world");
        final ArrayList<String> list = new ArrayList<String>();
        list.add("Shubham");
        list.add("Kale");
        for (final String s : list) {
            System.out.println(s);
        }
    }
}
