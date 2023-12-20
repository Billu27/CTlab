package unitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ATest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void addTest() {
		int actual = 8;
		A obj1 = new A();
		assertEquals(actual, obj1.multi(2,4,5));
	}
	
	@Test
	void divTest() {
		int actual = 4;
		A obj1 = new A();
		assertEquals(actual, obj1.div(8,2));
	}
}
