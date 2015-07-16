package Beautiful3;
/**
 * 子数组
 * @author wangpeng
 *
 */
public class Problem2_15 {

	public static int findMaxSum(int[][] num){
		if(num == null)
			return 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int rows = num.length;
		int cols = num[0].length;
		int beginCol = 0;
		int endCol = 0;
		int beginRow = 0;
		int endRow = 0;
		int maxStart = 0;
		
		for(int start = 0;start < rows;start++){
			for(int end = 0;end<cols;end++){
				sum = 0;
				for(int col = 0;col < cols;col++){
					if(sum <= 0){
						sum = BC(num,start,end,col);
						maxStart = col;
					}else{
						sum += BC(num,start,end,col);
					}
					
					if(sum > max){
						max = sum;
						beginRow = start;
						endRow = end;
						beginCol = maxStart;
						endCol = col;
					}
				}
			}
		}
		
		for(int i = beginRow;i<=endRow;i++){
			for(int j= beginCol;j<=endCol;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		return max;
	}
	private static int BC(int[][] num, int start, int end, int col) {
		int sum = 0;
		for(int i=start;i<=end;i++)
			sum += num[i][col];
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = { {0, -2, -7,  0},{ 9, 2, -6, 2}, {-4, 1, -4, 1}, {-1, 8, 0, -2} }; 
		System.out.print(findMaxSum(num));
	}

}
