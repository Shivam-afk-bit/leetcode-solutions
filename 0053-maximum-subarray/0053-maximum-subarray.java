class Solution {
    public int maxSubArray(int[] nums) {
        int sumtillnow = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > sumtillnow && sumtillnow < 0){
                sumtillnow = nums[i];
            }else{
                sumtillnow += nums[i];
            }

            maxsum = Math.max(maxsum , sumtillnow);
        }
        return maxsum;
    }
}