class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(!set.contains(nums[i])){
        //         set.add(nums[i]);
        //     }else{
        //         count++;
        //     }
        // }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}