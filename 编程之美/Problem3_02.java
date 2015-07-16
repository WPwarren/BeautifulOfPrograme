package Beautiful3;
/**
 * 电话号码转换成单词集合
 * @author wangpeng
 *
 */
public class Problem3_02 {

	private static char[][] c = {{},{},{'A','B','C'},
		{'D','E','F'},{'G','H','I'},{'J','K','L'},
		{'M','N','O'},{'P','Q','R','S'},{'T','U','V'},
		{'W','X','Y','Z'}};
	private static int total[] = {0,0,3,3,3,3,3,4,3,4};
	public static void phoneToWord(int[] number,int[] answer,int index,int n){
		if(n == index){
			for(int i=0;i<n;i++){
				System.out.print(c[number[i]][answer[i]]);
			}
			System.out.println();
			return;
		}
		
		for(answer[index] = 0;answer[index]<total[number[index]];answer[index]++){
			phoneToWord(number,answer,index+1,n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {3,4,5,6};
		int[] answer = new int[number.length];
		int n = number.length;
		phoneToWord(number,answer,0,n);
	}

}
