class Solution {
    public int smallestEvenMultiple(int n) {
        int val=1;
        while(val <= 2 * n){
            if(val%2==0 && val%n==0){
                return val;
            }
            val++;
        }
        return 0;
    }
}