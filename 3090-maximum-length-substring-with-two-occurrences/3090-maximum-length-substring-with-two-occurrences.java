class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = Integer.MIN_VALUE;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(i < s.length() && j < s.length() ){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j) , 1);
                len = (j-i) + 1;
                maxLength = Math.max(maxLength, len);
                j++;
                continue;
            }

            if(map.get(s.charAt(j)) < 2){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0) +1);
                len = (j-i) + 1;
                maxLength = Math.max(maxLength, len);
                j++;
            }else if( map.get(s.charAt(j)) == 2){
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) -1);
                i++;
                len = (j-i) + 1;
                maxLength = Math.max(maxLength, len);

            }
        }
        return maxLength;
    }
}