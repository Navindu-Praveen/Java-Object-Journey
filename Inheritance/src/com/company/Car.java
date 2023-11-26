package com.company;

public class Car extends Vehicle{
	int noOfDoors;
	
	public void showcarDetails() {
		 vehicleName = "Toyota";
		 color= "black";
		 numberOfWheels = 4;
		 seats = 4;
		 noOfDoors = 4;
		 
		 System.out.println("car name : " +this.vehicleName);
		 System.out.println("car color : " +this.color);
		 System.out.println("car number Of Wheels : " +this.numberOfWheels);
		 System.out.println("car number of seats : " +this.seats);
		 System.out.println("car number of Doors : " +this.noOfDoors);
		 
	}

}
