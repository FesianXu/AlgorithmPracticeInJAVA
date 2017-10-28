package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FastSort {
	int[] raw = new int[1000] ;
	
	public FastSort() {
		for (int i = 0; i < raw.length; i++)
			raw[i] = i;
		StdRandom.shuffle(raw);
	}
	
	public void sort(){
//		show(raw);
		StdRandom.shuffle(raw); // ��ʼ������������ɢ�˵����飬�Ӹ����������ڿ��ŵ��зֲ��ֹ��С�
//		sort(raw, 0, raw.length-1);
		sortBetter(raw, 0, raw.length-1, 10);
//		show(raw);
	}
	
	private void sort(int[] raw, int lo, int hi){
		if (hi <= lo) return; // the key!!!! �������ǵ������жϷ��ش�ʩ������
		int j = partion(raw, lo, hi);
		sort(raw, lo, j-1);
		sort(raw, j+1, hi);
	}
	
	private void sortBetter(int[] raw, int lo, int hi, int M){
		// ���ò���������С������������ٶ����⡣
		if (hi-lo <= M){
			int min_ind = lo;
			for (int i = lo+1; i < hi; i++)
				if (raw[i] < raw[min_ind])
					min_ind = i;
			exch(raw, min_ind, lo); // �ڱ�
			for (int i = lo; i < hi; i++){
				for (int j = i+1; raw[j] < raw[j-1]; j++)
					exch(raw, j-1, j);
			}
			return ;
		}
		int j = partion(raw, lo, hi);
		sort(raw, lo, j-1);
		sort(raw, j+1, hi);
	}
	
	private void show(int[] raw){
		StdOut.println(Arrays.toString(raw));
	}	
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	public int partion(int[] a, int lo, int hi){
		int i = lo, j = hi+1;
		int v = a[lo];
//		show(a);
//		StdOut.println(lo);
		while(true){
			while(a[++i] <= v) if (i == hi) break;
			while(a[--j] >= v) if (j == lo) break;
			if (i >= j) break; // ͷָ���βָ������
			exch(a, i, j);
		}
		exch(a, lo, j);
//		show(a);
		return j;
	}
	
}
