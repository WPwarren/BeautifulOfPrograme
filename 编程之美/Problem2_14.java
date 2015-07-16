package Beautiful3;

public class Problem2_14 {

	public static int findMaxSum(int[] num){
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int begin=0;
		int end = 0;
		int start = 0;
		
		for(int i=0;i<num.length;i++){
			if(sum<=0){
				sum = num[i];
				start = i;
			}else{
				sum += num[i];
			}
			
			if(sum > max){
				max = sum;
				begin = start;
				end = i;
			}
		}
		
		System.out.println(begin +"," + end);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1,5,3,-6,4,-8,6};
		System.out.print(findMaxSum(num));
	}

}
