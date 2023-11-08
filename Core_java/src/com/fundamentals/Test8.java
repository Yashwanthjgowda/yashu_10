package com.fundamentals;
/**copy constructor
 * 
 * 
 */
class Carr{
	int numberofwheels;
	String carname;
	Carr(int wheels,String name){
		numberofwheels=wheels;
		carname=name;
	}
	Carr(Carr obj){
		numberofwheels=obj.numberofwheels;
		carname=obj.carname;
	}
	
	public void show() {
		System.out.println("wheels:"+numberofwheels);
		System.out.println("name:"+carname);
		
	}
}
public class Test8 {
	
	public static void main(String[] args){
		Carr car1 = new Carr(4,"santro");
		car1.show();
		Carr car2 = new Carr(car1);
		car2.show();
		
	}
}
