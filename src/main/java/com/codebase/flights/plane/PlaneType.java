package com.codebase.flights.plane;

public enum PlaneType {

	BOEING747(467,412_000),
	PIPERCHEYENNE(9,5466);

	private final int capacity;
	private final int weight;

	PlaneType(int capacity, int weight) {
		this.capacity = capacity;
		this.weight = weight;}

	public int getCapacity() {
		return capacity;
	}

	public int getWeight() {
		return weight;
	}
}
