package com.comapny;

public class ExH {

	public static void main(String[] args) {
		int h;
		int j;
		int c;
		
		h=10;
		j=0;
		c=0;
	
		try {
		c =h/j;
		}catch(ArithmeticException ar1) {
			System.out.println("You cant divide by zero");
		}
		System.out.println("Sum is :" +c);
		
		int array[] = new int[5];
		
		
		try {
		array[0]=1;
		array[1]=3;
		array[6]=7;
		}catch(ArrayIndexOutOfBoundsException inb1) {
			System.out.println("Array size is 5 you cant enter greater than it");
		}
				
		
		
		
	}

}
