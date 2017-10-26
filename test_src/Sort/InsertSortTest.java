package Sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import Sort.InsertSort;
import edu.princeton.cs.algs4.StdOut;

public class InsertSortTest {
	
	InsertSort IS = new InsertSort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		IS.sort_guard();
	}

}
