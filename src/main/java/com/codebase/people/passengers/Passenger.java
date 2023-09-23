package com.codebase.people.passengers;

import com.codebase.people.Person;

public class Passenger extends Person {
	int bags;

	public Passenger(String name, int bags) {
		super(name);
		this.bags = bags;
	}

	public int getBags() {
		return bags;
	}

	public void setBags(int bags) {
		this.bags = bags;
	}
}
