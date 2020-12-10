package com.pra.spring.Battery;

public class Battery {

	private double capacity;
	private int powerInWatts;

	public Battery() {

		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	public boolean charge() {

		boolean charing = false;
		if (this.powerInWatts > 100) {
			System.out.println("Battery charge");
			charing = true;
		} else
			System.out.println("Battery is not working");
		return charing;
	}

	public boolean discharge() {
		boolean working = false;
		if (capacity > 0) {
			System.out.println("the battery is discharging");
			working = true;
		} else
			System.out.println("Battery is not Working");

		return working;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getPowerInWatts() {
		return powerInWatts;
	}

	public void setPowerInWatts(int powerInWatts) {
		this.powerInWatts = powerInWatts;
	}

}
