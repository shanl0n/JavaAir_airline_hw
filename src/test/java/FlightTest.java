import com.codebase.flights.Flight;
import com.codebase.flights.plane.Plane;
import com.codebase.flights.plane.PlaneType;
import com.codebase.people.passengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

	private Plane plane;
	private Flight flight;
	private Passenger passenger;

	@Before
	public void before() {
		plane = new Plane(PlaneType.BOEING747);
		flight = new Flight(plane, "FR756", "EDI", "FUN", "12:00");
		passenger = new Passenger("Daniel", 2);
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
	public void hasDepartureAirport() {
		assertEquals("EDI", flight.getDepartureAirport());
	}

	@Test
	public void hasDestinationAirport() {
		assertEquals("FUN", flight.getDestinationAirport());
	}

	@Test
	public void hasDepartureTime() {
		assertEquals("12:00", flight.getDepartureTime());
	}
}
