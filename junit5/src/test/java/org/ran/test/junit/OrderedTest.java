package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTest {
	private static int counter = 0;
	@Test
	@Order(1)
	void test1() {
		assertEquals(++counter, 1);
	}

	@Test
	@Order(2)
	void test2() {
		assertEquals(++counter, 2);
	}

	@Test
	@Order(3)
	void test3() {
		assertEquals(++counter, 3);
	}
}
