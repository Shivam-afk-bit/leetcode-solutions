class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        int winSize = 2 * k;
        int start = 0;
        int end = winSize - 1;

        while (end < arr.length) {

            if (end - start < winSize) {
                int i = start;
                int j = (start + k) - 1;
                while(i <= j){
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j--;
                }
            }

            start = start + (winSize );
            end = end + winSize;
        }

        int remaining = arr.length - start;

        if(remaining <= k){
            int i = start;
            int j = arr.length-1;;
                while(i <= j){
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j--;
                } 
        }else {
            int i = start;
            int j = (start + k) - 1;
                while(i <= j){
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j--;
                }
        }

        return new String(arr);
    }
}