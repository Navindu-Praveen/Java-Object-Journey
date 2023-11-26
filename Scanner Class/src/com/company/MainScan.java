package com.company;

import java.util.Scanner;

public class MainScan {
	public static void main (String args[]) {
		Scanner takeInput = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Welcome...");
		System.out.println();
		
		System.out.println("Enter Your Employee Name :");
		emp.Ename = takeInput.next();
		System.out.println();
		
		System.out.println("Enter Your Employee ID :");
		emp.EId = takeInput.nextInt();
		System.out.println();
		
		System.out.println("Enter Your Employee Salary :");
		emp.Esalary = takeInput.nextDouble();
		System.out.println();
		
		System.out.println("Enter Your Employee Working Hours :");
		emp.EWhr = takeInput.nextFloat();
		System.out.println();
		
		
		emp.showEname();
		emp.showEId();
		emp.showEsalary();
		emp.showEWhr();
		
	}

}
