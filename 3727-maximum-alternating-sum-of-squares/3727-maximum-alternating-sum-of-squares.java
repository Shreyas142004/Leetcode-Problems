class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        long val1 = 0;
        long val2 = 0;
        long[] squares = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squares);
        for (int i = 0; i < squares.length / 2; i++) {
            val1 = squares[squares.length - 1 - i];
            val2 = squares[i];
            sum += val1 - val2;
        }
        if (squares.length % 2 != 0) {
            sum += squares[squares.length / 2];
        }
        return sum;
    }
}