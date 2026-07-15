class MyQueue {

    Stack<Integer> first ;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();

    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
        while(!first.empty()){
            second.add(first.pop());
        }

        int ans =  second.pop();

        while(!second.empty()){
            first.add(second.pop());
        }

        return ans;
        
    }
    
    public int peek() {
         while(!first.empty()){
            second.add(first.pop());
        }

        int ans =  second.peek();

        while(!second.empty()){
            first.add(second.pop());
        }

        return ans;
        
    }
    
    public boolean empty() {

       return first.empty() && second.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */