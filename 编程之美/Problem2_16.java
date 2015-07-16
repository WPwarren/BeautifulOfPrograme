package Beautiful3;
/**
 * 求数组中最长递增子序列
 * @author wangpeng
 *
 */
public class Problem2_16 {
	
	public static int findMaxSubArr(int[] number){
		int maxLen = 1;
		int[] maxV = new int[number.length+1];
		maxV[0] = Integer.MIN_VALUE;
		int[] LSI = new int[number.length];
		for(int i=0;i<LSI.length;i++){
			LSI[i] = 1;
		}
		
		for(int i=1;i<number.length;i++){
			int j;
			for(j=maxLen;j>0;j--){
				if(maxV[j] < number[i])
					LSI[i] = j+1;
				
				if(LSI[i] > maxLen){
					maxLen = LSI[i];
					maxV[LSI[i]] = number[i];
				}else if(maxV[j] < number[i] && maxV[j+1] > number[i]){
					maxV[j+1] = number[i];
				}
			}
		}
		
		return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,-2,3,-4,5,-6,7,-8};
		System.out.print(findMaxSubArr(number));
	}

}
