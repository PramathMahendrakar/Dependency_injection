package com.pra.spring.Tester;

import com.pra.spring.Battery.Battery;
import com.pra.spring.Fuel.Fuel;
import com.pra.spring.Vehicle.Vehicle;

public class tester {

	public static void main(String[] args) {

		Battery excide = new Battery();
		excide.setCapacity(2);

		Fuel desial = new Fuel();
		desial.setQuantity(0);

		Vehicle car = new Vehicle("KA 17 DA 9900", "Pramath", excide, desial);
		car.start();

	}
}
