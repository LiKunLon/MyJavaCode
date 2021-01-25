class MyQueue {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        *//** Initialize your data structure here. *//*
        public MyQueue() {

        }

        *//** Push element x to the back of queue. *//*
        public void push(int x) {
            s1.push(x);
        }

        *//** Removes the element from in front of queue and returns that element. *//*
        public int pop() {
            if(empty()){
                return -1;
            }
            //将主栈中元素逐个压入辅助栈
            //辅助栈栈顶元素,就是主栈中最后一个元素
            //直接pop()
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        *//** Get the front element. *//*
        public int peek() {
            if(empty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            //跟上面pop()一样
            //这个直接拿到peek就行
            return s2.peek();
        }

        *//** Returns whether the queue is empty. *//*
        public boolean empty() {
            return s1.empty()&&s2.empty();
        }
    }