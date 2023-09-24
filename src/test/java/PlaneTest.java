import com.codebase.flights.plane.Plane;
import com.codebase.flights.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PlaneTest {

	Plane plane;

	@Before
	public void before() { plane = new Plane(PlaneType.BOEING747);}

	@Test
	public void canGetPlaneType() {
		assertEquals(PlaneType.BOEING747, plane.getType());}

	@Test
	public void canGetCapacity() {
		assertEquals(467, plane.getCapacity());}

	@Test
	public void canGetWeight() {
		assertEquals(412_000, plane.getWeight());}
}
