class Solution {
    public TreeNode increasingBST(TreeNode root) {
        //定义一个集合来保存元素
        List<Integer> list=new ArrayList<>();
        order(root,list);
        TreeNode ans=new TreeNode(0);
        TreeNode cur=ans;
        //遍历的同时,构建新的树
        for(int num:list){
            cur.right=new TreeNode(num);
            cur=cur.right;
        }
        return ans.right;
    }
    public void order(TreeNode root,List<Integer> list){
        //直接一个中序遍历,把所有的元素保存下来
        if(root==null)return;
        order(root.left,list);
        list.add(root.val);
        order(root.right,list);
    }
}