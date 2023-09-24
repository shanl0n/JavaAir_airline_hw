package com.codebase.flights;

import com.codebase.flights.plane.Plane;
import com.codebase.people.crew.CabinCrew;
import com.codebase.people.crew.CockpitCrew;
import com.codebase.people.passengers.Passenger;

import java.util.ArrayList;

public class Flight {
	private Plane plane;
	private ArrayList<CockpitCrew> cockpitCrew;
	private ArrayList<CabinCrew> cabinCrew;
	private ArrayList<Passenger> passengers;
	private String flightNumber;
	private String departureAirport;
	private String destinationAirport;
	private String departureTime;

	public Flight(Plane plane, String flightNumber, String departureAirport, String destinationAirport, String departureTime) {
		this.plane = plane;
		this.flightNumber = flightNumber;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.cockpitCrew = new ArrayList<CockpitCrew>();
		this.cabinCrew = new ArrayList<CabinCrew>();
		this.passengers = new ArrayList<Passenger>();
	}

	public Plane getPlane() {
		return plane;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public String getDepartureTime() {
		return departureTime;
	}


}
