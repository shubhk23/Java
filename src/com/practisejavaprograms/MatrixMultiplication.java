package com.practisejavaprograms;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
      int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
      //another matrix to store the multiplication of two matrix 
      int c[][]=new int [3][3]; 
      //Multiplying the twomatrix 
      for(int i=0;i<3;i++) {
    	  for(int j=0;j<3;j++) {
    		  c[i][j]=0;
    		  for(int k=0;k<3;k++) {
    			  c[i][j]+=a[i][k]*b[j][k];
    		  }
    			System.out.print(c[i][j]+"  "); 
    	  }
    	  System.out.println(" ");
      }
	}

}
