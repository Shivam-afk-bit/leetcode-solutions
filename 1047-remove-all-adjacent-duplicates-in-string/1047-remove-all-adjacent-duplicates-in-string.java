class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> helper = new Stack<>();

        StringBuilder ans = new StringBuilder();


        for(char k : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(k);
                
            }else if(k == stack.peek()){
                stack.pop();
            }else{
                stack.push(k);
                
            }
            
        }

        while(!stack.isEmpty()){
            helper.push(stack.pop());
        }

        while(!helper.isEmpty()){
            ans.append(helper.pop());
        }
        
        return ans.toString();
        
    }
}