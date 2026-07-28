class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        StringBuilder ans = new StringBuilder();

        if(s.length() % 2 == 0 ){
            int z = s.length()/2;
            char[] arr = new char[z];

            for(int i = 0 ; i < z; i++){
                

                arr[i] = s.charAt(i);

                
            }
            Arrays.sort(arr);
            for(char c : arr){
                ans.append(c);
            }

            for(int j = arr.length-1; j>=0; j--){
                ans.append(arr[j]);
            }

            return ans.toString();
                
            
        }

        int z = s.length()/2;
         char[] arr = new char[z];
        for(int i = 0 ; i < z; i++){
           arr[i] = s.charAt(i);

            
        }

        Arrays.sort(arr);

        for(char c : arr){
            ans.append(c);
        }
        
        ans.append(s.charAt(z));


        for(int i = arr.length-1; i>=0; i--){
            ans.append(arr[i]);
        }



        return ans.toString();
    }
}