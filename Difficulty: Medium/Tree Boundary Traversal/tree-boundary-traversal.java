// User function Template for Java
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(node ==null)
            return ans;
        ans.add(node.data);
        if(node.left ==null && node.right ==null)
             return ans;
        leftboundry(node.left, ans);
        bottomboundry(node,ans);
        rightboundry(node.right,ans);
        return ans;
    }
    public static void leftboundry(Node node,  ArrayList<Integer> ans){
        if(node == null || (node.left ==null && node.right ==null))
           return;
        ans.add(node.data);
        if(node.left!=null)
          leftboundry(node.left, ans);
        else
           leftboundry(node.right, ans);
        
    }
     public static void rightboundry(Node node,  ArrayList<Integer> ans){
        if(node == null || (node.left ==null && node.right ==null))
           return;
        if(node.right!=null)
          rightboundry(node.right, ans);
        else
           rightboundry(node.left, ans);
           
        if(!(node.left ==null && node.right ==null))
            ans.add(node.data);
    }
    
     public static void bottomboundry(Node node,  ArrayList<Integer> ans){
        if(node == null)
            return;
        if(node.left ==null && node.right ==null)
            ans.add(node.data);
        bottomboundry(node.left, ans);
        bottomboundry(node.right, ans);

    }
    
}
