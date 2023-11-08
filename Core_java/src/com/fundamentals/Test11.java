package com.fundamentals;

public class Test11 { 
	         
	int x=5;
	 public Test11() {
		
	}

	public void Main(int x) {
		    this.x = x;
		  }
	
	public static void main(String[] args){
		
		Test11 t1 = new Test11();
		t1.Main(11);
	    System.out.println("Value of x = " + t1.x);
	}
}
