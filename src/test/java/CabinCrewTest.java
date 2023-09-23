import com.codebase.people.crew.CabinCrew;
import com.codebase.people.crew.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

	CabinCrew cabinCrew;

	@Before
	public void before() { cabinCrew = new CabinCrew(CrewRank.FLIGHTATTENDANT, "Jan");}

	@Test
	public void hasRank() {
		assertEquals(CrewRank.FLIGHTATTENDANT, cabinCrew.getRank());
	}

	@Test
	public void hasName() {
		assertEquals("Jan", cabinCrew.getName());
	}

	@Test
	public void canSetName() {
		cabinCrew.setName("Janice");
		assertEquals("Janice", cabinCrew.getName());
	}

	@Test
	public void canRelayMessage() {
		assertEquals("Seat backs and tray tables must be placed in their upright and locked positions", cabinCrew.makeAnnouncement());
	}
}
