package com.fundamentals;
//relational operator
public class Relational {
	public void relationaloperator() {
	int a = 10;
	int b = 10;
	System.out.println("greater = "+(a>b));
	System.out.println("lesser  = "+(a<b));
	System.out.println("greater than equal to = "+(a>=b));
	System.out.println("lesser than equal to  = "+(a<=b));
	System.out.println("equal  = "+(a==b));
	System.out.println("not_equal_to  = "+(a!=b));
	
	}
	public static void main(String[] args){
		Relational b = new Relational();
		b.relationaloperator();
	}
}
