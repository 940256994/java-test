package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedDemoTest {
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    assertTrue(StringUtils.isNotBlank(candidate));
	}
}
