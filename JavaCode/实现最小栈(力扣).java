class MinStack {
        Stack<Integer> stack=new Stack<>();
        //辅助栈
        Stack<Integer> minStack=new Stack<>();

        * initialize your data structure here. 
        public MinStack() {

        }

        public void push(int x) {
            stack.push(x);
            //辅助栈为空的话,把x也添加给他
            if(minStack.isEmpty()){
                minStack.push(x);
            }else{
                //辅助栈不为空
                //如果x比栈顶元素小
                //再把x压入辅助栈
                if(x<=minStack.peek()){
                    minStack.push(x);
                }
            }
        }

        public void pop() {
            int x=stack.pop();
            //如果两个栈顶元素相等,都pop();
            if(x==minStack.peek()){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }