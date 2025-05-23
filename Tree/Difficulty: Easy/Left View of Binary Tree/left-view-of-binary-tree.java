// User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      Queue<Node> q = new LinkedList<>();
      if(root ==null)
         return ans;
      q.add(root);
      while(!q.isEmpty()){
          int n = q.size();
          for(int i=0;i<n;i++){
              Node nd = q.poll();
              if(i==0){
                  ans.add(nd.data);
              }
              if(nd.left!=null){
                  q.add(nd.left);
              }
              if(nd.right!=null){
                  q.add(nd.right);
              }
          }
      }
      return ans;
    }
}