class Solution {
    public boolean checkDivisibility(int n) {
        int sumOfdigit = digitSum(n);
        int productOfdigit = digitProduct(n);

        int sum = sumOfdigit + productOfdigit;


        if(n % sum == 0){
            return true;
        }

        return false;
    }
    public int digitSum(int n){
        int sum  = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public int digitProduct(int n){
        int product = 1;

        while(n > 0){
            product = product * (n % 10);
            n = n/10;
        }

        return product;
    }
}