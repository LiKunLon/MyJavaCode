class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null)return true;
        if(s==null)return false;
        boolean left=isSubtree(s.left,t);
        boolean right=isSubtree(s.right,t);
        //return isSameTree(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
        return left||right||isSameTree(s,t);
    }
    public boolean isSameTree(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isSameTree(s.left,t.left)&&isSameTree(s.right,t.right);
    }
}