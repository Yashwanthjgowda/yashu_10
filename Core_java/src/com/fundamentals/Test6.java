package com.fundamentals;
/**
 * types:
 * default-constructor(no argument ,0 argument constructor)
 * parametrized constructor
 * copy constructor
 */
class Employee{//jvm is going give function which is invisible so it is known as default constructor
	int empid;
	String empname;
	
	Employee(int id,String name){
		empid=id;
		empname=name;
	}
	public void display() {
		System.out.println("Empid:"+empid+"EmpName:"+empname);
	}
}
public class Test6 {
	public static void main(String[] args){
		Employee emp = new Employee(102,"harsh");
		Employee emp1 = new Employee(103,"amit");
		System.out.println("details of first employee");
		emp.display();
		System.out.println("details of first employee");
		emp1.display();
		
		
	}

}
