package Beautiful3;

public class Problem2_01 {

	public static int numOfOne(int n){
		int sum = 0;
		while(n!=0){
			sum++;
			n &= n-1;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.print(numOfOne(num));
	}

}
