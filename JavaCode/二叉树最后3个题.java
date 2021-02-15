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


    public void tree2strChild(TreeNode t,StringBuilder sb) {
        if(t == null) return;
        sb.append(t.val);
        if(t.left == null) {
            if(t.right == null) {
                return;
            }else{
                sb.append("()");
            }
        }else {
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }

        if(t.right == null) {
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }

    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        tree2strChild(t,sb);
        return sb.toString();
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int preIndex = 0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int inbegin,int inend) {
        //说明没有左树 或者没有右树
        if(inbegin > inend) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex]);
        //在中序遍历的数组当中  找到当前跟节点所在的位置
        int index = findValInorder(inorder,preorder[preIndex],inbegin,inend);
        preIndex++;
        root.left = buildTreeChild(preorder,inorder,inbegin,index-1);
        root.right = buildTreeChild(preorder,inorder,index+1,inend);
        return root;
    }

    public int findValInorder(int[] inorder,int key,int inbegin,int inend) {
        for(int i = inbegin;i <= inend; i++) {
            if(inorder[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) return null;
        if(preorder.length == 0|| inorder.length == 0) return null;

        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }

}




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int posIndex = 0;//后序遍历的下表
    public TreeNode buildTreeChild(int[] postorder, int[] inorder,int inbegin,int inend) {
        //说明没有左树 或者没有右树
        if(inbegin > inend) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[posIndex]);
        //在中序遍历的数组当中  找到当前跟节点所在的位置
        int index = findValInorder(inorder,postorder[posIndex],inbegin,inend);
        posIndex--;
        root.right = buildTreeChild(postorder,inorder,index+1,inend);
        root.left = buildTreeChild(postorder,inorder,inbegin,index-1);
        return root;
    }
    public int findValInorder(int[] inorder,int key,int inbegin,int inend) {
        for(int i = inbegin;i <= inend; i++) {
            if(inorder[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder == null || inorder == null) return null;
        if(postorder.length == 0|| inorder.length == 0) return null;
        posIndex = postorder.length-1;
        return buildTreeChild(postorder,inorder,0,inorder.length-1);
    }
}


