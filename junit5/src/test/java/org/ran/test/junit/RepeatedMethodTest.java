package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RepeatedMethodTest {
	private int i = 0;

	/**
	 * default display name: "repetition {currentRepetition} of {totalRepetitions}"
	 * 
	 * @param testInfo
	 */
	@RepeatedTest(value = 10, name = "{currentRepetition}")
	void repeatedTest(TestInfo testInfo) {
		assertEquals(Integer.toString(++i), testInfo.getDisplayName());
	}

	private Logger logger = Logger.getLogger(RepeatedMethodTest.class.getName());

	@BeforeEach
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		String methodName = testInfo.getTestMethod().get().getName();
		logger.info(String.format("About to execute repetition %d of %d for %s", //
				currentRepetition, totalRepetitions, methodName));
	}

	@RepeatedTest(10)
	void repeatedTest() {
		// ...
	}

	@RepeatedTest(5)
	void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
		assertEquals(5, repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Repeat!")
	void customDisplayName(TestInfo testInfo) {
		assertEquals("Repeat! 1/1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Details...")
	void customDisplayNameWithLongPattern(TestInfo testInfo) {
		assertEquals("Details... :: repetition 1 of 1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 5, name = "Wiederholung {currentRepetition} von {totalRepetitions}")
	void repeatedTestInGerman() {
		// ...
	}
}
