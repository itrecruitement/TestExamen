package edu.esprit.examenjee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiboTest {
	Fibo f;
	@Before
	public void setUp() throws Exception {
		f = new Fibo();
	}

	@Test
	public void itShouldReturnOneWhenTwo() {
		assertEquals(1, f.process(2));
	}

}
