package com.fundamentals;
//Method :block of code to perform the task
//Non-static method:object.nameofMethod
//static method:className.nameofMethod

//Syntax: acessModifiers(public) returnType(void) fn(arg-list)
public class Test3 {
	
	//Non-static method:
	public void m1() {
		System.out.println(11+12);
	}
	public void m2(int a,int b) {
		System.out.println( a+ b);
		
	}
	//Static method
	public static void m3() {
		System.out.println("hello");
		
	}
	
	
	public static void main(String[] args){
		Test3 obj = new Test3();
		obj.m1();
		obj.m2(10, 10);
		Test3.m3();
		
	}

}
