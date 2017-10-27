package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class FastSort {
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	
	public void sort(){
		sort(raw, 0, raw.length-1);
	}
	
	private void sort(int[] raw, int lo, int hi){
		int j = partion(raw, lo, hi);
		sort(raw, lo, j-1);
		sort(raw, j, hi);
	}
	private void show(int[] raw){
		StdOut.println(Arrays.toString(raw));
	}	
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	private int partion(int[] a, int lo, int hi){
		int i = lo, j = hi+1;
		int v = a[lo];
//		show(a);
		while(true){
			while(a[++i] <= v) if (i == hi) break;
			while(a[j--] >= v) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		show(a);
		return j;
	}
}
