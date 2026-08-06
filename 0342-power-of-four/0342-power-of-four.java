class Solution {
    public boolean isPowerOfFour(int n) {
    return helper(n , 0 , 1);
        
    }
    public boolean helper(int n , int p , double curr){
        if(curr == n){
            return true;
        }else if(curr > n){
            return false;
        }

        curr = Math.pow(4 , p);
        return helper(n , p+1 , curr);
    }
}