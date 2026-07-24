class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;

        left[0] = 1;
        for(int i = 1 ; i < nums.length; i++ ){
            leftProduct = leftProduct * nums[i-1];
            left[i] = leftProduct;
        }

        right[right.length-1] = 1;
        for(int i = right.length-2; i >=0; i-- ){
            rightProduct = rightProduct * nums[i+1];
            right[i] = rightProduct;
        }

        for(int i = 0; i < ans.length; i++){
            ans[i] = right[i] * left[i]; 
        }

        return ans;
    }
}