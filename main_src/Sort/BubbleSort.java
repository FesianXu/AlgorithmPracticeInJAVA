package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class BubbleSort {
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	private void show(int[] raw){
		StdOut.println(Arrays.toString(raw));
	}
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public void sort(){
		show(raw);
		int m = raw.length;
		for (int out = 0; out < raw.length-1; out++){
			m -= 1; // 用于优化效率，后面已经冒泡升序了的序列不用再次排序比较了。
			for (int ind = 0; ind < m; ind++){
				if (raw[ind] > raw[ind+1])
					exch(raw, ind, ind+1);
			}
		}
		show(raw);
	}
	
}
