package com.fundamentals;

public class Dimension {
	int r = 100;
	int w=5;
	int l=6;
	public int areaofSquare() {
		return (r*r);
	}
	public int areaofrectangle() {
		return (w*l);
	}
	public double perimeterofacircle(int radius) {
		return 2*Math.PI*radius;
	}
	public static void main(String[] args){
		Dimension t = new Dimension();
		int result = t.areaofSquare();
		System.out.println(result);
		int result1 = t.areaofrectangle();//creating a method returning value from method
		System.out.println(result1);
		double area=t.perimeterofacircle(10);
		System.out.println(area);
	}
}
