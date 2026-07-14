class Solution {
    public void sortColors(int[] nums) {
        int first =0;
        int last =  nums.length-1;
        int element = 0;


        while(element <= last){
            if(nums [element] == 0){
                int temp = nums[element];
                nums[element] = nums[first];
                nums[first] = temp;
                first++;
                element++; 
            }else if(nums[element] == 2){
               int temp2 = nums[element];
                nums[element] = nums[last];
                nums[last] = temp2;
                last--;
            }else{
                element++;
            }
        }
    }
}