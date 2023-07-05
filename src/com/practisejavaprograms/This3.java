package com.practisejavaprograms;

public class This3 {

	//To invoke current class constructor
	This3(){
		System.out.println("wow");
	}
	This3(int x){
		this();
		System.out.println(x);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This3 t=new This3(10);
        
	}

}
