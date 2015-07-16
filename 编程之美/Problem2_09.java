package Beautiful3;
/**
 * 斐波那契数列
 * @author wangpeng
 *
 */
public class Problem2_09 {

	public static int fibonacci(int n){
		if(n == 0)
			return 0;
		if(n== 1)
			return 1;
		
		int lastOne = 1;
		int lastTwo = 0;
		int res = 0;
		
		for(int i=1;i<n;i++){
			res = lastOne + lastTwo;
			lastTwo = lastOne;
			lastOne = res;
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.print(fibonacci(n));
	}

}
