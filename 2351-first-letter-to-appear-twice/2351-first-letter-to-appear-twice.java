class Solution {
    public char repeatedCharacter(String s) {
        int MaxLnegth = 0;

        HashSet<Character> set = new HashSet<>();
        
        for(char a : s.toCharArray() ){
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
            }
        }
        return 'a';
    }
}