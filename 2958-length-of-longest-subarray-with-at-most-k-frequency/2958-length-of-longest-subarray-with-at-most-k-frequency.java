class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int maxLength = Integer.MIN_VALUE;
        int len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(i < nums.length && j < nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j] , 1);
                len = (j-i) + 1;
                
                
                maxLength = Math.max(len , maxLength);
                j++;
                continue;
               
            }
            if(map.get(nums[j]) < k){
                map.put(nums[j] , map.getOrDefault(nums[j] , 0) +1);
                len = (j - i) + 1;

                maxLength = Math.max(len , maxLength);
                j++;
            }else if(map.get(nums[j]) == k){
                
                map.put(nums[i] , map.getOrDefault(nums[i] , 0 ) -1);
                i++;
                
               
                
                
                
            }
        }
        return maxLength;
    }
}