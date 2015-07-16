package Beautiful3;
/**
 * 最大子序列乘积
 * @author wangpeng
 *
 */
public class Problem2_13 {

	public static double findMaxSubPro(double[] num){
		if(num == null || num.length == 0){
			return 0;
		}
		double max = num[0];
		double min = num[0];
		double curMax = 0;
		double curMin = 0;
		double res = num[0];
		
		for(int i=1;i<num.length;i++){
			curMax = max * num[i];
			curMin = min * num[i];
			max = Math.max(Math.max(curMax, curMin), num[i]);
			min = Math.min(Math.min(curMax,curMin), num[i] );
			res = Math.max(max, res);
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {-2.5,4,0,3,0.5,8,-1};
		System.out.print(findMaxSubPro(num));
	}

}
