import com.codebase.flights.Flight;
import com.codebase.flights.plane.Plane;
import com.codebase.flights.plane.PlaneType;
import com.codebase.people.crew.CabinCrew;
import com.codebase.people.crew.CockpitCrew;
import com.codebase.people.crew.CrewRank;
import com.codebase.people.passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

	private Plane plane;
	private Flight flight;
	private Passenger passenger;
	private Passenger passenger2;
	private Passenger passenger3;
	private Passenger passenger4;
	private CockpitCrew cockpitCrew;
	private CockpitCrew cockpitCrew2;
	private CabinCrew cabinCrew;
	private CabinCrew cabinCrew2;

	@Before
	public void before() {
		plane = new Plane(PlaneType.BOEING747);
		flight = new Flight(plane, "FR756", "EDI", "FUN", "12:00");
		passenger = new Passenger("Daniel", 2);
		passenger2 = new Passenger("Jack", 3);
		passenger3 = new Passenger("Rose", 1);
		passenger4 = new Passenger("Kate", 5);
		cockpitCrew = new CockpitCrew(CrewRank.CAPTAIN, "Jack Sparrow", "P1lot");
		cockpitCrew2 = new CockpitCrew(CrewRank.FIRSTOFFICER, "Will Turner", "P2lot");
		cabinCrew = new CabinCrew(CrewRank.FLIGHTATTENDANT, "Jan");
	}

	@Test
	public void hasPlane() {
		assertEquals(plane, flight.getPlane());
	}

	@Test
	public void hasFlightNumber() {
		assertEquals("FR756", flight.getFlightNumber());
	}

	@Test
	public void canSetFlightNumber() {
		flight.setFlightNumber("DTK253");
		assertEquals("DTK253", flight.getFlightNumber());
	}

	@Test
	public void hasDepartureAirport() {
		assertEquals("EDI", flight.getDepartureAirport());
	}

	@Test
	public void canSetDepartureAirport() {
		flight.setDepartureAirport("OMG");
		assertEquals("OMG", flight.getDepartureAirport());
	}

	@Test
	public void hasDestinationAirport() {
		assertEquals("FUN", flight.getDestinationAirport());
	}

	@Test
	public void canSetDestinationAirport() {
		flight.setDestinationAirport("WTF");
		assertEquals("WTF", flight.getDestinationAirport());
	}

	@Test
	public void hasDepartureTime() {
		assertEquals("12:00", flight.getDepartureTime());
	}

	@Test
	public void hasNoCockpitCrew() {
		assertEquals(0, flight.getCockpitCrewCount());
	}

	@Test
	public void hasNoCabinCrew() {
		assertEquals(0, flight.getCabinCrewCount());
	}

	@Test
	public void hasNoPassengers() {
		assertEquals(0, flight.getPassengerCount());
	}

	@Test
	public void canAddCockpitCrew() {
		flight.addCockpitCrew(cockpitCrew);
		flight.addCockpitCrew(cockpitCrew2);
		assertEquals(2, flight.getCockpitCrewCount());
	}

	@Test
	public void canAddCabinCrew() {
		flight.addCabinCrew(cabinCrew);
		assertEquals(1, flight.getCabinCrewCount());
	}

	@Test
	public void canAddPassenger() {
		flight.addPassenger(passenger);
		flight.addPassenger(passenger2);
		assertEquals(2, flight.getPassengerCount());
	}

	@Test
	public void canReturnAvailableSeats() {
		flight.addPassenger(passenger);
		flight.addPassenger(passenger2);
		assertEquals(465, flight.remainingSeats());
	}
}
