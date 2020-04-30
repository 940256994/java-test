package org.ran.test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ran.test.junit.materiel.extension.RandomParametersExtension;
import org.ran.test.junit.materiel.extension.RandomParametersExtension.Random;

@ExtendWith(RandomParametersExtension.class)
public class MyRandomParametersTest {

	@Test
	void injectsInteger(@Random int i, @Random int j) {
		assertNotEquals(i, j);
	}

	@Test
	void injectsDouble(@Random double d) {
		assertEquals(0.0, d, 1.0);
	}

}
