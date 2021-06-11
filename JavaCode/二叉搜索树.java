class BinarySearchTree{
    static class BSnode{
        public int val;
        public BSnode left;
        public BSnode right;
        public BSnode(int val) {
            this.val = val;
        }
    }
    //BinaryTree2 binaryTree2=new BinaryTree2();
     BSnode root=null;
    public boolean Search(int val){
        if(root==null)return false;
        BSnode cur=root;
        while(cur!=null){
            if(cur.val==val){
                return true;
            }else if(cur.val>val){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return false;
    }
    public boolean insert(int val){
        //如果没节点,直接new一个
        BSnode bSnode=new BSnode(val);
        if(root==null){
            root=bSnode;
            return true;
        }
        BSnode cur=root;
        BSnode parent=null;
        while(cur!=null){
            if(cur.val==val){
                return false;
            }else if(cur.val>val){
                parent=cur;//要记录一下当前要插入的节点
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.left;
            }
        }
        if(parent.val>val){
            parent.left=bSnode;
        }else{
            parent.right=bSnode;
        }
        return true;
    }
    public void remove(int val){
        if(root==null)return;
        BSnode cur=root;
        BSnode parent=null;
        while(cur!=null){
            if(cur.val==val){
                removeNode(parent,cur,val);
            }else if(cur.val<val){
                parent=cur;
                cur=cur.right;
            }else{
                parent=cur;
                cur=cur.left;
            }
        }
    }
    public void removeNode(BSnode parent,BSnode cur,int val){
        //分三种情况
        //①:cur.left == null
        //1. cur 是 root，则 root = cur.right
        //2. cur 不是 root，cur 是 parent.left，则 parent.left = cur.right
        //3. cur 不是 root，cur 是 parent.right，则 parent.right = cur.right
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }else if(cur==parent.left){
                parent.left=cur.right;
            }else{
                parent.right=cur.right;
            }
        //②:cur.right == null
        //1. cur 是 root，则 root = cur.left
        //2. cur 不是 root，cur 是 parent.left，则 parent.left = cur.left
        //3. cur 不是 root，cur 是 parent.right，则 parent.right = cur.left
        }else if(cur.right==null){
            if(cur==null){
                root=cur.left;
            }else if(cur==parent.left){
                parent.left=cur.left;
            }else{
                parent.right=cur.left;
            }
        //③: cur.left != null && cur.right != null
        //找个替罪羊
        // 在待删除节点的右树的左边找最小的
        // 或者在左树的右边找最大的,覆盖掉待删除节点
        //最后再删掉找到的替罪羊
        }else{
            //找右树里左边最小的节点
            BSnode target=cur.right;
            BSnode targetparent=cur;
            while(target.left!=null){
                targetparent=target;
                target=target.left;
            }
            //循环走完,target指向的就是右树最小的节点
            //覆盖删除
            cur.val=target.val;
            //删除找到的替罪羊节点
            if(target==targetparent.left){
                //tp有左树
                targetparent.left=target.right;
            }else{
                targetparent.right=target.right;
            }
        }
    }