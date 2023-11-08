package com.fundamentals;
//unary operator 
//++ increment
//-- decrement
public class Test12 {
	public void unaryoperator() {
		int a=12;
		int b=a++;
		/*
		 * assign value of a to b
		 * b=a
		 * after assigning,increment the value of a by 1
		 * example of post increment
		 */
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
		
	}
	public static void main(String[] args){
		Test12 t = new Test12();
		t.unaryoperator();
	}
}











