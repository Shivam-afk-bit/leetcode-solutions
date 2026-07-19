import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
       ArrayList<Integer> current = new ArrayList<>();

       helper(nums,0,current);
       return ans;
    }

   List<List<Integer>> ans = new ArrayList<>();

public void helper(int[] nums, int index, ArrayList<Integer> current) {

    if (index == nums.length) {
        ans.add(new ArrayList<>(current)); // Store a copy
        return;
    }

    // Take
    current.add(nums[index]);
    helper(nums, index + 1, current);

    // Backtrack
    current.remove(current.size() - 1);

    // Don't Take
    helper(nums, index + 1, current);
 }
}