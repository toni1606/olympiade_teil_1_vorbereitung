package com.olympiade;

import java.util.Comparator;
public class Car {
	private short horsePower;
	private short productionYear;

	private String color;
	private String brand;
	private String model;

	public Car(short horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car{" +
				"horsePower=" + horsePower +
				'}';
	}

	public static Comparator<Car> compareHorsePower = new Comparator<Car>(){
		@Override
		public int compare(Car o1, Car o2) {
			return o1.horsePower - o2.horsePower;
		}
	};
}
