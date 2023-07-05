package com.practisejavaprograms;

public class BankOverirde {

	public static void main(String[] args) {
		// Method Overriding
    SBI s=new SBI();
    ICIC i=new ICIC();
    AXIS a=new AXIS();
		System.out.println("State Bank of India "+s.getRateOfInterest());
		System.out.println("ICIC Bank "+i.getRateOfInterest());
		System.out.println("Axis Bank "+a.getRateOfInterest());
	}

}
