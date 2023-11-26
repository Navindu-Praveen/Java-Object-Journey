package com.company;

public class Van extends Vehicle {
	int noOfDoors;
	int loadCapacity;
	
	public void loadVan() {
		System.out.println("Loading...");
	}
	
	public void showVanDetails() {
		 vehicleName = "Toyota";
		 color= "black";
		 numberOfWheels = 4;
		 seats = 4;
		 noOfDoors = 4;
		 loadCapacity = 1800;
		 
		 System.out.println("car name : " +this.vehicleName);
		 System.out.println("car color : " +this.color);
		 System.out.println("car number Of Wheels : " +this.numberOfWheels);
		 System.out.println("car number of seats : " +this.seats);
		 System.out.println("car number of Doors : " +this.noOfDoors);
		 
	}

}
