package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Sort.ShellSort;

public class ShellSortTest {
	
	ShellSort SS = new ShellSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		for (int i = 0; i < 1000; i++)
		SS.sort();
	}

}
