package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class SelectSort {
	
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	
	public void sort(){
		StdOut.print(Arrays.toString(raw));
		int len = raw.length;
		for (int i = 0; i < len; i++){
			int min_ind = i; // the index of the min
			for (int j = i+1; j < len; j++){
				if (raw[min_ind] > raw[j])
					min_ind = j;
			}
			exch(raw, i, min_ind);
			// 这里需要注意的是纪录的是索引而不是具体的值大小。
		}
		StdOut.println();
		StdOut.print(Arrays.toString(raw));
	}
}
