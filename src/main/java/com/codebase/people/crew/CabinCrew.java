package com.codebase.people.crew;

public class CabinCrew extends FlightCrew {

	public CabinCrew(CrewRank rank, String name) {
		super(rank, name);
	}

	public String makeAnnouncement() {
		return "Seat backs and tray tables must be placed in their upright and locked positions";
	}
}
