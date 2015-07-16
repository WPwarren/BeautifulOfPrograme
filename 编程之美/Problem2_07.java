package Beautiful3;
/**
 * 求最大公约数
 * 有三种方法：
 * 方法一：
 * 取模法
 * 方法二
 * 相减法
 * 方法三：
 * 上面两种结合
 * f(x,y) = f(kx',ky') = kf(x',y')
 * f(x,y) = f(kx',y) 其中k为素数y不能整除k,则f(x,y) = f(x',y)
 * @thor wangpeng
 * 
 */
public class Problem2_07 {

//	方法一
	public static int findMaxComm1(int num1,int num2){
		if(num2 == 0)
			return num1;
		int b = num1 % num2;
		return findMaxComm1(num2,b);
	}
	
//	方法二
	public static int findMaxComm2(int num1,int num2){
		if(num1 == num2)
			return num1;
		if(num1<num2)
			return findMaxComm2(num2, num1);
		
		int b = num1 - num2;
		return findMaxComm2(num2, b);
	}
	
//	方法三
	public static int findMaxComm3(int num1,int num2){
		if(num1 == num2)
			return num1;
		if(num1 < num2)
			return findMaxComm3(num2, num1);
		
		if(isEvent(num1) && isEvent(num2)){
			return findMaxComm3(num1>>1, num2>>1)<<1;
		}else if(isEvent(num1)){
			return findMaxComm3(num1>>1, num2);
		}else if(isEvent(num2)){
			return findMaxComm3(num1, num2>>1);
		}else{
			return findMaxComm3(num2, num1-num2);
		}
	}
	private static boolean isEvent(int num) {
		// TODO Auto-generated method stub
		return (num & 1)==0;
	}

	public static void main(String[] args) {
		int num1 = 42;
		int num2 = 30;
		System.out.print(findMaxComm3(num1, num2));
	}

}
