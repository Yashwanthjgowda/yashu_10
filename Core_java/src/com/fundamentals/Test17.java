package com.fundamentals;
// used to managing of bits
public class Test17 {
	public void shiftoperator() {
		// left-shift(<<) ,right-shift(>>)
		int a =10;//1 0 1 0
		int b =10;//1 0 1 0
		a=a<<1;//left shift (multiplying of 2)
		b=b>>1;// right shift(dividing of 2)
		//a=a>>1;
		System.out.println(a);//1 0 1 0 0
		System.out.println(b);//0 1 0 1
		
		
		
	}
	public static void main(String[] args){
		Test17 t = new Test17();
		t.shiftoperator();
	}


}
