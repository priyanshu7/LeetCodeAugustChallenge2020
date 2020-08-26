package august2020;

import biweeklyMay.GoodNodes.TreeNode;

public class SumOfLeftLeaves {
	
	private int dfs(TreeNode node, boolean isLeft){
        if(node == null)
            return 0;
        if(node.left == null && node.right == null && isLeft)
            return node.val;
        if(node.left == null && node.right == null && !isLeft)
            return 0;
        return dfs(node.left, true) + dfs(node.right, false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        return dfs(root.left, true) + dfs(root.right, false);
    }

}
