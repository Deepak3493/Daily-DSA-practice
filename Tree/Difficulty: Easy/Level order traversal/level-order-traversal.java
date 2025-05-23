

/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(q.size()>0){
            ArrayList<Integer> subAns = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                Node r = q.poll();
                subAns.add(r.data);
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
            }
            ans.add(subAns);
        }
        return ans;
    }
}
