package com.fundamentals;
/*
 * constructor:special function
 * name of the function matches with name of class name
 * this  function doesn't have the return type not even a void
 * constructors are used to instantiate a class(creating a object)
 */

class Studentdata{  //class
	Studentdata(){//function
		System.out.println("object created");
	}
}
public class Test5 {
	
	public static void main(String[] args){
		Studentdata s = new Studentdata();
		
	}

}
