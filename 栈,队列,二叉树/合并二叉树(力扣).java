class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //特殊情况判定
        if(t1==null)return t2;
        if(t2==null)return t1;
        //一个后序遍历
        //合并t1.left和t2.left,放在t1.left上
        //合并t1.right和t2.right,放在t2.right上
        t1.left=mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t1.right,t2.right);
        t1.val=t1.val+t2.val;
        return t1;
    }
}