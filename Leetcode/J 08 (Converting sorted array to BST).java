/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public TreeNode s(int[] nums, int lb, int ub)
    {
        if(lb>ub)
        {
            return null;
        }
        int mid = (lb + ub)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = s(nums, lb, mid-1);
        root.right = s(nums, mid+1, ub);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
       return s(nums, 0, nums.length-1);
    }
}
