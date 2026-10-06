class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int big=0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                big = Math.max(big, count);
            }
        }
        return big;
    }
}