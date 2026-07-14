class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int ans =0;
        int big; int small;


        while(left < right){
            int SmallHeight = Math.min(height[left] , height[right]);
            int width = right - left ;

            ans = Math.max(ans , SmallHeight * width);

            if(height[left] >= height[right]){
                right --;
            }else{
                left++;
            }

        }
        return ans;
    }
}