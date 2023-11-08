package com.fundamentals;
//variables: named memory location
//instance variable
//objectName.VariableName
//static variable 
//ClassName.VariableName
//local variable:variable defined inside a method

public class Test2 {
	int a =100;//instance variable
	static int b= 200;//static variable
	
	public void m1()
	{
		int c = 2000;
		System.out.println(c);
	}
	public static void main(String[] args){
		//ClassName nameofObj = new ClassName();
		Test2 t = new Test2();
		//System.out.println(t.a);//objname.variablename
		
		Test2 t1 = new Test2();
		//System.out.println(t1.a);
		
		t.a=20;//changing 
		System.out.println(t.a);
		System.out.println(t1.a);
		t1.a=40;//changing 
		System.out.println(t1.a);
		
		System.out.println(Test2.b);
		
		Test2.b=1000;//changing 
		System.out.println(Test2.b);
		
		t.m1();
		
		
		
		
		
	}
	}


