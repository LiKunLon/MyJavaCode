/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        //如果没节点，就返回一个长度0的数组
        if(root==null)return new int[0];
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //如果队列不为空,抛出队头元素
        //定义一个cur记录并打印
        //再判断左右树
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            ans.add(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
        //创建个数组，接收集合的数据
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}