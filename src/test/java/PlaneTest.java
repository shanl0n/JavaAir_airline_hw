import com.codebase.flights.plane.Plane;
import com.codebase.flights.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PlaneTest {

	Plane plane;

	@Before
	public void before() { plane = new Plane(PlaneType.PIPERCHEYENNE);}

	@Test
	public void canGetPlaneType() {
		assertEquals(PlaneType.PIPERCHEYENNE, plane.getType());}

	@Test
	public void canGetCapacity() {
		assertEquals(9, plane.getCapacity());}

	@Test
	public void canGetWeight() {
		assertEquals(5466, plane.getWeight());}
}
