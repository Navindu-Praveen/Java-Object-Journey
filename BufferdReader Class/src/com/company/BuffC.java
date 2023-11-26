package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffC {

	public static void main(String[] args) throws Exception  {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		Buf2 buf2 = new Buf2();
		
		
		System.out.println("Enter Employee name :");
		buf2.name = bfr.readLine();
		
		System.out.println();
		
		System.out.println("Enter Employee Salary1 :");
		buf2.sal = Integer.parseInt(bfr.readLine());
		
		System.out.println();
		
		System.out.println("Enter Employee Salary2 :");
		buf2.sal2 = Float.parseFloat(bfr.readLine());
		
		System.out.println();
		
		System.out.println("Enter Employee Salary3 :");
		buf2.sal3 = Double.parseDouble(bfr.readLine());
		
		System.out.println();
		
		
		System.out.println("*******************************");
		System.out.println();
		
		buf2.showN();
		buf2.showS1();
		buf2.showS2();
		buf2.showS3();
		
		
	}

}
