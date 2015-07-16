package Beautiful3;
/**
 * 最短摘要
 * @author wangpeng
 *
 */
public class Problem3_05 {

	public static int minShortAbstract(String[] keyword,String[] str){
		int start = 0;
		int end = 0;
		int minStart = 0;
		int minEnd = 0;
		int n = str.length;
		int minLen = Integer.MIN_VALUE;
		int[] visited = new int[str.length];
		boolean flag = false;
		
		while(true){
			while(end<n && !isAllIn(keyword[end],str,visited,flag)){
				end++;
			}
			while(isAllIn(keyword[start],str,visited,flag)){
				start++;
				int len = end - start + 1;
				if(len<minLen){
					minLen = len;
					minStart = start;
					minEnd = end;
				}
			}
			
			if(end >= n)
				break;
		}
		
		for(int i=minStart;i<=minEnd;i++){
			System.out.print(keyword[i]+" ");
		}
		return minLen;
	}
	private static boolean isAllIn(String string, String[] str, int[] visited,boolean flag) {
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
