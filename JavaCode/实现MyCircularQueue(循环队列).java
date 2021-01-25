class MyCircularQueue {
    public int front;//队头
    public int rear;//代表当前可以存放数据的下标
    public int[] elem;

    public MyCircularQueue(int k) {
        this.elem=new int[k];
        this.front=0;
        this.rear=0;
    }
    //入队
    public boolean enQueue(int value) {
        //判满
        if(isFull()){
            return false;
        }
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%this.elem.length;
        return true;
    }
    //出队
    public boolean deQueue() {
        //判空
        if(isEmpty()){
            return false;
        }
        //删掉队头元素就好了
        //让front挪到下一个位置即可
        this.front=(this.front+1)%this.elem.length;
        return true;
    }
    //拿到队头元素
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        //直接返回front下标的元素即可
        int num=this.elem[this.front];
        return num;
    }
    //拿到队尾元素
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        /**
         * 队尾有两种情况:
         * ①:队是满的,rear已经去了0号位置
         * ②:正常情况
         */
        int index=-1;
        if(this.rear==0){
            index=this.elem.length-1;
        }else{
            index=this.rear-1;
        }
        return this.elem[index];
    }

    public boolean isEmpty() {
        //front和rear相遇时
        //则为空
        return this.front==this.rear;
    }

    public boolean isFull() {
        //rear在最后面,下一个就是front
        //(rear+1)%length就到队头了
        //牺牲了一个空间
        return (this.rear+1)%this.elem.length==this.front;
    }
}