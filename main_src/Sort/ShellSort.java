package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class ShellSort {
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	
	private void show(){
		StdOut.println(Arrays.toString(raw));
	}
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public void sort() {
		show();
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
		show();
		
	}
}
