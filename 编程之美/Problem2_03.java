package Beautiful3;
/**
 * 寻找发帖“水王”
 * @author wangpeng
 *
 */
public class Problem2_03 {
	
	public static int findMoreHalf(int[] num){
		if(num == null || num.length == 0)
			return 0;
		int count = 1;
		int target = num[0];
		for(int i = 1;i<num.length;i++){
			if(count == 0){
				target = num[i];
				count = 1;
			}
			else if(target == num[i])
				count++;
			else{
				count--;
			}
		}
		int sum = 0;
		for(int i=0;i<num.length;i++){
			if(num[i] == target)
				sum++;
		}
		
		return sum>(num.length/2) ? target : 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,6,3,3,3,7,2,3,3,3};
		System.out.print(findMoreHalf(num));
	}

}
