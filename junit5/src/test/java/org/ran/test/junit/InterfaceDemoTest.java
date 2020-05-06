package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.ran.test.junit.inter.TestInterfaceDynamicTestsDemo;
import org.ran.test.junit.inter.TimeExecutionLogger;

public class InterfaceDemoTest implements LifecycleLoggerTest, TimeExecutionLogger, TestInterfaceDynamicTestsDemo {

	@Test
	void isEqualValue() {
		assertEquals(1, "a".length(), "is always equal");
	}

}