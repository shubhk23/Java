package com.practisejavaprograms;

public class ConcatTest {

	public static void main(String[] args) {
	 long startTime=System.currentTimeMillis();
	   StringBuffer sb=new StringBuffer("Concat");
        	for(int i=0;i<10000;i++) {
		      sb.append("Buffer");
		//System.out.println(sb);
		}
	
	System.out.println("Time taken by StringBuffer="+(System.currentTimeMillis()-startTime)+ "ms");
	
	 startTime=System.currentTimeMillis();
	   StringBuilder sb1=new StringBuilder("Concat");
	         for(int i=0;i<10000;i++) {
		          sb1.append("Builder");
		//System.out.println(sb1);
	}
		// TODO Auto-generated method stub
	System.out.println("Time taken by StringBuilder="+(System.currentTimeMillis()-startTime)+"ms");
	}

}
