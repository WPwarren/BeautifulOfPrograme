package Beautiful3;
/**
 * 寻找数组中的最大值和最小值
 * 尽量减少比较次数
 * @author wangpeng
 *
 */
public class Problem2_10 {
	public static void findMaxAndMin(int[] num){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++){
			if(i +1 == num.length){
				max = Math.max(num[i], max);
				min = Math.min(num[i], min);
			}else{
				int maxEnd = Math.max(num[i], num[i+1]);
				int minEnd = Math.min(num[i], num[i+1]);
				i++;
				max = Math.max(maxEnd, max);
				min = Math.min(minEnd, min);
			}
		}
		System.out.print(max +"," +min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5,6,8,8,3,7,9};
		findMaxAndMin(num);
	}

}
