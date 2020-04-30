package org.ran.test.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class LifecyclePerClassTest {
	@BeforeAll
	public void beforeAll() {
		// non static with @TestInstance(Lifecycle.PER_CLASS)
	}
	
	@AfterAll
	public void afterAll() {
		// non static with @TestInstance(Lifecycle.PER_CLASS)
	}
}
