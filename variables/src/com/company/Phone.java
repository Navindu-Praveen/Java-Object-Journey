package com.company;

public class Phone {
	private String name;
	private String color;
	private int battery;
	private double price;
	
	public void setName(String sname) {
		this.name=sname;
	}
	
	public String getName() {
		return this.name;
	}
		
	public void call() {
		String callName = "Kasun";
		System.out.println("Calling to : " + callName);
	};
	public void sendText() {};
	public void findPlaces() {};
	public void takePhotos() {};

}
