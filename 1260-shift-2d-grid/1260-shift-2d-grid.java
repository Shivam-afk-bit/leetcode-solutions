class Solution {
    ArrayList<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int [] oneD = new int[grid.length * grid[0].length];

        int i = 0;
        for(int[] row : grid){
           for(int num : row){
              oneD[i] = num;
              i++;
           }
        }

        int skip = k % oneD.length;

        Reverse(oneD , 0 , oneD.length-1);
        Reverse(oneD , 0 , skip - 1);
        Reverse(oneD , skip , oneD.length-1);

        i=0;
        for(int j = 0; j < grid.length; j++){
            List<Integer> row = new ArrayList<>();
            for(int z = 0; z < grid[0].length; z++){
                row.add(oneD[i]);
                i++;
            }
            ans.add(row);
        }

        return ans;

    }
    public void Reverse(int [] oneD , int i , int j){
            

            while(i < j){
                int temp = oneD[j];
                oneD[j] = oneD[i];
                oneD[i] = temp;
                i++;
                j--;
            }
    }
}