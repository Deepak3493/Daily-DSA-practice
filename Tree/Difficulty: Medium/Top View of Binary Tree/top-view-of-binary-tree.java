// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    // Function to return a list of nodes visible from the top view
   // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        Map<Integer,Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        Pair p1 = new Pair(root,0);
        q.add(p1);
        while(q.size()>0){
            int size = q.size();
            for(int i=0;i<size;i++){
               Pair p = q.poll();
               int index = p.index;
               if(!mp.containsKey(p.index)){
                   mp.put(p.index, p.node.data);
               }
               if(p.node.left!=null){
                   Pair left = new Pair(p.node.left,index-1);
                   q.add(left);
               }
               if(p.node.right!=null){
                   Pair right = new Pair(p.node.right, index+1);
                   q.add(right);
               }
               
            }
        }
       ArrayList<Integer> ans = new ArrayList<Integer>();
       for(Integer key: mp.keySet()){
           ans.add(mp.get(key));
       }
       return ans;
    }
    static class Pair{
        Node node;
        int index;
        Pair(Node n, int i){
            node = n;
            index = i;
        }
    }
}