package com.company;

public class Employee {
	private String name;
	private static String managername;
	
	public void setEName(String enm) {
		this.name=enm;
	}
	public String getEName() {
		return this.name;
	}
	
	
	public static void setMName(String mnm) {
		managername=mnm;
	}
	public String getMName() {
		return managername;
	}
	
	public void display() {
		System.out.println("Employee name : " +this.name);
		System.out.println("Manager name : " +managername);
		
	}

}
