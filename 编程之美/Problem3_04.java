package Beautiful;

import Package15.LinkedStack.Node;
/**
 * ����ͷ��������ɾ���ڵ�
 * ������һ��û��ͷָ��ĵ�����һ��ָ��ָ��ε������м��һ���ڵ㣬�뽫�ýڵ�ӵ�������ɾ����
 * @author wangpeng
 * pCurrent��data��pNext��data������ɾ��pNext�ڵ�
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
