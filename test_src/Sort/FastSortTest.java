package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FastSortTest {
	
	FastSort FS = new FastSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		for (int i = 0; i < 10000; i++)
			FS.sort();
	}

}
