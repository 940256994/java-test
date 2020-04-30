package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DisabledTest {
	@Disabled("Disabled until bug #42 has been resolved")
	@Test
	public void testWillBeSkipped() {
		fail();
	}
	
	@Nested
	@Disabled("Disabled until bug #99 has been fixed")
	class DisabledClassDemo {

	    @Test
	    void testWillBeSkipped() {
	    	fail();
	    }

	}
}
