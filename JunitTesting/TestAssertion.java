package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class TestAssertion {

	@Test
	public void TestAssertion() {

		int a = 10;
		int b = 20;
		String s1 = "Welcome";
		String s2 = "Welcome";

		assertSame(a, b);

		assertNotSame(a, b);

		assertTrue(a < b);

		assertSame(s1, s2);

		assertNull(s1);

		assertNotNull(s2);

		assertNull(s2);

	}
}
