package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.manipulation.Sorter;

import Sort.SelectSort;

public class SelectSortTest {
	SelectSort Sorter = new SelectSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Sorter.sort();
	}

}
