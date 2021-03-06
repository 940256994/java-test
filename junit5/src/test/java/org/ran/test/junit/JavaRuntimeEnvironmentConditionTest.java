package org.ran.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JavaRuntimeEnvironmentConditionTest {
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void onlyOnJava8() {
	    // ...
	}

	@Test
	@EnabledOnJre({ JRE.JAVA_9, JRE.JAVA_10 })
	void onJava9Or10() {
	    // ...
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
	void fromJava9to11() {
	    // ...
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_9)
	void fromJava9toCurrentJavaFeatureNumber() {
	    // ...
	}

	@Test
	@EnabledForJreRange(max = JRE.JAVA_11)
	void fromJava8To11() {
	    // ...
	}

	@Test
	@DisabledOnJre(JRE.JAVA_9)
	void notOnJava9() {
	    // ...
	}

	@Test
	@DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
	void notFromJava9to11() {
	    // ...
	}

	@Test
	@DisabledForJreRange(min = JRE.JAVA_9)
	void notFromJava9toCurrentJavaFeatureNumber() {
	    // ...
	}

	@Test
	@DisabledForJreRange(max = JRE.JAVA_11)
	void notFromJava8to11() {
	    // ...
	}

	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	void onlyOn64BitArchitectures() {
	    // ...
	}

	@Test
	@DisabledIfSystemProperty(named = "ci-server", matches = "true")
	void notOnCiServer() {
	    // ...
	}
}
