class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret=new LinkedList<>();
        if(root==null)return ret;
        //队列TreeNode
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            //size会变,,提前获取一下
            int size=queue.size();
            while(size>0){
                //cur接收队列抛出元素
                TreeNode cur=queue.poll();
                //list添加val值
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                //抛出一个size--
                size--;
            }
            //一层完了添加给ret
            ret.add(list);
        }
        return ret;
            
            
    }
}