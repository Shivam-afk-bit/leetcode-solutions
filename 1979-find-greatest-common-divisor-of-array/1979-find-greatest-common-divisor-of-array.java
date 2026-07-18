class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int ans = calGCD(min, max);
        return ans;
    }
    public int calGCD(int min , int max){
        
        if(min == 0){
            return max;
        }else if(max == 0){
            return min;
        }

        if(max > min){
            return calGCD(min , max % min);
        }else{
            return calGCD(min % max, max);
        }
    }
}