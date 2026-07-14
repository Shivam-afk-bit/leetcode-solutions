class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(j != nums.length){
            if(nums[j] !=0 ){
                nums[i] = nums[j];
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }

        for(int k=count; k < nums.length; k++){
            nums[k] = 0;
        }

    }
}