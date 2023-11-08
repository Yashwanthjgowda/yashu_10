package com.fundamentals;
//  (/) operator gives with qotient
//  (%) operator gives with remainder
// operators are used to create some mathemetical function
// operators :
// arithmetic operators:+,-,*,/,%
public class Testa {
	int a = 10;//int (data type) a= name of variable
	int b= 2;
	public void add() {
		System.out.println(10+2);
	}
	public void sub() {
		System.out.println(10-2);
	}
	public void mul() {
		System.out.println(10*2);
	}
	public void divide() {
		System.out.println(10/2);
	}
	public void modulus() {
		System.out.println(10%2);
	}
	public static void main(String[] args){
		Testa a = new Testa();
		a.add();
		a.sub();
		a.mul();
		a.divide();
		a.modulus();
		
		
	}

}
