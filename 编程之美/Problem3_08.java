package Beautiful3;

import Beautiful2.TreeNode;

/**
 * 求二叉树中节点的最大距离
 * @author wangpeng
 *
 */
public class Problem3_08 {
	private static int maxLen = 0;
	public static void findMaxDistance(TreeNode root){
		if(root == null)
			return ;
		
		if(root.left == null)
			root.MaxLeft = 0;
		if(root.right == null)
			root.MaxRight =0;
		
		findMaxDistance(root.left);
		findMaxDistance(root.right);
		
		
		if(root.left != null){
			root.MaxLeft = Math.max(root.left.MaxLeft, root.left.MaxRight) + 1;
		}
		if(root.right != null){
			root.MaxRight = Math.max(root.right.MaxLeft, root.right.MaxRight) + 1;
		}
		
		if(root.MaxLeft + root.MaxRight > maxLen){
			maxLen = root.MaxLeft + root.MaxRight;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
