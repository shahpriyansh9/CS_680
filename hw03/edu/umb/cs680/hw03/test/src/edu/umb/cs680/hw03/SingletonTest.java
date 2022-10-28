package edu.umb.cs680.hw03;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SingletonTest {

	@Test
	public void testInst_not_null() {
		assertNotNull(Singleton.getInstance());
	}

	@Test
	public void test_equal_hashvalues() {
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
	}
}