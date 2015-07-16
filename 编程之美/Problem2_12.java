package Beautiful3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 快速寻找满足条件的两个数
 * @author wangpeng
 *
 */
public class Problem2_12 {

	public static ArrayList<ArrayList<Integer>> findRightTwoNum(ArrayList<Integer> num,int sum){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(num == null || num.size() == 0)
			return list;
		Collections.sort(num);
		int begin = 0;
		int end = num.size()-1;
		
		while(begin<end){
			int k = num.get(begin) + num.get(end);
			if(k == sum){
				ArrayList<Integer> item = new ArrayList<Integer>();
				item.add(num.get(begin));
				item.add(num.get(end));
				list.add(item);
				begin++;
			}else if(k<sum){
				begin++;
			}else{
				end--;
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,6,1,4,7,9,8};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
			list.add(num[i]);
		
		System.out.print(findRightTwoNum(list, 10));
	}

}
