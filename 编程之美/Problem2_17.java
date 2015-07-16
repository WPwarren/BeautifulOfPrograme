package Beautiful;
/**
 * ����ѭ����λ
 * ��һ������N��Ԫ�ص�����ѭ������Kλ��Ҫ��ʱ�临�Ӷ�ΪO(N)��ֻ����ʹ����������
 * @author wangpeng
 * һ���������Ϊ�����֣�0~n-k-1����n-k~n-1
 * ������һ���������򣬵ڶ�����������
 * ������������
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
