package com.fundamentals;

public class Test16 {
	public void ternaryoperator() {
		// condition ? start1 : start2
		int a =10;
		int b =20;
		String result =(a>b)?"hello":"hi";
		System.out.println(result);
		String result1 =(a<b)?"hello":"hi";
		System.out.println(result1);
		
		
	}
	public static void main(String[] args){
		Test16 t = new Test16();
		t.ternaryoperator();
	}

}
