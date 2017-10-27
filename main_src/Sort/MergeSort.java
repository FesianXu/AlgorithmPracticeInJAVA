package Sort;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class MergeSort {
	int[] raw = {5,3,6,8,7,4,1,2,6,41,25,36,74,15,98,74,15,12,32,64};
	int[] aux;
	private void show(int[] raw){
		StdOut.println(Arrays.toString(raw));
	}
	private void merge(int[] a, int lo, int mid, int hi){
		int lid = lo;
		int rid = mid+1;
		for (int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++){
			if (lid > mid) a[k] = aux[rid++];
			else if (rid > hi) a[k] = aux[lid++];
			else if (aux[lid] < aux[rid]) a[k] = aux[lid++];
			else a[k] = aux[rid++];
		}
		// ע������ı߽���lo��hi������0��length��ֻ��lo��hi�н��и��ƺ͹鲢��
	}
	// �Զ����µĹ鲢����
	public void sort(){
		aux = new int[raw.length];
//		show(raw);
		sort(raw, 0, raw.length-1);
//		show(raw);
	}
	
	private void exch(int[] g, int i, int j){
		int tmp = g[i];
		g[i] = g[j];
		g[j] = tmp;
	}
	
	private void sort(int[] a, int lo, int hi){
		if (lo >= hi) return;
		
		// ���ò����������С���������ʱ�䣬��ΪС����ĵ����ᵼ�ºܶຯ�����ã���ֵ�á�
		if (hi-lo <= 4){
			int min_id = lo;
			for (int i = lo; i <= hi; i++){
				if (a[min_id] > a[i]) min_id = i;
			}
			exch(a, min_id, lo); // �����ڱ�
			for (int i = lo; i < hi; i++){
				for (int j = i+1; a[j] < a[j-1]; j--){
					exch(a, j, j-1);
				}
			}
			return ;
		}
		
		
		int mid = lo+(hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);	
		if (a[mid] <= a[mid+1])
			return; // �����Ѿ�����������������merger���ڡ�
		merge(a, lo, mid, hi);

	}
	
	
	public void sortBU(){
		// �Ե׶��ϵķ���
		// �ʺ�������ʵ�֣�������CPPȥ����
		int len = raw.length;
		aux = new int[len];
//		show(raw);
		for (int size = 1; size < len; size = 2*size){ // the size of the sub-arrays
			for (int ind = 0; ind < len-size; ind += 2*size){
				merge(raw, ind, ind+size-1, Math.min(len-1, ind+2*size-1));
			}
		}
//		show(raw);
		
	}
	
}
