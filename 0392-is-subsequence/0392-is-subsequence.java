class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        StringBuilder ans = new StringBuilder();
        while(i != t.length()  && j != s.length()){
            if(t.charAt(i) == s.charAt(j)){
                ans.append(t.charAt(i));
                i++;
                j++;
                
            }else{
                i++;
            }
        }
        if(s.equals(ans.toString())){
            return true;
        }

        return false;
        
    }
}