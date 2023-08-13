package com.practisejavaprograms;

public class Objectclone implements cloneable {
	static int roollno;
	static String student;
	void Student18(int rollno, String student){
		this.roollno=roollno;
		this.student=student;
	}
 public Object Objectclone() throws CloneNotSupportedException{
	 return super.clone();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Student1 obj1=new Student18(10,"Shubh");
		Student18 obj2=(Student18).obj1.clone();
		System.out.println(obj1.rollno + obj1.student);
	    System.out.println(obj2.rollno+ obj2.student);	
		}
	    catch{
	    	(CloneNotSupportedException c){}  
		}
     
	}

}
