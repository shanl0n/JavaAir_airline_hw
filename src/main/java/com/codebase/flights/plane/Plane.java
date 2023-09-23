package com.codebase.flights.plane;

public class Plane {

	private PlaneType planeType;

	public Plane(PlaneType type) {
		this.planeType = type;
	}

	public PlaneType getType() {
		return planeType;
	}

	public int getCapacity() {
		return this.planeType.getCapacity();
	}

	public int getWeight() {
		return this.planeType.getWeight();
	}
}
