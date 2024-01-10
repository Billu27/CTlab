import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ATest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void addTest() {
		int actual = 4;
		A obj1 = new A();
		assertEquals(actual, obj1.add(2,2));
	}

}
