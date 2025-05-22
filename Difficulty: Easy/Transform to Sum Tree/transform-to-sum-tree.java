/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root) {
        // add code here.
        sumTree(root);
        
    }
    public static int sumTree(Node root){
        if(root ==null)
           return 0;
        
        int left = sumTree(root.left);
        int right = sumTree(root.right);
        int temp = root.data;
        root. data = left+right;
        return temp+root.data;
    }
}