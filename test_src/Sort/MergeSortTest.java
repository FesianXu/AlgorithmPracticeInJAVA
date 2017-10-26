package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Sort.MergeSort;

public class MergeSortTest {
	MergeSort MS = new MergeSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MS.sortBU();
	}

}
