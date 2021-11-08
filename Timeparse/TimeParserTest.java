import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeParserTest {
	
	private TimeParser tp = new TimeParser();
	
	
	@Test
	void testam() {
		assertEquals(95,  tp.parseTimeToMinutes("1:35am"), "am calculation error");
	}

}
