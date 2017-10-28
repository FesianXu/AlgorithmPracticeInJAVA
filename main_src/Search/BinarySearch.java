package Search;
import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;


public class BinarySearch {
	
	private static int[] group = {2,4,9,1,3,10,74,56,41,96,75,26,42};
	
	public static int search(int key){
		Arrays.sort(group);
		StdOut.println(Arrays.toString(group));
		int hi = group.length-1;
		int lo = 0;
		while (lo <= hi){
			int mid = lo+(hi-lo)/2;
			if (key < group[mid]) {hi = mid-1;}
			else if (key > group[mid]) { lo = mid+1;}
			// 注意这里的lo和hi的更新。当key < g[mid]时，key 不可能大于g[mid+1]的，因此需要hi = mid-1
			// 同理可以知道lo = mid+1,这里搞反了会导致在没有key值在group的时候产生死循环
			else 
				return mid;
		}
		return -1;
	}
}
