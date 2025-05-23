/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int findLargestSubtreeSum(Node root) {
        int ans[] = new int[1];
        ans[0] = Integer.MIN_VALUE;
        find(root, ans);
        return ans[0];
    }
    public static int find(Node root, int ans[] ){
        // code here
        if(root == null)
           return 0;
        int left = find(root.left, ans);
        int right = find(root.right, ans);
        ans[0] = Math.max(ans[0], root.data+left+right);
        return left+right+root.data;
    }
}
