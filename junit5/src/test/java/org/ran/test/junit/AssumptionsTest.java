package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;
import org.ran.test.junit.util.AssertionUtils;

public class AssumptionsTest {
	@Test
	public void test() {
		AssertionUtils.success();
		assumeTrue(false);
		fail();
	}
	@Test
	public void test1() {
		assumingThat(false, ()->{
			fail();
		});
		AssertionUtils.success();
		
	}
}
