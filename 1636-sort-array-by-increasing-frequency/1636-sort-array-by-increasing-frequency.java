class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0 ; i < nums.length; i ++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0) +1);
        }

        Integer temp[] = new Integer[nums.length];
        for(int i = 0 ; i < nums.length; i ++){
            temp[i]  = nums[i];
        }

        Arrays.sort(temp  , new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(freq.get(a) == freq.get(b)){
                    return b - a;
                }else{
                    return freq.get(a) - freq.get(b);
                }
            }
        });

        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }

        return nums;
    }
}