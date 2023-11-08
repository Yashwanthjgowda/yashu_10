package com.fundamentals;

public class Student {
	int idofstudent =100;
	String nameofstudent="yashwanth";
	static String  nameofclg= "BE PRACTICAL";//static variable
	public void display() {
		System.out.println(idofstudent);
		System.out.println(nameofstudent);
		System.out.println(nameofclg);
	}
	public static void main(String[] args){
		Student t = new Student();
		//System.out.println(t.idofstudent);
		//System.out.println(t.nameofstudent);
		//System.out.println(Student.nameofclg);
		t.display();
	
		
	}

}
