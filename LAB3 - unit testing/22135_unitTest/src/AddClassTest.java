import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddClassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		AddClass a = new AddClass();
		int expected = 6 ;
		//int actual = a.add(3,3);
		assertEquals(expected, a.add(3,3));
	}
}
