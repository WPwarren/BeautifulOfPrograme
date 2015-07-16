package Beautiful;
/**
 * 区间重合判断：
 * 给定一个源区间[x,y](y>=x)和N个无序的目标区间[x1,y1],[x2,y2],[x3,y3]...[xm,ym],
 * 判断源区间[x,y]是不是在目标区间内
 * @author wangpeng
 * 方法：
 * 首先对现有目标区域进行一些预处理，将无序的目标区间合并成几个有序的区间
 * 然后与源区间比较
 * 一、对目标区间数组按着X轴坐标从小到大排序；
 * 二、将排好序的目标区间合并成若干个互不相交的区间
 * 三、用二分查找来判断源区间是否被包含在目标区间内
 */
public class Problem2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
