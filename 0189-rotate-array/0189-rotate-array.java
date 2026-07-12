class Solution {
    public void rotate(int[] nums, int k) {
        int x = k % nums.length;

        Reverse(nums, 0 , nums.length-1);
        Reverse(nums, 0 , x-1);
        Reverse(nums , x , nums.length-1); 
    }

    public void Reverse(int[] nums , int start, int end){
       
        int temp;
        while(start <= end){
            temp =  nums[end];
            
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}