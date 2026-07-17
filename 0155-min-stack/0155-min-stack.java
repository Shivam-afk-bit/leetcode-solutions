class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> minstack;
    
   
   
    public MinStack() {
        stack1 = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        stack1.push(value);
       

        if(minstack.isEmpty()){
            minstack.push(value);
        }else if(value <= minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(stack1.peek().intValue() == minstack.peek().intValue()){
            stack1.pop();
            
            minstack.pop();
        }else{
            stack1.pop();
        }
        

        

    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
       
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */