class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int i = 2;
        int j = 0;
        int k = 0;

        while( i < nums.length){
            if(arr1[j] > arr2[k] ){
                arr1[j+1] = nums[i];
                i++;
                j++;
                
            }else{
                arr2[k+1] = nums[i];
                i++;
                k++;
            }
        }
        j++;
        k = 0;
        while(j < arr1.length && k < arr2.length){
            arr1[j] = arr2[k];
            j++;
            k++;
        }
        return arr1;

        
    }

}