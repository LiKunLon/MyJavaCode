class BTnode{
    public char val;
    public BTnode left;
    public BTnode right;
    public BTnode(char val){
        this.val=val;
    }
    public BTnode(){
    }
}
public class BinaryTree2 {
    public BTnode createtree(){
        BTnode A=new BTnode('A');
        BTnode B=new BTnode('B');
        BTnode C=new BTnode('C');
        BTnode D=new BTnode('D');
        BTnode E=new BTnode('E');
        BTnode F=new BTnode('F');
        BTnode G=new BTnode('G');
        BTnode H=new BTnode('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        E.right=H;
        C.left=F;
        C.right=G;
        return A;
    }
    // 前序遍历
    void preOrderTraversal(BTnode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(BTnode root){
        if(root==null)return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(BTnode root){
        if(root==null)return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }
    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(BTnode root){
        if(root==null)return;
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数
    int getSize2(BTnode root){
        if(root==null)return 0;
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(BTnode root){

    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(BTnode root){
        return -1;
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(BTnode root){
        return -1;
    }
}
