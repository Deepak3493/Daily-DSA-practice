

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int diameter(Node root) {
        // Your code here
       int ans[] = new int[1];
       find(root,ans);
       return ans[0];
    }
    
    public static int find(Node root,int ans[]){
        if(root ==null)
           return 0;
        if(root.left ==null && root.right ==null)
           return 1;
        int left = find(root.left, ans);
        int right = find(root.right, ans);
        ans[0] = Math.max(ans[0],left+right);
        return 1+Math.max(left, right);
    }
}
