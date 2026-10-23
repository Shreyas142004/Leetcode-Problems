class Solution {
    public int findGCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long maxPairStrength(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int gcd = findGCD(nums[i], nums[j]);
                long val=(long)nums[i]*nums[j]/((long)gcd * gcd);
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }
}