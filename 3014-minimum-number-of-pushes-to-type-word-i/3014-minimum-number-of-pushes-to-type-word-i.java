class Solution {
    public int minimumPushes(String word) {
        int size = word.length();
        int ans = 0;

        if(size <= 8){
            ans = size;

            return ans;
        }

        if(size <= 16 && size > 8 ){
            int x = 8;
            int y = size - 8;


            ans = ans + (x*1) + (y*2);
            return ans;
        }

        if(size > 16 && size <= 24){
            int x = 8;
            int y = 8;
            int z = size - 16;

            ans = ans + (x*1) + (y*2) + (z*3);

            return ans;
        }
        if(size > 24){

            int x = 8;
            int y = 8;
            int z = 8;
            int n = size - 24;

            ans = ans + (x*1) + (y*2) + (z*3) + (n*4);
            return ans;

        }

        return -1;
    }
}