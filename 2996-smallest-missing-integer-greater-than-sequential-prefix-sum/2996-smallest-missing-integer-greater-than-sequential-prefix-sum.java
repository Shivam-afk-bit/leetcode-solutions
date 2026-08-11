class Solution {
    public int missingInteger(int[] nums) {
        int prefix = nums[0];

        int i = 1;
        while(i < nums.length ){
            if(nums[i] == (nums[i-1] + 1) ){
                prefix = prefix + nums[i];
                i++;
            }else{
                break;
            }
        }
            
        HashSet<Integer> set = new HashSet<>();


        for(int j = 0; j < nums.length; j++){
            set.add(nums[j]);
        }

       

       while(set.contains(prefix)){
        prefix++;
       }
       return prefix;

    }
}