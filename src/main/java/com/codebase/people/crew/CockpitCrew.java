package com.codebase.people.crew;

public class CockpitCrew extends FlightCrew{

	private final String licenceNumber;

	public CockpitCrew(CrewRank rank, String name, String licenceNumber) {
		super(rank, name);
		this.licenceNumber = licenceNumber;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}



	public String takeoff() {
		return "I believe I can fly!";
	}
}
