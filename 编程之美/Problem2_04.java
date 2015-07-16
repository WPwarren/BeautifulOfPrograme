package Beautiful3;

public class Problem2_04 {
	public static int numOfOne(int num){
		int low = 0;
		int cur = 0;
		int high = 0;
		int order = 1;
		int sum = 0;
		
		while(num/order != 0){
			low = num - (num / order)*order;
			cur = (num / order) % 10;
			high = num/(order*10);
			
			switch(cur){
			case 0:
				sum += high * order;
				break;
			case 1:
				sum += high * order + low +1;
				break;
			default:
				sum += (high + 1)*order;
				break;
			}
			order *= 10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		System.out.print(numOfOne(num));
	}

}
