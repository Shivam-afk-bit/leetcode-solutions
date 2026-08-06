class Solution {
    public int smallestNumber(int n, int t) {
       
        while(true){
           int k = productOfNum(n);

            if(k % t == 0){
                break;
            }

            n++;
            
        }

        return n;

    }
    public int productOfNum(int n){
        int ans = 1;
        while(n > 0){
            int z = n % 10;
            ans = ans * z;
            n = n/10;
        }
        return ans;
    }
}