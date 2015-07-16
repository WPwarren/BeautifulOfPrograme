package Beautiful;
/**
 * 数组分割
 * 有一个无序、元素个数为2n的正整数数组，
 * 要求：如何能把这个数组分割为元素个数为n的两个数组，并使两个数组的和最接近
 * @author wangpeng
 * 得到2n数组中，长度为n的数组集合有多少种取法。
 * 然后分别计算和，选出符合条件的2个数组；
 * 
 * 定义Heap[i]，i<=N表示任意i个数能够构成的数值集合
 * Heap[i-1] = {V}
 * Heap[i] = Heap[i-1]U{v+arr[i]}
 */
public class Problem2_18 {

//	public int[] Partition(int[] arr){
//		Heap[0] = 0; 
//		for(int k=1;k<=2*n;k++){
//			i_max = min(k-1,n-1);
//			for(int i=i_max;i>=0;i--){
//				for(v in Heap[i-1])
//					insert(v,v+arr[i],Heap[i+1]);
//			}
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
