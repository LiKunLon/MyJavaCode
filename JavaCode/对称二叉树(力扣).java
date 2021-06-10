class Solution {
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree==null&&rightTree!=null||leftTree!=null&&rightTree==null){
            return false;
        }
        if(leftTree==null&&rightTree==null){
            return true;
        }
        if(leftTree.val!=rightTree.val){
            return false;
        }
        return isSymmetricChild(leftTree.left,rightTree.right)&&isSymmetricChild(rightTree.left,leftTree.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}