class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winStart = 0;
        int winEnd = k-1;
        double MaxAns = 0;
        

        for(int i = winStart; i < k; i++){
            MaxAns = MaxAns+nums[i];
        }
        double currAns = MaxAns;
        double currAvgAns = 0;
        MaxAns = MaxAns/k;
        

        while(winEnd < nums.length){
            winStart++;
            winEnd++;

            if(winEnd < nums.length){
            currAns = currAns - nums[winStart-1];
            currAns = currAns + nums[winEnd];
            }else{
                continue;
            }

            currAvgAns = currAns/k;

            MaxAns = Math.max(MaxAns, currAvgAns);

        }
        return MaxAns;
    }
}