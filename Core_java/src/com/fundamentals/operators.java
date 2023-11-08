package com.fundamentals;
//arithmetic operators
public class operators {
	public void arithmeticoperators() {//access modifiers ,return type,name of function// class is idea objects are physically present
		int a = 10;
		int b = 5;
		System.out.println("Add "+(a+b));
		System.out.println("sub "+(a-b));
		System.out.println("mul "+(a*b));
		System.out.println("div "+(a/b));
		System.out.println("modulus "+(a%b));
	}
	public static void main(String[] args){
		operators b = new operators();
		b.arithmeticoperators();
		
	}

}
