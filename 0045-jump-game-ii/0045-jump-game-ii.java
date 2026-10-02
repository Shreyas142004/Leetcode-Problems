class Solution {
    public int jump(int[] nums) {
        int m = 0;
        int c=0;
        int end=0;
        for(int i = 0; i <nums.length-1; i++) {
            m = Math.max(m, i + nums[i]);
            if(i==end) {
                c++;
                end=m;
            }
        }
        return c;
    }
}