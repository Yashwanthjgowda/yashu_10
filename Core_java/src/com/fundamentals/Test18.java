package com.fundamentals;
// bitwise operators:
//&(bitwise AND)
//|(bitwise OR)
//^(bitwise XOR)
public class Test18 {
	public void bitwiseopearator() {
		int n1 =10;//1 0 1 0
		int n2= 10;//1 0 1 0
		System.out.println(n1&n2);//0 0 0 0
		System.out.println(n1|n2);//1 1 1 1 0
		int x1=11;//1 0 1 1
		int x2=12;//1 1 0 0
		System.out.println(x1^x2);//0 1 1 1
	}
	
	public static void main(String[] args){
		Test18 t = new Test18();
		t.bitwiseopearator();
}
}