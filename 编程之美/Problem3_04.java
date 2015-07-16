package Beautiful;

import Package15.LinkedStack.Node;
/**
 * 从无头单链表中删除节点
 * 假设有一个没有头指针的单链表。一个指针指向次单链表中间的一个节点，请将该节点从单链表中删除。
 * @author wangpeng
 * pCurrent的data与pNext的data交换，删除pNext节点
 */
public class Problem3_04 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void DeleteRandomNode(Node pCurrent){
		Node pNext = pCurrent.next;
		int data = (int) pCurrent.item;
		pCurrent.item = pNext.item;
		pNext.item = data;
		
		pCurrent.next = pNext.next;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
