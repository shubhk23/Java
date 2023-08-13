package com.practisejavaprograms;

public class CustomStringBuffer {

    static String t = "Java";
    private String value;

    public CustomStringBuffer(String string) {
        // TODO Auto-generated constructor stub
        System.out.println(t);
        value = string;
    }

    public static void main(String args[]) {
        CustomStringBuffer sb = new CustomStringBuffer("Hello");
        sb.append(t); // now original string is changed
        System.out.println(sb); // prints Hello Java
    }

    void append(String string) {
        // TODO: Add implementation to append the given string to the existing string
    }

    @Override
    public String toString() {
        return value;
    }
}
