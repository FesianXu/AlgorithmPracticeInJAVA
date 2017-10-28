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
			// ע�������lo��hi�ĸ��¡���key < g[mid]ʱ��key �����ܴ���g[mid+1]�ģ������Ҫhi = mid-1
			// ͬ�����֪��lo = mid+1,����㷴�˻ᵼ����û��keyֵ��group��ʱ�������ѭ��
			else 
				return mid;
		}
		return -1;
	}
}
