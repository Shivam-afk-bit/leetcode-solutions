class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sort = new int[nums1.length + nums2.length];
        
        int i = 0;
        int j = 0;
        int count = 0;
        int prev = 0;
        int current = 0;
        int n = ((nums1.length + nums2.length)/2) + 1;

        while(count != n && i < nums1.length && j < nums2.length ){
            if(nums1[i] <= nums2[j] ){
                prev = current;
                current = nums1[i];
                count++;
                i++;
                continue;
            }

            if(nums1[i] > nums2[j]){
                prev = current;
                current = nums2[j];
                count++;
                j++;

            }
        }

        if( j == nums2.length && count != n){
            while(count != n){
            prev = current;
            current = nums1[i];
            i++;
            count++;

            }
            
        }else if( i == nums1.length && count != n){
           while(count != n){
             prev = current;
            current = nums2[j];
            j++;
            count++;
           }
        }

        double median = 0;

        if((nums1.length + nums2.length)%2 == 0){
                median = (prev + current)/2.0;
        }else{
            median = current;

        }


        

        

        return median;
  
    }
}