package com.fundamentals;

public class Test14 {
	public void unaryoperator() {
		int a=10;
		int b=a--;
		/*
		 * assign value of a to b
		 * a=a-1
		 * assign the value of c to d
		 * d=c;
		 * example of post decrement
		 */
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
		
	}
	public static void main(String[] args){
		Test14 t = new Test14();
		t.unaryoperator();
	}
}


