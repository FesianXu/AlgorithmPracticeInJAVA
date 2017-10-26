package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class InsertSort {
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	
	private void show(){
		StdOut.println(Arrays.toString(raw));
	}
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public void sort(){
		show();
		int len = raw.length;
		for (int i = 1; i < len; i++){
			for (int j = i; j > 0 && (raw[j] < raw[j-1]); j--){
				exch(raw, j ,j-1);
			}
		}
		show();
	}
	public void insert(int[] raw, int i, int j) {
		int tmp = raw[j];
		for (int each = j; each > i; each--){
			raw[each] = raw[each-1];
		}
		raw[i] = tmp;
	}
	
	public void sort_fine(){
		show();
		int len = raw.length;
		for (int i = 1; i < len; i++){
			int j;
			for (j = i; j > 0 && (raw[i] < raw[j-1]); j--)
				;
			insert(raw, j, i);
		}
		show();
	}
	
	public void sort_guard(){
		show();
		int len = raw.length;
		int min_ind = 0;		
		for (int i = 1; i < len; i++){
			if (raw[min_ind] > raw[i])
				min_ind = i;
		}
		exch(raw, 0, min_ind);
		for (int i = 1; i < len; i++){
			int j;
			for (j = i; raw[i] < raw[j-1]; j--)
				;
			insert(raw, j, i);
		}
		show();
	}
}
