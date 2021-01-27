class BTnode<T>{
    public T val;
    public BTnode left;
    public BTnode right;

    public BTnode(T val){
        this.val=val;
    }
}

public class BinaryTree {
    public BTnode crateTree(){
        BTnode<Character> A=new BTnode<>('A');
        BTnode<Character> B=new BTnode<>('B');
        BTnode<Character> C=new BTnode<>('C');
        BTnode<Character> D=new BTnode<>('D');
        BTnode<Character> E=new BTnode<>('E');
        BTnode<Character> F=new BTnode<>('F');
        BTnode<Character> G=new BTnode<>('G');
        BTnode<Character> H=new BTnode<>('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        E.right=H;
        C.left=F;
        C.right=G;
        return A;
    }
    // 前序遍历(根左右)
    public void preOrderTraversal(BTnode root){
        if(root==null)return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    // 中序遍历(左根右)
    public void inOrderTraversal(BTnode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);

    }
    // 后序遍历(左右根)
    public void postOrderTraversal(BTnode root){
        if(root==null)return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);

    }
    // 遍历思路-求结点个数
    static int size = 0;
    public void getSize1(BTnode root){

        if(root==null)return;
        size++;
        getSize1(root.left);
        getSize1(root.right);
        //System.out.println(size);
    }
    // 子问题思路-求结点个数
    public int getSize2(BTnode root){
        if(root==null) return 0;
        //size++;
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    public void getLeafSize1(BTnode root){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    public int getLeafSize2(BTnode root){
        if(root==null)return 0;
        if(root.left==null&&root.right==null)
            return 1;
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    public int getKLevelSize(BTnode root,int k){
        if(root==null)return 0;
        if(k==1){
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }
    // 获取二叉树的高度
    public int getHeight(BTnode root){
        if(root==null)return 0;
        //同时取得左右树的高度同时+1(根节点)
        return getHeight(root.left)>getHeight(root.right)?getHeight(root.left)+1:getHeight(root.right)+1;
    }
    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    public BTnode find(BTnode root, int val){
        return null;
    }


public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BTnode root=binaryTree.crateTree();
        //先序遍历
        binaryTree.preOrderTraversal(root);
        System.out.println();
        //中序遍历
        binaryTree.inOrderTraversal(root);
        System.out.println();
        //后序遍历
        binaryTree.postOrderTraversal(root);
        System.out.println();
        //节点个数
        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);
        System.out.println(binaryTree.getSize2(root));
        //叶子节点个数
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));
        //第k层节点个数
        System.out.println(binaryTree.getKLevelSize(root,3));
        //获取二叉树的高度
        System.out.println(binaryTree.getHeight(root));
    }
}