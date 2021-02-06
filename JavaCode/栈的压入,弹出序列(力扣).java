练习
Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int val:pushed){
            stack.push(val);//逐个压入栈
            //当满足栈顶元素与弹出数组元素第一个相同,同时满足栈不为空
            //继续抛出
            //index++比较下一个
            while(!stack.empty()&&stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        //如果栈里面还剩下元素,说明popped数组不满足弹出顺序
        return stack.empty();