class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;


        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= biggest){
                biggest = nums[i];
            }

            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }

        int range = (  biggest  - smallest ) + 1;

        int[] arr = new int[range];

        for(int i = 0; i < nums.length; i++){
            int n = nums[i] - smallest;

            arr[n] = 1;
        }

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 0){
                
                ans.add(i + smallest);
            }
        }
        return ans;
    }
}