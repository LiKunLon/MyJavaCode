//以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node Seperate(int x){
        Node bs=null;//小数据部分始端(beforestart)
        Node be=null;//小数据部分末端(beforeend)
        Node as=null;//大数据部分始端(afterstart)
        Node ae=null;//大数据部分末端(afterend)
        Node cur=this.head;
        while(cur!=null){
            if(cur.val<x){
                if(bs==null){
                    //两个点都指向放进来的节点
                    bs=cur;
                    be=cur;
                }else{
                    //有数据了进行尾插
                    be.next=cur;
                    be=be.next;
                }
            }else{
                if(as==null){
                    as=cur;
                    ae=cur;
                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            //让cur也移动着
            cur=cur.next;
        }
        /**
         * 有两个小情况
         * ①:最后要返回小数据部分的头,但是如果小数据部分没有数据,就会出错
         * ②:找不到尾结点
         */
        if(bs==null){
            return as;
        }
        //将前后两部分进行头尾相连,成为一个链表
        be.next=as;
        
        //如果头有数据,直接将尾结点的next置空
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }