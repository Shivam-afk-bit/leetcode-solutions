class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans = binarySearch(nums , target , 0 , nums.length-1);
        return ans;
    }
     public boolean binarySearch(int[] nums, int target, int start, int end){
            if(start > end){
                return false;
            }

            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                 return binarySearch(nums, target, start + 1, end - 1);
            }

            if(nums[start] <= nums[mid] ){
                if(target >= nums[start] && target <= nums[mid]){
                    return binarySearch(nums , target , start , mid - 1);
                }else{
                    return binarySearch(nums , target , mid+1 , end);
                }
            }
            if(target >= nums[mid] && target <= nums[end]){
                return binarySearch(nums , target , mid+1 , end);
            }else{
                return binarySearch(nums , target , start , mid-1);
            }
    }
}