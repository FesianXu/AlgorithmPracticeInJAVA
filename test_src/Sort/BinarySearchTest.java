package Sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Search.BinarySearch;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearchTest {
	BinarySearch bs = new BinarySearch();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void search_test(){
		int a = BinarySearch.search(1);
		StdOut.println(a);
	}

}
