package com.codebase.people.crew;

import com.codebase.people.Person;

public class FlightCrew extends Person {

	CrewRank rank;

public FlightCrew(CrewRank rank, String name) {
		super(name);
		this.rank = rank;
	}

	public CrewRank getRank() {
		return rank;
	}
}
