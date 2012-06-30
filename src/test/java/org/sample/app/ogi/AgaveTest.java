package org.sample.app.ogi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgaveTest {
	private Agave testObject;
	@Before
	public void setUp() throws Exception {
		testObject = new Agave();
	}

	@Test
	public final void testAgaveMethod() {
		assertEquals(3,testObject.agaveMethod(33));
	}

}
