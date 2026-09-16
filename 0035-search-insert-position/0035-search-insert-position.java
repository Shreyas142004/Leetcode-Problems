class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        if(target <=nums[0]) return 0;
        for(i=1;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i-1]<target && nums[i]>target){
                return i;
            }
        }
        return i;
    }
}