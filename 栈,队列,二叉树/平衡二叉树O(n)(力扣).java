class Solution {
    public int height(TreeNode root){
        if(root==null)return 0;
        //递归遍历到最下面节点
        int left=height(root.left);
        int right=height(root.right);
        //如果左右树高度差小于等于1
        // if(left>=0&&right>=0&&Math.abs(left-right)<=1){
        //     //返回高度大的再加上自身节点
        //     return Math.max(left,right)+1;
        // }else{
        //     //不满足平衡
        //     return -1;
        // }
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(height(root)>=0){
            return true;
        }
        return false;
    }
}