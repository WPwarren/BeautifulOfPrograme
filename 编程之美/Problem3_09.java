package Beautiful3;

import Arithmetic2.BinaryTree;
import Arithmetic2.TreeNode;

/**
 * 重建二叉树
 * @author wangpeng
 *
 */
public class Problem3_09 {

	public static TreeNode rebuildTree(int[] pro,int[] order){
		if(pro == null || pro.length == 0 || order == null || order.length == 0)
			return null;
		TreeNode head = rebuildCore(pro,0,pro.length-1,order,0,order.length-1);
		return head;
	}
	private static TreeNode rebuildCore(int[] pro, int start1, int end1, int[] order,
			int start2, int end2) {
		if(start1<=end1 && start2<=end2){
			int val = pro[start1];
			TreeNode root = new TreeNode(val);
			int index = findRightIndex(order,start2,end2,val);
			int offset = end2 - index -1;
			
			TreeNode left = rebuildCore(pro,start1+1,start1+1+offset,order,start2 ,index-1);
			TreeNode right = rebuildCore(pro, start1+2+offset, end1, order, index+1, end2);
			
			root.left = left;
			root.right = right;
			
			return root;
		}
		return null;
	}
	private static int findRightIndex(int[] order, int start2, int end2, int val) {
		int index = 0;
		for(int i= start2;i<end2;i++)
			if(order[i] == val){
				index = i;
				break;
			}
				
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {4,2,1,3,6,5,7};
		int[] in = {1,2,3,4,5,6,7};
		TreeNode root = rebuildTree(pre,in);
		BinaryTree b = new BinaryTree();
		b.afterOrder(root);
	}

}
