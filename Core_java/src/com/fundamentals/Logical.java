package com.fundamentals;
// logical operators:
// logical operatoRs are used to combine two different condition we use logical operators
// AND (&&)
//OR (||)
//LOGICAL NOT (!())

public class Logical {
	public void logicaloperator() {
		int x = 10;
		int y = 20;
		System.out.println((x>y)&&(x<y));
		System.out.println((x<y)&&(x==y));
		System.out.println((x<y)&&(x!=y));
	}
	public static void main(String[] args){
		Logical l = new Logical();
		l.logicaloperator();
	}

}
