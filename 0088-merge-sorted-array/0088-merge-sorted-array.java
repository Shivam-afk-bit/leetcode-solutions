class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0;
        int idx2 = 0;

        while(idx1 < m && idx2 < n){
            if(nums1[idx1] < nums2[idx2]){
                idx1++;
            }else if(nums1[idx1] == nums2[idx2]){
                 shift(nums1 , idx1);
                 nums1[idx1+1] = nums2[idx2];
                 m++;
                 idx1++;
                 idx2++;
            }else{
                shift2(nums1 , idx1);
                nums1[idx1] = nums2[idx2];
                m++;
                idx1++;
                idx2++;
            }
        }
        while(idx2 < n){
            nums1[idx1] = nums2[idx2];
            idx1++;
            idx2++;
        }
        
    }
    public void shift(int[] nums1, int idx){
        for(int i = nums1.length-1; i >= idx+2 ; i--){
            nums1[i] = nums1[i-1];
        }
    }
    public void shift2(int [] nums1, int idx){
        for(int i = nums1.length-1; i>= idx+1  ; i--){
            nums1[i] = nums1[i-1];
        }
    }
}