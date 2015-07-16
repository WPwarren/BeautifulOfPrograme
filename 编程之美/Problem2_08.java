package Beautiful3;
/**
 * 找到符合条件的整数
 * @author wangpeng
 *
 */
public class Problem2_08 {

	public static int findRightNum(int m){
		if(m == 1)
			return 1;
		int[] A = new int[m];
		int[] B = new int[m];
		int order = 10;
		Reset(A,-1);
		A[1] = 1;
		boolean not_found = true;
		
		while(not_found){
			Reset(B,-1);
			int x = order % m;
			if(A[x] == -1){
				B[x] = order;
				if(x == 0)
					break;
			}
			
			for(int i=0;i<m;i++){
				if(A[i] == -1){
					continue;
				}
				int new_x = (x + i)%m;
				if(A[new_x] == -1 && B[new_x] == -1){
					B[new_x] = order + A[i];
					if(new_x == 0){
						not_found = false;
						break;
					}
				}
			}
			
			order *= 10;
			for(int i=0;i<m;i++){
				if(A[i] == -1 && B[i] != -1){
					A[i] = B[i];
				}
			}
		}
		return B[0];
	}
	private static void Reset(int[] a, int num) {
		for(int i=0;i<a.length;i++){
			a[i] = num;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.print(findRightNum(n));
	}

}
