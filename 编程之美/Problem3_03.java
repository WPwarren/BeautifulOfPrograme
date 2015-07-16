package Beautiful3;
/**
 * 计算字符串的相似度
 * @author wangpeng
 *
 */
public class Problem3_03 {

	public static int stringDistance(String str1,int Astart,int Aend,String str2,int Bstart,int Bend){
		if(Astart > Aend){
			if(Bstart >Bend)
				return 0;
			else{
				return Bend - Bstart + 1;
			}
		}
		
		if(Bstart > Bend){
			if(Astart > Aend)
				return 0;
			else
				return Astart - Aend + 1;
		}
		
		if(str1.charAt(Astart) == str2.charAt(Bstart)){
			return stringDistance(str1,Astart+1,Aend,str2,Bstart+1,Bend);
		}else{
			int d1 = stringDistance(str1,Astart+1,Aend,str2,Bstart,Bend);
			int d2 = stringDistance(str1,Astart,Aend,str2,Bstart+1,Bend);
			int d3 = stringDistance(str1,Astart+1,Aend,str2,Bstart+1,Bend);
			
			return Math.min(Math.min(d1, d2), d3) + 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "heolwrold";
		String str2 = "helloworld";
		System.out.print(stringDistance(str1, 0, str1.length()-1, str2, 0, str2.length()-1));
	}

}
