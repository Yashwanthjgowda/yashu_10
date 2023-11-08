package com.fundamentals;

class Carss{//jvm is going give function which is invisible so it is known as default constructor
	int noofwheels;
	String color;
	String name;
	
	
	Carss(int Number,String paint,String goodname){
		noofwheels=Number;
		color=paint;
		name=goodname;
		
	}
	public void display() {
		System.out.println("Noofwheels:"+noofwheels+"Color:"+color+"Name:"+name);
	}
}
public class Test7 {
	public static void main(String[] args){
		Carss emp = new Carss(102,"blue","xuv");
		Carss emp1 = new Carss(103,"red","zantro");
		Carss emp2 = new Carss(103,"black","Bmz");
		
		System.out.println("details of first car");
		emp.display();
		System.out.println("details of second car");
		emp1.display();
		System.out.println("details of third car");
		emp2.display();
		
	}

}


