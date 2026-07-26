class Solution {
    public int maximumProduct(int[] nums) {
        int maxProduct = 1;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax =  Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;


        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] >= firstMax ){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];

            }

            if(nums[i] < firstMax && nums[i] >= secondMax ){
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            if(nums[i] < secondMax && nums[i] > thirdMax ){
                thirdMax = nums[i];
            }

            if(nums[i] <= firstMin ){
                secondMin = firstMin;
                firstMin = nums[i];

            }
            if(nums[i] > firstMin && nums[i] < secondMin){
                secondMin = nums[i];
            }
            
        }

        int ans1 = firstMax * secondMax * thirdMax;
        int ans2 = firstMin * secondMin * firstMax;


        return Math.max(ans1, ans2);
    }
}