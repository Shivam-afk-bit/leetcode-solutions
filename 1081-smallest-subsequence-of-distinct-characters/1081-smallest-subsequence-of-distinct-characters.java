class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();


        for(char z : s.toCharArray() ){
            map.put(z , map.getOrDefault(z , 0) +1);
        }

        for(char z : s.toCharArray() ){
           map.put(z , map.get(z) -1);

           if(set.contains(z)){
            continue;

           }

           if(stack.isEmpty()){
                stack.push(z);
                set.add(z);
                continue;
           }

           while(!stack.isEmpty() && z < stack.peek() && map.get(stack.peek()) > 0){
                char removed = stack.pop();
                set.remove(removed);
           }

           stack.push(z);
           set.add(z);
        }
    StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.append(stack.pop());
            
        }

        return ans.reverse().toString();
       
    }
}