package Beautiful;
/**
 * 数组循环移位
 * 把一个含有N个元素的数组循环右移K位，要求时间复杂度为O(N)且只允许使用两个变量
 * @author wangpeng
 * 一、把数组分为两部分，0~n-k-1，和n-k~n-1
 * 二、第一个数组逆序，第二个数组逆序
 * 三、整体逆序
 */
public class Problem2_17 {

	public static String Reverse(String str,int k){
		if(str == null || str.length()==0)
			return null;
		char[] arr = str.toCharArray();
		int n = arr.length;
		Revers(arr,0,n-k-1);
		Revers(arr,n-k,n-1);
		Revers(arr,0,n-1);
		
		return new String(arr);
	}
	private static void Revers(char[] arr, int start, int end) {
		int i = start;
		int j = end;
		while(i<j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[ ] args) {
		// TODO Auto-generated method stub
		String s = "abcd1234";
		System.out.print(Reverse(s,4));
	}

}
