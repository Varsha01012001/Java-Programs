package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSquare {

	@Test
	void test() {
		Methods obj = new Methods();
		int actualResult = obj.square(2);
		
		assertEquals(4, actualResult);
		}

}
