


/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
          // Your code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
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
            for(int i=subAns.size()-1;i>=0;i--){
                ans.add(0,subAns.get(i));
            }
        }
        return ans;
    }
}