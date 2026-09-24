class Solution {
    public static int sumDigit(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int small=nums[0];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(sumDigit(val)==i){
                return i;
            }
        }

        return -1;
    }
}