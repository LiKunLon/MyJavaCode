class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        //用层序遍历
        if(root==null)return 0;
        LinkedList<Integer> list=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //第一个节点编号为1
        list.add(1);
        int res=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                //cur接收队列抛出元素
                TreeNode cur=queue.poll();
                //每一次的根节点记录下来
                Integer curIndex=list.removeFirst();
                if(cur.left!=null){
                    queue.offer(cur.left);
                    //添加当前根节点的左子树
                    list.add(curIndex*2);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                    //添加当前根节点的右子树
                    list.add(curIndex*2+1);
                }
                //循环一次,size--
                size--;
            }
            //就一个节点,宽度为一,不用看
            //每次比较最大宽度值
            if(list.size()>=2){
                res=Math.max(res,list.getLast()-list.getFirst()+1);
            }
            
        }
        return res;
    }
}