package august2020;

import java.util.*;

import biweeklyMay.GoodNodes.TreeNode;

public class PathSum3 {
	
	public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> presum = new HashMap<>();
        presum.put(0, 1);
        return calcSum(0, sum, root, presum);
    }
    private int calcSum(int currSum, int targetSum, TreeNode root, HashMap<Integer, Integer> presum){
        if(root==null)
            return 0;
        currSum += root.val;
        int res = presum.getOrDefault(currSum-targetSum, 0);
        presum.put(currSum, presum.getOrDefault(currSum ,0)+1);
        
        res += calcSum(currSum, targetSum, root.left, presum) + calcSum(currSum, targetSum, root.right, presum);
        
        presum.put(currSum, presum.get(currSum)-1);
        return res;
    }
    
    //O(n^2)
    public int pathSumRecur(TreeNode root, int sum) {
        if(root == null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int helper(TreeNode root, int sum){
        if(root == null) return 0;
        return (root.val == sum ? 1 : 0) + helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }

}
