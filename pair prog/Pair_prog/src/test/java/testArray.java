import static org.junit.Assert.*;

import org.junit.Test;

public class testArray {
	@Test
	public void add() {
	 addArr camilo = new addArr();
	 int[] expec = new int[] {1,4,6,8,10};
	 
	 int [] d = new int[] {1,2,3,4,5};
	 int [] d1 = new int[] {1,2,2,2,2};
	 
	 assertArrayEquals(expec, camilo.addAr(d ,d1));
	}

}
