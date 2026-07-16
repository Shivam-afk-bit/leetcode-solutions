class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();
    

       for(int i = temperatures.length-1; i >= 0 ; i--){
        if(stack.isEmpty()){
            ans[i] = 0;
            stack.push(i);
        }else if(temperatures[i] >= temperatures[stack.peek()]){
            while( !stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = 0;
                stack.push(i);
            }else{
                ans[i] = stack.peek() - i;
                stack.push(i);
            }
            
            
            
         }else{
            ans[i] = stack.peek() - i;
            stack.push(i);
           
         }
       }

       return ans;

    }
}