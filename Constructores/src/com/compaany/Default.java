package com.compaany;

public class Default {
	
	String name;
	int age;
	String color;
	int sid;
	
	//default constructor
	public Default() {
		 this.name = "std name";
		 this.age = 00;
		 this.color = "white";
		 this.sid = 0001;
	}
	
	public Default(String snm,int age,String clr,int id) {
		this.name=snm;
		this.age=age;
		this.color=clr;
		this.sid=id;
		}
	
	public void show() {
		System.out.println("student name :" +this.name);
		System.out.println("Student age :"+this.age);
		System.out.println("Student color :"+this.color);
		System.out.println("Student id:"+this.sid);
	}
	
	
	

}
