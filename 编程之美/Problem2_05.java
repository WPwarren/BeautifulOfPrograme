package Beautiful3;

import java.util.ArrayList;

/**
 * 寻找最大的K个数
 * @author wangpeng
 *
 */
public class Problem2_05 {

	public static ArrayList<Integer> findMaxKNum(int[] num,int k){
		int target = num.length - k ;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int begin = 0;
		int end = num.length - 1;
		int randIndex = Partition(num,begin,end);
		
		while(randIndex != target){
			if(randIndex < target){
				randIndex = Partition(num,randIndex+1, end);
			}else{
				randIndex = Partition(num,begin,randIndex-1);
			}
		}
		
		for(int i=target;i<num.length;i++)
			list.add(num[i]);
		return list;
	}
	
	
	private static int Partition(int[] num, int begin, int end) {
		int temp = num[begin];
		while(begin < end){
			while(begin<end && num[end] > temp)
				end--;
			if(begin < end)
				num[begin++] = num[end];
			while(begin<end && num[begin] < temp){
				begin++;
			}
			if(begin < end)
				num[end--] = num[begin];
		}
		num[begin] = temp;
		return begin;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,4,6,7,1,2,8,9,3,10};
		int k = 3;
		System.out.print(findMaxKNum(num, k));
	}

}
