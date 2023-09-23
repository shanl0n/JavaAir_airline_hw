package com.codebase.people.crew;

public enum CrewRank {

	CAPTAIN("Captain"),
	FIRSTOFFICER("First Officer"),
	PURSER("Purser"),
	FLIGHTATTENDANT("Flight Attendant");

	private final String rank;

	CrewRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}
}
