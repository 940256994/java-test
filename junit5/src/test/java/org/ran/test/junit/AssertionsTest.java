package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class AssertionsTest {
	@Test
	public void test() {
		assertAll("equals", () -> assertEquals("1", "1"));
		assertNotNull(new Object());
		assertThrows(RuntimeException.class, () -> {throw new RuntimeException("msg");}, "supplied");
		assertTimeout(Duration.ofSeconds(2), () -> {});
		// not in the caller thread
		assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {});
		assertTrue(true);
		//assertArrayEquals
		//assertDoesNotThrow
		//assertFalse
		//assertNotEquals
		//assertNotSame
		//assertNull
		//assertIterableEquals
	}
}
