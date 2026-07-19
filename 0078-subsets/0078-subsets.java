import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
       ArrayList<Integer> current = new ArrayList<>();

       helper(nums,0,current);
       return ans;
    }

    List<List<Integer>> ans = new ArrayList<>();
 
    public void helper(int[] nums, int index, ArrayList<Integer> current){
        
    if (index == nums.length) {
        ans.add(current);
        return;
    }

    
    ArrayList<Integer> take = new ArrayList<>(current);
    take.add(nums[index]);
    helper(nums, index + 1, take);

 
    ArrayList<Integer> dontTake = new ArrayList<>(current);
    helper(nums, index + 1, dontTake);
    }
}