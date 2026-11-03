class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        int val= max * nums.length - sum;
        return val;
    }
}