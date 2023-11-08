package com.fundamentals;

public class Simple {
	int principleamount =100;
	int time = 5;
	static float year = 7.5f;
	
	public void simpleintrest() {
		System.out.println(principleamount*time*year/100);
		
	}
	public static void main(String[] args){
		Simple t = new Simple();
		
		t.simpleintrest();
	}
}
     

