package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class BubbleSort {
	int[] raw = new int[1000] ;
	public BubbleSort() {
		for (int i = 0; i < raw.length; i++)
			raw[i] = i;
		StdRandom.shuffle(raw);
	}
	private void show(int[] raw){
		StdOut.println(Arrays.toString(raw));
	}
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public void sort(){
//		show(raw);
		StdRandom.shuffle(raw);
		int m = raw.length;
		for (int out = 0; out < raw.length-1; out++){
			m -= 1; // �����Ż�Ч�ʣ������Ѿ�ð�������˵����в����ٴ�����Ƚ��ˡ�
			for (int ind = 0; ind < m; ind++){
				if (raw[ind] > raw[ind+1])
					exch(raw, ind, ind+1);
			}
		}
//		show(raw);
	}
	
}
