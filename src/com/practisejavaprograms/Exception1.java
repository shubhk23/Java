package com.practisejavaprograms;

public class Exception1 {

	public static void main(String[] args) {
		try {
	int a[]=new int [5];
	a[0]=30/0;
	System.out.println(a[10]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithamtic Excepption error occur"+ e);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//finally block 
		finally{
                  System.out.println("This is finally");			
		}
	}
}
