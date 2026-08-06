class Solution {
    public void reverseString(char[] s) {
        Reverse(s,0,s.length-1);
    }
    public void Reverse(char[] s , int i , int j ){
        if(i >= j){
            return;
        }
            char temp = s[j];
            s[j] = s[i];
            s[i] =  temp;

            Reverse(s, i+1, j-1);
        
    }
}