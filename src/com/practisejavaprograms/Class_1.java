package com.practisejavaprograms;

public class Class_1 
{
    int id1;
    int id2;
    String s1;
    String s2;
    
    public Class_1() {
        this.id1 = 1654;
        this.id2 = 1934;
        this.s1 = "Shubham";
        this.s2 = "Kale";
    }
    
    public static void main(final String[] args) {
        final Class_1 obj = new Class_1();
        System.out.println(String.valueOf(obj.s1) + " " + obj.id1);
        System.out.println(String.valueOf(obj.s2) + " " + obj.id2);
    }
}