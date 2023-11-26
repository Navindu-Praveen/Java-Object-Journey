package com.company;

public class StaM {

	public static void main(String[] args) {
		Employee.WorkingHrs=18;
		Employee.WrkH();
				
		Employee emp1 = new Employee();
		
		emp1.EmpSal=1000;
		
		emp1.WorkingHrs=10;
		
		System.out.println();
		
		emp1.WrkH();
		System.out.println();
		emp1.call();
		System.out.println();
		
		
		
		

	}

}
