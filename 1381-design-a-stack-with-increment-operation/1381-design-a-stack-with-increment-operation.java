class CustomStack {
    int maxSize;
    Stack<Integer> stack1;
    Stack<Integer> helper;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack1 = new Stack<>();
        helper = new Stack<>();


    }
    
    public void push(int x) {
        if(stack1.size() < maxSize){
            stack1.push(x);
        }
    }
    
    public int pop() {
        if(!stack1.isEmpty()){
            return stack1.pop();
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        while(!stack1.isEmpty()){
            helper.push(stack1.pop());
        }

        while(k>0 && !helper.isEmpty()){
            stack1.push(helper.pop() + val);
            k--;
        }

        while(!helper.isEmpty()){
            stack1.push(helper.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */