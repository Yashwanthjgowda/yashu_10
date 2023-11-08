package com.fundamentals;

public class Test1 {
	public void getsize() {
		System.out.println("byte size="+Byte.SIZE+"bits");
		System.out.println("short size="+Short.SIZE+"bits");
		System.out.println("int size="+Integer.SIZE+"bits");
		System.out.println("long size="+Long.SIZE+"bits");
		System.out.println("char size="+Character.SIZE+"bits");
		System.out.println("float size="+Float.SIZE+"bits");
		System.out.println("double size="+Double.SIZE+"bits");
		
	}
	public void getRange() {
		System.out.println("Byte");
		System.out.println("Max value :"+Byte.MAX_VALUE + "Min value :"+Byte.MIN_VALUE);
		System.out.println("Max value :"+Short.MAX_VALUE +"Min value :"+Short.MIN_VALUE);
		System.out.println("Max value :"+Integer.MAX_VALUE +"Min value :"+Integer.MIN_VALUE);
		System.out.println("Max value :"+Long.MAX_VALUE +"Min value :"+Long.MIN_VALUE);
		System.out.println("Max value :"+Character.MAX_VALUE +"Min value :"+Character.MIN_VALUE);
		System.out.println("Max value :"+Float.MAX_VALUE +"Min value :"+Float.MIN_VALUE);
		System.out.println("Max value :"+Double.MAX_VALUE +"Min value :"+Double.MIN_VALUE);
		
	}
	
	public static void main(String[] args){
		Test1 t = new Test1();
		t.getsize();
		
		t.getRange();
	
	
	
	}
	}


