package Beautiful3;
/**
 * 求N！末尾有多少个0
 * 求N！末尾二进制表示中最低位1的位置
 * @author wangpeng
 *
 */
public class Problem2_02 {

	public static int numOfZero(int n){
		int num = 0;
		while(n!=0){
			num += n/5;
			n /= 5;
		}
		return num;
	}
	
	public static int indexOfOne(int n){
		int num = 0;
		while(n!=0){
			num += n/2;
			n /= 2;
		}
		
		return num;
	}
	public static void main(String[] args) {
		int num = 3;
		System.out.println(numOfZero(num));
		System.out.print(indexOfOne(num));
	}

}
