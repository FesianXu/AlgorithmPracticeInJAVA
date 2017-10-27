package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
	BubbleSort BS = new BubbleSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
//		for (int i = 0; i < 1000000; i++)
			BS.sort();
	}

}
