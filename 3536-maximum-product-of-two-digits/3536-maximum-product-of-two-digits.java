class Solution {
    public int maxProduct(int n) {
        int Max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        while(n > 0){
            int z = n % 10;
            if(z >= Max){
                
                SecondMax = Max;
                Max = z;
            }else if(z < Max && z > SecondMax){
                SecondMax = z;
            }

            n = n/10;
        }

        return Max * SecondMax;
    }
}