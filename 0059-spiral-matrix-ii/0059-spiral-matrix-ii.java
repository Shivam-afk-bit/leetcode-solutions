class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int down = ans.length-1;
        int left = 0;
        int right = ans[0].length-1;

        int number = 1;
        
        while(top <= down && left <= right){
            for(int i = left ; i <= right; i++ ){
                ans[top][i] = number;
                number++;
            }
            top++;
            for(int i = top ; i <= down ; i++ ){
                ans[i][right] = number;
                number++;
            }
            right--;

            if(top <= down){
            for(int i = right; i>=left; i-- ){
                ans[down][i] = number;
                number++;
            }
            }
            down--;

            if(left<= right){
            for(int i =  down; i >= top; i-- ){
                ans[i][left] = number;
                number++;
                
            }
            }
            left++;
        }

        return ans;
        
    }
}