package Beautiful;
/**
 * 字符串一维包含的问题
 * 给定两个字符串s1和s2，要求判定s2是否能够被s1做循环移位得到的字符串包含
 * @author wangpeng
 *
 */
public class Problem3_01 {

	public static boolean isContent(String s1,String s2){
		String str = s1+s1;
		return str.contains(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "CDAA";
		System.out.print(isContent(s1,s2));
	}

}
