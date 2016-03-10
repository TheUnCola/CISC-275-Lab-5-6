package Game1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CrabTest {
	static Crab c;
	@Before
	public static void setUp() throws Exception {
		c = new Crab(1,1,1);
	}

	@After
	public static void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void getModeTest() {
		c.getMode();
	}
	
	@Test
	public void setModeTest() {
		fail("Not yet implemented");
	}

}
