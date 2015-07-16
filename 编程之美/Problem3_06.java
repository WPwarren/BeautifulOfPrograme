package Beautiful;
/**
 * 判断两个链表是否相交
 * @author wangpeng
 * 解法一：
 * 超简单，直说思路。
 * 一、计算链表一的长度l1
 * 二、计算链表二的长度l2
 * d=|l1-l2|
 * 让长的链表先走d步
 * 然后分别遍历两个链表，看是否有2个指针指向容一个结点，若是返回true，否则继续指到结尾
 * 解法二：
 * 遍历链表1到最后一个节点
 * 遍历链表2到最后一个节点
 * 两个链表最后一个节点比较，若相等则相较，否则不想交
 */
public class Problem3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
