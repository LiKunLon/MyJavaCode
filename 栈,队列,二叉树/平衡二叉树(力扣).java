class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        //左右树高度
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        //绝对值函数
        //同时要判断 左树的左树和右树  右树的左树和右树
        return Math.abs(left-right)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    //求高度函数
    public int getHeight(TreeNode root){
        if(root==null)return 0;
        int left=getHeight(root.left)+1;
        int right=getHeight(root.right)+1;
        return Math.max(left,right);
    }
}