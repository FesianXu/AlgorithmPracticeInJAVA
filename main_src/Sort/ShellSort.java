package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ShellSort {
	int[] raw = new int[1000] ;
	public ShellSort() {
		for (int i = 0; i < raw.length; i++)
			raw[i] = i;
		StdRandom.shuffle(raw);
	}
	
	private void show(){
		StdOut.println(Arrays.toString(raw));
	}
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public void sort() {
//		show();
		StdRandom.shuffle(raw);
		int len = raw.length;
		int h = 1;
		while(h < len/4) h = 4*h+1;
		while(h >= 1){
			for (int i = h; i < len; i++){
				for (int j = i; j >= h && (raw[j] < raw[j-h]); j -= h){
					exch(raw, j ,j-h);
				}
			}
			h = h/4;
		}
//		show();
		
	}
}
