class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        //判空
        if(root==null)return null;
        //只有一个节点的情况
        if(root.left==null&&root.right==null)return root;
        //定义一个临时变量
        TreeNode cur;
        //交换
        cur=root.left;
        root.left=root.right;
        root.right=cur;
        //别忘了递归,不然就只交换了一个节点
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}