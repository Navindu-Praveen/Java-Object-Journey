package com.company;

public class Circule extends Shape{
	int radius;
	
	@Override
	public int getArea() {
		return (int)((22/7)*radius*radius);
	}
	
	

}
