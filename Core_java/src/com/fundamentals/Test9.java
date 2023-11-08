package com.fundamentals;
// this keyword

class Carr2{
	Carr2(){
		System.out.println("value of this key word:"+this.hashCode());
	}
}
public class Test9 {
	
	public static void main(String[] args){
		Carr2 c = new Carr2();
		System.out.println("value of c:"+c.hashCode());
	}
}
