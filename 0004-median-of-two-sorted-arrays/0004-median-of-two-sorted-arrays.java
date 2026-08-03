class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sort = new int[nums1.length + nums2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j] ){
                sort[k] = nums1[i];
                k++;
                i++;
                continue;
            }

            if(nums1[i] > nums2[j]){
                sort[k] = nums2[j];
                k++;
                j++;

            }
        }
        if(j == nums2.length){
            while(i < nums1.length ){
                sort[k] = nums1[i];
                i++;
                k++;
            }
        }else{
            while(j < nums2.length ){
                sort[k] = nums2[j];
                j++;
                k++;
            }

        }


        double median = 0;

        if(sort.length % 2 == 0){
            int n = sort.length/2;
            median = (sort[n] + sort[n-1])/2.0;
        }else{
            int z = sort.length/2;
            median = sort[z];
        }

        return median;
  
    }
}