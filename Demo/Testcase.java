import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class Testcase {
	private CoverageExample tc = new CoverageExample();;
		
	@Test
	public void testIdentityAllTrue() {
		assertEquals(0,  tc.identity(0,  true,  true,  true));
	}

	@Test
	public void testIdentityAllFalse() {

		assertEquals(0,  tc.identity(0,  false,  false,  false));
	}

	

}
