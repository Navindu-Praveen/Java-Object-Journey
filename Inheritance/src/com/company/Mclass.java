package com.company;

public class Mclass {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Bike bike1 = new Bike();
		Van van1 = new Van();
		Vehicle vehicle1 = new Vehicle();
		
		car1.showcarDetails();
		vehicle1.start();
		vehicle1.accelerating();
		vehicle1.vehicleBreak();
		
		System.out.println();
		
		bike1.showBikeDetails();
		vehicle1.start();
		vehicle1.accelerating();
		vehicle1.vehicleBreak();
		
		System.out.println();
		van1.showVanDetails();
		vehicle1.start();
		vehicle1.accelerating();
		vehicle1.vehicleBreak();
		van1.loadVan();
		System.out.println();
		
		

	}

}
