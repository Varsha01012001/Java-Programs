package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCountA {

	@Test
	void test() {
		Methods obj = new Methods();
		int count = obj.countA("Varsha");
		
		assertEquals(2, count);
	}

}
