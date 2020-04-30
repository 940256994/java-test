package org.ran.test.junit;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
/**
 * @see org.junit.jupiter.engine.extension.RepetitionInfoParameterResolver
 * @see org.junit.jupiter.engine.extension.TestReporterParameterResolver
 * 
 * @author caoran
 * @date 2020年4月30日
 */
public class TestReporterTest {
	@Test
	void reportSingleValue(TestReporter testReporter) {
		testReporter.publishEntry("a status message");
	}

	@Test
	void reportKeyValuePair(TestReporter testReporter) {
		testReporter.publishEntry("a key", "a value");
	}

	@Test
	void reportMultipleKeyValuePairs(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("user name", "dk38");
		values.put("award year", "1974");

		testReporter.publishEntry(values);
	}

}
