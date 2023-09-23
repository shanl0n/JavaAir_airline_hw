import com.codebase.people.passengers.Passenger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

	Passenger passenger;

	@Before
	public void before() { passenger = new Passenger("Amanda", 6);}

	@Test
	public void hasName() {
		assertEquals("Amanda", passenger.getName());
	}

	@Test
	public void canSetName() {
		passenger.setName("Amanda");
		assertEquals("Amanda", passenger.getName());
	}

	@Test
	public void canGetBags() {
		assertEquals(6, passenger.getBags());
	}

	@Test
	public void canSetBags() {
		passenger.setBags(5);
		assertEquals(5, passenger.getBags());
	}
}
