import  com.codebase.people.crew.CockpitCrew;
import com.codebase.people.crew.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CockpitCrewTest {

	CockpitCrew cockpitCrew;

	@Before
	public void before() { cockpitCrew = new CockpitCrew(CrewRank.CAPTAIN, "Jack Sparrow", "P1lot");}

	@Test
	public void hasRank() {
		assertEquals(CrewRank.CAPTAIN, cockpitCrew.getRank());
	}

	@Test
	public void hasName() {
		assertEquals("Jack Sparrow", cockpitCrew.getName());
	}

	@Test
	public void canGetLicence() {
		assertEquals("P1lot", cockpitCrew.getLicenceNumber());
	}

	@Test
	public void canTakeoff() {
		assertEquals("I believe I can fly!", cockpitCrew.takeoff());
	}
}
