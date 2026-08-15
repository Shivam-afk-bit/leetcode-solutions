class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int len = 0;
        int maxLength = 0;

        while(i < nums.length && j < nums.length){
            if(nums[j] == 1){
                len = (j-i) + 1;
                maxLength = Math.max(maxLength , len);
                j++;
            }else{
                j++;
                i = j;
            }
        }
        return maxLength;
    }
}