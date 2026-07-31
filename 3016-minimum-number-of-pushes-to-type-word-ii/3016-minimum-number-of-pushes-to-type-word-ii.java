class Solution {
    public int minimumPushes(String word) {
        
        int[] freq = new int[26];

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int n = ch - 'a';

            freq[n]++;
        }

        Arrays.sort(freq);

        int count = 1;
        int ans = 0;
        
        for(int i = freq.length-1; i >= 0; i-- ){

            if(count <=8){
                ans = ans + 1* freq[i];
             
            }else if(count >8 && count <=16){
                ans = ans + 2 * freq[i];
            }else if(count >16 && count <=24 ){
                ans = ans + 3 * freq[i];
            }else {
                ans = ans + 4 * freq[i];
            }

            count++;


        }

        return ans;
        
    }   
}