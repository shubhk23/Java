package com.practisejavaprograms;

public class Variables {
static int c;
    
    static {
        Variables.c = 12;
    }
    
    public void method() {
        final int m = 15;
        System.out.println(m);
    }
    
    public static void main(final String[] args) {
        final int data = 50;
        final int a = 10;
        final float f = (float)a;
        final float t = 10.45f;
        final int r = (int)f;
        System.out.println(data);
        System.out.println(Variables.c);
        System.out.println(a);
        System.out.println(f);
        System.out.println(r);
        final int e = 150;
        final byte b = (byte)e;
        System.out.println(e);
        System.out.println(b);
    }
}
