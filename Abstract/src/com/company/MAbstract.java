package com.company;

public class MAbstract {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Circule c1 = new Circule();
		
		
		r1.length=10;
		r1.width=5;
		c1.radius=2;
		
		System.out.println();
		System.out.println("Area of Rectangele : " +r1.getArea());
		System.out.println();
		System.out.println("Area of Circule  : " +c1.getArea());
		
		
	}

}
