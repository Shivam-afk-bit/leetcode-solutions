class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
           max = Math.max(max, nums[i]);
            set.add(nums[i]);
        }
        
        int n = 1;
        int z = k;
        int ans = 0;
        while(z <= max){
           z = k*n;

            if(set.contains(z)){
                n++;
            }else{
                ans = z;
                break;
            }
        }
        if(z > max){
            ans = z;
        }
       
        
        return ans;
    }
}