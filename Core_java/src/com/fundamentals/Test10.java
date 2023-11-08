package com.fundamentals;
//case 1: solve the naming confliction when
//name of instance variable and construct variable are same

class vehicle{
	int numberofwheels;
	String name;
	
	vehicle(int numberofwheels,String name){
		this.numberofwheels=numberofwheels;//this keyword is used to ensure which is the given instance.variable.
		 this.name= name;//this keyword is used to ensure which is the given instance.variable.
	}
	public void display() {
		System.out.println("Wheels:"+numberofwheels);
		System.out.println("name:"+name);
	}
}
public class Test10 {
	public static void main(String[] args){
		vehicle v = new vehicle(4,"santro");
		v.display();
	}
}

